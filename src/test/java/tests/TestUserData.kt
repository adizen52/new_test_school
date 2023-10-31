//package tests
//
//import GlobalVariables.androidDriver
//import MainActivity
//import TestFunctions.changeUserData
//import TestFunctions.checkUserData
//import TestFunctions.clearField
//import TestFunctions.clickToElement
//import TestFunctions.getText
//import TestFunctions.sendText
//import TestFunctions.tapExitPage
//import general_cases_for_test.AutorizationScenaries
//import io.appium.java_client.AppiumBy
//import io.appium.java_client.android.AndroidDriver
//import io.appium.java_client.android.nativekey.AndroidKey
//import org.testng.annotations.Test
//import screens.MainSelector.selectMenu
//import screens.MainSelector.selectProfile
//import screens.MyDataScreens
//import screens.MyDataScreens.Birthday
//import screens.MyDataScreens.Email
//import screens.MyDataScreens.ExitMyData
//import screens.MyDataScreens.Instagram
//import screens.ProfileScreen.myData
//import screens.MyDataScreens.Name
//import screens.MyDataScreens.saveData
//import java.util.concurrent.TimeUnit
//
//
//class TestUserData : MainActivity() {
//
//    @Test
//    fun testData() {
//        val userData1 = mapOf(Name.androidXPath to "Сергей", Birthday.androidXPath to "17 октября 1996", Email.androidXPath to "adizen52@yandex.ru", Instagram.androidXPath to "@adizen52")
//        val userData2 = mapOf(Name.androidXPath to "Марина", Birthday.androidXPath to "17 октября 1996", Email.androidXPath to "Marinka1997@gmail.ru", Instagram.androidXPath to "@Marinka1997")
//
//        AutorizationScenaries.checkAutorizaitionUser(true)
//        clickToElement(selectProfile.androidXPath, LocatorType.XPATH)
//        clickToElement(myData.androidAccessId, LocatorType.ACCESSIBILITY_ID)
//        var userName = getText(Name.androidXPath, LocatorType.XPATH)
//        when (userName) {
//            userData1[Name.androidXPath] -> changeUserData(userData2)
//            userData2[Name.androidXPath] -> changeUserData(userData1)
//        }
//        clickToElement(myData.androidAccessId, LocatorType.ACCESSIBILITY_ID)
//        userName =  getText(Name.androidXPath, LocatorType.XPATH)
//        when (userName) {
//            userData1[Name.androidXPath] -> checkUserData(userData1)
//            userData2[Name.androidXPath] -> checkUserData(userData2)
//        }
//        TimeUnit.SECONDS.sleep(2)
//        tapExitPage(ExitMyData.androidAccessId, LocatorType.ACCESSIBILITY_ID)
//        clickToElement(selectMenu.androidXPath, LocatorType.XPATH)
//    }
//}