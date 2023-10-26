package tests

import LocatorType
import MainActivity
import TestFunctions.clickToElement
import TestFunctions.sendText
import TestFunctions.swipeOnScreen
import TestFunctions.tapByCoordinates
import general_cases_for_test.AutorizationScenaries.checkAutorizaitionUser
import org.testng.annotations.Test
import screens.BasketScreen.allRight
import screens.BasketScreen.commentDone
import screens.BasketScreen.commentInpyt
import screens.BasketScreen.commentOrder
import screens.BasketScreen.orderMeal
import screens.MainScreen.chickenRice
import screens.MainScreen.dishPuree
import screens.MainScreen.hotDish
import screens.MainScreen.selectBasket
import screens.MainSelector.selectMenu
import screens.MainSelector.selectProfile
import screens.ProfileScreen.myOrders
import java.util.concurrent.TimeUnit

class TestsClass : MainActivity() {

    @Test
    fun test1(){
        checkAutorizaitionUser(true)
        clickToElement(hotDish.androidAccessId, LocatorType.ACCESSIBILITY_ID)
//        clickToElement(dishPuree.androidAccessId, LocatorType.ACCESSIBILITY_ID)
        //tapByCoordinates(538, 2090)
        TimeUnit.SECONDS.sleep(3)
        tapByCoordinates(100, 1041)
        tapByCoordinates(630, 1041)
        TimeUnit.SECONDS.sleep(2)
        tapByCoordinates(230, 1880)

       // tapByCoordinates(630, 1041)
//        clickToElement(chickenRice.androidAccessId, LocatorType.ACCESSIBILITY_ID)
//        clickToElement(selectBasket.androidAccessId, LocatorType.ACCESSIBILITY_ID)
        clickToElement(commentOrder.androidAccessId, LocatorType.ACCESSIBILITY_ID)
        sendText(commentInpyt.androidClassName, LocatorType.CLASS_NAME, "AS SOON AS POSSIBLE")
        clickToElement(commentDone.androidAccessId, LocatorType.ACCESSIBILITY_ID)
        clickToElement(orderMeal.androidAccessId, LocatorType.ACCESSIBILITY_ID)
        clickToElement(allRight.androidAccessId, LocatorType.ACCESSIBILITY_ID)
        TimeUnit.SECONDS.sleep(6)
        swipeOnScreen(538, 136, 500, 1091)
        clickToElement(selectProfile.androidXPath, LocatorType.XPATH)
        clickToElement(myOrders.androidAccessId, LocatorType.ACCESSIBILITY_ID)
        swipeOnScreen(538, 136, 500, 1091)
        clickToElement(selectMenu.androidXPath, LocatorType.XPATH)

    }

    @Test
    fun test2(){
        checkAutorizaitionUser(true)
    }

    @Test
    fun test3(){
        checkAutorizaitionUser(false)
    }

    @Test
    fun test4(){
        checkAutorizaitionUser(false)
    }
}