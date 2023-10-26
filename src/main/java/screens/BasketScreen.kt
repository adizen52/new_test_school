package screens

object BasketScreen {

    val pickupLocation = ScreenConstructor(
        androidAccessId = "Самовывоз Shop 1",
        elementName = "Выбор места самовывоза"
    )

    val timeDelivery = ScreenConstructor(
        androidAccessId = "Сегодня, через 15 минут",
        elementName = "Изменение времени доставки"
    )

    val commentOrder = ScreenConstructor(
        androidAccessId = "Комментарий к заказу",
        elementName = "Добавление комментария к заказу"
    )

    val commentInpyt = ScreenConstructor(
        androidClassName = "android.widget.EditText",
        elementName = "Ввод комментария"
    )

    val commentDone = ScreenConstructor(
        androidAccessId = "Готово",
        elementName = "Нажатие кнопки готово при написании комментария"
    )

    val addingDevices = ScreenConstructor(
        androidXPath = "//android.view.View[@content-desc=" +
                "\"Приборы 1\"]/android.widget.ImageView[3]",
        elementName = "Добавление столовых приборов"
    )

    val reductionDevices = ScreenConstructor(
        androidXPath = "//android.view.View[@content-desc=" +
                "\"Приборы 1\"]/android.widget.ImageView[2]",
        elementName = "Уменьшение количества приборов"
    )

    val payMethod = ScreenConstructor(
        androidAccessId = "Наличными",
        elementName = "Выбор способа оплаты заказа"
    )

    val promoCode = ScreenConstructor(
        androidAccessId = "Добавить промокод",
        elementName = "Добавление промокода для заказа"
    )

    val orderMeal = ScreenConstructor(
        androidAccessId = "Заказ на сумму\n" +
                "461 ₽",
        elementName = "Кнопка для совершения заказа"
    )

    val allRight = ScreenConstructor(
        androidAccessId = "Все верно",
        elementName = "Подтверждение верности заказа"
    )

    val correctOrder = ScreenConstructor(
        androidAccessId = "Изменить",
        elementName = "Изменение заказа"
    )

}