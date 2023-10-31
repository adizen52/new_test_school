package screens

object noticeScren {

    val noticeOn = ScreenConstructor(
        iosAccessibilityId = "Включить уведомления",
        elementName = "Кнопка включения оповещений"
    )

    val noticeAllow = ScreenConstructor(
        iosAccessibilityId = "Allow",
        elementName = "Согласие в сплывающем окне об уведомлениях"
    )

    val noticeDontAllow = ScreenConstructor(
        iosAccessibilityId = "Don’t Allow",
        elementName = "Отказ в сплывающем окне об уведомлениях"
    )

    val AllowTrackActivity = ScreenConstructor(
        iosClassChain = "(//XCUIElementTypeOther[@name=\"Horizontal scroll bar, 1 page\"])[2]",
        elementName = "Согласие в сплывающем о наблюдении за активностью"
    )

    val dontAllowTrackActivity = ScreenConstructor(
        iosAccessibilityId = "Ask App Not to Track",
        elementName = "Отказ от наблюдения за активностью"
    )



}