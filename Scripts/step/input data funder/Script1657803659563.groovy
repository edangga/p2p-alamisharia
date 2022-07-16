import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.setText(findTestObject('Object Repository/register/input_funderName'), name)

WebUI.setText(findTestObject('Object Repository/register/input_funderEmail'), email)

WebUI.setText(findTestObject('Object Repository/register/input_ledgerPhoneNumber'), phoneNumber)

WebUI.setText(findTestObject('Object Repository/register/input_password'), password)

if(userType=='Institusi') {
	WebUI.click(findTestObject('Object Repository/register/rdo_accountInstitusi'))
}else {
	WebUI.click(findTestObject('Object Repository/register/rdo_accountIndividu'))
}
