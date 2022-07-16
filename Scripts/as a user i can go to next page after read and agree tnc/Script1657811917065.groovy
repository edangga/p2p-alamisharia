import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

String datetime = java.time.LocalDateTime.now()

def now = datetime.replace('-', '').replace('T', '').replace(':', '').substring(2).substring(0, 12)

if (individualRun) {
    WebUI.callTestCase(findTestCase('step/navigate to p2p alamisharia'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('step/go to registration by login page'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('step/select account type'), [('accountType') : 'Pemberi Dana'], FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('step/input data funder'), [('name') : 'testing', ('email') : ('emailtest' + now) + 
            '@mail.com', ('phoneNumber') : '08' + now, ('password') : 'Password150', ('userType') : 'Individual'], FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('step/click button lanjut'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('step/verify user on tnc page'), [:], FailureHandling.STOP_ON_FAILURE)
}

WebUI.callTestCase(findTestCase('step/agree tnc'), [:], FailureHandling.STOP_ON_FAILURE)