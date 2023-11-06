package screens

import LocatorType
import TestFunctions.clickToElement

// ВХОДНОЕ ОКНО С ВЫБОРОМ ЯЗЫКА
class Onboarding {

    fun clickSelectRusButton() {
        clickToElement(
            locatorAndroid = selectLanguage.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = selectLanguage.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID
        )
    }

    fun clickNextButton() {
        clickToElement(
            locatorAndroid = nextButton.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = nextButton.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID
        )
    }

    private val selectLanguage = ScreenConstructor(
        androidAccessId = "Русский",
        iosAccessibilityId = "Русский",
        elementName = "Выбор русского языка на экране онбординга"
    )

    private val nextButton = ScreenConstructor(
        androidAccessId = "Далее",
        iosAccessibilityId = "Далее",
        elementName = "Кнопка далее на экране онбординга"
    )
}