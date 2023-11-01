package tests

import GlobalVariables.androidDriver
import LocatorType
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
import screens.newAddressScren.saperniAddress
import screens.newAddressScren.saveAddress
import java.util.concurrent.TimeUnit

class TestAddress : MainActivity() {

    @Test
    fun Test1() {
        AutorizationScenaries.checkAutorizaitionUser(true)
        clickToElement(selectProfile.androidXPath, LocatorType.XPATH, selectProfile.iosClassChain, LocatorType.IOS_CLASS_CHAIN)
        clickToElement(myAddresses.androidAccessId, LocatorType.ACCESSIBILITY_ID, myAddresses.iosAccessibilityId, LocatorType.ACCESSIBILITY_ID)
        TimeUnit.SECONDS.sleep(3)
        clickToElement(addNewAddress.androidAccessId, LocatorType.ACCESSIBILITY_ID, addNewAddress.iosAccessibilityId, LocatorType.ACCESSIBILITY_ID)
        try {
            clickToElement(locationResolution.androidXPath, LocatorType.XPATH, locationResolution.iosAccessibilityId, LocatorType.ACCESSIBILITY_ID)
        } catch (e: org.openqa.selenium.NoSuchElementException) {
            println("Элемента не было")
        }
        TimeUnit.SECONDS.sleep(3)
        clickToElement(addNewAddress.androidAccessId, LocatorType.ACCESSIBILITY_ID, addNewAddress.iosAccessibilityId, LocatorType.ACCESSIBILITY_ID)
        clickToElement(lineAddress.androidClassName, LocatorType.CLASS_NAME, lineAddress.iosClassName, LocatorType.CLASS_NAME)
        TimeUnit.SECONDS.sleep(2)
        clickToElement(removeAddress.androidXPath, LocatorType.XPATH, removeAddress.iosClassChain, LocatorType.IOS_CLASS_CHAIN)
        sendText(lineAddress.androidClassName, LocatorType.CLASS_NAME, lineAddress.iosClassName, LocatorType.CLASS_NAME, "Сапёрный переулок, 24, Санкт-Петербург")
        clickToElement(valueAddress.androidAccessId, LocatorType.ACCESSIBILITY_ID, valueAddress.iosAccessibilityId, LocatorType.ACCESSIBILITY_ID)
        clickToElement(flat.androidXPath, LocatorType.XPATH, flat.iosAccessibilityId, LocatorType.ACCESSIBILITY_ID)
        sendText(flat.androidXPath, LocatorType.XPATH, flat.iosAccessibilityId, LocatorType.ACCESSIBILITY_ID, "1808")
        clickToElement(entrance.androidXPath, LocatorType.XPATH, entrance.iosAccessibilityId, LocatorType.ACCESSIBILITY_ID)
        sendText(entrance.androidXPath, LocatorType.XPATH, entrance.iosAccessibilityId, LocatorType.ACCESSIBILITY_ID, "9")
        clickToElement(intercom.androidXPath, LocatorType.XPATH, intercom.iosAccessibilityId, LocatorType.ACCESSIBILITY_ID)
        sendText(intercom.androidXPath, LocatorType.XPATH, intercom.iosAccessibilityId, LocatorType.ACCESSIBILITY_ID, "111")
        clickToElement(floor.androidXPath, LocatorType.XPATH, floor.iosAccessibilityId, LocatorType.ACCESSIBILITY_ID)
        sendText(floor.androidXPath, LocatorType.XPATH, floor.iosAccessibilityId, LocatorType.ACCESSIBILITY_ID, "18")
        clickToElement(commentCourier.androidXPath, LocatorType.XPATH, commentCourier.iosAccessibilityId, LocatorType.ACCESSIBILITY_ID)
        sendText(commentCourier.androidXPath, LocatorType.XPATH, commentCourier.iosAccessibilityId, LocatorType.ACCESSIBILITY_ID, "Есть лифт")
        clickToElement(saveAddress.androidAccessId, LocatorType.ACCESSIBILITY_ID, saveAddress.iosAccessibilityId, LocatorType.ACCESSIBILITY_ID)
        TimeUnit.SECONDS.sleep(2)
        swipeOnScreen(545, 122, 500, 1091)
        clickToElement(selectMenu.androidXPath, LocatorType.XPATH, selectMenu.iosClassChain, LocatorType.IOS_CLASS_CHAIN)
        clickToElement(selectProfile.androidXPath, LocatorType.XPATH, selectProfile.iosClassChain, LocatorType.IOS_CLASS_CHAIN)
        clickToElement(myAddresses.androidAccessId, LocatorType.ACCESSIBILITY_ID, myAddresses.iosAccessibilityId, LocatorType.ACCESSIBILITY_ID)
        TimeUnit.SECONDS.sleep(2)
        swipeDeleteAddress(saperniAddress.androidAccessId, LocatorType.ACCESSIBILITY_ID, saperniAddress.iosAccessibilityId, LocatorType.ACCESSIBILITY_ID)
        TimeUnit.SECONDS.sleep(2)
//        val element1 = androidDriver.findElement(AppiumBy.accessibilityId("Удалить"))
        tapDeleteAddress(deleteAddress.androidAccessId, LocatorType.ACCESSIBILITY_ID, deleteAddress.iosAccessibilityId, LocatorType.ACCESSIBILITY_ID)
        swipeOnScreen(545, 122, 500, 1091)
        clickToElement(myAddresses.androidAccessId, LocatorType.ACCESSIBILITY_ID, myAddresses.iosAccessibilityId, LocatorType.ACCESSIBILITY_ID)
        try {
            checkAvaliableElemnt(saperniAddress.androidAccessId, LocatorType.ACCESSIBILITY_ID, saperniAddress.iosAccessibilityId, LocatorType.ACCESSIBILITY_ID)
        } catch (e: org.openqa.selenium.NoSuchElementException) {
            println("Адрес удален.")
        }
        TimeUnit.SECONDS.sleep(2)
        swipeOnScreen(545, 122, 500, 1091)
        clickToElement(selectMenu.androidXPath, LocatorType.XPATH, selectMenu.iosClassChain, LocatorType.IOS_CLASS_CHAIN)
    }
}