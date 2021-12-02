package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    private WebDriver driver;
    private By forgotPasswd = By.linkText("Forgot Password");
    private By formSubmit = By.cssSelector("#form_submit");

    public ForgotPasswordPage(WebDriver driver){
        this.driver = driver;
    }

    public void setEmail(String email){
        driver.findElement(forgotPasswd).sendKeys(email);
    }

    public VerificationAreaPage clickSubmitButton(){
        driver.findElement(formSubmit).click();
        return new VerificationAreaPage(driver);
    }
}
