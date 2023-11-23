package screens

import TestFunctions.clickToElement

//ОСНОВНОЕ ОКНО С МЕНЮ
class MainScreen {

    fun clickSelectBasket(findElementWithoutCatching: Boolean = false){
        clickToElement(
            locatorAndroid = selectBasket.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = selectBasket.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = selectBasket.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickDishPuree(findElementWithoutCatching: Boolean = false){
        clickToElement(
            locatorAndroid = dishPuree.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = dishPuree.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = dishPuree.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickChikenRice(findElementWithoutCatching: Boolean = false){
        clickToElement(
            locatorAndroid = chickenRice.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = chickenRice.iosClassChain,
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            elementName = chickenRice.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickHotDish(findElementWithoutCatching: Boolean = false){
        clickToElement(
            locatorAndroid = hotDish.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = hotDish.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = hotDish.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickHotSnacks(findElementWithoutCatching: Boolean = false){
        clickToElement(
            locatorAndroid = snacks.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = snacks.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = snacks.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickHotSoups(findElementWithoutCatching: Boolean = false){
        clickToElement(
            locatorAndroid = soups.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = soups.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = soups.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickHotPasta(findElementWithoutCatching: Boolean = false){
        clickToElement(
            locatorAndroid = pasta.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = pasta.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = pasta.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickHotSandwiches(findElementWithoutCatching: Boolean = false){
        clickToElement(
            locatorAndroid = sandwich.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = sandwich.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = sandwich.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickHotPizza(findElementWithoutCatching: Boolean = false){
        clickToElement(
            locatorAndroid = pizza.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = pizza.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = pizza.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickHotDesserts(findElementWithoutCatching: Boolean = false){
        clickToElement(
            locatorAndroid = desserts.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = desserts.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = desserts.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickHotSalads(findElementWithoutCatching: Boolean = false){
        clickToElement(
            locatorAndroid = salads.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = salads.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = salads.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickHotBreakfast(findElementWithoutCatching: Boolean = false){
        clickToElement(
            locatorAndroid = breakfast.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = breakfast.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = breakfast.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickHotBread(findElementWithoutCatching: Boolean = false){
        clickToElement(
            locatorAndroid = bread.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = bread.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = bread.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun newPrice(elemntLocator: String) {
        priceMeal.androidAccessId = elemntLocator
        priceMeal.iosAccessibilityId = elemntLocator
    }

    fun clickMealPrice(findElementWithoutCatching: Boolean = false){
        clickToElement(
            locatorAndroid = priceMeal.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = priceMeal.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = priceMeal.elementName,
            findElementWithoutCatching = findElementWithoutCatching
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

    private val priceMeal = ScreenConstructor(
        androidAccessId = "",
        iosAccessibilityId = "",
        elementName = "Динамическая цена к блюду"
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

    private val snacks = ScreenConstructor(
        androidAccessId = "Закуски",
        iosAccessibilityId = "Закуски",
        elementName = "Выбор закусок"
    )

    private val soups = ScreenConstructor(
        androidAccessId = "Супы",
        iosAccessibilityId = "Супы",
        elementName = "Выбор супов"
    )

    private val pasta = ScreenConstructor(
        androidAccessId = "Паста",
        iosAccessibilityId = "Паста",
        elementName = "Выбор паст"
    )

    private val sandwich = ScreenConstructor(
        androidAccessId = "Сендвичи",
        iosAccessibilityId = "Сендвичи",
        elementName = "Выбор сендвичей"
    )

    private val pizza = ScreenConstructor(
        androidAccessId = "Пицца",
        iosAccessibilityId = "Пицца",
        elementName = "Выбор пицц"
    )

    private val desserts = ScreenConstructor(
        androidAccessId = "Десерты",
        iosAccessibilityId = "Десерты",
        elementName = "Выбор десертов"
    )

    private val salads = ScreenConstructor(
        androidAccessId = "Салаты",
        iosAccessibilityId = "Салаты",
        elementName = "Выбор салатов"
    )

    private val breakfast = ScreenConstructor(
        androidAccessId = "Завтраки",
        iosAccessibilityId = "Завтраки",
        elementName = "Выбор завтраков"
    )

    private val bread = ScreenConstructor(
        androidAccessId = "Хлеб",
        iosAccessibilityId = "Хлеб",
        elementName = "Выбор хлеба"
    )
}