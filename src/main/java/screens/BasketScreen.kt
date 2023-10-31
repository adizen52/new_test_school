package screens

object BasketScreen {

    val pickupLocation = ScreenConstructor(
        androidAccessId = "Самовывоз Shop 1",
        iosAccessibilityId = "Самовывоз\n" +
                "Shop 1",
        elementName = "Выбор места самовывоза"
    )

    val timeDelivery = ScreenConstructor(
        androidAccessId = "Сегодня, через 15 минут",
        iosAccessibilityId = "Сегодня, через 15 минут",
        elementName = "Изменение времени доставки"
    )

    val commentOrder = ScreenConstructor(
        androidAccessId = "Комментарий к заказу",
        iosAccessibilityId = "Комментарий к заказу",
        elementName = "Добавление комментария к заказу"
    )

    val commentInpyt = ScreenConstructor(
        androidClassName = "android.widget.EditText",
        iosClassName = "XCUIElementTypeTextField",
        elementName = "Ввод комментария"
    )

    val commentDone = ScreenConstructor(
        androidAccessId = "Готово",
        iosAccessibilityId = "Готово",
        elementName = "Нажатие кнопки готово при написании комментария"
    )

    val addingDevices = ScreenConstructor(
        androidXPath = "//android.view.View[@content-desc=" +
                "\"Приборы 1\"]/android.widget.ImageView[3]",
        iosClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/" +
                "XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/" +
                "XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/" +
                "XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/" +
                "XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/" +
                "XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/" +
                "XCUIElementTypeOther[4]/XCUIElementTypeImage[3]",
        elementName = "Добавление столовых приборов"
    )

    val reductionDevices = ScreenConstructor(
        androidXPath = "//android.view.View[@content-desc=" +
                "\"Приборы 1\"]/android.widget.ImageView[2]",
        iosClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/" +
                "XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/" +
                "XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/" +
                "XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/" +
                "XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/" +
                "XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/" +
                "XCUIElementTypeOther[4]/XCUIElementTypeImage[2]",
        elementName = "Уменьшение количества приборов"
    )

    val payMethod = ScreenConstructor(
        androidAccessId = "Наличными",
        iosAccessibilityId = "Наличными",
        elementName = "Выбор способа оплаты заказа"
    )

    val promoCode = ScreenConstructor(
        androidAccessId = "Добавить промокод",
        iosAccessibilityId = "Добавить промокод",
        elementName = "Добавление промокода для заказа"
    )

    val orderMeal = ScreenConstructor(
        androidAccessId = "Заказ на сумму\n" +
                "461 ₽",
        iosAccessibilityId = "Заказ на сумму\n" +
                "461 ₽",
        elementName = "Кнопка для совершения заказа"
    )

    val allRight = ScreenConstructor(
        androidAccessId = "Все верно",
        iosAccessibilityId = "Все верно",
        elementName = "Подтверждение верности заказа"
    )

    val correctOrder = ScreenConstructor(
        androidAccessId = "Изменить",
        iosAccessibilityId = "Изменить",
        elementName = "Изменение заказа"
    )

}