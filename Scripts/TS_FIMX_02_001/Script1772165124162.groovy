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

ChromeOptions options = new ChromeOptions()

// Disable password manager & breach popup
options.addArguments('--disable-notifications')

options.addArguments('--disable-save-password-bubble')

options.addArguments('--incognito')

// Disable password services
Map<String, Object> prefs = new HashMap()

prefs.put('credentials_enable_service', false)

prefs.put('profile.password_manager_enabled', false)

options.setExperimentalOption('prefs', prefs)

// Start Chrome with options
DriverFactory.changeWebDriver(new ChromeDriver(options))

WebUI.navigateToUrl('https://www.saucedemo.com/')

WebUI.setText(findTestObject('Page_Swag Labs/input_Username'), 'standard_user')

WebUI.setEncryptedText(findTestObject('Page_Swag Labs/input_Password'), 'qcu24s4901FyWDTwXGr6XA==')

WebUI.click(findTestObject('Page_Swag Labs/input_login-button'))

WebUI.waitForElementPresent(findTestObject('Page_Swag Labs/span_Name (A to Z)Name (A to Z)Name (Z to A)Pric'), 0)

WebUI.verifyElementText(findTestObject('Page_Swag Labs/span_Name (A to Z)Name (A to Z)Name (Z to A)Pric'), 'Name (A to Z)\nName (A to Z)\nName (Z to A)\nPrice (low to high)\nPrice (high to low)')

WebUI.click(findTestObject('Page_Swag Labs/span_Name (A to Z)Name (A to Z)Name (Z to A)Pric'))

WebUI.selectOptionByValue(findTestObject('Page_Swag Labs/select_Name (A to Z)Name (Z to A)Price (low to h'), 'za', false)

WebUI.selectOptionByValue(findTestObject('Page_Swag Labs/select_Name (A to Z)Name (Z to A)Price (low to h'), 'az', false)

WebUI.selectOptionByValue(findTestObject('Page_Swag Labs/select_Name (A to Z)Name (Z to A)Price (low to h'), 'lohi', false)

WebUI.selectOptionByValue(findTestObject('Page_Swag Labs/select_Name (A to Z)Name (Z to A)Price (low to h'), 'hilo', false)

