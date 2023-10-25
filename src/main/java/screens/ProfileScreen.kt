package screens

// ОКНО - ПРОФИЛЯ ПОЛЬЗОВАТЕЛЯ

object ProfileScreen {
    val myOrders = ScreenConstructor(
        androidAccessId = "Мои заказы",
        elementName = "Выбор моих заказов"
    )

    val myAddresses = ScreenConstructor(
        androidAccessId = "Мои адреса",
        elementName = "Выбор моих адресов"
    )

    val myData = ScreenConstructor(
        androidAccessId = "Мои данные",
        elementName = "Выбор моих данных"
    )

    val payMethod = ScreenConstructor(
        androidAccessId = "Способы оплаты",
        elementName = "Переход к выбору способа оплаты"
    )

    val logInCabinet = ScreenConstructor(
        androidAccessId = "Войти",
        elementName = "Кнопка для входа"
    )

    val logOut = ScreenConstructor(
        androidAccessId = "Выйти",
        elementName = "Кнопка для ВЫХОДА из аккаунта"
    )
}