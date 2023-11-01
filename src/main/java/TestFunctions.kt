import GlobalVariables.androidDriver
import GlobalVariables.iosDriver
import GlobalVariables.platformType
import io.appium.java_client.AppiumBy
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Pause
import org.openqa.selenium.interactions.PointerInput
import org.openqa.selenium.interactions.Sequence
import screens.DeliveryMethod.selectPickup
import screens.MyDataScreens
import screens.Onboarding.nextButton
import screens.Onboarding.selectLanguage
import screens.noticeScren.AllowTrackActivity
import screens.noticeScren.noticeAllow
import screens.noticeScren.noticeOn
import java.time.Duration
import java.time.Duration.ofMillis
import java.util.concurrent.TimeUnit


object TestFunctions {

    fun changeLocator(locatorAndroid: String, locatorTypeAndroid: LocatorType,
                      locatorIOS : String, locatorTypeIOS: LocatorType) : WebElement{
        if (platformType == TypeOS.ANDROID) {
            val element = findElement(locatorAndroid, locatorTypeAndroid)
            return element
        } else {
            val element = findElement(locatorIOS, locatorTypeIOS)
            return element
        }
    }

    fun clickToElement(locatorAndroid: String, locatorTypeAndroid: LocatorType,
                       locatorIOS : String, locatorTypeIOS: LocatorType){
        val element = changeLocator(locatorAndroid, locatorTypeAndroid,
            locatorIOS, locatorTypeIOS)
        element.click()
    }

    fun sendText(locatorAndroid: String, locatorTypeAndroid: LocatorType,
                 locatorIOS : String, locatorTypeIOS: LocatorType, text: String){
        val element = changeLocator(locatorAndroid, locatorTypeAndroid,
            locatorIOS, locatorTypeIOS)
        element.sendKeys(text)
    }

    fun clearField(locatorAndroid: String, locatorTypeAndroid: LocatorType,
                   locatorIOS : String, locatorTypeIOS: LocatorType){
        val element = changeLocator(locatorAndroid, locatorTypeAndroid,
            locatorIOS, locatorTypeIOS)
        element.clear()
    }

    fun checkAvaliableElemnt(locatorAndroid: String, locatorTypeAndroid: LocatorType,
                             locatorIOS : String, locatorTypeIOS: LocatorType) : Boolean {
        val element = changeLocator(locatorAndroid, locatorTypeAndroid,
            locatorIOS, locatorTypeIOS)
        return  element.isEnabled
    }

    fun getText(locatorAndroid: String, locatorTypeAndroid: LocatorType,
                locatorIOS : String, locatorTypeIOS: LocatorType) : String {
        val element = changeLocator(locatorAndroid, locatorTypeAndroid,
            locatorIOS, locatorTypeIOS)
        val textInElement = element.text
        return textInElement
    }

    fun phoneCode() : String {
        var xmlTextPage: String
        if (platformType == TypeOS.ANDROID) {
            xmlTextPage = androidDriver.pageSource
        } else {
            xmlTextPage = iosDriver.pageSource
        }

        val code = (xmlTextPage.substringAfter("Введите код из смс&#10;")).substringBefore("&#10;")
        return code
    }

    fun BeforeSuitFun() {
        clickToElement(
            selectLanguage.androidAccessId,
            LocatorType.ACCESSIBILITY_ID,
            selectLanguage.iosAccessibilityId,
            LocatorType.ACCESSIBILITY_ID
        )
        clickToElement(
                nextButton.androidAccessId,
                LocatorType.ACCESSIBILITY_ID,
                nextButton.iosAccessibilityId,
                LocatorType.ACCESSIBILITY_ID
            )
        if (platformType == TypeOS.IOS) {
            try {
                clickToElement(
                    noticeOn.androidAccessId,
                    LocatorType.ACCESSIBILITY_ID,
                    noticeOn.iosAccessibilityId,
                    LocatorType.ACCESSIBILITY_ID
                )
            } catch (e: org.openqa.selenium.NoSuchElementException) {
                println("Не было кнопки на уведомления.")
            }
            TimeUnit.SECONDS.sleep(2)
            try {
                clickToElement(
                    noticeAllow.androidAccessId,
                    LocatorType.ACCESSIBILITY_ID,
                    noticeAllow.iosAccessibilityId,
                    LocatorType.ACCESSIBILITY_ID
                )
            } catch (e: org.openqa.selenium.NoSuchElementException) {
                println("Не было сообщения о соглашении с уведомлениями.")
            }
            TimeUnit.SECONDS.sleep(2)
            try {
                clickToElement(
                    AllowTrackActivity.androidAccessId,
                    LocatorType.ACCESSIBILITY_ID,
                    AllowTrackActivity.iosClassChain,
                    LocatorType.IOS_CLASS_CHAIN
                )
            } catch (e: org.openqa.selenium.NoSuchElementException)
            {
                println("Элементов о соглашении УВЕДОМЛЕНИЙ не было.")
            }
        }
        TimeUnit.SECONDS.sleep(5)
        clickToElement(
                selectPickup.androidAccessId,
                LocatorType.ACCESSIBILITY_ID,
                selectPickup.iosAccessibilityId,
                LocatorType.ACCESSIBILITY_ID
            )
    }


