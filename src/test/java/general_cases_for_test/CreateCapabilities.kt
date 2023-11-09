package general_cases_for_test

import TypeOS
import io.appium.java_client.remote.AndroidMobileCapabilityType
import io.appium.java_client.remote.IOSMobileCapabilityType
import io.appium.java_client.remote.MobileCapabilityType
import org.openqa.selenium.remote.DesiredCapabilities

object CreateCapabilities {

    fun createCapabilities(paramPlatformName: TypeOS, paramPlatformVersion: String,
                           paramDeviceName: String, paramUDID: String, paramTimeToSearchElement: Long,
                           paramPathToApp: String) : DesiredCapabilities {

        val capabilities = DesiredCapabilities()

        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,  paramPlatformName)
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, paramPlatformVersion)
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, paramDeviceName)
        capabilities.setCapability(MobileCapabilityType.APP, paramPathToApp)
        //capabilities.setCapability(MobileCapabilityType.NO_RESET, true)

        if (paramPlatformName == TypeOS.ANDROID) {
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2")
            capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "starter.school.client")
            capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "starter.school.client.MainActivity")
        } else
        {
            capabilities.setCapability(IOSMobileCapabilityType.WDA_CONNECTION_TIMEOUT, 80000)
            capabilities.setCapability(IOSMobileCapabilityType.COMMAND_TIMEOUTS, 50000)
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest")
        }

        return capabilities
    }
}