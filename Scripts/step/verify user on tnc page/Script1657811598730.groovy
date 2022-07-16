import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.waitForElementPresent(findTestObject('Object Repository/register/button_lanjut_tnc'), 10)

WebUI.verifyElementPresent(findTestObject('Object Repository/register/button_lanjut_tnc'), 10, FailureHandling.STOP_ON_FAILURE)
