package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.AddRemovePage;
import pages.CheckBoxesPage;

public class BaseTest {
    WebDriver driver;
    AddRemovePage addRemovePage;
    CheckBoxesPage checkBoxesPage;

    @BeforeMethod
    public void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);

        addRemovePage = new AddRemovePage(driver);
        checkBoxesPage = new CheckBoxesPage(driver);
    }

    @AfterMethod
    public void close(){
        driver.quit();
    }
}
