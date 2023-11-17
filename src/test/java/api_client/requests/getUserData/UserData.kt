package api_client.requests.getUserData

import Get
import Res
import api_client.enviroment.Environment
import api_client.pojo.userPojo
import com.google.common.reflect.TypeToken
import com.google.gson.Gson
import io.restassured.response.Response

object UserData : Get, Res, userPojo() {

    override lateinit var resBody: UserData

    override fun getDataFromJSON(response: Response): UserData {
        val jsonString: String = response.asString()
        val gson = Gson()
        val itemType = object : TypeToken<UserData>() {}.type
        return gson.fromJson(jsonString, itemType)
    }

    override fun get(queryParams: MutableMap<String, String>) : Any {
        val responseJSON = getReq(
            queryParams = queryParams,
            endPoint = Environment.endPoints.dataUserV2,
            responseType = ResponseType.JSON
        )
        resBody = getDataFromJSON(responseJSON)

        return resBody

    }
}