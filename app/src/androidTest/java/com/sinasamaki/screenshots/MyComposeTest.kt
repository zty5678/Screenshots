package com.sinasamaki.screenshots

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.test.junit4.AndroidComposeTestRule
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.sinasamaki.screenshots.ui.theme.ScreenshotsTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import tools.fastlane.screengrab.Screengrab
import tools.fastlane.screengrab.UiAutomatorScreenshotStrategy
import tools.fastlane.screengrab.locale.LocaleTestRule

class MyComposeTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<TestActivity>()

    @Rule
    @JvmField
    val localeTestRule = LocaleTestRule()

    @Before
    fun init() {
        Screengrab.setDefaultScreenshotStrategy(UiAutomatorScreenshotStrategy())
    }

    @Test
    fun simpleScreenshot() {
        composeTestRule.setContent {
            ScreenshotsTheme {
                App()
            }
        }
        composeTestRule.takeScreenshot("simpleScreenshot")
    }

    @Test
    fun screenshotInCard() {
        composeTestRule.setContent {
            previewMainApp()

        }
        composeTestRule.takeScreenshot("screenshotInCard")
    }

    @Test
    fun titleScreenshot() {
        composeTestRule.setContent {

            previewTitle()
        }
        composeTestRule.takeScreenshot("title")
    }

    @Test
    fun subtitleScreenshot() {
        composeTestRule.setContent {
            previewSubTitle()
        }
        composeTestRule.takeScreenshot("subtitle")
    }

    @Test
    fun themeScreenshot() {
        composeTestRule.setContent {
            previewTheme()
        }
        composeTestRule.takeScreenshot("theme")
    }
}

private fun AndroidComposeTestRule<ActivityScenarioRule<TestActivity>, TestActivity>.takeScreenshot(
    screenshotName: String
) {
    runBlocking {
        awaitIdle()
        delay(100)
        Screengrab.screenshot(screenshotName)

        delay(1000)
    }
}