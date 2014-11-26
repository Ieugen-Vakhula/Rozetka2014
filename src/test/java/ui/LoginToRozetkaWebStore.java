package ui;

import core.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Login;
import pages.RozetkaWelcomePage;

import static org.testng.Assert.assertTrue;

public class LoginToRozetkaWebStore extends TestBase {

    RozetkaWelcomePage page = new RozetkaWelcomePage();

    Login loginClick = new Login();

    @Test
    public void setUpPreconditions(){

        page.open();

        assertTrue(page.isOpened());

        loginClick.clickOnLogin();

        loginClick.swichingWindows();

        loginClick.nameValidation();

        loginClick.isOpened();

    }
}
