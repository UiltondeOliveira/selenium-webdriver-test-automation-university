package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerificationAreaPage {
    private WebDriver driver;
    private By message = By.id("");

    public VerificationAreaPage(WebDriver driver){
        this.driver = driver;
    }
    public String getMessageText(){
        return driver.findElement(message).getText();
    }
}
