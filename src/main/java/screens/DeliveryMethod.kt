package screens

import LocatorType
import TestFunctions.clickToElement
import TestFunctions.tapExitPage

// ВСПЛЫВАЮЩИЕ ОКНО - ВЫБОРА МЕТОДА ПОЛУЧЕНИЯ ЗАКАЗА

class DeliveryMethod {

    fun clickSelectDelivery(findElementWithoutCatching: Boolean = false){
        clickToElement(
            locatorAndroid = selectDelivery.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = selectDelivery.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = selectDelivery.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickSelectPickup(findElementWithoutCatching: Boolean = false){
        clickToElement(
            locatorAndroid = selectPickup.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = selectPickup.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = selectPickup.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickSelectForTable(findElementWithoutCatching: Boolean = false){
        clickToElement(
            locatorAndroid = selectForTable.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = selectForTable.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = selectForTable.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickSelectClose(findElementWithoutCatching: Boolean = false){
        tapExitPage(locatorAndroid = selectClose.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = selectClose.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = selectClose.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    private val selectDelivery = ScreenConstructor(
        androidAccessId = "Доставка",
        iosAccessibilityId = "Доставка",
        elementName = "Выбор способа получения - Доставка"
    )

    private val selectPickup = ScreenConstructor(
        androidAccessId = "Самовывоз",
        iosAccessibilityId = "Самовывоз",
        elementName = "Выбор способа получения - Самовывоз"
    )

    private val selectForTable = ScreenConstructor(
        androidAccessId = "За столик",
        iosAccessibilityId = "За столик",
        elementName = "Выбор получения - за столик"
    )

    private val selectClose = ScreenConstructor(
        androidAccessId = "Закрыть",
        iosAccessibilityId = "Закрыть",
        elementName = "Закрытие страницы без выбора метода получения"
    )
}