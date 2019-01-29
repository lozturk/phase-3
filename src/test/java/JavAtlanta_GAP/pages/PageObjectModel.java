package JavAtlanta_GAP.pages;

import JavAtlanta_GAP.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModel {

    public PageObjectModel() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "sample")
    public WebElement sample;
}
