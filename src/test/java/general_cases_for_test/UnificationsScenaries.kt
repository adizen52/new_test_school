package general_cases_for_test

import GlobalVariables.androidDriver
import GlobalVariables.iosDriver
import GlobalVariables.platformType
import TestFunctions.swipeOnScreen

object UnificationsScenaries {

    fun swipeCategoryCoordinates() {
        var screenSizeWidth : Int
        var screenSizeHeight : Int
        if (platformType == TypeOS.ANDROID) {
            screenSizeWidth = androidDriver.manage().window().size.getWidth()
            screenSizeHeight = androidDriver.manage().window().size.getHeight()
        } else {
            screenSizeWidth = iosDriver.manage().window().size.getWidth()
            screenSizeHeight = iosDriver.manage().window().size.getHeight()
        }
        screenSizeWidth = screenSizeWidth / 2
        screenSizeHeight  = (screenSizeHeight * 0.654).toInt()

        swipeOnScreen(startCordX = screenSizeWidth,
            startCordY = screenSizeHeight,
            moveCordX = 0,
            moveCordY = screenSizeHeight)
    }
}