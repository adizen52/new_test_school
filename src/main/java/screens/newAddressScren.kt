package screens

object newAddressScren {

    val newAddress = ScreenConstructor(
        androidXPath = "/hierarchy/android.widget.FrameLayout/" +
                "android.widget.LinearLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.view.View/android.view.View/" +
                "android.view.View/android.view.View[7]/android.view.View/" +
                "android.view.View/android.widget.EditText"
    )

    val flat = ScreenConstructor(
        androidXPath = "/hierarchy/android.widget.FrameLayout/" +
                "android.widget.LinearLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.view.View/android.view.View/" +
                "android.view.View/android.view.View[7]/android.view.View/" +
                "android.view.View/android.view.View[2]/android.widget.EditText[1]",
        elementName = "Поле ввода квартиры"
    )

    val entrance = ScreenConstructor(
        androidXPath = "/hierarchy/android.widget.FrameLayout/" +
                "android.widget.LinearLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.view.View/android.view.View/" +
                "android.view.View/android.view.View[7]/android.view.View/" +
                "android.view.View/android.view.View[2]/android.widget.EditText[2]",
        elementName = "Поле ввода подъезда"
    )

    val intercom = ScreenConstructor(
        androidXPath = "/hierarchy/android.widget.FrameLayout/" +
                "android.widget.LinearLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.view.View/android.view.View/" +
                "android.view.View/android.view.View[7]/android.view.View/" +
                "android.view.View/android.view.View[2]/android.widget.EditText[3]",
        elementName = "Поле ввода домофона"
    )

    val floor = ScreenConstructor(
        androidXPath = "/hierarchy/android.widget.FrameLayout/" +
                "android.widget.LinearLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.view.View/android.view.View/" +
                "android.view.View/android.view.View[7]/android.view.View/" +
                "android.view.View/android.view.View[2]/android.widget.EditText[4]",
        elementName = "Поле ввода этажа"
    )

    val commentCourier = ScreenConstructor(
        androidXPath = "/hierarchy/android.widget.FrameLayout/" +
                "android.widget.LinearLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.view.View/android.view.View/" +
                "android.view.View/android.view.View[7]/android.view.View/" +
                "android.view.View/android.view.View[2]/android.widget.EditText[5]",
        elementName = "Поле ввода комментария для курьера"
    )

    val saveAddress = ScreenConstructor(
        androidAccessId = "Сохранить",
        elementName = "Кнопка сохранения адреса"
    )


}