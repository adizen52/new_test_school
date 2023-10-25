package general_cases_for_test

import TestFunctions.checkAvaliableElemnt
import TestFunctions.clickToElement
import screens.MainSelector
import screens.MainSelector.selectProfile
import screens.ProfileScreen.logOut

object AutorizationScenaries {
    fun checkAutorizaitionUser(needAutorizationUser: Boolean) {
        var userIsAutorization: Boolean
        try {
            clickToElement(selectProfile.androidXPath, LocatorType.XPATH)
            userIsAutorization = checkAvaliableElemnt(logOut.androidAccessId, LocatorType.ACCESSIBILITY_ID)
        } catch (e: org.openqa.selenium.NoSuchElementException) {
            userIsAutorization = false
        }
        when {
            needAutorizationUser && userIsAutorization -> {}
            needAutorizationUser && !userIsAutorization -> {}
            !needAutorizationUser && userIsAutorization -> {}
            !needAutorizationUser && !userIsAutorization -> {}
        }

    }
}