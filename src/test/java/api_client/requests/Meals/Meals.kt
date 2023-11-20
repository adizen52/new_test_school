package api_client.requests.Meals

import Get
import Res
import api_client.enviroment.Environment
import api_client.pojo.mealsPojo
import com.google.common.reflect.TypeToken
import com.google.gson.Gson
import io.restassured.response.Response

object Meals : Get, Res, mealsPojo() {

    override lateinit var resBody: List<mealsRes>

    override fun getDataFromJSON(response: Response): List<mealsRes> {
        val jsonString : String = response.asString()
        val gson = Gson()
        val itemType = object : TypeToken<List<mealsRes>>() {}.type

        return gson.fromJson(jsonString, itemType)
    }

    override fun get(queryParams: MutableMap<String, String>) {
        val responseJSON = getReq(
            queryParams = queryParams,
            endPoint = Environment.endPoints.mealsV2,
            responseType = ResponseType.JSON
        )
        resBody = getDataFromJSON(responseJSON)
    }
}