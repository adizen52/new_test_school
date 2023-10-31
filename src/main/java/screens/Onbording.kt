package screens

// ВХОДНОЕ ОКНО С ВЫБОРОМ ЯЗЫКА
object Onboarding {

    val selectLanguage = ScreenConstructor(
        androidAccessId = "Русский",
        iosAccessibilityId = "Русский",
        elementName = "Выбор русского языка на экране онбординга"
    )

    val nextButton = ScreenConstructor(
        androidAccessId = "Далее",
        iosAccessibilityId = "Далее",
        elementName = "Кнопка далее на экране онбординга"
    )
}