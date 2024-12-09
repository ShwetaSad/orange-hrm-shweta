package com.orangehrmlive.hrm.testsuite;

import com.orangehrmlive.hrm.pages.DashboardPage;
import com.orangehrmlive.hrm.pages.HomePage;
import com.orangehrmlive.hrm.pages.LoginPage;
import com.orangehrmlive.hrm.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashSet;

public class LoginTest extends BaseTest {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    HomePage homePage = new HomePage();

    //1. verifyUserShouldLoginSuccessFully()
    @Test
    public void verifyUserShouldLoginSuccessFully() {

        //   Enter username
        loginPage.inputUsername();

        //   Enter password
        loginPage.inputPassword();

        //   Click on Login Button
        loginPage.clickonLoginButton();

        //   Verify "Dashboard" Message
        Assert.assertEquals(dashboardPage.getDashBoardText(), "Dashboard", "Wrong Page");

    }

    //2. VerifyThatTheLogoDisplayOnLoginPage()
    @Test
    public void VerifyThatTheLogoDisplayOnLoginPage() {

        //   Launch the application
        homePage.getCurrectPage();

        //   Verify Logo is Displayed
        Assert.assertEquals(homePage.getOrangeLogo(), "", "Wrong Page");
        //   Assert.assertEquals(homePage.getAnothreLogo(),"","Wrong Page");
        //
        //3. VerifyUserShouldLogOutSuccessFully()

        //   Login To The application
        loginPage.inputUsername();
        loginPage.inputPassword();
        loginPage.clickonLoginButton();

        //   Click on User Profile logo
        homePage.clickOnUserProfileLogo();

        //   Mouse hover on "Logout" and click
        homePage.mouseHoverAndClickOnLogoutButton();

        //   Verify the text "Login Panel" is displayed
        //   Assert.assertEquals(homePage.getLoginText(),"Login","Wrong Page");


    }

}
