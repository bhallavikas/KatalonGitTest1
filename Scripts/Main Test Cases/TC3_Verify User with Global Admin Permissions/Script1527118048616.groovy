import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

'Test to Open Browser'
WebUI.openBrowser('')

WebUI.deleteAllCookies()

WebUI.refresh()

WebUI.navigateToUrl(GlobalVariable.url_staging)

WebUiBuiltInKeywords.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

'Test Sign In With Email Button'
WebUI.verifyElementPresent(findTestObject('SignIn_OR/Page_SmartCloud  Login/button_Sign in with emailEmail'), 0)

'Test Sign In With Gmail Button'
WebUiBuiltInKeywords.verifyElementPresent(findTestObject('SignIn_OR/Page_SmartCloud  Login/button_Sign in with GoogleGoog'), 
    0)

'Test Login using smart parking email'
WebUI.click(findTestObject('SignIn_OR/Page_SmartCloud  Login/span_Sign in with email'))

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('SignIn_OR/Page_SmartCloud  Login/div_Email'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('SignIn_OR/Page_SmartCloud  Login/h1_Sign in with email'), 0)

WebUI.setText(findTestObject('SignIn_OR/Page_SmartCloud  Login/input_email'), GlobalVariable.stag_uname_email)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('SignIn_OR/Page_SmartCloud  Login/button_Next'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('SignIn_OR/Page_SmartCloud  Login/button_Cancel'), 0)

WebUI.click(findTestObject('SignIn_OR/Page_SmartCloud  Login/button_Next'))

WebUI.setText(findTestObject('SignIn_OR/Page_SmartCloud  Login/input_password'), GlobalVariable.stag_pass_email)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('SignIn_OR/Page_SmartCloud  Login/button_Sign In'), 0)

WebUI.click(findTestObject('SignIn_OR/Page_SmartCloud  Login/button_Sign In'))

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('SignIn_OR/Page_SmartCloud/h3_SmartPark Dashboard'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('SignIn_OR/Page_SmartCloud/div_SmartCloud'), 0)

WebUiBuiltInKeywords.click(findTestObject('Menu_Global_Access_OR/Page_SmartCloud/img'))

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Menu_Global_Access_OR/Page_SmartCloud/div_view_quiltMy Dashboardstim'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Menu_Global_Access_OR/Page_SmartCloud/div_view_quiltMy Dashboards'), 0)

WebUI.click(findTestObject('Menu_Global_Access_OR/Page_SmartCloud/div_view_quiltMy Dashboards'), FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Menu_Global_Access_OR/Page_SmartCloud/div_add_to_queueNew Dashboard'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Menu_Global_Access_OR/Page_SmartCloud/div_time_to_leaveSmartPark'), 0)

WebUiBuiltInKeywords.click(findTestObject('Menu_Global_Access_OR/Page_SmartCloud/div_time_to_leaveSmartPark'))

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Menu_Global_Access_OR/Page_SmartCloud/div_time_to_leaveSmart Park Da'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Menu_Global_Access_OR/Page_SmartCloud/div_local_parkingDefine Sector'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Menu_Global_Access_OR/Page_SmartCloud/div_local_parkingDefine Lots'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Menu_Global_Access_OR/Page_SmartCloud/div_local_parkingDefine Bay Ty'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Menu_Global_Access_OR/Page_SmartCloud/div_data_usageSmartData'), 0)

WebUiBuiltInKeywords.click(findTestObject('Menu_Global_Access_OR/Page_SmartCloud/div_data_usageSmartData'))

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Menu_Global_Access_OR/Page_SmartCloud/div_library_booksDefine Report'), 0)

WebUiBuiltInKeywords.click(findTestObject('Menu_Global_Access_OR/Page_SmartCloud/div_device_hubSmartZone'))

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Menu_Global_Access_OR/Page_SmartCloud/div_device_hubSmartZone'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Menu_Global_Access_OR/Page_SmartCloud/div_device_hubSmartZone Dashbo'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Menu_Global_Access_OR/Page_SmartCloud/div_pin_dropMap Devices'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Menu_Global_Access_OR/Page_SmartCloud/div_storageGroup Devices'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Menu_Global_Access_OR/Page_SmartCloud/div_storageRF Survey'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Menu_Global_Access_OR/Page_SmartCloud/div_view_moduleSmartZone - Sen'), 0)

WebUiBuiltInKeywords.click(findTestObject('Menu_Global_Access_OR/Page_SmartCloud/div_Settings'))

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Menu_Global_Access_OR/Page_SmartCloud/div_settingsSettings'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Menu_Global_Access_OR/Page_SmartCloud/div_queueDefine Site'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Menu_Global_Access_OR/Page_SmartCloud/div_editEdit Site'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Menu_Global_Access_OR/Page_SmartCloud/div_view_arrayGroups Editor'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Menu_Global_Access_OR/Page_SmartCloud/div_question_answereAdd Url Ti'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Menu_Global_Access_OR/Page_SmartCloud/div_personUsers'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('Menu_Global_Access_OR/Page_SmartCloud/div_view_quiltAdd External Too'), 0)

WebUI.click(findTestObject('Menu_Global_Access_OR/Page_SmartCloud/div'))

WebUI.click(findTestObject('SignIn_OR/Page_SmartCloud/img'))

WebUI.click(findTestObject('SignIn_OR/Page_SmartCloud/a_Logout'))

WebUI.verifyElementPresent(findTestObject('SignIn_OR/Page_SmartCloud  Login/button_Sign in with emailEmail'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('SignIn_OR/Page_SmartCloud  Login/button_Sign in with GoogleGoog'), 
    0)

WebUI.closeBrowser()

