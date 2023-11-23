package api_client.requests.auth

import Post
import Res
import api_client.enviroment.Environment.endPoints
import api_client.pojo.auth.AuthResetCodePojo
import io.qameta.allure.Step
import io.restassured.response.Response

object AuthResetCode : Post, Res, AuthResetCodePojo() {

    override lateinit var resBody: String

    override fun getDataFromJSON(response : Response) : String {
        return response.body.asString()
    }

    fun authResetCodeReqBody(phone : String) : AuthResetCodeReqBody {
        return AuthResetCodeReqBody(phone = phone)
    }

    @Step("Отправка запроса POST для получени кода")
    override fun post(reqBody: Any) {
        val responseJSON = postReq(
            endPoint = endPoints.authResetCode,
            reqBody = reqBody,
            responseType = ResponseType.HTML
        )

        resBody = getDataFromJSON(responseJSON)
    }
}