package api_client.requests.categories

import Get
import Res
import api_client.enviroment.Environment.endPoints
import api_client.pojo.CategoriesPojo
import com.google.common.reflect.TypeToken
import com.google.gson.Gson
import io.restassured.response.Response

object Categories : Get, Res, CategoriesPojo() {

    override lateinit var resBody: List<CategoriesRes>

    override fun getDataFromJSON(response: Response): List<CategoriesRes> {
        val jsonString : String = response.toString()
        val gson = Gson()
        val itemType = object : TypeToken<List<CategoriesRes>>() {}.type

        return gson.fromJson(jsonString, itemType)
    }

    override fun get(queryParams: MutableMap<String, String>){
        val responseJSON = getReq(
            queryParams = queryParams,
            endPoint = endPoints.categories,
            responseType = ResponseType.JSON
        )
        resBody = getDataFromJSON(responseJSON)
    }
}