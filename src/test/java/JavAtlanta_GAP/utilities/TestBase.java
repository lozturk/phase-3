package JavAtlanta_GAP.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

public class TestBase {

    protected WebDriver driver = Driver.getDriver();

    @BeforeClass
    public void beforeClass() {
        SoftAssert softAssert = new SoftAssert();
    }

    @BeforeMethod
    public void beforeMethod() {
        driver.manage().window().maximize();
    }

}
