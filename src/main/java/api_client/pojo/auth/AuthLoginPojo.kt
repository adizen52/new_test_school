package api_client.pojo.auth

open class AuthLoginPojo {
    data class AuthLoginReqBody(
        val phone: String,
        val code : String
    )
}