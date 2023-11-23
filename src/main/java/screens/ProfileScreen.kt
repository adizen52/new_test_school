package screens

import TestFunctions.checkAvaliableElemnt
import TestFunctions.clickToElement

// ОКНО - ПРОФИЛЯ ПОЛЬЗОВАТЕЛЯ

class ProfileScreen {

    fun clickMyOrders(findElementWithoutCatching: Boolean = false){
        clickToElement(
            locatorAndroid = myOrders.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = myOrders.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = myOrders.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickMyAddress(findElementWithoutCatching: Boolean = false){
        clickToElement(
            locatorAndroid = myAddresses.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = myAddresses.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = myAddresses.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickMyData(findElementWithoutCatching: Boolean = false){
        clickToElement(
            locatorAndroid = myData.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = myData.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = myData.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickPayMethod(findElementWithoutCatching: Boolean = false){
        clickToElement(
            locatorAndroid = payMethod.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = payMethod.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = payMethod.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickLogInCabinet(findElementWithoutCatching: Boolean = false){
        clickToElement(
            locatorAndroid = logInCabinet.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = logInCabinet.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = logInCabinet.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickLogOut(findElementWithoutCatching: Boolean = false){
        clickToElement(
            locatorAndroid = logOut.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = logOut.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = logOut.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun checkLogOut(findElementWithoutCatching: Boolean = false) : Boolean{
        return checkAvaliableElemnt(
            locatorAndroid = logOut.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = logOut.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = logOut.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    private val myOrders = ScreenConstructor(
        androidAccessId = "Мои заказы",
        iosAccessibilityId = "Мои заказы",
        elementName = "Выбор моих заказов"
    )

    private val myAddresses = ScreenConstructor(
        androidAccessId = "Мои адреса",
        iosAccessibilityId = "Мои адреса",
        elementName = "Выбор моих адресов"
    )

    private val myData = ScreenConstructor(
        androidAccessId = "Мои данные",
        iosAccessibilityId = "Мои данные",
        elementName = "Выбор моих данных"
    )

    private val payMethod = ScreenConstructor(
        androidAccessId = "Способы оплаты",
        iosAccessibilityId = "Способы оплаты",
        elementName = "Переход к выбору способа оплаты"
    )

    private val logInCabinet = ScreenConstructor(
        androidAccessId = "Войти",
        iosAccessibilityId = "Войти",
        elementName = "Кнопка для входа"
    )

    private val logOut = ScreenConstructor(
        androidAccessId = "Выйти",
        iosAccessibilityId = "Выйти",
        elementName = "Кнопка для ВЫХОДА из аккаунта"
    )
}