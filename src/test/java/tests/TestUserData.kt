package tests

import MainActivity
import TestFunctions.changeUserData
import TestFunctions.checkUserData
import general_cases_for_test.AutorizationScenaries
import org.testng.annotations.Test
import screens.MainSelector
import screens.MyDataScreens
import screens.ProfileScreen
import java.util.concurrent.TimeUnit


class TestUserData : MainActivity() {

    @Test
    fun test1() {

        val mainSelector = MainSelector()
        val profileScreen = ProfileScreen()
        val myDataScreen = MyDataScreens()

        val userData1 = mapOf(
            "Name" to "Сергей",
            "Birthday" to "17 октября 1996",
            "Email" to "adizen52@yandex.ru",
            "Instagram" to "@adizen52"
        )
        val userData2 = mapOf(
            "Name" to "Марина",
            "Birthday" to "17 октября 1996",
            "Email" to "Marinka1997@gmail.ru",
            "Instagram" to "@Marinka1997"
        )


        AutorizationScenaries.checkAutorizaitionUser(true)
        mainSelector.clickSelectProfile()
        profileScreen.clickMyData()
        var userName : String = myDataScreen.getName()

        when (userName) {
                userData1["Name"] -> changeUserData(userData2)
                userData2["Name"] -> changeUserData(userData1)
        }

        mainSelector.clickSelectMenu()
        mainSelector.clickSelectProfile()
        profileScreen.clickMyData()

        userName =  myDataScreen.getName()
        when (userName) {
            userData1["Name"] -> checkUserData(userData1)
            userData2["Name"] -> checkUserData(userData2)
        }
        TimeUnit.SECONDS.sleep(2)

        myDataScreen.tapOnCenterExit()
        mainSelector.clickSelectMenu()
    }
}