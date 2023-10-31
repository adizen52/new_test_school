package general_cases_for_test

import TestFunctions.checkAvaliableElemnt
import TestFunctions.clickToElement
import TestFunctions.phoneCode
import TestFunctions.sendText
import screens.EnterScreens.getCode
import screens.EnterScreens.inputCode
import screens.EnterScreens.inputPhone
import screens.MainSelector
import screens.MainSelector.selectMenu
import screens.MainSelector.selectProfile
import screens.ProfileScreen
import screens.ProfileScreen.logInCabinet
import screens.ProfileScreen.logOut
import java.util.concurrent.TimeUnit

object AutorizationScenaries {

    fun inputPhone(){
        val numberPhone = "9616669293"
        for (digit in numberPhone) {
            sendText(inputPhone.androidClassName, LocatorType.CLASS_NAME,
                inputPhone.iosClassName, LocatorType.CLASS_NAME, digit.toString())
        }
    }

    fun inputUserCode(userCode: String) {
        for (number in userCode) {
            sendText(inputCode.androidClassName, LocatorType.CLASS_NAME,
                inputCode.iosClassName, LocatorType.CLASS_NAME, number.toString())
        }

    }

    fun userLogIn() {
        clickToElement(selectProfile.androidXPath, LocatorType.XPATH, selectProfile.iosClassChain, LocatorType.IOS_CLASS_CHAIN)
        clickToElement(logInCabinet.androidAccessId, LocatorType.ACCESSIBILITY_ID, logInCabinet.iosAccessibilityId, LocatorType.ACCESSIBILITY_ID)
//        sendText(inputPhone.androidClassName, LocatorType.CLASS_NAME, "9616669293")
        inputPhone()
        clickToElement(getCode.androidAccessId, LocatorType.ACCESSIBILITY_ID, getCode.iosAccessibilityId, LocatorType.ACCESSIBILITY_ID)
        TimeUnit.SECONDS.sleep(5)
        inputUserCode(phoneCode())
        clickToElement(selectMenu.androidXPath, LocatorType.XPATH, selectMenu.iosClassChain, LocatorType.IOS_CLASS_CHAIN)
    }
    fun userLogOut () {
        clickToElement(selectProfile.androidXPath, LocatorType.XPATH, selectProfile.iosClassChain, LocatorType.IOS_CLASS_CHAIN)
        clickToElement(logOut.androidAccessId, LocatorType.ACCESSIBILITY_ID, logOut.iosAccessibilityId, LocatorType.ACCESSIBILITY_ID)
        clickToElement(selectMenu.androidXPath, LocatorType.XPATH, selectMenu.iosClassChain, LocatorType.IOS_CLASS_CHAIN)
    }

    fun checkAutorizaitionUser(needAutorizationUser: Boolean) {
        var userIsAutorization: Boolean
        try {
            clickToElement(selectProfile.androidXPath, LocatorType.XPATH, selectProfile.iosClassChain, LocatorType.IOS_CLASS_CHAIN)
            userIsAutorization = checkAvaliableElemnt(logOut.androidAccessId, LocatorType.ACCESSIBILITY_ID, logOut.iosAccessibilityId, LocatorType.ACCESSIBILITY_ID)
        } catch (e: org.openqa.selenium.NoSuchElementException) {
            userIsAutorization = false
        }
        when {
            needAutorizationUser && userIsAutorization -> {clickToElement(selectMenu.androidXPath, LocatorType.XPATH, selectMenu.iosClassChain, LocatorType.IOS_CLASS_CHAIN)}
            needAutorizationUser && !userIsAutorization -> {userLogIn()}
            !needAutorizationUser && userIsAutorization -> {userLogOut()}
            !needAutorizationUser && !userIsAutorization -> {clickToElement(selectMenu.androidXPath, LocatorType.XPATH, selectMenu.iosClassChain, LocatorType.IOS_CLASS_CHAIN)}
        }
    }
}