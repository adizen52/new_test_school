package general_cases_for_test

import GlobalVariables.androidDriver
import GlobalVariables.iosDriver
import GlobalVariables.platformType
import screens.EnterScreens
import screens.MainSelector
import screens.ProfileScreen
import java.util.concurrent.TimeUnit

object AutorizationScenaries {

    //ввод телефона при входе пользователя ios/android
    fun inputUserPhone(){
        val numberPhone = "9616669293"
        if (platformType == TypeOS.IOS) {
            for (digit in numberPhone) {
                EnterScreens().sendInputPhone(digit.toString())
            }
        } else {
            EnterScreens().sendInputPhone(numberPhone)
        }
    }

    //ввод кода при входе пользователя
    fun phoneCode() : String {
        var xmlTextPage: String

        if (platformType == TypeOS.ANDROID) {
            xmlTextPage = androidDriver.pageSource
        } else {
            xmlTextPage = iosDriver.pageSource
        }

        val code = (xmlTextPage.substringAfter("Введите код из смс&#10;")).substringBefore("&#10;")
        return code
    }

    //получении кода со страницы
    fun inputUserCode(userCode: String) {
        if (platformType == TypeOS.IOS) {
            for (number in userCode) {
                EnterScreens().sendInputCode(number.toString())
            }
        } else {
            EnterScreens().sendInputCode(userCode)
        }
    }

    //вход пользователя
    fun userLogIn() {
        MainSelector().clickSelectProfile()
        ProfileScreen().clickLogInCabinet()
        inputUserPhone()
        EnterScreens().clickGetCode()
        TimeUnit.SECONDS.sleep(5)
        inputUserCode(phoneCode())
        MainSelector().clickSelectMenu()
    }

    //выход пользователя
    fun userLogOut () {
        MainSelector().clickSelectProfile()
        ProfileScreen().clickLogOut()
        MainSelector().clickSelectMenu()
    }

    //проверка наличия активного пользователя
    fun checkAutorizaitionUser(needAutorizationUser: Boolean) {
        var userIsAutorization: Boolean
        val profileScreen = ProfileScreen()

        try {
            MainSelector().clickSelectProfile()

            userIsAutorization = profileScreen.checkLogOut()
        } catch (e: org.openqa.selenium.NoSuchElementException) {
            userIsAutorization = false
        }
        when {
            needAutorizationUser && userIsAutorization -> {MainSelector().clickSelectMenu()}
            needAutorizationUser && !userIsAutorization -> {userLogIn()}
            !needAutorizationUser && userIsAutorization -> {userLogOut()}
            !needAutorizationUser && !userIsAutorization -> {MainSelector().clickSelectMenu()}
        }
    }
}