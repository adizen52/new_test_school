package screens

import TestFunctions.clickToElement

// ИНФОРМАЦИОННОЕ ОКНО С НОМЕРОМ И ВРЕМЕНЕМ РАБОТЫ КАФЕ

class InformationScreen {

    fun clickOfferInf(findElementWithoutCatching: Boolean = false) {
        clickToElement(
            locatorAndroid = offerInf.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = offerInf.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = offerInf.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickPrivacyPolicy(findElementWithoutCatching: Boolean = false) {
        clickToElement(
            locatorAndroid = privacyPolicy.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = privacyPolicy.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = privacyPolicy.elementName,
            findElementWithoutCatching = findElementWithoutCatching
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