package screens

import TestFunctions.clearField
import TestFunctions.clickToElement
import TestFunctions.getText
import TestFunctions.sendText
import TestFunctions.tapExitPage
import java.sql.Savepoint

// ВСПЛЫВАЮЩЕЕ ОКНО - ДАННЫХ О ПОЛЬЗОВАТЕЛЕ

class MyDataScreens {

    fun getName() : String{
        return getText(
            locatorAndroid = Name.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = Name.iosClassChain,
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN)
    }

    fun clickClearSendName(name: String) {
        clickToElement(
            locatorAndroid = Name.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = Name.iosClassChain,
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN
        )
        clearField(
            locatorAndroid = Name.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = Name.iosClassChain,
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN
        )
        clickToElement(
            locatorAndroid = Name.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = Name.iosClassChain,
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN
        )
        sendText(
            locatorAndroid = Name.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = Name.iosClassChain,
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            name
        )
    }

    fun getBirthday() : String{
        return getText(
            locatorAndroid = Birthday.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = Birthday.iosClassChain,
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN)
    }

    fun clickClearSendBirthday(birthday: String) {
        clickToElement(
            locatorAndroid = Birthday.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = Birthday.iosClassChain,
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN
        )
        clearField(
            locatorAndroid = Birthday.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = Birthday.iosClassChain,
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN
        )
        clickToElement(
            locatorAndroid = Birthday.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = Birthday.iosClassChain,
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN
        )
        sendText(
            locatorAndroid = Birthday.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = Birthday.iosClassChain,
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            birthday
        )
    }

    fun getEmail() : String{
        return getText(
            locatorAndroid = Email.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = Email.iosClassChain,
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN)
    }

    fun clickClearSendEmail(email: String) {
        clickToElement(
            locatorAndroid = Email.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = Email.iosClassChain,
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN
        )
        clearField(
            locatorAndroid = Email.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = Email.iosClassChain,
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN
        )
        clickToElement(
            locatorAndroid = Email.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = Email.iosClassChain,
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN
        )
        sendText(
            locatorAndroid = Email.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = Email.iosClassChain,
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            email
        )
    }

    fun getInstagram() : String{
        return getText(
            locatorAndroid = Instagram.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = Instagram.iosClassChain,
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN)
    }
    fun clickClearSendInstagram(instagram: String) {
        clickToElement(
            locatorAndroid = Instagram.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = Instagram.iosClassChain,
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN
        )
        clearField(
            locatorAndroid = Instagram.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = Instagram.iosClassChain,
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN
        )
        clickToElement(
            locatorAndroid = Instagram.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = Instagram.iosClassChain,
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN
        )
        sendText(
            locatorAndroid = Instagram.androidXPath,
            locatorTypeAndroid = LocatorType.XPATH,
            locatorIOS = Instagram.iosClassChain,
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            instagram
        )
    }

    fun clickSaveData(){
        clickToElement(
            locatorAndroid = saveData.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = saveData.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID
        )
    }

    fun clickDeleteUser(){
        clickToElement(
            locatorAndroid = deleteUser.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = deleteUser.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID
        )
    }

    fun tapOnCenterExit(){
        tapExitPage(
            locatorAndroid = saveData.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = saveData.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID
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