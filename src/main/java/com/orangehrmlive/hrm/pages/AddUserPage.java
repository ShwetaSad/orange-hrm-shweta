package com.orangehrmlive.hrm.pages;

import com.orangehrmlive.hrm.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AddUserPage extends Utility {

    // User Role Drop Down, Employee Name, Username, Status Drop Down, Password, Confirm Password,
    //  Save and Cancel Button Locators and it's actions
    By userRoleDropdown = By.xpath("//div[@class='oxd-select-text oxd-select-text--active']");
    By employeename = By.xpath("//input[@placeholder=\"Type for hints...\"]");
    By username = By.xpath("//div[@class=\"oxd-form-row\"]//div[@class=\"oxd-grid-2 orangehrm-full-width-grid\"]//div[@class=\"oxd-grid-item oxd-grid-item--gutters\"]//div[@class=\"oxd-input-group oxd-input-field-bottom-space\"]//div//input[@class=\"oxd-input oxd-input--active\"]");
    By stausDropdown = By.xpath("//div[@class=\"oxd-select-text oxd-select-text--focus\"]");
    By password = By.xpath("//div[@class=\"oxd-grid-item oxd-grid-item--gutters user-password-cell\"]//div[@class=\"oxd-input-group oxd-input-field-bottom-space\"]//div//input[@type=\"password\"]");
    By confirmPassword = By.xpath("//div[@class=\"oxd-grid-item oxd-grid-item--gutters\"]//div[@class=\"oxd-input-group oxd-input-field-bottom-space\"]//div//input[@type=\"password\"]");
    By save = By.xpath("//button[@type=\"submit\"]");
    By cancel = By.xpath("//button[normalize-space()=\"Cancel\"]");
    By addUserText = By.xpath("//h6[@class=\"oxd-text oxd-text--h6 orangehrm-main-title\"]");
    By successfullySavedText = By.xpath("");

    public void SelectByUserRoleDropdown() {

        List<WebElement> allOptions = driver.findElements(userRoleDropdown);
        System.out.println(allOptions.size());
        for (WebElement option : allOptions) {
            if (option.getText().contains("Admin")) {
                option.click();
                break;
            }
        }
    }

    public void addEmployeeName(String name) {
        sendTextToElement(employeename, name);


    }

    public void enterUsername(String Username) {
        sendTextToElement(username, Username);
    }

    public void SelectByStausDropdown() {
        List<WebElement> allOptions = driver.findElements(stausDropdown);
        System.out.println(allOptions.size());
        for (WebElement option : allOptions) {
            if (option.getText().contains("Disable")) {
                option.click();
                break;
            }
        }
    }

    public void enterpassword(String Password) {
        sendTextToElement(password, Password);
    }

    public void enterConfirmPassword(String Confirmpassword) {
        sendTextToElement(confirmPassword, Confirmpassword);

    }

    public void clickOnSaveButton() {
        clickOnElement(save);
    }

    public String setAddUserText() {
        return getTextFromElement(addUserText);

    }
}


