package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckBoxesPage extends BasePage{

    public CheckBoxesPage(WebDriver driver){super(driver);}

    private final By CHECK_BOX = By.xpath("//input[@type='checkbox']");
    private final By ACTIVE_CHECK_BOX = By.xpath("//input[@checked='']");

    public void open(){
        driver.get(BASE_URL + "checkboxes");
    }

    public void activatedSetNumber(int howMuch){
        List<WebElement> checkboxes = driver.findElements(CHECK_BOX);
        int count = 0;

        for (WebElement checkbox: checkboxes){
            if (!checkbox.isSelected()){
                checkbox.click();
                count++;
            }

            if (count == howMuch){
                break;
            }
        }
    }

    public void disableSetNumber(int howMuch){
        List<WebElement> checkboxes = driver.findElements(CHECK_BOX);
        int count = 0;

        activatedAllCheckBox();

        for (WebElement checkbox: checkboxes){
            if (checkbox.isSelected()){
                checkbox.click();
                count++;
            }

            if (count == howMuch){
                break;
            }
        }
    }

    public void disableAllCheckBox(){
        List<WebElement> checkboxes = driver.findElements(CHECK_BOX);
        for (WebElement checkbox: checkboxes){
            if (checkbox.isSelected()){
                checkbox.click();
            }
        }
    }

    public void activatedAllCheckBox(){
        List<WebElement> checkboxes = driver.findElements(CHECK_BOX);
        for (WebElement checkbox: checkboxes){
            if(!checkbox.isSelected()){
                checkbox.click();
            }
        }
    }

    public int countActiveCheckBox(){
        return driver.findElements(ACTIVE_CHECK_BOX).size();
    }

    public int countAllBox(){
        return driver.findElements(CHECK_BOX).size();
    }
}
