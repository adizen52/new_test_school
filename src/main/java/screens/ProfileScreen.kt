package screens

// ОКНО - ПРОФИЛЯ ПОЛЬЗОВАТЕЛЯ

object ProfileScreen {
    val myOrders = ScreenConstructor(
        androidAccessId = "Мои заказы",
        iosAccessibilityId = "Мои заказы",
        elementName = "Выбор моих заказов"
    )

    val myAddresses = ScreenConstructor(
        androidAccessId = "Мои адреса",
        iosAccessibilityId = "Мои адреса",
        elementName = "Выбор моих адресов"
    )

    val myData = ScreenConstructor(
        androidAccessId = "Мои данные",
        iosAccessibilityId = "Мои данные",
        elementName = "Выбор моих данных"
    )

    val payMethod = ScreenConstructor(
        androidAccessId = "Способы оплаты",
        iosAccessibilityId = "Способы оплаты",
        elementName = "Переход к выбору способа оплаты"
    )

    val logInCabinet = ScreenConstructor(
        androidAccessId = "Войти",
        iosAccessibilityId = "Войти",
        elementName = "Кнопка для входа"
    )

    val logOut = ScreenConstructor(
        androidAccessId = "Выйти",
        iosAccessibilityId = "Выйти",
        elementName = "Кнопка для ВЫХОДА из аккаунта"
    )
}