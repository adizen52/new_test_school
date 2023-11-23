package screens

import TestFunctions.checkAvaliableElemnt
import TestFunctions.clickToElement
import TestFunctions.sendText
import TestFunctions.swipeDeleteAddress
import TestFunctions.tapDeleteAddress

//ОКНО С МОИМИ АДРЕСАМИ

class addressScren {

    fun clickAddNewAddress(findElementWithoutCatching: Boolean = false) {
        clickToElement(
            locatorAndroid = addNewAddress.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = addNewAddress.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = addNewAddress.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickDeleteAddress(findElementWithoutCatching: Boolean = false) {
        tapDeleteAddress(
            locatorAndroid = deleteAddress.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = deleteAddress.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = deleteAddress.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickLineAddress(findElementWithoutCatching: Boolean = false) {
        clickToElement(
            locatorAndroid = lineAddress.androidClassName,
            locatorTypeAndroid = LocatorType.CLASS_NAME,
            locatorIOS = lineAddress.iosClassName,
            locatorTypeIOS = LocatorType.CLASS_NAME,
            elementName = lineAddress.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun sendLineAddress(text : String, findElementWithoutCatching: Boolean = false) {
        sendText(
            locatorAndroid = lineAddress.androidClassName,
            locatorTypeAndroid = LocatorType.CLASS_NAME,
            locatorIOS = lineAddress.iosClassName,
            locatorTypeIOS = LocatorType.CLASS_NAME,
            elementName = lineAddress.elementName,
            text = text,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickRemoveAddress(findElementWithoutCatching: Boolean = false) {
        clickToElement(
            locatorAndroid = removeAddress.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = removeAddress.iosClassChain,
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            elementName = removeAddress.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickValueAddress(findElementWithoutCatching: Boolean = false) {
        clickToElement(
            locatorAndroid = valueAddress.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = valueAddress.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = valueAddress.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickLocationResolution(findElementWithoutCatching: Boolean = false) {
        clickToElement(
            locatorAndroid = locationResolution.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = locationResolution.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = locationResolution.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun assignmentTestAddress(element: String) {
            testAddressScreen.androidAccessId = element
            testAddressScreen.iosAccessibilityId = element
    }

    fun swipeOrCheckSTestAddress(command: String, findElementWithoutCatching: Boolean = false) {
        if (command == "CHECK") {
            checkAvaliableElemnt(
                locatorAndroid = testAddressScreen.androidAccessId,
                locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
                locatorIOS = testAddressScreen.iosAccessibilityId,
                locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
                elementName = testAddressScreen.elementName,
                findElementWithoutCatching = findElementWithoutCatching)
        } else {
            swipeDeleteAddress(
                locatorAndroid = testAddressScreen.androidAccessId,
                locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
                locatorIOS = testAddressScreen.iosAccessibilityId,
                locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
                elementName = testAddressScreen.elementName,
                findElementWithoutCatching = findElementWithoutCatching
            )
        }
    }

    private val addNewAddress = ScreenConstructor(
        androidAccessId = "Добавить новый адрес",
        iosAccessibilityId = "Добавить новый адрес",
        elementName = "Нажатие кнопки добавление нового адреса"
    )

    private val deleteAddress = ScreenConstructor(
        androidAccessId = "Удалить",
        iosAccessibilityId = "Удалить",
        elementName = "Удаление аддреса"
    )

    private val lineAddress = ScreenConstructor(
        androidClassName = "android.widget.EditText",
        iosClassName = "XCUIElementTypeTextField",
        elementName = "Поле ввода Адреса"
    )

    private val removeAddress = ScreenConstructor(
        androidXPath = "/hierarchy/android.widget.FrameLayout/" +
                "android.widget.LinearLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.view.View/android.view.View/" +
                "android.view.View/android.view.View[5]/android.view.View/" +
                "android.view.View/android.widget.EditText/android.widget.ImageView",
        iosClassChain = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/" +
                "XCUIElementTypeOther/XCUIElementTypeOther/" +
                "XCUIElementTypeOther/XCUIElementTypeOther[2]/" +
                "XCUIElementTypeOther[2]/XCUIElementTypeOther[6]/" +
                "XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/" +
                "XCUIElementTypeOther[2]/XCUIElementTypeImage",
        elementName = "Кнопка чтобы убрать из строки адрес"
    )

    private val valueAddress = ScreenConstructor(
        androidAccessId = "Сапёрный переулок, 24, Санкт-Петербург",
        iosAccessibilityId = "Сапёрный переулок, 24, Санкт-Петербург",
        elementName = "Предлагаемый адрес"
    )

    private val locationResolution = ScreenConstructor(
        androidXPath = "/hierarchy/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.widget.FrameLayout/" +
                "android.widget.ScrollView/android.widget.LinearLayout/" +
                "android.widget.LinearLayout/android.widget.LinearLayout[3]/" +
                "android.widget.Button[1]",
        iosAccessibilityId = "При использовании",
        elementName = "Кнокпка на разрешение использования геолокации"

    )

    private var testAddressScreen = ScreenConstructor(
        androidAccessId = "",
        iosAccessibilityId = "",
        elementName = "Новый введенный адрес Саперной улицы"
    )
}