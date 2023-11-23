package screens

import TestFunctions.clickToElement
import TestFunctions.sendText

// ОКНА ПРИ РЕГИСТРАЦИИ ПОЛЬЗОВАТЕЛЯ (ОТПРАВКА ТЕЛЕФОНА, ПОЛУЧЕНИЕ И ОТПРАВКА КОДА)

class EnterScreens {

    fun sendInputPhone(number: String, findElementWithoutCatching: Boolean = false){
        sendText(locatorAndroid = inputPhone.androidClassName,
            locatorTypeAndroid = LocatorType.CLASS_NAME,
            locatorIOS = inputPhone.iosClassName,
            locatorTypeIOS = LocatorType.CLASS_NAME,
            elementName = inputPhone.elementName,
            text = number,
            findElementWithoutCatching = findElementWithoutCatching)
    }

    fun sendInputCode(number: String, findElementWithoutCatching: Boolean = false) {
        sendText(
            locatorAndroid = inputCode.androidClassName,
            locatorTypeAndroid = LocatorType.CLASS_NAME,
            locatorIOS = inputCode.iosClassName,
            locatorTypeIOS = LocatorType.CLASS_NAME,
            elementName = inputCode.elementName,
            text = number,
            findElementWithoutCatching = findElementWithoutCatching)
    }

    fun clickGetCode(findElementWithoutCatching: Boolean = false) {
        clickToElement(
            locatorAndroid = getCode.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = getCode.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = getCode.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickCondition(findElementWithoutCatching: Boolean = false) {
        clickToElement(
            locatorAndroid = condition.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = condition.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = condition.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    private val inputPhone = ScreenConstructor(
        androidClassName = "android.widget.EditText",
        iosClassName = "XCUIElementTypeTextField",
        elementName = "Поле ввода номера для входа"
    )

    private val getCode = ScreenConstructor(
        androidAccessId = "Получить код",
        iosAccessibilityId = "Получить код",
        elementName = "Кнопка для получения кода по номеру"
    )

    private val condition = ScreenConstructor(
        androidAccessId = "Регистрируясь, вы соглашаетесь с условиями " +
                "использования и передачи данных",
        iosAccessibilityId = "Регистрируясь, вы соглашаетесь с условиями " +
                "использования и передачи данных",
        elementName = "Кнопка для чтения условий регистрации"
    )

    private val inputCode = ScreenConstructor(
        androidClassName = "android.widget.EditText",
        iosClassName = "XCUIElementTypeTextField",
        elementName = "Поле ввода кода из СМС"
    )


}