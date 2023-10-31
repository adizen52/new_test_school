package screens

object MainScreen {

    val selectBasket = ScreenConstructor(
        androidAccessId = "2\n" +
                "Корзина\n" +
                "461 ₽",
        iosAccessibilityId = "2\n" +
                "Корзина\n" +
                "461 ₽",
        elementName = "Корзина с двумя дабвленными блюдами"
    )

    val dishPuree = ScreenConstructor(
        androidAccessId = "111 ₽",
        iosAccessibilityId = "111 ₽",
        elementName = "Добавление блюда ПЮРЕ"
    )

    val chickenRice = ScreenConstructor(
        androidAccessId = "350 ₽",
        iosClassChain = "**/XCUIElementTypeImage[`label == \"350 ₽\"`][1]",
        elementName = "Добавление блюда Риу - Кура терьяки"
    )

    val hotDish = ScreenConstructor(
        androidAccessId = "Горячее",
        iosAccessibilityId = "Горячее",
        elementName = "Выбор горячих блюд"
    )
}