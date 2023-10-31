package screens

// ИНФОРМАЦИОННОЕ ОКНО С НОМЕРОМ И ВРЕМЕНЕМ РАБОТЫ КАФЕ

object InformationScreen {
    val offerInf = ScreenConstructor(
        androidAccessId = "Оферта",
        iosAccessibilityId = "Оферта",
        elementName = "Переход для прочтения информации об оферте"
    )

    val privacyPolicy = ScreenConstructor(
        androidAccessId = "Политика конфиденциальности",
        iosAccessibilityId = "Политика конфиденциальности",
        elementName = "Переход к прочтению политики конфиденц."
    )
}