package screens

import TestFunctions.clickToElement
import TestFunctions.sendText

//ОКНО С ДОБАВЛЕНИЕМ НОВЫХ ДАННЫХ АДРЕСА
class newAddressScren {

    fun clickAndSendNewAddress(text : String, findElementWithoutCatching: Boolean = false) {
        clickToElement(
            locatorAndroid = newAddress.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = newAddress.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = newAddress.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
        sendText(
            locatorAndroid = newAddress.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = newAddress.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = newAddress.elementName,
            text = text,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickAndSendFlat(text: String, findElementWithoutCatching: Boolean = false) {
        clickToElement(
            locatorAndroid = flat.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = flat.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = flat.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
        sendText(
            locatorAndroid = flat.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = flat.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = flat.elementName,
            text = text,
            findElementWithoutCatching = findElementWithoutCatching)
    }

    fun clickAndSendEntrance(text: String, findElementWithoutCatching: Boolean = false) {
        clickToElement(
            locatorAndroid = entrance.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = entrance.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = entrance.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
        sendText(
            locatorAndroid = entrance.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = entrance.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = entrance.elementName,
            text = text,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickAndSendIntercom(text: String, findElementWithoutCatching: Boolean = false) {
        clickToElement(
            locatorAndroid = intercom.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = intercom.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = intercom.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
        sendText(
            locatorAndroid = intercom.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = intercom.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = intercom.elementName,
            text = text,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickAndSendFloor(text: String, findElementWithoutCatching: Boolean = false) {
        clickToElement(
            locatorAndroid = floor.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = floor.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = floor.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
        sendText(
            locatorAndroid = floor.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = floor.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = floor.elementName,
            text = text,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickAndSendCommentCourier(text: String, findElementWithoutCatching: Boolean = false) {
        clickToElement(
            locatorAndroid = commentCourier.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = commentCourier.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = commentCourier.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
        sendText(
            locatorAndroid = commentCourier.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = commentCourier.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = commentCourier.elementName,
            text = text,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickSaveAddress(findElementWithoutCatching: Boolean = false) {
        clickToElement(
            locatorAndroid = saveAddress.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = saveAddress.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = saveAddress.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    private val newAddress = ScreenConstructor(
        androidXPath = "/hierarchy/android.widget.FrameLayout/" +
                "android.widget.LinearLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.view.View/android.view.View/" +
                "android.view.View/android.view.View[7]/android.view.View/" +
                "android.view.View/android.widget.EditText",
        iosAccessibilityId = "Адрес",
        elementName = "Поле с введенным адресом"

    )

    private val flat = ScreenConstructor(
        androidXPath = "/hierarchy/android.widget.FrameLayout/" +
                "android.widget.LinearLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.view.View/android.view.View/" +
                "android.view.View/android.view.View[7]/android.view.View/" +
                "android.view.View/android.view.View[2]/android.widget.EditText[1]",
        iosAccessibilityId = "Квартира",
        elementName = "Поле ввода квартиры"
    )

    private val entrance = ScreenConstructor(
        androidXPath = "/hierarchy/android.widget.FrameLayout/" +
                "android.widget.LinearLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.view.View/android.view.View/" +
                "android.view.View/android.view.View[7]/android.view.View/" +
                "android.view.View/android.view.View[2]/android.widget.EditText[2]",
        iosAccessibilityId = "Подъезд",
        elementName = "Поле ввода подъезда"
    )

    private val intercom = ScreenConstructor(
        androidXPath = "/hierarchy/android.widget.FrameLayout/" +
                "android.widget.LinearLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.view.View/android.view.View/" +
                "android.view.View/android.view.View[7]/android.view.View/" +
                "android.view.View/android.view.View[2]/android.widget.EditText[3]",
        iosAccessibilityId = "Домофон",
        elementName = "Поле ввода домофона"
    )

    private val floor = ScreenConstructor(
        androidXPath = "/hierarchy/android.widget.FrameLayout/" +
                "android.widget.LinearLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.view.View/android.view.View/" +
                "android.view.View/android.view.View[7]/android.view.View/" +
                "android.view.View/android.view.View[2]/android.widget.EditText[4]",
        iosAccessibilityId = "Этаж",
        elementName = "Поле ввода этажа"
    )

    private val commentCourier = ScreenConstructor(
        androidXPath = "/hierarchy/android.widget.FrameLayout/" +
                "android.widget.LinearLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.view.View/android.view.View/" +
                "android.view.View/android.view.View[7]/android.view.View/" +
                "android.view.View/android.view.View[2]/android.widget.EditText[5]",
        iosAccessibilityId = "Комментарий для курьера",
        elementName = "Поле ввода комментария для курьера"
    )

    private val saveAddress = ScreenConstructor(
        androidAccessId = "Сохранить",
        iosAccessibilityId = "Сохранить",
        elementName = "Кнопка сохранения адреса"
    )

}