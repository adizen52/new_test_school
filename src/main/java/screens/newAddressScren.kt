package screens

object newAddressScren {

    val newAddress = ScreenConstructor(
        androidXPath = "/hierarchy/android.widget.FrameLayout/" +
                "android.widget.LinearLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.view.View/android.view.View/" +
                "android.view.View/android.view.View[7]/android.view.View/" +
                "android.view.View/android.widget.EditText",
        iosAccessibilityId = "Адрес",
        elementName = "Поле с введенным адресом"

    )

    val flat = ScreenConstructor(
        androidXPath = "/hierarchy/android.widget.FrameLayout/" +
                "android.widget.LinearLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.view.View/android.view.View/" +
                "android.view.View/android.view.View[7]/android.view.View/" +
                "android.view.View/android.view.View[2]/android.widget.EditText[1]",
        iosAccessibilityId = "Квартира",
        elementName = "Поле ввода квартиры"
    )

    val entrance = ScreenConstructor(
        androidXPath = "/hierarchy/android.widget.FrameLayout/" +
                "android.widget.LinearLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.view.View/android.view.View/" +
                "android.view.View/android.view.View[7]/android.view.View/" +
                "android.view.View/android.view.View[2]/android.widget.EditText[2]",
        iosAccessibilityId = "Подъезд",
        elementName = "Поле ввода подъезда"
    )

    val intercom = ScreenConstructor(
        androidXPath = "/hierarchy/android.widget.FrameLayout/" +
                "android.widget.LinearLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.view.View/android.view.View/" +
                "android.view.View/android.view.View[7]/android.view.View/" +
                "android.view.View/android.view.View[2]/android.widget.EditText[3]",
        iosAccessibilityId = "Домофон",
        elementName = "Поле ввода домофона"
    )

    val floor = ScreenConstructor(
        androidXPath = "/hierarchy/android.widget.FrameLayout/" +
                "android.widget.LinearLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.view.View/android.view.View/" +
                "android.view.View/android.view.View[7]/android.view.View/" +
                "android.view.View/android.view.View[2]/android.widget.EditText[4]",
        iosAccessibilityId = "Этаж",
        elementName = "Поле ввода этажа"
    )

    val commentCourier = ScreenConstructor(
        androidXPath = "/hierarchy/android.widget.FrameLayout/" +
                "android.widget.LinearLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.view.View/android.view.View/" +
                "android.view.View/android.view.View[7]/android.view.View/" +
                "android.view.View/android.view.View[2]/android.widget.EditText[5]",
        iosAccessibilityId = "Комментарий для курьера",
        elementName = "Поле ввода комментария для курьера"
    )

    val saveAddress = ScreenConstructor(
        androidAccessId = "Сохранить",
        iosAccessibilityId = "Сохранить",
        elementName = "Кнопка сохранения адреса"
    )

    val saperniAddress = ScreenConstructor(
        androidAccessId = "Сапёрный переулок, 24\n" +
                "кв 1808, 9 подъезд, 18 этаж. Домофон: 111. Есть лифт",
        iosAccessibilityId = "Сапёрный переулок, 24\n" +
                "кв 1808, 9 подъезд, 18 этаж. Домофон: 111. Есть лифт",
        elementName = "Новый введенный адрес Саперной улицы"
    )


}