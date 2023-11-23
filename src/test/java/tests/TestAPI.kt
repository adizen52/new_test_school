package tests

import api_client.enviroment.Environment.enviroment
import api_client.requests.Meals.Meals
import api_client.requests.auth.AuthLogin
import api_client.requests.auth.AuthResetCode
import api_client.requests.categories.Categories
import api_client.requests.sessionId.SessionId
import api_client.specifications.Specifications
import io.qameta.allure.Description
import org.testng.annotations.Test
import java.util.concurrent.TimeUnit

class TestAPI {
    @Description("Проверка запросов API")
    @Test(description = "Проверка авторизации с использованием API")
    fun TestAPI(){

        Specifications.installSpecification(Specifications.requestSpec(enviroment.host))

        SessionId.get(mutableMapOf())

        AuthResetCode.post(reqBody = run { AuthResetCode.authResetCodeReqBody(phone = "79616669293") })

        TimeUnit.SECONDS.sleep(3)

        AuthLogin.post(reqBody = run { AuthLogin.authLoginReqBody(phone = "79616669293", code = "3256")})

        Categories.get(mutableMapOf())

        Meals.get(mutableMapOf())

    }

}