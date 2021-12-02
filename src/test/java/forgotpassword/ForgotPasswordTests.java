package forgotpassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;
import pages.VerificationAreaPage;

import static org.testng.Assert.assertTrue;

public class ForgotPasswordTests extends BaseTests {
    @Test
    public void successForgotPassword(){
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.setEmail("tau@example.com");
        VerificationAreaPage verificationAreaPage = forgotPasswordPage.clickSubmitButton();
        assertTrue(verificationAreaPage.getMessageText().contains("Your e-mail's been sent!"),"Message text is incorrect");

    }
}
