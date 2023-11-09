import GlobalVariables.androidDriver
import GlobalVariables.iosDriver
import GlobalVariables.platformType
import TestFunctions.BeforeSuitFun
import general_cases_for_test.CreateCapabilities.createCapabilities
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.ios.IOSDriver
import io.appium.java_client.remote.AndroidMobileCapabilityType
import io.appium.java_client.remote.IOSMobileCapabilityType
import io.appium.java_client.remote.MobileCapabilityType
import org.openqa.selenium.remote.DesiredCapabilities
import org.testng.annotations.AfterClass
import org.testng.annotations.AfterMethod
import org.testng.annotations.AfterSuite
import org.testng.annotations.BeforeClass
import org.testng.annotations.BeforeMethod
import org.testng.annotations.BeforeSuite
import org.testng.annotations.Parameters
import java.net.URL

import java.time.Duration
import java.util.concurrent.TimeUnit

open class MainActivity {

    @BeforeSuite
    @Parameters(
        value = ["paramPlatformName", "paramPlatformVersion", "paramDeviceName",
            "paramUDID", "paramTimeToSearchElement", "paramPathToApp"]
    )
    fun installDriver(paramPlatformName: TypeOS, paramPlatformVersion: String,
                      paramDeviceName: String, paramUDID: String, paramTimeToSearchElement: Long,
                      paramPathToApp: String) {


        val capabilities = createCapabilities(paramPlatformName, paramPlatformVersion,
            paramDeviceName, paramUDID, paramTimeToSearchElement,
            paramPathToApp)

        val url = URL("http://127.0.0.1:4723/")

        if (paramPlatformName == TypeOS.ANDROID) {
            androidDriver = AndroidDriver(url, capabilities)
            androidDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(paramTimeToSearchElement))
        } else {
            iosDriver = IOSDriver(url, capabilities)
            iosDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(paramTimeToSearchElement))
        }

        platformType = paramPlatformName

        try {
            BeforeSuitFun()
        } catch (e: org.openqa.selenium.NoSuchElementException)
        {
            println("Элементы не найдены.")
        }

    }


    @AfterSuite
    fun quitDriver(){
        if (platformType == TypeOS.ANDROID) {
            androidDriver.quit()
        } else {
            iosDriver.quit()
        }
    }

    @BeforeClass
    fun beforeClass(){

    }

    @AfterClass
    fun afterClass() {

    }

    @BeforeMethod     //запуск приложения заново
    fun launceApp(){
        if (platformType == TypeOS.ANDROID) {
            androidDriver.activateApp(BUNDLE_ID)
            TimeUnit.SECONDS.sleep(5)
        } else {
            iosDriver.activateApp(BUNDLE_ID)
            TimeUnit.SECONDS.sleep(5)
        }
           //Таймаут после запуска
    }

    @AfterMethod        //закрытие приложения
    fun closeApp(){
        if (platformType == TypeOS.ANDROID) {
            androidDriver.terminateApp(BUNDLE_ID)
        } else {
            iosDriver.terminateApp(BUNDLE_ID)
        }


    }

    companion object {
        const val BUNDLE_ID = "starter.school.client"
        const val PHONE = "9616669293"
    }


}