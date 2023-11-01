package screens

object addressScren {

    val addNewAddress = ScreenConstructor(
        androidAccessId = "Добавить новый адрес",
        iosAccessibilityId = "Добавить новый адрес",
        elementName = "Нажатие кнопки добавление нового адреса"
    )

    val deleteAddress = ScreenConstructor(
        androidAccessId = "Удалить",
        iosAccessibilityId = "Удалить",
        elementName = "Удаление аддреса"
    )

    val lineAddress = ScreenConstructor(
        androidClassName = "android.widget.EditText",
        iosClassName = "XCUIElementTypeTextField",
        elementName = "Поле ввода Адреса"
    )

    val removeAddress = ScreenConstructor(
        androidXPath = "/hierarchy/android.widget.FrameLayout/" +
                "android.widget.LinearLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.view.View/android.view.View/" +
                "android.view.View/android.view.View[5]/android.view.View/" +
                "android.view.View/android.widget.EditText/android.widget.ImageView",
        iosClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/" +
                "XCUIElementTypeOther/XCUIElementTypeOther/" +
                "XCUIElementTypeOther/XCUIElementTypeOther[2]/" +
                "XCUIElementTypeOther[2]/XCUIElementTypeOther[6]/" +
                "XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/" +
                "XCUIElementTypeOther[2]/XCUIElementTypeImage",
        elementName = "Кнопка чтобы убрать из строки адрес"
    )

    val valueAddress = ScreenConstructor(
        androidAccessId = "Сапёрный переулок, 24, Санкт-Петербург",
        iosAccessibilityId = "Сапёрный переулок, 24, Санкт-Петербург",
        elementName = "Предлагаемый адрес"
    )

    val locationResolution = ScreenConstructor(
        androidXPath = "/hierarchy/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.widget.FrameLayout/" +
                "android.widget.ScrollView/android.widget.LinearLayout/" +
                "android.widget.LinearLayout/android.widget.LinearLayout[3]/" +
                "android.widget.Button[1]",
        iosAccessibilityId = "Allow Once",
        elementName = "Кнокпка на разрешение использования геолокации"

    )


}