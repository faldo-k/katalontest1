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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.urlDev)

WebUI.verifyElementVisible(findTestObject('Wikipedia/label_selamatDatang'))

labelSelamatDatang1 = WebUI.getText(findTestObject('Wikipedia/label_selamatDatang'))

labelSelamatDatang = CustomKeywords.'latihanCustomKeywords.split.splitText'(labelSelamatDatang1, ' ', 0)

iniArray = CustomKeywords.'latihanCustomKeywords.split.textToArray'(labelSelamatDatang1)

WebUI.comment(labelSelamatDatang)

println(iniArray)

lowerSelamatDatang = CustomKeywords.'latihanCustomKeywords.split.textToLowerCase'(labelSelamatDatang)

WebUI.comment(lowerSelamatDatang)

upperSelamatDatang = CustomKeywords.'latihanCustomKeywords.split.textToCapitalize'(lowerSelamatDatang, 2)

WebUI.comment(upperSelamatDatang)

