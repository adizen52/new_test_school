package screens

object addressScren {

    val addNewAddress = ScreenConstructor(
        androidAccessId = "Добавить новый адрес",
        elementName = "Нажатие кнопки добавление нового адреса"
    )

    val deleteAddress = ScreenConstructor(
        androidAccessId = "Удалить",
        elementName = "Удаление аддреса"
    )

    val lineAddress = ScreenConstructor(
        androidClassName = "android.widget.EditText",
        elementName = "Поле ввода Адреса"
    )

    val removeAddress = ScreenConstructor(
        androidXPath = "/hierarchy/android.widget.FrameLayout/" +
                "android.widget.LinearLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.view.View/android.view.View/" +
                "android.view.View/android.view.View[5]/android.view.View/" +
                "android.view.View/android.widget.EditText/android.widget.ImageView",
        elementName = "Кнопка чтобы убрать из строки адрес"
    )

    val valueAddress = ScreenConstructor(
        androidAccessId = "Сапёрный переулок, 24, Санкт-Петербург",
        elementName = "Предлагаемый адрес"
    )

    val locationResolution = ScreenConstructor(
        androidXPath = "/hierarchy/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.widget.FrameLayout/" +
                "android.widget.ScrollView/android.widget.LinearLayout/" +
                "android.widget.LinearLayout/android.widget.LinearLayout[3]/" +
                "android.widget.Button[1]",
        elementName = "Кнокпка на разрешение использования геолокации"

    )






}