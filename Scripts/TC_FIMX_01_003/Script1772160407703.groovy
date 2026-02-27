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

WebUI.verifyElementText(findTestObject('Page_Swag Labs/div_Swag Labs'), 'Swag Labs')

WebUI.verifyElementText(findTestObject('Page_Swag Labs/input_Username'), '')

WebUI.verifyElementText(findTestObject('Page_Swag Labs/input_Password'), '')

WebUI.verifyElementClickable(findTestObject('Page_Swag Labs/input_login-button'))

WebUI.verifyElementText(findTestObject('Page_Swag Labs/input_login-button'), '')

WebUI.setText(findTestObject('Page_Swag Labs/input_Username'), 'standard_user')

WebUI.click(findTestObject('Page_Swag Labs/input_Password'))

WebUI.setEncryptedText(findTestObject('Page_Swag Labs/input_Password'), 'DzI8evQYvnn8U5YkQj+I4g==')

WebUI.click(findTestObject('Page_Swag Labs/input_login-button'))

WebUI.waitForElementPresent(findTestObject('Page_Swag Labs/username and password do not match'), 0)

WebUI.verifyElementText(findTestObject('Page_Swag Labs/username and password do not match'), 'Epic sadface: Username and password do not match any user in this service')

