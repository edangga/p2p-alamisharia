import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.interactions.Actions as Actions
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.focus(findTestObject('Object Repository/register/scroll_tnc'))

WebUI.click(findTestObject('Object Repository/register/text_Bismillahirrahmanirrahim'))

def driver = DriverFactory.getWebDriver()

Actions builder = new Actions(driver)

builder.sendKeys(Keys.END).build().perform()

WebUI.waitForElementClickable(findTestObject('Object Repository/register/cbk_tnc'), 10)

WebUI.click(findTestObject('Object Repository/register/cbk_tnc'))

WebUI.click(findTestObject('Object Repository/register/button_lanjut_tnc'))

WebUI.waitForElementPresent(findTestObject('Object Repository/register/button_resendEmail'), 10, FailureHandling.STOP_ON_FAILURE)