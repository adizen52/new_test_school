package api_client.enviroment

object Environment {

    var enviroment = Evn()
    val endPoints = EndPoints()
    val headers: MutableMap<String, String> = mutableMapOf(
        "authority" to "api.starterapp.ru",
        "authorization" to enviroment.authToken,
        "sessionid" to enviroment.sessionId,
        "content-type" to "application/json",
        "accept" to "application/json",
        "lang" to "ru",
        "user-agent" to "IOS-device",
        "origin" to "https://school.starterapp.ru",
        "x-real-ip" to "91.197.192.54",
        "timezone" to "Europe/Moscow"
    )

    data class Evn(
        var authToken: String = "",
        var sessionId: String = "1f9a128f-0c98-4d5b-8f99-1ff2eb8f4938",
        val host: String = "https://api.starterapp.ru/school/",
        val shopId: String = "8c65fc68-dfd9-4591-a8f2-9edf77fbd3fd"
    )

    data class EndPoints(
        val categories: String = "categories/${Evn().shopId}/v2",
        val authResetCode: String = "/auth/resetCode"
    )
}