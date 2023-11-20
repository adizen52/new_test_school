package tests

import MainActivity
import TestFunctions.swipeOnScreen
import api_client.enviroment.Environment
import api_client.requests.Meals.Meals
import api_client.requests.auth.AuthLogin
import api_client.requests.auth.AuthResetCode
import api_client.requests.categories.Categories
import api_client.requests.sessionId.SessionId
import api_client.specifications.Specifications
import general_cases_for_test.AutorizationScenaries
import org.testng.annotations.Test
import screens.BasketScreen
import screens.MainScreen
import screens.MainSelector
import screens.ProfileScreen
import java.util.concurrent.TimeUnit

class TestOrder: MainActivity() {

//    @Test
//    fun test1(){
//        val mainScreens = MainScreen()
//        val basketScreens = BasketScreen()
//        val mainSelector = MainSelector()
//        val profileScreen = ProfileScreen()
//
//        AutorizationScenaries.checkAutorizaitionUser(true)
//        mainScreens.clickHotDish()
//        TimeUnit.SECONDS.sleep(1)
//        mainScreens.clickDishPuree()
//        mainScreens.clickChikenRice()
//        mainScreens.clickSelectBasket()
//        try {
//            basketScreens.clickAddingDevices()
//            basketScreens.clickReductionDevices()
//        } catch (e: org.openqa.selenium.NoSuchElementException)
//        {
//            println("На IOS динамичный элемент, не хочет его искать -_-")
//        }
//        try {
//            basketScreens.clickCommentOrder()
//            basketScreens.sendCommentInput("Как можно скорее.")
//            basketScreens.clickCommentDone()
//        } catch (e: org.openqa.selenium.NoSuchElementException)
//        {
//                println("Комментарий уже внесен.")
//        }
//        TimeUnit.SECONDS.sleep(2)
//        basketScreens.tapOnCenterOrderMeal()
//        basketScreens.clickAllRight()
//        TimeUnit.SECONDS.sleep(6)
//        swipeOnScreen(538, 136, 500, 1091)
//        mainSelector.clickSelectProfile()
//        profileScreen.clickMyOrders()
//        swipeOnScreen(538, 136, 500, 1091)
//        mainSelector.clickSelectMenu()
//    }

    @Test
    fun test2(){
        val mainScreen = MainScreen()
        val mainSelector = MainSelector()

        AutorizationScenaries.checkAutorizaitionUser(true)
        mainScreen.clickHotDish()
        mainScreen.clickHotSnacks()
        mainScreen.clickHotSoups()
        mainScreen.clickHotPasta()
        mainScreen.clickHotSandwiches()
        mainScreen.clickHotPizza()
        mainScreen.clickHotDesserts()
        mainScreen.clickHotSalads()
        mainScreen.clickHotBreakfast()
        mainScreen.clickHotBread()

        Specifications.installSpecification(Specifications.requestSpec(Environment.enviroment.host))
        SessionId.get(mutableMapOf())
        AuthResetCode.post(reqBody = run { AuthResetCode.authResetCodeReqBody(phone = "79616669293") })
        TimeUnit.SECONDS.sleep(3)
        AuthLogin.post(reqBody = run { AuthLogin.authLoginReqBody(phone = "79616669293", code = "3256")})

        Categories.get(mutableMapOf())

        val BreadCategory : String = "Хлеб"
        val CategoryObject = Categories.resBody
        var CategoryCode : String = ""

        for (category in CategoryObject) {
            if (BreadCategory == category.name) {
                CategoryCode = category.code.toString()

            }
        }

        Meals.get(mutableMapOf())
        println(CategoryCode)

        val mealsResponse = Meals.resBody
        for (meals in mealsResponse) {
            if (CategoryCode  == meals.categories[0]) {
                mainScreen.newPrice("${meals.price.toString()} ₽")
                break
            }
        }

        mainScreen.clickMealPrice()
        mainSelector.clickSelectMenu()

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