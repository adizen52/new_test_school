package tests

import GlobalVariables.androidDriver
import MainActivity
import TestFunctions.checkAvaliableElemnt
import TestFunctions.clickToElement
import TestFunctions.sendText
import TestFunctions.swipeDeleteAddress
import TestFunctions.swipeOnScreen
import TestFunctions.tapDeleteAddress
import general_cases_for_test.AutorizationScenaries
import io.appium.java_client.AppiumBy
import io.appium.java_client.android.AndroidDriver
import org.testng.annotations.Test
import screens.MainScreen
import screens.MainSelector.selectMenu
import screens.MainSelector.selectProfile
import screens.ProfileScreen.myAddresses
import screens.addressScren
import screens.addressScren.addNewAddress
import screens.addressScren.deleteAddress
import screens.addressScren.lineAddress
import screens.addressScren.locationResolution
import screens.addressScren.removeAddress
import screens.addressScren.valueAddress
import screens.newAddressScren.commentCourier
import screens.newAddressScren.entrance
import screens.newAddressScren.flat
import screens.newAddressScren.floor
import screens.newAddressScren.intercom
import screens.newAddressScren.saveAddress
import java.util.concurrent.TimeUnit

class TestAddress : MainActivity() {

    @Test
    fun TestAddress() {
        AutorizationScenaries.checkAutorizaitionUser(true)
        clickToElement(selectProfile.androidXPath, LocatorType.XPATH)
        clickToElement(myAddresses.androidAccessId, LocatorType.ACCESSIBILITY_ID)
        clickToElement(addNewAddress.androidAccessId, LocatorType.ACCESSIBILITY_ID)
        try {
            clickToElement(locationResolution.androidXPath, LocatorType.XPATH)
        } catch (e: org.openqa.selenium.NoSuchElementException) {
            println("Элемента не было")
        }
        TimeUnit.SECONDS.sleep(2)
        clickToElement(addNewAddress.androidAccessId, LocatorType.ACCESSIBILITY_ID)
        clickToElement(lineAddress.androidClassName, LocatorType.CLASS_NAME)
        clickToElement(removeAddress.androidXPath, LocatorType.XPATH)
        sendText(lineAddress.androidClassName, LocatorType.CLASS_NAME, "Сапёрный переулок, 24, Санкт-Петербург")
        clickToElement(valueAddress.androidAccessId, LocatorType.ACCESSIBILITY_ID)
        clickToElement(flat.androidXPath, LocatorType.XPATH)
        sendText(flat.androidXPath, LocatorType.XPATH, "1808")
        clickToElement(entrance.androidXPath, LocatorType.XPATH)
        sendText(entrance.androidXPath, LocatorType.XPATH, "9")
        clickToElement(intercom.androidXPath, LocatorType.XPATH)
        sendText(intercom.androidXPath, LocatorType.XPATH, "111")
        clickToElement(floor.androidXPath, LocatorType.XPATH)
        sendText(floor.androidXPath, LocatorType.XPATH, "18")
        clickToElement(commentCourier.androidXPath, LocatorType.XPATH)
        sendText(commentCourier.androidXPath, LocatorType.XPATH, "Есть лифт")
        clickToElement(saveAddress.androidAccessId, LocatorType.ACCESSIBILITY_ID)
        TimeUnit.SECONDS.sleep(2)
        swipeOnScreen(545, 122, 500, 1091)
        clickToElement(selectMenu.androidXPath, LocatorType.XPATH)
        clickToElement(selectProfile.androidXPath, LocatorType.XPATH)
        clickToElement(myAddresses.androidAccessId, LocatorType.ACCESSIBILITY_ID)
        val element = androidDriver.findElement(AppiumBy.accessibilityId("Сапёрный переулок, 24\n" +
                "кв 1808, 9 подъезд, 18 этаж. Домофон: 111. Есть лифт"))
        TimeUnit.SECONDS.sleep(2)
        swipeDeleteAddress(element)
        TimeUnit.SECONDS.sleep(2)
        val element1 = androidDriver.findElement(AppiumBy.accessibilityId("Удалить"))
        tapDeleteAddress(element1)
        swipeOnScreen(545, 122, 500, 1091)
        clickToElement(myAddresses.androidAccessId, LocatorType.ACCESSIBILITY_ID)
        try {
            checkAvaliableElemnt("Сапёрный переулок, 24\n" +
                    "кв 1808, 9 подъезд, 18 этаж. Домофон: 111. Есть лифт", LocatorType.ACCESSIBILITY_ID)
        } catch (e: org.openqa.selenium.NoSuchElementException) {
            println("Адрес удален.")
        }
        TimeUnit.SECONDS.sleep(2)
        swipeOnScreen(545, 122, 500, 1091)
        clickToElement(selectMenu.androidXPath, LocatorType.XPATH)




    }
}