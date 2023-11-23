package screens

import TestFunctions.clickToElement

// ВСПЛЫВАЮЩИЕ ОКНО - ПРИ УДАЛЕНИИ ПОЛЬЗОВАТЕЛЯ

class DeleteUserScreens {
    fun clickSelectDelete(findElementWithoutCatching: Boolean = false) {
        clickToElement(
            locatorAndroid = selectDelete.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = selectDelete.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = selectDelete.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickNotToBe(findElementWithoutCatching: Boolean = false) {
        clickToElement(
            locatorAndroid = notToBe.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = notToBe.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = notToBe.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickExitDeleteUser(findElementWithoutCatching: Boolean = false) {
        clickToElement(
            locatorAndroid = ExitDeleteUser.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = ExitDeleteUser.iosClassChain,
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            elementName = ExitDeleteUser.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    private val selectDelete = ScreenConstructor(
        androidAccessId = "Хочу удалить навсегда",
        iosAccessibilityId = "Хочу удалить навсегда",
        elementName = "Кнопка согласие с удалением"
    )

    private val notToBe = ScreenConstructor(
        androidAccessId = "Не надо",
        iosAccessibilityId = "Не надо",
        elementName = "Кнопка выбора: НЕ УДАЛЯТЬ"
    )

    private val ExitDeleteUser = ScreenConstructor(
        androidAccessId = "Закрыть",
        iosClassChain = "**/XCUIElementTypeWindow[2]/XCUIElementTypeOther/" +
                "XCUIElementTypeOther[1]",
        elementName = "Закрыть окно без выбора"
    )
}