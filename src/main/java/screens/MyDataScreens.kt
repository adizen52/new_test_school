package screens

// ВСПЛЫВАЮЩЕЕ ОКНО - ДАННЫХ О ПОЛЬЗОВАТЕЛЕ

object MyDataScreens {
    val Name = ScreenConstructor(
        androidXPath = "/hierarchy/android.widget.FrameLayout/" +
                "android.widget.LinearLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.view.View/android.view.View/" +
                "android.view.View[1]/android.view.View/android.widget.ImageView/" +
                "android.view.View/android.view.View/android.widget.EditText[1]",
        iosAccessibilityId = "Имя",
        elementName = "Поле ввода ИМЕНИ пользователя"
    )
    val Birthday = ScreenConstructor(
        androidXPath = "/hierarchy/android.widget.FrameLayout/" +
                "android.widget.LinearLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.view.View/android.view.View/" +
                "android.view.View[1]/android.view.View/android.widget.ImageView/" +
                "android.view.View/android.view.View/android.view.View[2]/" +
                "android.widget.EditText",
        iosAccessibilityId = "День рождения",
        elementName = "Поле ввода ДНЯ РОЖДЕНИЯ пользователя"
    )
    val Email = ScreenConstructor(
        androidXPath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
                "android.widget.FrameLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/" +
                "android.view.View/android.view.View[1]/android.view.View/" +
                "android.widget.ImageView/android.view.View/android.view.View/" +
                "android.widget.EditText[2]",
        iosAccessibilityId = "Эл. почта",
        elementName = "Поле ввода ЭЛ.ПОЧТЫ пользователя"
    )
    val Instagram = ScreenConstructor(
        androidXPath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
                "android.widget.FrameLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/" +
                "android.view.View/android.view.View[1]/android.view.View/" +
                "android.widget.ImageView/android.view.View/android.view.View/" +
                "android.widget.EditText[3]",
        iosAccessibilityId = "Инстаграм",
        elementName = "Поле ввода аккаунта ИНСТАГРАМ пользователя"
    )
    val saveData = ScreenConstructor(
        androidAccessId = "Сохранить",
        iosAccessibilityId = "Сохранить",
        elementName = "Кнопка сохранения данных"
    )
    val deleteUser = ScreenConstructor(
        androidAccessId = "Удалить аккаунт",
        iosAccessibilityId = "Удалить аккаунт",
        elementName = "Кнопка удаления аккаунта"
    )

    val ExitMyData = ScreenConstructor(
        androidAccessId = "Закрыть",
        iosClassChain = "**/XCUIElementTypeWindow[2]/XCUIElementTypeOther/" +
                "XCUIElementTypeOther[1]",
        elementName = "Выход из окна с данными пользователя."
    )
}