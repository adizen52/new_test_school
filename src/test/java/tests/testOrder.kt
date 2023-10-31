package tests

import MainActivity
import TestFunctions.clickToElement
import TestFunctions.sendText
import TestFunctions.swipeOnScreen
import general_cases_for_test.AutorizationScenaries
import org.testng.annotations.Test
import screens.BasketScreen
import screens.BasketScreen.allRight
import screens.BasketScreen.commentDone
import screens.BasketScreen.commentInpyt
import screens.BasketScreen.commentOrder
import screens.BasketScreen.orderMeal
import screens.MainScreen
import screens.MainScreen.chickenRice
import screens.MainScreen.dishPuree
import screens.MainScreen.hotDish
import screens.MainScreen.selectBasket
import screens.MainSelector
import screens.MainSelector.selectMenu
import screens.MainSelector.selectProfile
import screens.ProfileScreen
import screens.ProfileScreen.myOrders
import java.util.concurrent.TimeUnit

class testOrder: MainActivity() {

    @Test
    fun test1(){
        AutorizationScenaries.checkAutorizaitionUser(true)
        clickToElement(hotDish.androidAccessId, LocatorType.ACCESSIBILITY_ID, hotDish.iosAccessibilityId, LocatorType.ACCESSIBILITY_ID)
        clickToElement(dishPuree.androidAccessId, LocatorType.ACCESSIBILITY_ID, dishPuree.iosAccessibilityId, LocatorType.ACCESSIBILITY_ID)
        clickToElement(chickenRice.androidAccessId, LocatorType.ACCESSIBILITY_ID, chickenRice.iosAccessibilityId, LocatorType.ACCESSIBILITY_ID)
        clickToElement(selectBasket.androidAccessId, LocatorType.ACCESSIBILITY_ID, selectBasket.iosAccessibilityId, LocatorType.ACCESSIBILITY_ID)
        clickToElement(commentOrder.androidAccessId, LocatorType.ACCESSIBILITY_ID, commentOrder.iosAccessibilityId, LocatorType.ACCESSIBILITY_ID)
        sendText(commentInpyt.androidClassName, LocatorType.CLASS_NAME, commentInpyt.iosClassName, LocatorType.CLASS_NAME,"AS SOON AS POSSIBLE")
        clickToElement(commentDone.androidAccessId, LocatorType.ACCESSIBILITY_ID, commentDone.iosAccessibilityId, LocatorType.ACCESSIBILITY_ID)
        clickToElement(orderMeal.androidAccessId, LocatorType.ACCESSIBILITY_ID, orderMeal.iosAccessibilityId, LocatorType.ACCESSIBILITY_ID)
        clickToElement(allRight.androidAccessId, LocatorType.ACCESSIBILITY_ID, allRight.iosAccessibilityId, LocatorType.ACCESSIBILITY_ID)
        TimeUnit.SECONDS.sleep(6)
        swipeOnScreen(538, 136, 500, 1091)
        clickToElement(selectProfile.androidXPath, LocatorType.XPATH, selectProfile.iosClassChain, LocatorType.IOS_CLASS_CHAIN)
        clickToElement(myOrders.androidAccessId, LocatorType.ACCESSIBILITY_ID, myOrders.iosAccessibilityId, LocatorType.ACCESSIBILITY_ID)
        swipeOnScreen(538, 136, 500, 1091)
        clickToElement(selectMenu.androidXPath, LocatorType.XPATH, selectMenu.iosClassChain, LocatorType.IOS_CLASS_CHAIN)

    }

    @Test
    fun test2(){
        AutorizationScenaries.checkAutorizaitionUser(true)
    }

    @Test
    fun test3(){
        AutorizationScenaries.checkAutorizaitionUser(false)
    }

    @Test
    fun test4(){
        AutorizationScenaries.checkAutorizaitionUser(false)
    }
}