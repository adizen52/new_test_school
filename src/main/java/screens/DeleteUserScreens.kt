package screens

import kotlin.coroutines.Continuation

// ВСПЛЫВАЮЩИЕ ОКНО - ПРИ УДАЛЕНИИ ПОЛЬЗОВАТЕЛЯ

object DeleteUserScreens {
    val selectDelete = ScreenConstructor(
        androidAccessId = "Хочу удалить навсегда",
        elementName = "Кнопка согласие с удалением"
    )

    val notToBe = ScreenConstructor(
        androidAccessId = "Не надо",
        elementName = "Кнопка выбора: НЕ УДАЛЯТЬ"
    )

    val ExitDeleteUser = ScreenConstructor(
        androidAccessId = "Закрыть",
        elementName = "Закрыть окно без выбора"
    )


}