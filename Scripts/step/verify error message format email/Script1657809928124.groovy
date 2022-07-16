import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.verifyElementVisible(findTestObject('Object Repository/register/text_error_field_email'), FailureHandling.STOP_ON_FAILURE)