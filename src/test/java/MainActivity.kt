import GlobalVariables.androidDriver
import TestFunctions.BeforeSuitFun
import TestFunctions.checkAvaliableElemnt
import TestFunctions.clickToElement
import TestFunctions.phoneCode
import TestFunctions.sendText
import general_cases_for_test.AutorizationScenaries.checkAutorizaitionUser
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.remote.MobileCapabilityType
import org.openqa.selenium.remote.DesiredCapabilities
import org.testng.annotations.AfterClass
import org.testng.annotations.AfterMethod
import org.testng.annotations.AfterSuite
import org.testng.annotations.BeforeClass
import org.testng.annotations.BeforeMethod
import org.testng.annotations.BeforeSuite
import screens.DeliveryMethod.selectPickup
import screens.EnterScreens.getCode
import screens.EnterScreens.inputCode
import screens.EnterScreens.inputPhone
import screens.MainSelector.selectProfile
import screens.MyDataScreens.ExitMyData
import screens.Onboarding.nextButton
import screens.Onboarding.selectLanguage
import screens.ProfileScreen.logInCabinet
import screens.ProfileScreen.logOut
import java.net.URL

import java.time.Duration
import java.util.concurrent.TimeUnit

open class MainActivity {

    @BeforeSuite
    fun installDriver(){

        val capabilities = DesiredCapabilities()

        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,  "Android")
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.0")
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel")
        capabilities.setCapability(MobileCapabilityType.APP, "/Users/admin/apps/app-profile.apk")
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2")
//        capabilities.setCapability(MobileCapabilityType.NO_RESET, true)
        //capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "starter.school.client")
        //capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "starter.school.client.MainActivity")


        val url = URL("http://127.0.0.1:4723/")
        androidDriver = AndroidDriver(url, capabilities)
        androidDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10))

        try {
            BeforeSuitFun()
        } catch (e: org.openqa.selenium.NoSuchElementException)
        {
            println("Элементы не найдены.")
        }

    }


    @AfterSuite
    fun quitDriver(){
        androidDriver.quit()
    }

    @BeforeClass
    fun beforeClass(){

    }

    @AfterClass
    fun afterClass() {

    }

    @BeforeMethod     //запуск приложения заново
    fun launceApp(){
        androidDriver.activateApp(BUNDLE_ID)
        TimeUnit.SECONDS.sleep(5)   //Таймаут после запуска
    }

    @AfterMethod        //закрытие приложения
    fun closeApp(){
        androidDriver.terminateApp(BUNDLE_ID)
    }

    companion object {
        const val BUNDLE_ID = "starter.school.client"
        const val PHONE = "9616669293"
    }


}