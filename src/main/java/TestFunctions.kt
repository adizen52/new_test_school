import GlobalVariables.androidDriver
import GlobalVariables.iosDriver
import GlobalVariables.platformType
import io.appium.java_client.AppiumBy
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Pause
import org.openqa.selenium.interactions.PointerInput
import org.openqa.selenium.interactions.Sequence
import screens.*
import java.time.Duration
import java.time.Duration.ofMillis
import java.util.concurrent.TimeUnit


object TestFunctions {

    // ВЫБОР ЛОКАТОРОВ (IOS - ANDROID)
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

    //КЛИК ПО ЭЛЕМЕНТУ
    fun clickToElement(locatorAndroid: String, locatorTypeAndroid: LocatorType,
                       locatorIOS : String, locatorTypeIOS: LocatorType){
        val element = changeLocator(locatorAndroid, locatorTypeAndroid,
            locatorIOS, locatorTypeIOS)
        element.click()
    }

    //вставка текста в элемент
    fun sendText(locatorAndroid: String, locatorTypeAndroid: LocatorType,
                 locatorIOS : String, locatorTypeIOS: LocatorType, text: String){
        val element = changeLocator(locatorAndroid, locatorTypeAndroid,
            locatorIOS, locatorTypeIOS)
        element.sendKeys(text)
    }

    //очистка элемента от текста
    fun clearField(locatorAndroid: String, locatorTypeAndroid: LocatorType,
                   locatorIOS : String, locatorTypeIOS: LocatorType){
        val element = changeLocator(locatorAndroid, locatorTypeAndroid,
            locatorIOS, locatorTypeIOS)
        element.clear()
    }

    //проверка наличия элемента
    fun checkAvaliableElemnt(locatorAndroid: String, locatorTypeAndroid: LocatorType,
                             locatorIOS : String, locatorTypeIOS: LocatorType) : Boolean {
        val element = changeLocator(locatorAndroid, locatorTypeAndroid,
            locatorIOS, locatorTypeIOS)
        return  element.isEnabled
    }

    //получение текста из элемента
    fun getText(locatorAndroid: String, locatorTypeAndroid: LocatorType,
                locatorIOS : String, locatorTypeIOS: LocatorType) : String {
        val element = changeLocator(locatorAndroid, locatorTypeAndroid,
            locatorIOS, locatorTypeIOS)
        val textInElement: String
        if (platformType == TypeOS.ANDROID) {
            textInElement = element.text
        } else {
            textInElement = element.text
        }
        return textInElement
    }

    //предтестовые шаги, онбординг + выбор доставки
    fun BeforeSuitFun() {

        Onboarding().clickSelectRusButton()
        Onboarding().clickNextButton()

        if (platformType == TypeOS.IOS) {
            try {
                noticeScren().clickNoticeOn()
            } catch (e: org.openqa.selenium.NoSuchElementException) {
                println("Не было кнопки на уведомления.")
            }
            TimeUnit.SECONDS.sleep(2)
            try {
                noticeScren().clickNoticeAllow()
            } catch (e: org.openqa.selenium.NoSuchElementException) {
                println("Не было сообщения о соглашении с уведомлениями.")
            }
            TimeUnit.SECONDS.sleep(2)
            try {
                noticeScren().clickAllowTrackActivity()
            } catch (e: org.openqa.selenium.NoSuchElementException)
            {
                println("Элементов о соглашении УВЕДОМЛЕНИЙ не было.")
            }
        }
        TimeUnit.SECONDS.sleep(5)
        DeliveryMethod().clickSelectPickup()
    }

    //тап по координатам
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

    //тап по центру элемента, но изменено для кнопки заказа
    fun tapOnCenterElement(locatorAndroid: String, locatorTypeAndroid: LocatorType,
                         locatorIOS : String, locatorTypeIOS: LocatorType){

        val element = changeLocator(locatorAndroid, locatorTypeAndroid,
            locatorIOS, locatorTypeIOS)

        val sizeElement = element.size
        val locatorElement = element.location

        val cordX = locatorElement.x + sizeElement.width / 3
        val cordY = locatorElement.y + sizeElement.height / 3

        tapByCoordinates(cordX, cordY)

    }

    //общая функция свайпа
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

    //функция для свайпа при удалении элемента
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

    //нажатие на кнопку после свайпа для удаления адреса
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

    //нажатие на свободное поле в сплывающем окне для закрытия
    fun tapExitPage(locatorAndroid: String, locatorTypeAndroid: LocatorType,
                    locatorIOS : String, locatorTypeIOS: LocatorType)
    {
        val element = changeLocator(locatorAndroid, locatorTypeAndroid,
            locatorIOS, locatorTypeIOS)

        val locateElement = element.location
        val sizeElement = element.size

        val tapX = locateElement.x + sizeElement.width / 2
        val tapY = locateElement.y + sizeElement.height / 3

        tapByCoordinates(tapX, tapY)
    }

    //изменение данных на другие из map
    fun changeUserData(mapUserData: Map<String, String>) {
        val myDataScreens = MyDataScreens()

        for ((key, value) in mapUserData) {

            when (key) {
                "Name" -> myDataScreens.clickClearSendName(value)
                "Birthday" -> println("Дату изменить нельзя.")
                "Email" -> myDataScreens.clickClearSendEmail(value)
                "Instagram" -> myDataScreens.clickClearSendInstagram(value)
            }
                    }
        myDataScreens.clickSaveData()
        TimeUnit.SECONDS.sleep(3)
    }

    //проверка соответствия данных
    fun checkUserData(mapUserData: Map<String, String>) {
        val myDataScreens = MyDataScreens()

        for ((key, value) in mapUserData) {
            when (key) {
                "Name" -> {
                    val name = myDataScreens.getName()
                    if (name == value) println("$name соответствует") else println("$name НЕ СООТВЕТСТВУЕТ!!!")
                }
                "Birthday" -> {
                    val birthday = myDataScreens.getBirthday()
                    if (birthday == value) println("$birthday соответствует") else println("$birthday НЕ СООТВЕТСТВУЕТ!!!")
                }
                "Email" -> {
                    val email = myDataScreens.getEmail()
                    if (email == value) println("$email соответствует") else println("$email НЕ СООТВЕТСТВУЕТ!!!")
                }
                "Instagram" -> {
                    val instagram = myDataScreens.getInstagram()
                    if (instagram == value) println("$instagram соответствует") else println("$instagram НЕ СООТВЕТСТВУЕТ!!!")
                }
            }
        }
    }

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