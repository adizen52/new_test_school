package screens

import TestFunctions.clickToElement
import TestFunctions.sendText
import TestFunctions.tapOnCenterElement

//ОКНО С МОЕЙ КОРЗИНОЙ
class BasketScreen {

    fun clickPickupLocation(findElementWithoutCatching: Boolean = false) {
        clickToElement(
            locatorAndroid = pickupLocation.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = pickupLocation.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = pickupLocation.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickTimeDelivery(findElementWithoutCatching: Boolean = false){
        clickToElement(
            locatorAndroid = timeDelivery.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = timeDelivery.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = timeDelivery.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickCommentOrder(findElementWithoutCatching: Boolean = false) {
        clickToElement(
            locatorAndroid = commentOrder.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = commentOrder.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = commentOrder.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickCommentDone(findElementWithoutCatching: Boolean = false) {
        clickToElement(
            locatorAndroid = commentDone.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = commentDone.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = commentDone.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickAddingDevices(findElementWithoutCatching: Boolean = false) {
        clickToElement(
            locatorAndroid = addingDevices.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = addingDevices.iosClassChain,
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            elementName = addingDevices.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickReductionDevices(findElementWithoutCatching: Boolean = false) {
        clickToElement(
            locatorAndroid = reductionDevices.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = reductionDevices.iosClassChain,
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            elementName = reductionDevices.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickPayMethod(findElementWithoutCatching: Boolean = false) {
        clickToElement(
            locatorAndroid = payMethod.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = payMethod.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = payMethod.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickPromoCode(findElementWithoutCatching: Boolean = false) {
        clickToElement(
            locatorAndroid = promoCode.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = promoCode.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = promoCode.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickOrderMeal(findElementWithoutCatching: Boolean = false) {
        clickToElement(
            locatorAndroid = orderMeal.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = orderMeal.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            orderMeal.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickAllRight(findElementWithoutCatching: Boolean = false) {
        clickToElement(
            locatorAndroid = allRight.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = allRight.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = allRight.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickCprrectOrder(findElementWithoutCatching: Boolean = false) {
        clickToElement(
            locatorAndroid = correctOrder.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = correctOrder.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = commentOrder.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun sendCommentInput(text : String, findElementWithoutCatching: Boolean = false) {
        sendText(
            locatorAndroid = commentInput.androidClassName,
            locatorTypeAndroid = LocatorType.CLASS_NAME,
            locatorIOS = commentInput.iosClassName,
            locatorTypeIOS = LocatorType.CLASS_NAME,
            elementName = commentInput.elementName,
            text = text,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun tapOnCenterOrderMeal(findElementWithoutCatching: Boolean = false){
            tapOnCenterElement(
                locatorAndroid = orderMeal.androidXPath,
                locatorTypeAndroid = LocatorType.XPATH,
                locatorIOS = orderMeal.iosAccessibilityId,
                locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
                elementName = orderMeal.elementName,
                findElementWithoutCatching = findElementWithoutCatching
            )
    }

    private val pickupLocation = ScreenConstructor(
        androidAccessId = "Самовывоз Shop 1",
        iosAccessibilityId = "Самовывоз\n" +
                "Shop 1",
        elementName = "Выбор места самовывоза"
    )

    private val timeDelivery = ScreenConstructor(
        androidAccessId = "Сегодня, через 15 минут",
        iosAccessibilityId = "Сегодня, через 15 минут",
        elementName = "Изменение времени доставки"
    )

    private val commentOrder = ScreenConstructor(
        androidAccessId = "Комментарий к заказу",
        iosAccessibilityId = "Комментарий к заказу",
        elementName = "Добавление комментария к заказу"
    )

    val commentInput = ScreenConstructor(
        androidClassName = "android.widget.EditText",
        iosClassName = "XCUIElementTypeTextField",
        elementName = "Ввод комментария"
    )

    private val commentDone = ScreenConstructor(
        androidAccessId = "Готово",
        iosAccessibilityId = "Готово",
        elementName = "Нажатие кнопки готово при написании комментария"
    )

    private val addingDevices = ScreenConstructor(
        androidXPath = "//android.view.View[@content-desc=\"Приборы\n" +
                "1\"]/android.widget.ImageView[3]",
        iosClassChain = "**/XCUIElementTypeWindow/XCUIElementTypeOther/" +
                "XCUIElementTypeOther/XCUIElementTypeOther/" +
                "XCUIElementTypeOther/XCUIElementTypeOther[2]/" +
                "XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/" +
                "XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/" +
                "XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/" +
                "XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/" +
                "XCUIElementTypeImage[3]",
        elementName = "Добавление столовых приборов"
    )

    private val reductionDevices = ScreenConstructor(
        androidXPath = "//android.view.View[@content-desc=\"Приборы\n" +
                "2\"]/android.widget.ImageView[2]",
        iosClassChain = "**/XCUIElementTypeWindow/XCUIElementTypeOther/" +
                "XCUIElementTypeOther/XCUIElementTypeOther/" +
                "XCUIElementTypeOther/XCUIElementTypeOther[2]/" +
                "XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/" +
                "XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/" +
                "XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/" +
                "XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/" +
                "XCUIElementTypeImage[2]",
        elementName = "Уменьшение количества приборов"
    )

    private val payMethod = ScreenConstructor(
        androidAccessId = "Наличными",
        iosAccessibilityId = "Наличными",
        elementName = "Выбор способа оплаты заказа"
    )

    private val promoCode = ScreenConstructor(
        androidAccessId = "Добавить промокод",
        iosAccessibilityId = "Добавить промокод",
        elementName = "Добавление промокода для заказа"
    )

    private val orderMeal = ScreenConstructor(
        androidXPath = "//android.view.View[@content-desc=\"Заказ на сумму\n" +
                "461 ₽\"]",
        iosAccessibilityId = "Заказ на сумму\n" +
                "461 ₽",
        elementName = "Кнопка для совершения заказа"
    )

    private val allRight = ScreenConstructor(
        androidAccessId = "Все верно",
        iosAccessibilityId = "Все верно",
        elementName = "Подтверждение верности заказа"
    )

    private val correctOrder = ScreenConstructor(
        androidAccessId = "Изменить",
        iosAccessibilityId = "Изменить",
        elementName = "Изменение заказа"
    )

}