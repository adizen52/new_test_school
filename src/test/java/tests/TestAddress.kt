package tests

import MainActivity
import TestFunctions.swipeOnScreen
import general_cases_for_test.AutorizationScenaries
import org.testng.annotations.Test
import screens.*
import java.util.concurrent.TimeUnit

class TestAddress : MainActivity() {

    @Test
    fun Test1() {
        val mainSelector = MainSelector()
        val profileScreen = ProfileScreen()
        val newAddressScreen = newAddressScren()
        val addressScreen = addressScren()

        AutorizationScenaries.checkAutorizaitionUser(true)
        mainSelector.clickSelectProfile()
        profileScreen.clickMyAddress()
        TimeUnit.SECONDS.sleep(3)
        addressScreen.clickAddNewAddress()
        try {
            addressScreen.clickLocationResolution()
        } catch (e: org.openqa.selenium.NoSuchElementException) {
            println("Элемента не было")
        }
        TimeUnit.SECONDS.sleep(3)
        addressScreen.clickAddNewAddress()
        addressScreen.clickLineAddress()
        TimeUnit.SECONDS.sleep(2)
        addressScreen.clickRemoveAddress()
        addressScreen.sendLineAddress("Сапёрный переулок, 24, Санкт-Петербург")
        addressScreen.clickValueAddress()
        newAddressScreen.clickAndSendFlat("1808")
        newAddressScreen.clickAndSendEntrance("9")
        newAddressScreen.clickAndSendIntercom("111")
        newAddressScreen.clickAndSendFloor("18")
        newAddressScreen.clickAndSendCommentCourier("Есть лифт")
        newAddressScreen.clickSaveAddress()
        TimeUnit.SECONDS.sleep(2)
        swipeOnScreen(545, 122, 500, 1091)
        mainSelector.clickSelectMenu()
        mainSelector.clickSelectProfile()
        profileScreen.clickMyAddress()
        TimeUnit.SECONDS.sleep(2)
        addressScreen.swipeOrCheckSaperniAddress("SWIPE")
        TimeUnit.SECONDS.sleep(2)
        addressScreen.clickDeleteAddress()
        swipeOnScreen(545, 122, 500, 1091)
        profileScreen.clickMyAddress()
        try {
            addressScreen.swipeOrCheckSaperniAddress("CHECK")
        } catch (e: org.openqa.selenium.NoSuchElementException) {
            println("Адрес удален.")
        }
        TimeUnit.SECONDS.sleep(2)
        swipeOnScreen(545, 122, 500, 1091)
        mainSelector.clickSelectMenu()
    }
}