package com.orangehrmlive.hrm.testsuite;

import com.orangehrmlive.hrm.pages.*;
import com.orangehrmlive.hrm.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserTest extends BaseTest {

    LoginPage loginPage = new LoginPage();
    AdminPage adminPage = new AdminPage();
    HomePage homePage = new HomePage();
    ViewSystemUsersPage viewSystemUsersPage = new ViewSystemUsersPage();
    AddUserPage addUserPage = new AddUserPage();


    //1.adminShouldAddUserSuccessFully().
    @Test
    public void adminShouldAddUserSuccessFully() {


        //    Login to Application
        loginPage.inputUsername();
        loginPage.inputPassword();
        loginPage.clickonLoginButton();

        //	click On "Admin" Tab
        homePage.clickOnAdmin();

        //	Verify "System Users" Text
        String actualText = viewSystemUsersPage.VerfisystemUsersText();
        String expectedText = "System Users";
        Assert.assertEquals(actualText, expectedText, "Wrong Text");

        //	click On "Add" button
        viewSystemUsersPage.clickOnAdd();

        //	Verify "Add User" Text
        Assert.assertEquals(addUserPage.setAddUserText(), "Add User", "Wrong Page");

        //	Select User Role "Admin"
        addUserPage.SelectByUserRoleDropdown();

        //	enter Employee Name "Ananya Dash"
        addUserPage.addEmployeeName("Ananya Dash");

        //	enter Username
        addUserPage.enterUsername("Shaveta");

        //	Select status "Disable"
        addUserPage.SelectByStausDropdown();

        //	enter psaaword
        addUserPage.enterpassword("sethi");

        //	enter Confirm Password
        addUserPage.enterConfirmPassword("sethi");

        //	click On "Save" Button
        addUserPage.clickOnSaveButton();

        //	verify message "Successfully Saved"

    }

    //2. searchTheUserCreatedAndVerifyIt().
    @Test
    public void serchTheUserCreatedAndVerifyIt() {

        //	Login to Application
        loginPage.inputUsername();
        loginPage.inputPassword();
        loginPage.clickonLoginButton();

        //	click On "Admin" Tab
        homePage.clickOnAdmin();

        //	Verify "System Users" Text
        Assert.assertEquals(viewSystemUsersPage.VerfisystemUsersText(), "System Users", "Wrong Page");

        //	Enter Username
        viewSystemUsersPage.enterUsername("Shaveta");

        //	Select User Role
        viewSystemUsersPage.dropdown1();

        //	Select Satatus
        viewSystemUsersPage.dropdown2();

        //	Click on "Search" Button
        viewSystemUsersPage.clickONSearch();

        //	Verify the User should be in Result list.
        Assert.assertEquals(viewSystemUsersPage.verifyrecordPresent(), "shaveta", "Record not Present");

    }

    //3. verifyThatAdminShouldDeleteTheUserSuccessFully.
    @Test
    public void verifyThatAdminShouldDeleteTheUserSuccessFully() {

        //	Login to Application
        loginPage.inputUsername();
        loginPage.inputPassword();
        loginPage.clickonLoginButton();

        //	click On "Admin" Tab
        homePage.clickOnAdmin();

        //	Verify "System Users" Text
        Assert.assertEquals(viewSystemUsersPage.VerfisystemUsersText(), "System Users", "Wrong Page");

        //	Enter Username
        viewSystemUsersPage.enterUsername("Shaveta");

        //	Select User Role
        viewSystemUsersPage.dropdown1();

        //	Select Satatus
        viewSystemUsersPage.dropdown2();

        //	Click on "Search" Button
        viewSystemUsersPage.clickONSearch();

        //	Verify the User should be in Result list.
        Assert.assertEquals(viewSystemUsersPage.verifyrecordPresent(), "shaveta", "Record not Present");

        //	Click on Check box
        viewSystemUsersPage.clickOnCheckbox();

        //	Click on Delete Button
        viewSystemUsersPage.clickOnDeleteButton();

        //	Popup will display
        //	Click on Ok Button on Popup
        // viewSystemUsersPage.acceptAlert();
        viewSystemUsersPage.clickOkOnPopup();

        //	verify message "Successfully Deleted"
    }

    //4. searchTheDeletedUserAndVerifyTheMessageNoRecordFound.
    @Test
    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound() {

        //	Login to Application
        loginPage.inputUsername();
        loginPage.inputPassword();
        loginPage.clickonLoginButton();

        //	click On "Admin" Tab
        homePage.clickOnAdmin();

        //	Verify "System Users" Text
        String actualText = viewSystemUsersPage.VerfisystemUsersText();
        String expectedText = "System Users";
        Assert.assertEquals(actualText, expectedText, "Wrong Text");

        //	Enter Username
        viewSystemUsersPage.enterUsername("Shaveta");

        //	Select User Role
        viewSystemUsersPage.dropdown1();

        //	Select Satatus
        viewSystemUsersPage.dropdown2();

        //	Click on "Search" Button
        viewSystemUsersPage.clickONSearch();

        //	verify message "No Records Found"
        Assert.assertEquals(viewSystemUsersPage.NoRecordFound(), "No Records Found", "Records not deleted");
    }
}
