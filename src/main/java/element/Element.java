package element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utility.WebDriverHelper;

public class Element
{
    By by;

    public Element(By by)
    {
        this.by = by;
    }

    public void click() {

        WebDriverHelper.driver.findElement(by).click();
        }


    public void sendText(String text) {

        WebDriverHelper.driver.findElement(by).sendKeys(text);
    }

    public void selectIt(String country) {

        Select select = new Select(WebDriverHelper.driver.findElement(by));
        select.selectByValue(country);

    }


}