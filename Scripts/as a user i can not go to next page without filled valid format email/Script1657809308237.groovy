import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

if (individualRun) {
    WebUI.callTestCase(findTestCase('step/navigate to p2p alamisharia'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('step/go to registration by login page'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('step/select account type'), [('accountType') : 'Pemberi Dana'], FailureHandling.STOP_ON_FAILURE)
}

WebUI.callTestCase(findTestCase('step/input data funder'), [('name') : 'testing', ('email') : 'emailtesting', ('phoneNumber') : '080002000900'
        , ('password') : '1+1samadengan2', ('userType') : 'Individual'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('step/click button lanjut'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('step/verify error message format email'), [:], FailureHandling.STOP_ON_FAILURE)