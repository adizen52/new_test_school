package screens

import TestFunctions.clearField
import TestFunctions.clickToElement
import TestFunctions.getText
import TestFunctions.sendText
import TestFunctions.tapExitPage

// ВСПЛЫВАЮЩЕЕ ОКНО - ДАННЫХ О ПОЛЬЗОВАТЕЛЕ

class MyDataScreens {

    fun getName(findElementWithoutCatching: Boolean = false) : String{
        return getText(
            locatorAndroid = Name.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = Name.iosClassChain,
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            elementName = Name.elementName,
            findElementWithoutCatching = findElementWithoutCatching)
    }

    fun clickClearSendName(name: String, findElementWithoutCatching: Boolean = false) {
        clickToElement(
            locatorAndroid = Name.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = Name.iosClassChain,
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            elementName = Name.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
        clearField(
            locatorAndroid = Name.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = Name.iosClassChain,
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            elementName = Name.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
        clickToElement(
            locatorAndroid = Name.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = Name.iosClassChain,
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            elementName = Name.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
        sendText(
            locatorAndroid = Name.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = Name.iosClassChain,
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            elementName = Name.elementName,
            text = name,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun getBirthday(findElementWithoutCatching: Boolean = false) : String{
        return getText(
            locatorAndroid = Birthday.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = Birthday.iosClassChain,
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            elementName = Birthday.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickClearSendBirthday(birthday: String, findElementWithoutCatching: Boolean = false) {
        clickToElement(
            locatorAndroid = Birthday.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = Birthday.iosClassChain,
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            elementName = Birthday.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
        clearField(
            locatorAndroid = Birthday.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = Birthday.iosClassChain,
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            elementName = Birthday.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
        clickToElement(
            locatorAndroid = Birthday.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = Birthday.iosClassChain,
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            elementName = Birthday.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
        sendText(
            locatorAndroid = Birthday.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = Birthday.iosClassChain,
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            elementName = Birthday.elementName,
            text = birthday,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun getEmail(findElementWithoutCatching: Boolean = false) : String{
        return getText(
            locatorAndroid = Email.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = Email.iosClassChain,
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            elementName = Email.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickClearSendEmail(email: String, findElementWithoutCatching: Boolean = false) {
        clickToElement(
            locatorAndroid = Email.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = Email.iosClassChain,
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            elementName = Email.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
        clearField(
            locatorAndroid = Email.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = Email.iosClassChain,
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            elementName = Email.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
        clickToElement(
            locatorAndroid = Email.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = Email.iosClassChain,
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            elementName = Email.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
        sendText(
            locatorAndroid = Email.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = Email.iosClassChain,
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            elementName = Email.elementName,
            text = email,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun getInstagram(findElementWithoutCatching: Boolean = false) : String{
        return getText(
            locatorAndroid = Instagram.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = Instagram.iosClassChain,
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            elementName = Instagram.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }
    fun clickClearSendInstagram(instagram: String, findElementWithoutCatching: Boolean = false) {
        clickToElement(
            locatorAndroid = Instagram.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = Instagram.iosClassChain,
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            elementName = Instagram.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
        clearField(
            locatorAndroid = Instagram.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = Instagram.iosClassChain,
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            elementName = Instagram.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
        clickToElement(
            locatorAndroid = Instagram.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = Instagram.iosClassChain,
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            elementName = Instagram.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
        sendText(
            locatorAndroid = Instagram.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = Instagram.iosClassChain,
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            elementName = Instagram.elementName,
            text = instagram,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickSaveData(findElementWithoutCatching: Boolean = false){
        clickToElement(
            locatorAndroid = saveData.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = saveData.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = saveData.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickDeleteUser(findElementWithoutCatching: Boolean = false){
        clickToElement(
            locatorAndroid = deleteUser.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = deleteUser.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = deleteUser.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun tapOnCenterExit(findElementWithoutCatching: Boolean = false){
        tapExitPage(
            locatorAndroid = saveData.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = saveData.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = saveData.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }


    private val Name = ScreenConstructor(
        androidXPath = "/hierarchy/android.widget.FrameLayout/" +
                "android.widget.LinearLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.view.View/android.view.View/" +
                "android.view.View[1]/android.view.View/android.widget.ImageView/" +
                "android.view.View/android.view.View/android.widget.EditText[1]",
        iosClassChain = "**/XCUIElementTypeTextField[`label == \"Имя\"`]",
        elementName = "Поле ввода ИМЕНИ пользователя"
    )
    private val Birthday = ScreenConstructor(
        androidXPath = "/hierarchy/android.widget.FrameLayout/" +
                "android.widget.LinearLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.view.View/android.view.View/" +
                "android.view.View[1]/android.view.View/android.widget.ImageView/" +
                "android.view.View/android.view.View/android.view.View[2]/" +
                "android.widget.EditText",
        iosClassChain = "**/XCUIElementTypeTextField[`label == \"День рождения\"`]",
        elementName = "Поле ввода ДНЯ РОЖДЕНИЯ пользователя"
    )
    private val Email = ScreenConstructor(
        androidXPath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
                "android.widget.FrameLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/" +
                "android.view.View/android.view.View[1]/android.view.View/" +
                "android.widget.ImageView/android.view.View/android.view.View/" +
                "android.widget.EditText[2]",
        iosClassChain = "**/XCUIElementTypeTextField[`label == \"Эл. почта\"`]",
        elementName = "Поле ввода ЭЛ.ПОЧТЫ пользователя"
    )
    private val Instagram = ScreenConstructor(
        androidXPath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
                "android.widget.FrameLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/" +
                "android.view.View/android.view.View[1]/android.view.View/" +
                "android.widget.ImageView/android.view.View/android.view.View/" +
                "android.widget.EditText[3]",
        iosClassChain = "**/XCUIElementTypeTextField[`label == \"Инстаграм\"`]",
        elementName = "Поле ввода аккаунта ИНСТАГРАМ пользователя"
    )
    private val saveData = ScreenConstructor(
        androidAccessId = "Сохранить",
        iosAccessibilityId = "Сохранить",
        elementName = "Кнопка сохранения данных"
    )
    private val deleteUser = ScreenConstructor(
        androidAccessId = "Удалить аккаунт",
        iosAccessibilityId = "Удалить аккаунт",
        elementName = "Кнопка удаления аккаунта"
    )

    private val ExitMyData = ScreenConstructor(
        androidAccessId = "Закрыть",
        iosClassChain = "**/XCUIElementTypeWindow[2]/XCUIElementTypeOther/" +
                "XCUIElementTypeOther[1]",
        elementName = "Выход из окна с данными пользователя."
    )
}