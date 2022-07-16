import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

def baseUrl = GlobalVariable.baseUrl

WebUI.navigateToUrl(baseUrl)

WebUI.waitForElementVisible(findTestObject('Object Repository/login/button_login'), 10, FailureHandling.STOP_ON_FAILURE)