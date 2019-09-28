package application;
import pages.OrgName;

public class MatillionLandingApp

    //Reference this inside the JUNIT tests MatillionLandingApp.object.page
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