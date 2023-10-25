package screens

// ВСПЛЫВАЮЩИЕ ОКНО - ВЫБОРА МЕТОДА ПОЛУЧЕНИЯ ЗАКАЗА

object DeliveryMethod {

    val selectDelivery = ScreenConstructor(
        androidAccessId = "Доставка",
        elementName = "Выбор способа получения - Доставка"
    )

    val selectPickup = ScreenConstructor(
        androidAccessId = "Самовывоз",
        elementName = "Выбор способа получения - Самовывоз"
    )

    val selectForTable = ScreenConstructor(
        androidAccessId = "За столик",
        elementName = "Выбор получения - за столик"
    )

    val selectClose = ScreenConstructor(
        androidAccessId = "Закрыть",
        elementName = "Закрытие страницы без выбора метода получения"
    )
}