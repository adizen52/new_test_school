import GlobalVariables.androidDriver
import io.appium.java_client.AppiumBy
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.remote.AndroidMobileCapabilityType
import io.appium.java_client.remote.MobileCapabilityType
import org.openqa.selenium.remote.DesiredCapabilities
import org.testng.annotations.AfterSuite
import org.testng.annotations.BeforeSuite
import org.testng.annotations.Test
import java.net.URL

import java.time.Duration
import java.util.concurrent.TimeUnit

class MainActivity {

    @BeforeSuite
    fun installDriver(){

        val capabilities = DesiredCapabilities()

        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,  "Android")
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.0")
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel")
        capabilities.setCapability(MobileCapabilityType.APP, "/Users/admin/apps/app-profile.apk")
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2")
        //capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "starter.school.client")
        //capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "starter.school.client.MainActivity")


        val url = URL("http://127.0.0.1:4723/")


        androidDriver = AndroidDriver(url, capabilities)

        androidDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10))

//        val xp1 = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[1]"
//        val map_one = mapOf("Русский" to "", "Далее" to "", "Самовывоз" to "",
//            xp1 to "", "Войти" to "", "android.widget.EditText" to "9616669293", "Получить код" to "")
//
//        fun TapAndEnter(k: String, v: String) {
//
//            if ("android.widget.EditText" in k) {
//                androidDriver.findElement(AppiumBy.className(k)).sendKeys(v)
//                println("Выполнен ввод $v")
//                TimeUnit.SECONDS.sleep(3)
//            }
//            else if (k[0] == '/') {
//                androidDriver.findElement(AppiumBy.xpath(k)).click()
//                println("Произведено нажатие на эл.")
//                TimeUnit.SECONDS.sleep(3)
//            }
//            else {
//                androidDriver.findElement(AppiumBy.accessibilityId(k)).click()
//                println("Произведено нажатие на эл. $k")
//                TimeUnit.SECONDS.sleep(3)
//            }
//        }
//
//        for (i in map_one) {
//
//            TapAndEnter(i.key, i.value)
//
//        }

        val element1 = androidDriver.findElement(AppiumBy.accessibilityId("Русский"))
        element1.click()

        val element2 = androidDriver.findElement(AppiumBy.accessibilityId("Далее"))
        element2.click()

        TimeUnit.SECONDS.sleep(5)

        try {
            val el = androidDriver.findElement(AppiumBy.accessibilityId("Самыйвывоз"))
            el.click()
        } catch (el: org.openqa.selenium.NoSuchElementException) {
            println("Поймали ошибку")
            val element3 = androidDriver.findElement(AppiumBy.accessibilityId("Самовывоз"))
            element3.click()
        }

        val element4 = androidDriver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[1]"))
        element4.click()

        val element5 = androidDriver.findElement(AppiumBy.accessibilityId("Войти"))
        element5.click()

        val element6 = androidDriver.findElement(AppiumBy.className("android.widget.EditText")).sendKeys("9616669293")
        TimeUnit.SECONDS.sleep(3)

        val element7 = androidDriver.findElement(AppiumBy.accessibilityId("Получить код"))
        element7.click()
        TimeUnit.SECONDS.sleep(3)

        val text = androidDriver.pageSource

        val text_res = (text.substringAfter("Введите код из смс&#10;")).substringBefore("&#10;")

        val element8 = androidDriver.findElement(AppiumBy.className("android.widget.EditText")).sendKeys(text_res)
    }

    @AfterSuite
    fun quitDriver(){
        androidDriver.quit()
    }

    @Test
    fun testOne(){
        println("Тест1")
        TimeUnit.SECONDS.sleep(10)
    }
}