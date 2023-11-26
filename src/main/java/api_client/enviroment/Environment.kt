package api_client.enviroment

object Environment {

    val testAddress = TestAddress()
    val phoneAndCode = PhoneAndCode()
    val categoriesMealsEnv = CategoriesMeals()
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

    data class TestAddress(
        val street : String = "Сапёрный переулок, 24",
        val flat : String = "1808",
        val floor : Int = 18,
        val entrance : String = "9",
        val doorphone : String = "111"
    )

    data class PhoneAndCode(
        val phone : String = "79616669293",
        val code : String = "3256"
    )

    data class CategoriesMeals(
        val hotDish : String = "Горячее",
        val snacks : String = "Закуски",
        val soups : String = "Супы",
        val pasta : String = "Паста",
        val sandwiches : String = "Сендвичи",
        val pizza : String = "Пицца",
        val desserts : String = "Десерты",
        val salads : String = "Салаты",
        val breakfast : String = "Завтраки",
        val bread : String = "Хлеб"
    )
}