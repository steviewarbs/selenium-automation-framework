package application;
import pages.OrgName;

public class MatillionLandingApp

    //Reference this inside the JUNIT tests MatillionLandingApp.object.page;

// - Framework creation order

// - Create folder structure - main/application/element/pages/utility test/testexecution
// - WebDriver helper
// - TestRunner
// - Element class
// - Page
// - Main application
// - Tests
//*[contains(text(), '')]


{
    public static OrgName orgName;
    static
    {
        buildPages();
    }
    private static void buildPages()
    {
        orgName = new OrgName();
    }
}