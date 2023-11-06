package screens

import TestFunctions.clickToElement
import TestFunctions.sendText

class newAddressScren {

    fun clickAndSendNewAddress(text : String) {
        clickToElement(
            locatorAndroid = newAddress.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = newAddress.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID
        )
        sendText(
            locatorAndroid = newAddress.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = newAddress.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            text
        )
    }

    fun clickAndSendFlat(text: String) {
        clickToElement(
            locatorAndroid = flat.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = flat.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID
        )
        sendText(
            locatorAndroid = flat.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = flat.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            text)
    }

    fun clickAndSendEntrance(text: String) {
        clickToElement(
            locatorAndroid = entrance.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = entrance.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID
        )
        sendText(
            locatorAndroid = entrance.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = entrance.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            text
        )
    }

    fun clickAndSendIntercom(text: String) {
        clickToElement(
            locatorAndroid = intercom.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = intercom.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID
        )
        sendText(
            locatorAndroid = intercom.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = intercom.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            text
        )
    }

    fun clickAndSendFloor(text: String) {
        clickToElement(
            locatorAndroid = floor.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = floor.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID
        )
        sendText(
            locatorAndroid = floor.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = floor.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            text
        )
    }

    fun clickAndSendCommentCourier(text: String) {
        clickToElement(
            locatorAndroid = commentCourier.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = commentCourier.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID
        )
        sendText(
            locatorAndroid = commentCourier.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = commentCourier.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            text
        )
    }

    fun clickSaveAddress() {
        clickToElement(
            locatorAndroid = saveAddress.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = saveAddress.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID
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