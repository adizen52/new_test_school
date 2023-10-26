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

    fun userLogIn() {
        clickToElement(selectProfile.androidXPath, LocatorType.XPATH)
        clickToElement(logInCabinet.androidAccessId, LocatorType.ACCESSIBILITY_ID)
        sendText(inputPhone.androidClassName, LocatorType.CLASS_NAME, "9616669293")
        clickToElement(getCode.androidAccessId, LocatorType.ACCESSIBILITY_ID)
        TimeUnit.SECONDS.sleep(5)
        sendText(inputCode.androidClassName, LocatorType.CLASS_NAME, phoneCode())
        clickToElement(selectMenu.androidXPath, LocatorType.XPATH)
    }
    fun userLogOut () {
        clickToElement(selectProfile.androidXPath, LocatorType.XPATH)
        clickToElement(logOut.androidAccessId, LocatorType.ACCESSIBILITY_ID)
        clickToElement(selectMenu.androidXPath, LocatorType.XPATH)
    }

    fun checkAutorizaitionUser(needAutorizationUser: Boolean) {
        var userIsAutorization: Boolean
        try {
            clickToElement(selectProfile.androidXPath, LocatorType.XPATH)
            userIsAutorization = checkAvaliableElemnt(logOut.androidAccessId, LocatorType.ACCESSIBILITY_ID)
        } catch (e: org.openqa.selenium.NoSuchElementException) {
            userIsAutorization = false
        }
        when {
            needAutorizationUser && userIsAutorization -> {clickToElement(selectMenu.androidXPath, LocatorType.XPATH)}
            needAutorizationUser && !userIsAutorization -> {userLogIn()}
            !needAutorizationUser && userIsAutorization -> {userLogOut()}
            !needAutorizationUser && !userIsAutorization -> {clickToElement(selectMenu.androidXPath, LocatorType.XPATH)}
        }
    }
}