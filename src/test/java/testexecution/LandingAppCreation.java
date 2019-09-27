package testexecution;

import application.MatillionLandingApp;
import org.junit.Test;

public class LandingAppCreation extends TestRunner {
    //Runs the tests with either mvn-test from the terminal extends the Before/After annotations from TestRunner

    @Test
    public void createPage() {
        MatillionLandingApp.aboutYou.setPageDef();
        MatillionLandingApp.orgName.setPageDef();
    }

}