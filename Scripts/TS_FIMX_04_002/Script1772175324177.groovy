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

WebUI.click(findTestObject('Page_Swag Labs/button_add-to-cart-sauce-labs-backpack'))

WebUI.click(findTestObject('Page_Swag Labs/button_add-to-cart-sauce-labs-bike-light'))

WebUI.click(findTestObject('Page_Swag Labs/button_add-to-cart-sauce-labs-bolt-t-shirt'))

WebUI.click(findTestObject('Page_Swag Labs/button_add-to-cart-sauce-labs-fleece-jacket'))

WebUI.click(findTestObject('Page_Swag Labs/button_add-to-cart-sauce-labs-onesie'))

WebUI.click(findTestObject('Page_Swag Labs/div_Test.allTheThings() T-Shirt (Red)'))

WebUI.click(findTestObject('Page_Swag Labs/button_add-to-cart'))

WebUI.verifyElementPresent(findTestObject('Page_Swag Labs/button_remove'), 0)

WebUI.verifyElementText(findTestObject('Page_Swag Labs/span_6'), '6')

WebUI.click(findTestObject('Page_Swag Labs/button_back-to-products'))

WebUI.verifyElementPresent(findTestObject('Page_Swag Labs/div_15.99Remove'), 0)

WebUI.verifyElementText(findTestObject('Page_Swag Labs/span_6'), '6')

WebUI.click(findTestObject('Page_Swag Labs/button_remove-sauce-labs-backpack'))

WebUI.verifyElementPresent(findTestObject('Page_Swag Labs/div_29.99Add to cart'), 0)

WebUI.verifyElementText(findTestObject('Page_Swag Labs/span_6'), '5')

WebUI.click(findTestObject('Page_Swag Labs/div_Sauce Labs Bike Light'))

WebUI.click(findTestObject('Page_Swag Labs/button_remove'))

WebUI.verifyElementPresent(findTestObject('Page_Swag Labs/button_add-to-cart'), 0)

WebUI.verifyElementText(findTestObject('Page_Swag Labs/span_6'), '4')

WebUI.click(findTestObject('Page_Swag Labs/button_back-to-products'))

WebUI.click(findTestObject('Page_Swag Labs/a_5'))

WebUI.verifyElementPresent(findTestObject('Page_Swag Labs/span_Your Cart'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Swag Labs/div_Sauce Labs Bolt T-Shirt'), 0)

WebUI.click(findTestObject('Page_Swag Labs/button_remove-sauce-labs-bolt-t-shirt'))

WebUI.verifyElementNotPresent(findTestObject('Page_Swag Labs/div_Sauce Labs Bolt T-Shirt'), 0)

WebUI.click(findTestObject('Page_Swag Labs/button_checkout'))

WebUI.setText(findTestObject('Page_Swag Labs/input_First Name'), 'First')

WebUI.setText(findTestObject('Page_Swag Labs/input_Last Name'), 'Last')

WebUI.setText(findTestObject('Page_Swag Labs/input_Zip_Postal Code'), '12345')

WebUI.click(findTestObject('Page_Swag Labs/input_continue'))

WebUI.verifyElementPresent(findTestObject('Page_Swag Labs/div_Sauce Labs Fleece Jacket'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Swag Labs/div_Sauce Labs Onesie'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Swag Labs/div_Test.allTheThings() T-Shirt (Red)'), 0)

WebUI.verifyElementText(findTestObject('Page_Swag Labs/div_Item total_ 73.97'), 'Item total: $73.97')

WebUI.verifyElementText(findTestObject('Page_Swag Labs/div_Tax_ 5.92'), 'Tax: $5.92')

WebUI.verifyElementText(findTestObject('Page_Swag Labs/div_Total_ 79.89'), 'Total: $79.89')

WebUI.click(findTestObject('Page_Swag Labs/button_finish'))

WebUI.click(findTestObject('Page_Swag Labs/button_back-to-products'))

WebUI.verifyElementPresent(findTestObject('Page_Swag Labs/span_Name (A to Z)Name (A to Z)Name (Z to A)Pric'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Swag Labs/button_add-to-cart-sauce-labs-backpack'), 0)

WebUI.verifyElementNotPresent(findTestObject('Page_Swag Labs/span_6'), 0)

