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

WebUI.callTestCase(findTestCase('TC - Login'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/SWAG - Buying/android.view.ViewGroup (1)'), 0)

Mobile.swipe(0, 1440, 0, 140)

Mobile.tap(findTestObject('Object Repository/SWAG - Buying/android.view.ViewGroup (2)'), 0)

Mobile.tap(findTestObject('Object Repository/SWAG - Buying/android.widget.ImageView'), 0)

Mobile.swipe(0, 2100, 0, 900)

Mobile.tap(findTestObject('Object Repository/SWAG - Buying/android.view.ViewGroup (3)'), 0)

Mobile.setText(findTestObject('Object Repository/SWAG - Buying/android.widget.EditText - First Name'), 'agad', 0)

Mobile.setText(findTestObject('Object Repository/SWAG - Buying/android.widget.EditText - Last Name'), 'pramu', 0)

Mobile.setText(findTestObject('Object Repository/SWAG - Buying/android.widget.EditText - ZipPostal Code'), '55242', 0)

Mobile.tap(findTestObject('Object Repository/SWAG - Buying/android.view.ViewGroup (4)'), 0)

Mobile.swipe(0, 2000, 0, 170)

Mobile.tap(findTestObject('Object Repository/SWAG - Buying/android.view.ViewGroup (5)'), 0)

