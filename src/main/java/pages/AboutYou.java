package pages;


import element.Element;
import org.openqa.selenium.By;


public class AboutYou {
    public Element firstNameInput;
    public Element lastNameinput;
    public Element mobileNumber;
    public Element region;
    public Element submit;

    public AboutYou()
    {
        buildPage();
    }

    public void setPageDef()
    {
        firstNameInput.sendText("Steve");
        lastNameinput.sendText("Warbz");
        mobileNumber.sendText("07786077347");
        region.selectIt("united kingdom");
        submit.click();
    }

    private void buildPage()
    {
        firstNameInput = new Element(By.id("firstname"));
        lastNameinput = new Element(By.id("lastname"));
        mobileNumber = new Element(By.id("phone"));
        region = new Element(By.id("region"));
        submit = new Element(By.xpath("//button['Submit']"));

    }
}