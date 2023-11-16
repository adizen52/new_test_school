package api_client.requests.sessionId

import Get
import Res
import api_client.enviroment.Environment.endPoints
import api_client.enviroment.Environment.enviroment
import api_client.enviroment.Environment.headers
import io.restassured.response.Response

object SessionId: Get, Res {

    override lateinit var resBody: String

    override fun getDataFromJSON(response: Response): String {
        return response.body.asString()
    }

    override fun get(queryParams: MutableMap<String, String>) {
        val responseJSON = getReq(
            queryParams = queryParams,
            endPoint = endPoints.sessionId,
            responseType = ResponseType.JSON
        )
        resBody = getDataFromJSON(responseJSON)

        headers["sessionid"] = resBody
    }
}