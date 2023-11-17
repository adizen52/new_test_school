package tests

import api_client.enviroment.Environment.enviroment
import api_client.enviroment.Environment.testAddress
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

        SessionId.get(mutableMapOf())

        AuthResetCode.post(reqBody = run { AuthResetCode.authResetCodeReqBody(phone = "79616669293") })

        TimeUnit.SECONDS.sleep(3)

        AuthLogin.post(reqBody = run { AuthLogin.authLoginReqBody(phone = "79616669293", code = "3256")})

        UserData.get(mutableMapOf())

        var iosClassChainTestAddress : String = ""
        var flag : Boolean = false
        for (address in UserData.resBody.addresses) {
            if (testAddress.street == address.street) {
                iosClassChainTestAddress = "**/XCUIElementTypeImage[`label == \"${address.street}\n" +
                        "кв ${address.flat}, ${address.entrance} подъезд, ${address.floor} этаж. Домофон: ${address.doorphone}.\"`]"
                flag = true
                break
            } else {
                println("Адрес не соответствует.")
            }
        }
        if (!flag) println("Адрес не был найден.") else println(iosClassChainTestAddress)











    }

}