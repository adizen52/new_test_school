import GlobalVariables.androidDriver
import GlobalVariables.iosDriver
import GlobalVariables.platformType
import io.appium.java_client.AppiumBy
import io.qameta.allure.Attachment
import io.qameta.allure.Step
import org.openqa.selenium.OutputType
import org.openqa.selenium.TakesScreenshot
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Pause
import org.openqa.selenium.interactions.PointerInput
import org.openqa.selenium.interactions.Sequence
import org.testng.Assert
import screens.*

import java.time.Duration
import java.time.Duration.ofMillis
import java.util.Date
import java.util.concurrent.TimeUnit


object TestFunctions {

    // ВЫБОР ЛОКАТОРОВ (IOS - ANDROID)
    fun changeLocator(
        locatorAndroid: String,
        locatorTypeAndroid: LocatorType,
        locatorIOS: String,
        locatorTypeIOS: LocatorType,
        findElementWithoutCatching: Boolean = false
    ): WebElement {
        if (platformType == TypeOS.ANDROID) {
            val element = findElement(
                locatorAndroid,
                locatorTypeAndroid,
                findElementWithoutCatching
            )
            return element
        } else {
            val element = findElement(
                locatorIOS,
                locatorTypeIOS,
                findElementWithoutCatching
            )
            return element
        }
    }


    //КЛИК ПО ЭЛЕМЕНТУ
    @Step("Нажатие на {elementName}")
    fun clickToElement(
        locatorAndroid: String,
        locatorTypeAndroid: LocatorType,
        locatorIOS: String,
        locatorTypeIOS: LocatorType,
        elementName: String,
        findElementWithoutCatching: Boolean = false
    ) {
        val element = changeLocator(
            locatorAndroid,
            locatorTypeAndroid,
            locatorIOS,
            locatorTypeIOS,
            findElementWithoutCatching
        )
        element.click()
    }

    //вставка текста в элемент
    @Step("вставка текста {text} в поле {elementName}")
    fun sendText(
        locatorAndroid: String,
        locatorTypeAndroid: LocatorType,
        locatorIOS: String,
        locatorTypeIOS: LocatorType,
        text: String,
        elementName: String,
        findElementWithoutCatching: Boolean = false
    ) {
        val element = changeLocator(
            locatorAndroid,
            locatorTypeAndroid,
            locatorIOS,
            locatorTypeIOS,
            findElementWithoutCatching
        )
        element.sendKeys(text)
    }

    //очистка элемента от текста
    @Step("Очистка поля в элементе {elementName}")
    fun clearField(
        locatorAndroid: String,
        locatorTypeAndroid: LocatorType,
        locatorIOS: String,
        locatorTypeIOS: LocatorType,
        elementName: String,
        findElementWithoutCatching: Boolean = false
    ) {
        val element = changeLocator(
            locatorAndroid,
            locatorTypeAndroid,
            locatorIOS,
            locatorTypeIOS,
            findElementWithoutCatching
        )
        element.clear()
    }

    //проверка наличия элемента
    @Step("Проверка на наличие элемента {elementName}")
    fun checkAvaliableElemnt(
        locatorAndroid: String,
        locatorTypeAndroid: LocatorType,
        locatorIOS: String,
        locatorTypeIOS: LocatorType,
        elementName: String,
        findElementWithoutCatching: Boolean = false
    ): Boolean {
        val element = changeLocator(
            locatorAndroid,
            locatorTypeAndroid,
            locatorIOS,
            locatorTypeIOS,
            findElementWithoutCatching
        )
        return element.isEnabled
    }

    fun visibleElement(
        locatorAndroid: String,
        locatorTypeAndroid: LocatorType,
        locatorIOS: String,
        locatorTypeIOS: LocatorType,
        elementName: String,
        findElementWithoutCatching: Boolean = false
    ): Boolean {
        val element = changeLocator(
            locatorAndroid,
            locatorTypeAndroid,
            locatorIOS,
            locatorTypeIOS,
            findElementWithoutCatching
        )
        var visible : Boolean
        if (element.getAttribute("visible") == "true") {
            println("TRUE")
            visible = true
        } else {
            visible = false
        }
        return visible
    }

