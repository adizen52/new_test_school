package api_client.requests.auth

import Post
import Res
import api_client.enviroment.Environment
import api_client.pojo.auth.AuthLoginPojo
import api_client.pojo.auth.AuthResetCodePojo
import io.restassured.response.Response

object AuthLogin : Post, Res, AuthLoginPojo() {

    override lateinit var resBody: String

    override fun getDataFromJSON(response : Response) : String {
        return response.body.asString()
    }

    fun authLoginReqBody(phone : String, code : String) : AuthLoginReqBody {
        return AuthLoginReqBody(phone = phone, code = code)
    }

    override fun post(reqBody: Any) {
        val responseJSON = AuthResetCode.postReq(
            endPoint = Environment.endPoints.authLogin,
            reqBody = reqBody,
            responseType = ResponseType.HTML
        )

        resBody = getDataFromJSON(responseJSON)
    }
}