package screens

// ОКНА ПРИ РЕГИСТРАЦИИ ПОЛЬЗОВАТЕЛЯ (ОТПРАВКА ТЕЛЕФОНА, ПОЛУЧЕНИЕ И ОТПРАВКА КОДА)

object EnterScreens {

    val inputPhone = ScreenConstructor(
        androidClassName = "android.widget.EditText",
        elementName = "Поле ввода номера для входа"
    )

    val getCode = ScreenConstructor(
        androidAccessId = "Получить код",
        elementName = "Кнопка для получения кода по номеру"
    )

    val condition = ScreenConstructor(
        androidAccessId = "Регистрируясь, вы соглашаетесь с условиями " +
                "использования и передачи данных",
        elementName = "Кнопка для чтения условий регистрации"
    )

    val inputCode = ScreenConstructor(
        androidClassName = "android.widget.EditText",
        elementName = "Поле ввода кода из СМС"
    )


}