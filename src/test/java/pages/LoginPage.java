package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class LoginPage extends StartPage {


    private static final By EMAIL_FIELD_XPATH = By.xpath("//input[@class = 'form-control']");

    private static final By PASSWORD_FIELD_XPATH = By.xpath("//input[@id = 'i0118']");

    public LoginPage fillOutEmailField() {

        switchToLastOpenedWindow();
        switchToFrame(SIGN_ON_FRAME);
        WebElement emailField = waitForExpectedElement(EMAIL_FIELD_XPATH);
        emailField.sendKeys(getParamFromProperty("email"), Keys.ENTER);
        return this;


    }


    //SENDKEYS - KEYBOARD ACTION
    public OneDrivePage filloutPasswordField() {
        waitForExpectedElement(PASSWORD_FIELD_XPATH);
        new Actions(driver).sendKeys(getParamFromProperty("password"), Keys.ENTER).build().perform();
        return new OneDrivePage();
    }


}

