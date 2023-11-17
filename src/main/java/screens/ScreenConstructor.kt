package screens

data class ScreenConstructor (
    var androidAccessId : String = "",
    val androidId : String = "",
    var androidXPath : String = "",
    val androidClassName : String = "",
    val elementName : String = "",
    var iosAccessibilityId : String = "",
    val iosId: String = "",
    val iosXpath: String = "",
    var iosClassChain: String = "",
    val iosPredicateString: String = "",
    val iosClassName: String = ""
)