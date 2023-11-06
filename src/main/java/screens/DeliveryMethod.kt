package screens

import LocatorType
import TestFunctions.clickToElement
import TestFunctions.tapExitPage

// ВСПЛЫВАЮЩИЕ ОКНО - ВЫБОРА МЕТОДА ПОЛУЧЕНИЯ ЗАКАЗА

class DeliveryMethod {

    fun clickSelectDelivery(){
        clickToElement(
            locatorAndroid = selectDelivery.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = selectDelivery.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID
        )
    }

    fun clickSelectPickup(){
        clickToElement(
            locatorAndroid = selectPickup.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = selectPickup.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID
        )
    }

    fun clickSelectForTable(){
        clickToElement(
            locatorAndroid = selectForTable.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = selectForTable.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID
        )
    }

    fun clickSelectClose(){
        tapExitPage(locatorAndroid = selectClose.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = selectClose.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID)
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