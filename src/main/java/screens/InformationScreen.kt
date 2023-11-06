package screens

import TestFunctions.clickToElement

// ИНФОРМАЦИОННОЕ ОКНО С НОМЕРОМ И ВРЕМЕНЕМ РАБОТЫ КАФЕ

class InformationScreen {

    fun clickOfferInf() {
        clickToElement(
            locatorAndroid = offerInf.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = offerInf.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID
        )
    }

    fun clickPrivacyPolicy() {
        clickToElement(
            locatorAndroid = privacyPolicy.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = privacyPolicy.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID
        )
    }

    val offerInf = ScreenConstructor(
        androidAccessId = "Оферта",
        iosAccessibilityId = "Оферта",
        elementName = "Переход для прочтения информации об оферте"
    )

    val privacyPolicy = ScreenConstructor(
        androidAccessId = "Политика конфиденциальности",
        iosAccessibilityId = "Политика конфиденциальности",
        elementName = "Переход к прочтению политики конфиденц."
    )
}