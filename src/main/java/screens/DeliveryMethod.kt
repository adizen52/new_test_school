package screens

// ВСПЛЫВАЮЩИЕ ОКНО - ВЫБОРА МЕТОДА ПОЛУЧЕНИЯ ЗАКАЗА

object DeliveryMethod {

    val selectDelivery = ScreenConstructor(
        androidAccessId = "Доставка",
        iosAccessibilityId = "Доставка",
        elementName = "Выбор способа получения - Доставка"
    )

    val selectPickup = ScreenConstructor(
        androidAccessId = "Самовывоз",
        iosAccessibilityId = "Самовывоз",
        elementName = "Выбор способа получения - Самовывоз"
    )

    val selectForTable = ScreenConstructor(
        androidAccessId = "За столик",
        iosAccessibilityId = "За столик",
        elementName = "Выбор получения - за столик"
    )

    val selectClose = ScreenConstructor(
        androidAccessId = "Закрыть",
        iosAccessibilityId = "Закрыть",
        elementName = "Закрытие страницы без выбора метода получения"
    )
}