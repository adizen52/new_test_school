package screens

import TestFunctions.clickToElement

// НИЖНЯЯ ЧАСТЬ ОКНА С ТРЕМЯ ПОЛЯМИ(МЕНЮ, ПРОФИЛЬ, ИНФОРМАЦИОННОЕ ПОЛЕ)

class MainSelector {

    fun clickSelectMenu(findElementWithoutCatching: Boolean = false){
        clickToElement(
            locatorAndroid = selectMenu.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = selectMenu.iosClassChain,
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            elementName = selectMenu.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickSelectProfile(findElementWithoutCatching: Boolean = false){
        clickToElement(
            locatorAndroid = selectProfile.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = selectProfile.iosClassChain,
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            elementName = selectProfile.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickSelectInformation(findElementWithoutCatching: Boolean = false){
        clickToElement(locatorAndroid = selectInformation.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = selectInformation.iosClassChain,
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            elementName = selectInformation.elementName,
            findElementWithoutCatching = findElementWithoutCatching)
    }

    private val selectMenu = ScreenConstructor(
        androidXPath = "/hierarchy/android.widget.FrameLayout/" +
                "android.widget.LinearLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.view.View/android.view.View/" +
                "android.view.View/android.view.View/android.widget.ImageView[2]",
        iosClassChain = "**/XCUIElementTypeWindow/XCUIElementTypeOther/" +
                "XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/" +
                "XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/" +
                "XCUIElementTypeOther[2]/XCUIElementTypeImage[2]",
        elementName = "Выбор главного окна с меню"
    )

    private val selectProfile = ScreenConstructor(
        androidXPath = "/hierarchy/android.widget.FrameLayout/" +
                "android.widget.LinearLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.view.View/android.view.View/" +
                "android.view.View/android.view.View/android.widget.ImageView[1]",
        iosClassChain = "**/XCUIElementTypeWindow/XCUIElementTypeOther/" +
                "XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/" +
                "XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/" +
                "XCUIElementTypeOther[2]/XCUIElementTypeImage[1]",
        elementName = "Выбор окна с профилем"
    )

    private val selectInformation = ScreenConstructor(
        androidXPath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
                "android.widget.FrameLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/" +
                "android.view.View/android.view.View/android.view.View/" +
                "android.widget.ImageView[3]",
        iosClassChain = "**/XCUIElementTypeWindow/XCUIElementTypeOther/" +
                "XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/" +
                "XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/" +
                "XCUIElementTypeOther[2]/XCUIElementTypeImage[3]",
        elementName = "Выбор окна с информацией"
    )


}