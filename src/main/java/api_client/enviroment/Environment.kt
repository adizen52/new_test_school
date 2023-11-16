package api_client.enviroment

object Environment {

    var enviroment = Evn()
    val endPoints = EndPoints()
    val headers: MutableMap<String, String> = mutableMapOf(
        "authority" to "api.starterapp.ru",
        "authorization" to "",
        "sessionid" to "",
        "content-type" to "application/json",
        "accept" to "application/json",
        "lang" to "ru",
        "user-agent" to "IOS-device",
        "origin" to "https://school.starterapp.ru",
        "x-real-ip" to "91.197.192.54",
        "timezone" to "Europe/Moscow"
    )

    data class Evn(

        val host: String = "https://api.starterapp.ru/school/",
        val shopId: String = "8c65fc68-dfd9-4591-a8f2-9edf77fbd3fd"
    )

    data class EndPoints(
        val categories: String = "categories/${enviroment.shopId}/v2",
        val authResetCode: String = "auth/resetCode",
        val authLogin: String = "auth/login",
        val sessionId: String = "/user/sessionId",
        val dataUserV2: String = "/user/v2",
        val mealsV2: String = "/meals/${enviroment.shopId}/v2"
    )
}