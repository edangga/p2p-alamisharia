import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

if (accountType == 'Pemberi Dana') {
    WebUI.click(findTestObject('Object Repository/register/div_pemberi_dana'), FailureHandling.STOP_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('Object Repository/register/text_title_registarsi_pemberi_dana'), 10, FailureHandling.STOP_ON_FAILURE)
} else {
    WebUI.click(findTestObject('Object Repository/register/div_penerima_dana'), FailureHandling.STOP_ON_FAILURE)
}