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

WebUI.click(findTestObject('Page_Swag Labs/a_1'))

WebUI.click(findTestObject('Page_Swag Labs/button_checkout'))

WebUI.verifyElementText(findTestObject('Page_Swag Labs/span_Checkout_ Overview'), 'Checkout: Your Information')

WebUI.verifyElementPresent(findTestObject('Page_Swag Labs/div_checkout_info'), 0)

WebUI.verifyElementText(findTestObject('Page_Swag Labs/input_First Name'), '')

WebUI.verifyElementText(findTestObject('Page_Swag Labs/input_Last Name'), '')

WebUI.verifyElementText(findTestObject('Page_Swag Labs/input_Zip_Postal Code'), '')

WebUI.setText(findTestObject('Page_Swag Labs/input_First Name'), 'First')

WebUI.setText(findTestObject('Page_Swag Labs/input_Last Name'), 'Last')

WebUI.setText(findTestObject('Page_Swag Labs/input_Zip_Postal Code'), '12345')

WebUI.verifyElementPresent(findTestObject('Page_Swag Labs/button_cancel'), 0)

WebUI.verifyElementClickable(findTestObject('Page_Swag Labs/input_continue'))

WebUI.click(findTestObject('Page_Swag Labs/input_continue'))

WebUI.verifyElementText(findTestObject('Page_Swag Labs/span_Checkout_ Overview'), 'Checkout: Overview')

WebUI.verifyElementPresent(findTestObject('Page_Swag Labs/div_Sauce Labs Backpack'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Swag Labs/div_Payment Information'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Swag Labs/div_Shipping Information'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Swag Labs/div_Price Total'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Swag Labs/button_cancel'), 0)

WebUI.verifyElementClickable(findTestObject('Page_Swag Labs/button_finish'))

WebUI.click(findTestObject('Page_Swag Labs/div_Sauce Labs Backpack'))

WebUI.verifyElementPresent(findTestObject('Page_Swag Labs/button_back-to-products'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Swag Labs/div_Sauce Labs Backpack'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Swag Labs/button_remove'), 0)

WebUI.click(findTestObject('Page_Swag Labs/button_Back to products'))

WebUI.waitForElementPresent(findTestObject('Page_Swag Labs/span_Name (A to Z)Name (A to Z)Name (Z to A)Pric'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Swag Labs/button_remove-sauce-labs-backpack'), 0)

