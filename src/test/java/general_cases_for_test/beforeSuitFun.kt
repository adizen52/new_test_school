package general_cases_for_test

import GlobalVariables.platformType
import screens.DeliveryMethod
import screens.Onboarding
import screens.noticeScren
import java.util.concurrent.TimeUnit

object beforeSuitFun {

    fun BeforeSuitFun() {

        Onboarding().clickSelectRusButton()
        Onboarding().clickNextButton()

        if (platformType == TypeOS.IOS) {
            TimeUnit.SECONDS.sleep(3)
            try {
                noticeScren().clickNoticeOn(findElementWithoutCatching = true)
            } catch (e: org.openqa.selenium.NoSuchElementException) {
                println("Не было кнопки на уведомления.")
            }
            TimeUnit.SECONDS.sleep(2)
            try {
                noticeScren().clickNoticeAllow(findElementWithoutCatching = true)
            } catch (e: org.openqa.selenium.NoSuchElementException) {
                println("Не было сообщения о соглашении с уведомлениями.")
            }
            TimeUnit.SECONDS.sleep(2)
            try {
                noticeScren().clickAllowTrackActivity(findElementWithoutCatching = true)
            } catch (e: org.openqa.selenium.NoSuchElementException) {
                println("Элементов о соглашении УВЕДОМЛЕНИЙ не было.")
            }
        }
        TimeUnit.SECONDS.sleep(5)
        DeliveryMethod().clickSelectPickup()
    }

}