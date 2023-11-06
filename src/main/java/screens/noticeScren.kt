package screens

import TestFunctions.clickToElement

class noticeScren {

    fun clickNoticeOn(){
        clickToElement(
            locatorAndroid = noticeOn.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = noticeOn.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID
        )
    }

    fun clickNoticeAllow(){
        clickToElement(
            locatorAndroid = noticeAllow.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = noticeAllow.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID
        )
    }

    fun clickNoticeDontAllow() {
        clickToElement(
            locatorAndroid = noticeDontAllow.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = noticeDontAllow.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID
        )
    }

    fun clickAllowTrackActivity() {
        clickToElement(
            locatorAndroid = AllowTrackActivity.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = AllowTrackActivity.iosClassChain,
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN
        )
    }

    fun clickDontAllowTrackActivity() {
        clickToElement(
            locatorAndroid = dontAllowTrackActivity.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = dontAllowTrackActivity.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID
        )
    }

    private val noticeOn = ScreenConstructor(
        iosAccessibilityId = "Включить уведомления",
        elementName = "Кнопка включения оповещений"
    )

    private val noticeAllow = ScreenConstructor(
        iosAccessibilityId = "Allow",
        elementName = "Согласие в сплывающем окне об уведомлениях"
    )

    private val noticeDontAllow = ScreenConstructor(
        iosAccessibilityId = "Don’t Allow",
        elementName = "Отказ в сплывающем окне об уведомлениях"
    )

    private val AllowTrackActivity = ScreenConstructor(
        iosClassChain =  "**/XCUIElementTypeOther[`label == \"Horizontal scroll bar," +
                " 1 page\"`][2]",
        elementName = "Согласие в сплывающем о наблюдении за активностью"
    )

    private val dontAllowTrackActivity = ScreenConstructor(
        iosAccessibilityId = "Ask App Not to Track",
        elementName = "Отказ от наблюдения за активностью"
    )
}