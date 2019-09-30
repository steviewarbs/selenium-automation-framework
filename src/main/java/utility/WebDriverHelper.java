package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverHelper {

    public static final String CHROME_DRIVER = System.getProperty("user.dir") + "/drivers/chromedriver";


    public static WebDriver driver;

    public static void setupDriver(String browser) {

        if(browser.equalsIgnoreCase("Chrome")) {

            System.setProperty("webdriver.chrome.driver", CHROME_DRIVER);
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();

    }

    public static void locateUrl(String url) {

        driver.get(url);

    }

    public static void closeDriver() {

        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();

    }

}
