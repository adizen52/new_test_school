package tests

import GlobalVariables.platformType
import MainActivity
import TypeOS
import api_client.enviroment.Environment.categoriesMealsEnv
import general_cases_for_test.APIScenaries
import general_cases_for_test.APIScenaries.mealCategoryInBasketAPI
import general_cases_for_test.AutorizationScenaries
import general_cases_for_test.UnificationsScenaries.swipeCategoryCoordinates
import io.qameta.allure.Description
import org.testng.annotations.Test
import org.testng.reporters.jq.Main
import screens.MainScreen
import screens.MainSelector

class NewTest: MainActivity() {

    @Description("Тест для проверки унификаций")
    @Test(description = "Проверка унификации по категориям")
    fun test1() {
        val mainScreen = MainScreen()
        val mainSelector = MainSelector()

        val needCategory = categoriesMealsEnv.breakfast

        AutorizationScenaries.checkAutorizaitionUser(true)
        mainScreen.completionTimingCategory(needCategory)

        when {
            platformType == TypeOS.IOS -> {
                val availableNeedCategory = mainScreen.findTimingCategory(findElementWithoutCatching = true)
                val visibleNeedCategory = mainScreen.visibleTimingCategory()
                var step = 0
                if (availableNeedCategory) {
                    while (step != 4) {
                        if (visibleNeedCategory) {
                            mainScreen.clickTimingCategory()
                            break
                        } else {
                            swipeCategoryCoordinates()
                            step += 1
                        }
                    }
                }
            }
            platformType == TypeOS.ANDROID -> {
                var step = 0
                while (step != 4) {
                    try {
                        if (mainScreen.findTimingCategory(findElementWithoutCatching = true)) {
                            mainScreen.clickTimingCategory()
                            break
                        }
                        else {
                            swipeCategoryCoordinates()
                            step += 1
                        }
                    } catch (e: org.openqa.selenium.NoSuchElementException) {
                        println("Элемент еще не найден")
                        swipeCategoryCoordinates()
                        step += 1
                    }
                }

            }
        }

        mainScreen.newPrice(mealCategoryInBasketAPI(needCategory))
        mainScreen.clickMealPrice()
        mainSelector.clickSelectMenu()

    }

}