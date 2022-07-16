import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('step/input data login'), [('email') : '', ('password') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('step/click button login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('step/verify error message can not login'), [:], FailureHandling.STOP_ON_FAILURE)