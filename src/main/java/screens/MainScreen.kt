package screens

import TestFunctions.clickToElement

class MainScreen {

    fun clickSelectBasket(){
        clickToElement(
            locatorAndroid = selectBasket.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = selectBasket.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID
        )
    }

    fun clickDishPuree(){
        clickToElement(
            locatorAndroid = dishPuree.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = dishPuree.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID
        )
    }

    fun clickChikenRice(){
        clickToElement(
            locatorAndroid = chickenRice.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = chickenRice.iosClassChain,
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN
        )
    }

    fun clickHotDish(){
        clickToElement(
            locatorAndroid = hotDish.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = hotDish.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID
        )
    }

    private val selectBasket = ScreenConstructor(
        androidAccessId = "2\n" +
                "Корзина\n" +
                "461 ₽",
        iosAccessibilityId = "2\n" +
                "Корзина\n" +
                "461 ₽",
        elementName = "Корзина с двумя дабвленными блюдами"
    )

    private val dishPuree = ScreenConstructor(
        androidAccessId = "111 ₽",
        iosAccessibilityId = "111 ₽",
        elementName = "Добавление блюда ПЮРЕ"
    )

    private val chickenRice = ScreenConstructor(
        androidAccessId = "350 ₽",
        iosClassChain = "**/XCUIElementTypeImage[`label == \"350 ₽\"`][1]",
        elementName = "Добавление блюда Риу - Кура терьяки"
    )

    private val hotDish = ScreenConstructor(
        androidAccessId = "Горячее",
        iosAccessibilityId = "Горячее",
        elementName = "Выбор горячих блюд"
    )
}