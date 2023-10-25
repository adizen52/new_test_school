package screens

// НИЖНЯЯ ЧАСТЬ ОКНА С ТРЕМЯ ПОЛЯМИ(МЕНЮ, ПРОФИЛЬ, ИНФОРМАЦИОННОЕ ПОЛЕ)

object MainSelector {
    val selectMenu = ScreenConstructor(
        androidXPath = "/hierarchy/android.widget.FrameLayout/" +
                "android.widget.LinearLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.view.View/android.view.View/" +
                "android.view.View/android.view.View/android.widget.ImageView[2]",
        elementName = "Выбор главного окна с меню"
    )

    val selectProfile = ScreenConstructor(
        androidXPath = "/hierarchy/android.widget.FrameLayout/" +
                "android.widget.LinearLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.view.View/android.view.View/" +
                "android.view.View/android.view.View/android.widget.ImageView[1]",
        elementName = "Выбор окна с профилем"
    )

    val selectInformation = ScreenConstructor(
        androidXPath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
                "android.widget.FrameLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/" +
                "android.view.View/android.view.View/android.view.View/" +
                "android.widget.ImageView[3]",
        elementName = "Выбор окна с информацией"
    )
}