    //получение текста из элемента
    @Step("Получение текста из элемента {elementName}")
    fun getText(
        locatorAndroid: String,
        locatorTypeAndroid: LocatorType,
        locatorIOS: String,
        locatorTypeIOS: LocatorType,
        elementName: String,
        findElementWithoutCatching: Boolean = false
    ): String {
        val element = changeLocator(
            locatorAndroid,
            locatorTypeAndroid,
            locatorIOS,
            locatorTypeIOS,
            findElementWithoutCatching
        )
        return element.text
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
    fun tapOnCenterElement(
        locatorAndroid: String,
        locatorTypeAndroid: LocatorType,
        locatorIOS: String,
        locatorTypeIOS: LocatorType,
        elementName: String,
        findElementWithoutCatching: Boolean = false
    ) {

        val element = changeLocator(
            locatorAndroid,
            locatorTypeAndroid,
            locatorIOS,
            locatorTypeIOS,
            findElementWithoutCatching
        )

        val sizeElement = element.size
        val locatorElement = element.location

        val cordX = locatorElement.x + sizeElement.width / 3
        val cordY = locatorElement.y + sizeElement.height / 3

        tapByCoordinates(cordX, cordY)

    }

    //общая функция свайпа
    fun swipeOnScreen(startCordX: Int, startCordY: Int, moveCordX: Int, moveCordY: Int) {
        val finger = PointerInput(PointerInput.Kind.TOUCH, "finger")
        val actions = Sequence(finger, 1)

        actions.addAction(
            finger.createPointerMove(
                Duration.ofMillis(0),
                PointerInput.Origin.viewport(),
                startCordX,
                startCordY
            )
        )
        actions.addAction(finger.createPointerDown(PointerInput.MouseButton.MIDDLE.asArg()))
        actions.addAction(Pause(finger, Duration.ofMillis(600)))
        actions.addAction(
            finger.createPointerMove(
                Duration.ofMillis(1000),
                PointerInput.Origin.viewport(),
                moveCordX,
                moveCordY
            )
        )
        actions.addAction(finger.createPointerUp(PointerInput.MouseButton.MIDDLE.asArg()))

        if (platformType == TypeOS.ANDROID) {
            androidDriver.perform(listOf(actions))
        } else {
            iosDriver.perform(listOf(actions))
        }

    }

    //функция для свайпа при удалении элемента
    fun swipeDeleteAddress(
        locatorAndroid: String,
        locatorTypeAndroid: LocatorType,
        locatorIOS: String,
        locatorTypeIOS: LocatorType,
        elementName: String,
        findElementWithoutCatching: Boolean = false
    ) {
        val element = changeLocator(
            locatorAndroid,
            locatorTypeAndroid,
            locatorIOS,
            locatorTypeIOS,
            findElementWithoutCatching
        )

        val locateElement = element.location
        val sizeElement = element.size

        val startX = sizeElement.width
        val moveX = locateElement.x

        val startY = locateElement.y + sizeElement.height / 2

        swipeOnScreen(startX, startY, moveX, startY)

    }

    //нажатие на кнопку после свайпа для удаления адреса
    fun tapDeleteAddress(
        locatorAndroid: String,
        locatorTypeAndroid: LocatorType,
        locatorIOS: String,
        locatorTypeIOS: LocatorType,
        elementName: String,
        findElementWithoutCatching: Boolean = false
    ) {
        val element = changeLocator(
            locatorAndroid,
            locatorTypeAndroid,
            locatorIOS,
            locatorTypeIOS, findElementWithoutCatching
        )

        val locatorElement = element.location
        val sizeElement = element.size

        val tapX = locatorElement.x + sizeElement.width - 5
        val tapY = locatorElement.y + sizeElement.height - 5

        tapByCoordinates(tapX, tapY)
    }

    //нажатие на свободное поле в сплывающем окне для закрытия
    fun tapExitPage(
        locatorAndroid: String,
        locatorTypeAndroid: LocatorType,
        locatorIOS: String,
        locatorTypeIOS: LocatorType,
        elementName: String,
        findElementWithoutCatching: Boolean = false
    ) {
        val element = changeLocator(
            locatorAndroid,
            locatorTypeAndroid,
            locatorIOS,
            locatorTypeIOS,
            findElementWithoutCatching
        )

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

    private fun findElement(
        locator: String,
        locatorType: LocatorType,
        findElementWithoutCatching: Boolean = false
    ): WebElement {
        lateinit var element: WebElement

        if (findElementWithoutCatching) {
            when (locatorType) {
                LocatorType.ID -> {
                    element = if (platformType == TypeOS.ANDROID) {
                        androidDriver.findElement(AppiumBy.id(locator))
                    } else {
                        iosDriver.findElement(AppiumBy.id(locator))
                    }
                }

                LocatorType.XPATH -> {
                    element = if (platformType == TypeOS.ANDROID) {
                        androidDriver.findElement(AppiumBy.xpath(locator))
                    } else {
                        iosDriver.findElement(AppiumBy.xpath(locator))
                    }
                }

                LocatorType.ACCESSIBILITY_ID -> {
                    element = if (platformType == TypeOS.ANDROID) {
                        androidDriver.findElement(AppiumBy.accessibilityId(locator))
                    } else {
                        iosDriver.findElement(AppiumBy.accessibilityId(locator))
                    }
                }

                LocatorType.CLASS_NAME -> {
                    element = if (platformType == TypeOS.ANDROID) {
                        androidDriver.findElement(AppiumBy.className(locator))
                    } else {
                        iosDriver.findElement(AppiumBy.className(locator))
                    }
                }

                LocatorType.IOS_CLASS_CHAIN -> element = iosDriver.findElement(AppiumBy.iOSClassChain(locator))
                LocatorType.IOS_PREDICATE_STRING -> element =
                    iosDriver.findElement(AppiumBy.iOSNsPredicateString(locator))
            }

        } else {
            runCatching {
                when (locatorType) {
                    LocatorType.ID -> {
                        element = if (platformType == TypeOS.ANDROID) {
                            androidDriver.findElement(AppiumBy.id(locator))
                        } else {
                            iosDriver.findElement(AppiumBy.id(locator))
                        }
                    }

                    LocatorType.XPATH -> {
                        element = if (platformType == TypeOS.ANDROID) {
                            androidDriver.findElement(AppiumBy.xpath(locator))
                        } else {
                            iosDriver.findElement(AppiumBy.xpath(locator))
                        }
                    }

                    LocatorType.ACCESSIBILITY_ID -> {
                        element = if (platformType == TypeOS.ANDROID) {
                            androidDriver.findElement(AppiumBy.accessibilityId(locator))
                        } else {
                            iosDriver.findElement(AppiumBy.accessibilityId(locator))
                        }
                    }

                    LocatorType.CLASS_NAME -> {
                        element = if (platformType == TypeOS.ANDROID) {
                            androidDriver.findElement(AppiumBy.className(locator))
                        } else {
                            iosDriver.findElement(AppiumBy.className(locator))
                        }
                    }

                    LocatorType.IOS_CLASS_CHAIN -> element = iosDriver.findElement(AppiumBy.iOSClassChain(locator))
                    LocatorType.IOS_PREDICATE_STRING -> element =
                        iosDriver.findElement(AppiumBy.iOSNsPredicateString(locator))

                }
            }.onSuccess {

            }.onFailure {
                makeScreenshotOfScreen(Date().toString())
                Assert.fail("Элемент не был найден по локатору - $locator")
            }
        }
        return element
    }

    @Attachment(value = "Screenshot - {dateOnSystem}", type = "image/png")
    fun makeScreenshotOfScreen(dateOnSystem: String?): ByteArray {
        return if (platformType == TypeOS.IOS) {
            (iosDriver as TakesScreenshot?)!!.getScreenshotAs(OutputType.BYTES)
        } else (androidDriver as TakesScreenshot?)!!.getScreenshotAs(OutputType.BYTES)

        // использование - makeScreenshotOfScreen(String.valueOf(new Date()))
    }

}