    fun tapByCoordinates(cordX: Int, cordY: Int) {
        val finger = PointerInput(PointerInput.Kind.TOUCH, "finger")
        val actions = Sequence(finger, 1)

        actions.addAction(finger.createPointerMove(ofMillis(0), PointerInput.Origin.viewport(), cordX, cordY))
        actions.addAction(finger.createPointerDown(PointerInput.MouseButton.MIDDLE.asArg()))
        actions.addAction(finger.createPointerUp(PointerInput.MouseButton.MIDDLE.asArg()))

        if (platformType == TypeOS.ANDROID) {
            androidDriver.perform(listOf(actions))
        } else {
            iosDriver.perform(listOf(actions))
        }
    }

    fun tapMakeAnOrader (locatorAndroid: String, locatorTypeAndroid: LocatorType,
                         locatorIOS : String, locatorTypeIOS: LocatorType){
        val element = changeLocator(locatorAndroid, locatorTypeAndroid,
            locatorIOS, locatorTypeIOS)

        val sizeElement = element.size
        val locatorElement = element.location

        val cordX = locatorElement.x + sizeElement.width / 2
        val cordY = locatorElement.y +sizeElement.height / 2

        tapByCoordinates(cordX, cordY)

    }

    fun swipeOnScreen(startCordX: Int, startCordY: Int, moveCordX: Int, moveCordY: Int){
        val finger = PointerInput(PointerInput.Kind.TOUCH, "finger")
        val actions = Sequence(finger, 1)

        actions.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), startCordX,startCordY))
        actions.addAction(finger.createPointerDown(PointerInput.MouseButton.MIDDLE.asArg()))
        actions.addAction(Pause(finger, Duration.ofMillis(600)))
        actions.addAction(finger.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), moveCordX, moveCordY))
        actions.addAction(finger.createPointerUp(PointerInput.MouseButton.MIDDLE.asArg()))

        if (platformType == TypeOS.ANDROID) {
            androidDriver.perform(listOf(actions))
        } else {
            iosDriver.perform(listOf(actions))
        }

    }

    fun swipeDeleteAddress(locatorAndroid: String, locatorTypeAndroid: LocatorType,
                           locatorIOS : String, locatorTypeIOS: LocatorType){
        val element = changeLocator(locatorAndroid, locatorTypeAndroid,
            locatorIOS, locatorTypeIOS)

        val locateElement = element.location
        val sizeElement = element.size

        val startX = sizeElement.width
        val moveX = locateElement.x

        val startY = locateElement.y + sizeElement.height / 2

        swipeOnScreen(startX, startY, moveX, startY)

    }

    fun tapDeleteAddress(locatorAndroid: String, locatorTypeAndroid: LocatorType,
                         locatorIOS : String, locatorTypeIOS: LocatorType){
        val element = changeLocator(locatorAndroid, locatorTypeAndroid,
            locatorIOS, locatorTypeIOS)

        val locatorElement = element.location
        val sizeElement = element.size

        val tapX = locatorElement.x + sizeElement.width - 5
        val tapY = locatorElement.y + sizeElement.height - 5

        tapByCoordinates(tapX, tapY)
    }

    fun tapExitPage(locator : String, locatorType : LocatorType) {
        val element = findElement(locator, locatorType)
        val locateElement = element.location
        val sizeElement = element.size

        val tapX = locateElement.x + sizeElement.width / 2
        val tapY = locateElement.y + sizeElement.height / 3

        tapByCoordinates(tapX, tapY)
    }

//    fun changeUserData(mapUserData: Map<String, String>) {
//        for ((key, value) in mapUserData) {
//            if (key == MyDataScreens.Birthday.androidXPath) {
//                println("No trigger. Birthday.")
//            } else {
//                clickToElement(key, LocatorType.XPATH)
//                clearField(key, LocatorType.XPATH)
//                clickToElement(key, LocatorType.XPATH)
//                sendText(key, LocatorType.XPATH, value)
//            }
//        }
//        clickToElement(MyDataScreens.saveData.androidAccessId, LocatorType.ACCESSIBILITY_ID)
//    }

//    fun checkUserData(mapUserData: Map<String, String>) {
//        for ((key, value) in mapUserData) {
//            if (getText(key, LocatorType.XPATH) == value) {
//                println("$value соответствует!")
//            }
//            else {
//                println("$value не соответствует, ОШИБКА!!!")
//            }
//        }
//    }

    private fun findElement(locator: String, locatorType: LocatorType) : WebElement {
        return when (locatorType) {
            LocatorType.ID -> {
                if (platformType == TypeOS.ANDROID) {
                    androidDriver.findElement(AppiumBy.id(locator))
                } else {
                    iosDriver.findElement(AppiumBy.id(locator))
                }
            }
            LocatorType.XPATH -> {
                if (platformType == TypeOS.ANDROID) {
                    androidDriver.findElement(AppiumBy.xpath(locator))
                } else {
                    iosDriver.findElement(AppiumBy.xpath(locator))
                }
            }
            LocatorType.ACCESSIBILITY_ID -> {
                if (platformType == TypeOS.ANDROID) {
                    androidDriver.findElement(AppiumBy.accessibilityId(locator))
                } else {
                    iosDriver.findElement(AppiumBy.accessibilityId(locator))
                }
            }
            LocatorType.CLASS_NAME -> {
                if (platformType == TypeOS.ANDROID) {
                    androidDriver.findElement(AppiumBy.className(locator))
                } else {
                    iosDriver.findElement(AppiumBy.className(locator))
                }
            }

            LocatorType.IOS_CLASS_CHAIN -> iosDriver.findElement(AppiumBy.iOSClassChain(locator))
            LocatorType.IOS_PREDICATE_STRING -> iosDriver.findElement(AppiumBy.iOSNsPredicateString(locator))
        }
    }

}