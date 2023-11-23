package screens

import TestFunctions.clickToElement

//ВСПЛЫВАЮЩИЕ ОКНА О РАЗЛИЧНЫХ СОГЛАШЕНИЯХ
class noticeScren {

    fun clickNoticeOn(findElementWithoutCatching: Boolean = false){
        clickToElement(
            locatorAndroid = noticeOn.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = noticeOn.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = noticeOn.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickNoticeAllow(findElementWithoutCatching: Boolean = false){
        clickToElement(
            locatorAndroid = noticeAllow.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = noticeAllow.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = noticeAllow.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickNoticeDontAllow(findElementWithoutCatching: Boolean = false) {
        clickToElement(
            locatorAndroid = noticeDontAllow.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = noticeDontAllow.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = noticeDontAllow.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickAllowTrackActivity(findElementWithoutCatching: Boolean = false) {
        clickToElement(
            locatorAndroid = AllowTrackActivity.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = AllowTrackActivity.iosClassChain,
            locatorTypeIOS = LocatorType.IOS_CLASS_CHAIN,
            elementName = AllowTrackActivity.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    fun clickDontAllowTrackActivity(findElementWithoutCatching: Boolean = false) {
        clickToElement(
            locatorAndroid = dontAllowTrackActivity.androidAccessId,
            locatorTypeAndroid = LocatorType.ACCESSIBILITY_ID,
            locatorIOS = dontAllowTrackActivity.iosAccessibilityId,
            locatorTypeIOS = LocatorType.ACCESSIBILITY_ID,
            elementName = dontAllowTrackActivity.elementName,
            findElementWithoutCatching = findElementWithoutCatching
        )
    }

    private val noticeOn = ScreenConstructor(
        iosAccessibilityId = "Включить уведомления",
        elementName = "Кнопка включения оповещений"
    )

    private val noticeAllow = ScreenConstructor(
        iosAccessibilityId = "Разрешить",
        elementName = "Согласие в сплывающем окне об уведомлениях"
    )

    private val noticeDontAllow = ScreenConstructor(
        iosAccessibilityId = "Don’t Allow",
        elementName = "Отказ в сплывающем окне об уведомлениях"
    )

    private val AllowTrackActivity = ScreenConstructor(
        iosClassChain =  "**/XCUIElementTypeOther[`label == \"Горизонтальная полоса прокрутки, 1 страница\"`][2]",
        elementName = "Согласие в сплывающем о наблюдении за активностью"
    )

    private val dontAllowTrackActivity = ScreenConstructor(
        iosAccessibilityId = "Ask App Not to Track",
        elementName = "Отказ от наблюдения за активностью"
    )
}