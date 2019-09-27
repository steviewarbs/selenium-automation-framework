package pages;

import element.Element;
import org.openqa.selenium.By;

public class OrgName {

    public Element orgNameSearch;


    public OrgName()
    {
        buildPage();
    }

    public void setPageDef()
    {
        orgNameSearch.sendText("SWAT");
    }

    private void buildPage()
    {
        orgNameSearch = new Element(By.id("orgname"));

    }
}
