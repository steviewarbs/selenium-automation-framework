package application;
import pages.AboutYou;
import pages.OrgName;

public class MatillionLandingApp
{
    public static AboutYou aboutYou;
    public static OrgName orgName;
    static
    {
        buildPages();
    }
    private static void buildPages()
    {
        aboutYou = new AboutYou();
        orgName = new OrgName();
    }
}