package tests

import MainActivity
import TestFunctions.swipeOnScreen
import general_cases_for_test.APIScenaries.mealCategoryInBasketAPI
import general_cases_for_test.AutorizationScenaries
import io.qameta.allure.Description
import org.testng.annotations.Test
import screens.BasketScreen
import screens.MainScreen
import screens.MainSelector
import screens.ProfileScreen
import java.util.concurrent.TimeUnit

class TestOrder: MainActivity() {
    @Description("Тест кейсы - для заказов")
    @Test(description = "Тест по оформлению заказа")
    fun test1(){
        val mainScreens = MainScreen()
        val basketScreens = BasketScreen()
        val mainSelector = MainSelector()
        val profileScreen = ProfileScreen()

        AutorizationScenaries.checkAutorizaitionUser(true)
        mainScreens.clickHotDish()
        TimeUnit.SECONDS.sleep(1)
        mainScreens.clickDishPuree()
        mainScreens.clickChikenRice()
        mainScreens.clickSelectBasket()
        try {
            basketScreens.clickAddingDevices(findElementWithoutCatching = true)
            basketScreens.clickReductionDevices(findElementWithoutCatching = true)
        } catch (e: org.openqa.selenium.NoSuchElementException)
        {
            println("На IOS динамичный элемент, не хочет его искать -_-")
        }
        try {
            basketScreens.clickCommentOrder(findElementWithoutCatching = true)
            basketScreens.sendCommentInput("Как можно скорее.", findElementWithoutCatching = true)
            basketScreens.clickCommentDone(findElementWithoutCatching = true)
        } catch (e: org.openqa.selenium.NoSuchElementException)
        {
                println("Комментарий уже внесен.")
        }
        TimeUnit.SECONDS.sleep(2)
        basketScreens.tapOnCenterOrderMeal()
        basketScreens.clickAllRight()
        TimeUnit.SECONDS.sleep(6)
        swipeOnScreen(538, 136, 500, 1091)
        mainSelector.clickSelectProfile()
        profileScreen.clickMyOrders()
        swipeOnScreen(538, 136, 500, 1091)
        mainSelector.clickSelectMenu()
    }

    @Test(description = "Тест с использованием API для добавления товара в корзину")
    fun test2(){
        val mainScreen = MainScreen()
        val mainSelector = MainSelector()

        AutorizationScenaries.checkAutorizaitionUser(true)
        mainScreen.clickHotDish()
        TimeUnit.SECONDS.sleep(1)
        mainScreen.clickHotSnacks()
        TimeUnit.SECONDS.sleep(1)
        mainScreen.clickHotSoups()
        TimeUnit.SECONDS.sleep(1)
        mainScreen.clickHotPasta()
        TimeUnit.SECONDS.sleep(1)
        mainScreen.clickHotSandwiches()
        TimeUnit.SECONDS.sleep(1)
        mainScreen.clickHotPizza()
        TimeUnit.SECONDS.sleep(1)
        mainScreen.clickHotDesserts()
        TimeUnit.SECONDS.sleep(1)
        mainScreen.clickHotSalads()
        TimeUnit.SECONDS.sleep(1)
        mainScreen.clickHotBreakfast()
        TimeUnit.SECONDS.sleep(1)
        mainScreen.clickHotBread()
        mainScreen.newPrice(mealCategoryInBasketAPI("Хлеб"))
        mainScreen.clickMealPrice()
        mainSelector.clickSelectMenu()
    }
}