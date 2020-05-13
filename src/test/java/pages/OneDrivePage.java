package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

public class OneDrivePage extends LoginPage {

    private static final By BUTTON_XPATH = By.xpath("//input[@class = 'od-SearchBox-input']");

    private static final By BUTTON_LAST_XPATH = By.xpath("//a[@class = 'LeftNav-subLink ms-font-m']");

    //CONTEXT CLICK  - MOUSE ACRTION
    public void contextClickAction() {
        new Actions(driver).contextClick(find(BUTTON_XPATH)).build().perform();
    }

    public void highlightElement() {
        waitForExpectedElement(BUTTON_XPATH);
        String bg = find(BUTTON_XPATH).getCssValue("backgroundColor");
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].style.backgroundColor = '" + "red" + "'", find(BUTTON_XPATH));
        js.executeScript("arguments[0].style.backgroundColor = '" + bg + "'", find(BUTTON_XPATH));
    }


    public void clickOnTheElementJavaScript() {
        waitForExpectedElement(BUTTON_LAST_XPATH);
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click();", find(BUTTON_LAST_XPATH));

    }
}
