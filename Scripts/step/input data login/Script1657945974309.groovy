import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.setText(findTestObject('Object Repository/login/input_username'), email)

WebUI.setText(findTestObject('Object Repository/login/input_password'), password)