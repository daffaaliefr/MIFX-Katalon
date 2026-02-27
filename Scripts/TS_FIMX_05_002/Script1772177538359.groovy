import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver

WebUI.navigateToUrl('https://www.saucedemo.com/')

WebUI.setText(findTestObject('Page_Swag Labs/input_Username'), 'standard_user')

WebUI.click(findTestObject('Page_Swag Labs/input_Password'))

WebUI.setEncryptedText(findTestObject('Page_Swag Labs/input_Password'), 'qcu24s4901FyWDTwXGr6XA==')

WebUI.click(findTestObject('Page_Swag Labs/input_login-button'))

WebUI.click(findTestObject('Page_Swag Labs/button_react-burger-menu-btn'))

WebUI.verifyElementPresent(findTestObject('Page_Swag Labs/a_inventory_sidebar_link'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Swag Labs/a_about_sidebar_link'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Swag Labs/a_logout_sidebar_link'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Swag Labs/a_reset_sidebar_link'), 0)

WebUI.click(findTestObject('Page_Swag Labs/a_Logout'))

WebUI.verifyElementText(findTestObject('Page_Swag Labs/div_Swag Labs'), 'Swag Labs')

WebUI.verifyElementPresent(findTestObject('Page_Swag Labs/input_login-button'), 0)

