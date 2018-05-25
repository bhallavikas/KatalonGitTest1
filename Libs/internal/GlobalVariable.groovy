package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p>Profile default : Staging Environment URL</p>
     */
    public static Object url_staging
     
    /**
     * <p>Profile default : Development Environment URL</p>
     */
    public static Object url_dev
     
    /**
     * <p>Profile default : Production Environment URL</p>
     */
    public static Object url_prod
     
    /**
     * <p>Profile default : Email - Staging Environment</p>
     */
    public static Object stag_uname_email
     
    /**
     * <p>Profile default : E Password - Staging Environment</p>
     */
    public static Object stag_pass_email
     
    /**
     * <p>Profile default : Google - Staging Environment</p>
     */
    public static Object stag_uname_google
     
    /**
     * <p>Profile default : G Password- Staging Environment</p>
     */
    public static Object stag_pass_google
     
    /**
     * <p>Profile default : Email Limited Accress - Staging</p>
     */
    public static Object stag_uname_limit_email
     
    /**
     * <p>Profile default : E Pass Limited Accress - Staging</p>
     */
    public static Object stag_uname_limit_pass
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['url_staging' : 'https://neptune-staging.smartcloud.smartsys.io', 'url_dev' : 'https://neptune-dev.smartcloud.smartsys.io', 'url_prod' : 'https://dashboard.smartcloud.smartsys.io', 'stag_uname_email' : 'vikas.bhalla@smartparking.com', 'stag_pass_email' : 'Prod1234', 'stag_uname_google' : 'vikasnzind@gmail.com', 'stag_pass_google' : 'Chicken65', 'stag_uname_limit_email' : 'vikasb.smartparking@gmail.com', 'stag_uname_limit_pass' : 'test1234'])
        
        String profileName = RunConfiguration.getExecutionProfile()
        
        def selectedVariables = allVariables[profileName]
        url_staging = selectedVariables['url_staging']
        url_dev = selectedVariables['url_dev']
        url_prod = selectedVariables['url_prod']
        stag_uname_email = selectedVariables['stag_uname_email']
        stag_pass_email = selectedVariables['stag_pass_email']
        stag_uname_google = selectedVariables['stag_uname_google']
        stag_pass_google = selectedVariables['stag_pass_google']
        stag_uname_limit_email = selectedVariables['stag_uname_limit_email']
        stag_uname_limit_pass = selectedVariables['stag_uname_limit_pass']
        
    }
}
