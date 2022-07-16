import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebElement

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

if (WebUI.waitForElementPresent(findTestObject('Object Repository/dashboard/button_lengkapi_profil'), 10, FailureHandling.OPTIONAL)) {
	
	WebUI.clickOffset(findTestObject('Object Repository/dashboard/button_lengkapi_profil'), 100, 100)
		 //	WebUI.click(findTestObject('Object Repository/dashboard/button_notofication_dashboard'))
}

WebUI.verifyElementPresent(findTestObject('Object Repository/dashboard/button_notofication_dashboard'), 10, FailureHandling.STOP_ON_FAILURE)