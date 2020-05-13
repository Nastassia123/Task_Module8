package tests;

import org.testng.annotations.Test;
import pages.StartPage;

public class javaScriptExecutorTests extends StartPage {

    @Test
    public void verifyElementHighlightning()  {
        new StartPage()
                .openHomePage()
                .selectLanguageInThePopUp()
                .clickOnTheSignInButton()
                .fillOutEmailField()
                .filloutPasswordField()
                .highlightElement();
    }

    @Test
    public void verifyElementClick() {
        new StartPage()
                .openHomePage()
                .selectLanguageInThePopUp()
                .clickOnTheSignInButton()
                .fillOutEmailField()
                .filloutPasswordField()
                .clickOnTheElementJavaScript();
    }
}
