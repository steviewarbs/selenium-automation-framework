package testexecution;

import org.junit.After;
import org.junit.Before;
import utility.WebDriverHelper;

public class TestRunner {

    //Defines the common Before/After annotations that will always run prior to tests


    @Before
    public void testSetup() {

        WebDriverHelper.setupDriver("Chrome");
        WebDriverHelper.locateUrl("");

    }

    @After
    public void testTeardown() {

    }



}
