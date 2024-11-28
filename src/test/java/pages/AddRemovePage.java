package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddRemovePage extends BasePage {

    private final By ADD_ELEMENT = By.xpath("//button[@onclick='addElement()']");
    private final By DELETE_ELEMENT = By.xpath("//button[@class='added-manually']");

    public AddRemovePage(WebDriver driver){super(driver);}


    public void open(){
        driver.get(BASE_URL + "add_remove_elements/");
    }
    public void clickAddElement(int homMuchClick){
        for (int i=0; i < homMuchClick; i++) {
            driver.findElement(ADD_ELEMENT).click();
        }
    }

    public int countButtons(){
        return driver.findElements(DELETE_ELEMENT).size();
    }
}
