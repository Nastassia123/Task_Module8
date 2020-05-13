package tests;

import org.testng.annotations.Test;
import pages.OneDrivePage;
import pages.StartPage;


public class VerifyMouseAction extends StartPage {

    @Test
    public void verifyMouseAction() {
     new StartPage()
                .openHomePage()
                .selectLanguageInThePopUp()
                .clickOnTheSignInButton()
                .fillOutEmailField()
                .filloutPasswordField()
                .contextClickAction();
    }



}
