import GlobalVariables.androidDriver
import io.appium.java_client.AppiumBy
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Pause
import org.openqa.selenium.interactions.PointerInput
import org.openqa.selenium.interactions.Sequence
import screens.DeliveryMethod.selectPickup
import screens.EnterScreens.getCode
import screens.EnterScreens.inputCode
import screens.EnterScreens.inputPhone
import screens.MainSelector.selectProfile
import screens.Onboarding.nextButton
import screens.Onboarding.selectLanguage
import screens.ProfileScreen.logInCabinet
import screens.ProfileScreen.logOut
import java.time.Duration
import java.util.concurrent.TimeUnit


object TestFunctions {

    fun clickToElement(locator: String, locatorType: LocatorType){
        val element = findElement(locator, locatorType)
        element.click()
    }

    fun sendText(locator : String, locatorType : LocatorType, text : String){
        val element = findElement(locator, locatorType)
        element.sendKeys(text)
    }

    fun clearField(locator : String, locatorType : LocatorType){
        val element = findElement(locator, locatorType)
        element.clear()
    }

    fun checkAvaliableElemnt(locator: String, locatorType: LocatorType) : Boolean {
        val element = findElement(locator, locatorType)
        return  element.isEnabled
    }

    fun phoneCode() : String {
        val xmlTextPage = androidDriver.pageSource
        val code = (xmlTextPage.substringAfter("Введите код из смс&#10;")).substringBefore("&#10;")
        return code
    }

    fun BeforeSuitFun() {
        clickToElement(selectLanguage.androidAccessId, LocatorType.ACCESSIBILITY_ID)
        clickToElement(nextButton.androidAccessId, LocatorType.ACCESSIBILITY_ID)
        TimeUnit.SECONDS.sleep(5)
        clickToElement(selectPickup.androidAccessId, LocatorType.ACCESSIBILITY_ID)
    }

    fun tapByCoordinates(cordX: Int, cordY: Int) {
        val finger = PointerInput(PointerInput.Kind.TOUCH, "finger")
        val actions = Sequence(finger, 1)

        actions.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), cordX, cordY))
        actions.addAction(finger.createPointerDown(PointerInput.MouseButton.MIDDLE.asArg()))
        actions.addAction(finger.createPointerUp(PointerInput.MouseButton.MIDDLE.asArg()))
    }

    fun swipeOnScreen(startCordX: Int, startCordY: Int, moveCordX: Int, moveCordY: Int){
        val finger = PointerInput(PointerInput.Kind.TOUCH, "finger")
        val actions = Sequence(finger, 1)

        actions.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), startCordX,startCordY))
        actions.addAction(finger.createPointerDown(PointerInput.MouseButton.MIDDLE.asArg()))
        actions.addAction(Pause(finger, Duration.ofMillis(600)))
        actions.addAction(finger.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), moveCordX, moveCordY))
        actions.addAction(finger.createPointerUp(PointerInput.MouseButton.MIDDLE.asArg()))

        androidDriver.perform(listOf(actions))

    }

    private fun findElement(locator: String, locatorType: LocatorType) : WebElement {
        return when (locatorType) {
            LocatorType.ID -> androidDriver.findElement(AppiumBy.id(locator))
            LocatorType.XPATH -> androidDriver.findElement(AppiumBy.xpath(locator))
            LocatorType.ACCESSIBILITY_ID -> androidDriver.findElement(AppiumBy.accessibilityId(locator))
            LocatorType.CLASS_NAME -> androidDriver.findElement(AppiumBy.className(locator))
        }
    }
}