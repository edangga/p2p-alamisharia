import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

if (individualRun) {
    WebUI.callTestCase(findTestCase('step/navigate to p2p alamisharia'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('step/go to registration by login page'), [:], FailureHandling.STOP_ON_FAILURE)
}

WebUI.callTestCase(findTestCase('step/select account type'), [('accountType') : 'Pemberi Dana'], FailureHandling.STOP_ON_FAILURE)