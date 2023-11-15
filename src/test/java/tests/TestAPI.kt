package tests

import api_client.enviroment.Environment
import api_client.enviroment.Environment.enviroment
import api_client.requests.Meals.Meals
import api_client.requests.auth.AuthLogin
import api_client.requests.auth.AuthResetCode
import api_client.requests.getUserData.UserData
import api_client.requests.sessionId.SessionId
import api_client.specifications.Specifications
import org.testng.annotations.Test
import java.util.concurrent.TimeUnit

class TestAPI {

    @Test
    fun TestAPI(){

        Specifications.installSpecification(Specifications.requestSpec(enviroment.host))

        println("Вот изначальниый захардкожанный sesId: ${enviroment.sessionId}")
        enviroment.sessionId = SessionId.get(mutableMapOf()).toString()
        println("Вот вновь полученный sesId: ${enviroment.sessionId}")

        AuthResetCode.post(reqBody = run { AuthResetCode.authResetCodeReqBody(phone = "79616669293") })

        TimeUnit.SECONDS.sleep(5)

        AuthLogin.post(reqBody = run { AuthLogin.authLoginReqBody(phone = "79616669293", code = "3256")})

        UserData.get(mutableMapOf())

        Meals.get(mutableMapOf())




    }

}