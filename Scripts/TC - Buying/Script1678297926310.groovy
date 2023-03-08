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

if (tc_login_pass == 'yes') {
    WebUI.callTestCase(findTestCase('TC - Login'), [('tc_login_pass') : tc_login_pass, ('tc_password') : tc_password, ('tc_username') : tc_username], 
        FailureHandling.STOP_ON_FAILURE)

    if ((tc_item_1 == 'Sauce Labs Backpack') || (tc_item_2 == 'Sauce Labs Backpack')) {
        Mobile.tap(findTestObject('Object Repository/SWAG - Buying/add_backpack'), 0)

        Mobile.scrollToText('Sauce Labs Backpack', FailureHandling.STOP_ON_FAILURE)
    }
    
    if ((tc_item_1 == 'Sauce Labs Bike Light') || (tc_item_2 == 'Sauce Labs Bike Light')) {
        Mobile.tap(findTestObject('Object Repository/SWAG - Buying/add_bikeLight'), 0)

        Mobile.scrollToText('Sauce Labs Backpack', FailureHandling.STOP_ON_FAILURE)
    }
    
    if ((tc_item_1 == 'Sauce Labs Fleece Jacket') || (tc_item_2 == 'Sauce Labs Fleece Jacket')) {
        Mobile.scrollToText('Sauce Labs Fleece Jacket', FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Object Repository/SWAG - Buying/add_fleece'), 0)

        Mobile.scrollToText('Sauce Labs Backpack', FailureHandling.STOP_ON_FAILURE)
    }
    
    if ((tc_item_1 == 'Sauce Labs Onesie') || (tc_item_2 == 'Sauce Labs Onesie')) {
        Mobile.swipe(0, 2000, 0, 160)

        Mobile.tap(findTestObject('Object Repository/SWAG - Buying/add_onesie'), 0)

        Mobile.scrollToText('Sauce Labs Backpack', FailureHandling.STOP_ON_FAILURE)
    }
    
    Mobile.tap(findTestObject('Object Repository/SWAG - Buying/btn_cart'), 0)

    Mobile.swipe(0, 1600, 0, 750)

    Mobile.tap(findTestObject('Object Repository/SWAG - Buying/btn_checkout'), 0)

    Mobile.setText(findTestObject('Object Repository/SWAG - Buying/android.widget.EditText - First Name'), tc_first_name, 
        0)

    Mobile.setText(findTestObject('Object Repository/SWAG - Buying/android.widget.EditText - Last Name'), tc_last_name, 
        0)

    Mobile.setText(findTestObject('Object Repository/SWAG - Buying/android.widget.EditText - ZipPostal Code'), tc_postal_code, 
        0)

    Mobile.tap(findTestObject('Object Repository/SWAG - Buying/btn_continue'), 0)

    Mobile.swipe(0, 1600, 0, 750)

    Mobile.tap(findTestObject('Object Repository/SWAG - Buying/btn_finish'), 0)

    Mobile.tap(findTestObject('SWAG - Buying/btn_back_home'), 0)

    Mobile.closeApplication()
} else {
    Mobile.closeApplication()
}

