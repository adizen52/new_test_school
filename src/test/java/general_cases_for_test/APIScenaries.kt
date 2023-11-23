package general_cases_for_test

import GlobalVariables.platformType
import api_client.enviroment.Environment
import api_client.enviroment.Environment.enviroment
import api_client.enviroment.Environment.phoneAndCode
import api_client.requests.Meals.Meals
import api_client.requests.auth.AuthLogin
import api_client.requests.auth.AuthResetCode
import api_client.requests.categories.Categories
import api_client.requests.getUserData.UserData
import api_client.requests.sessionId.SessionId
import api_client.specifications.Specifications
import java.util.concurrent.TimeUnit

object APIScenaries {

    fun autorizationAPI(){
        Specifications.installSpecification(Specifications.requestSpec(enviroment.host))
        SessionId.get(mutableMapOf())
        AuthResetCode.post(reqBody = run { AuthResetCode.authResetCodeReqBody(phone = phoneAndCode.phone)})
        TimeUnit.SECONDS.sleep(3)
        AuthLogin.post(reqBody = run {AuthLogin.authLoginReqBody(phone = phoneAndCode.phone, code = phoneAndCode.code)})
    }

    fun mealCategoryInBasketAPI(category : String) : String{
        autorizationAPI()
        Categories.get(mutableMapOf())

        val CategoryObject = Categories.resBody
        var CategoryCode : String = ""

        for (categoryInArray in CategoryObject) {
            if (category == categoryInArray.name) {
                CategoryCode = categoryInArray.code.toString()
            }
        }

        Meals.get(mutableMapOf())
        var priceMeal : String = ""
        val mealsResponse = Meals.resBody
        for (meals in mealsResponse) {
            if (CategoryCode  == meals.categories[0]) {
                priceMeal = "${meals.price.toString()} ₽"
                break
            }
        }
        return priceMeal
    }

    fun getTestAddressApi() : String{
        autorizationAPI()
        UserData.get(mutableMapOf())

        val addresses = UserData.resBody.addresses
        var locatorElement: String = ""
        for (address in addresses) {
            when {
                Environment.testAddress.street == address.street && platformType == TypeOS.IOS -> {
                    locatorElement = "${address.street}\n" +
                            "кв ${address.flat}, ${address.entrance} подъезд, ${address.floor} этаж. Домофон: ${address.doorphone}. ${address.comment}"
                    break
                }
                Environment.testAddress.street == address.street && platformType == TypeOS.ANDROID -> {
                    locatorElement = "${address.street}\n" +
                            "кв ${address.flat}, ${address.entrance} подъезд, ${address.floor} этаж. Домофон: ${address.doorphone}. ${address.comment}"
                    break
                }
            }
        }
        return locatorElement
    }
}