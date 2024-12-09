package com.orangehrmlive.hrm.pages;

import com.orangehrmlive.hrm.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ViewSystemUsersPage extends Utility {


//System Users Text, Username Field, User Roll dropDown, Employee Name Field,
//  Status Drop Down, Search Button, Reset Button, Add Button and Delete Button locators
//  and it's actions

    By systemUsersText = By.xpath("//h5[@class=\"oxd-text oxd-text--h5 oxd-table-filter-title\"]");
    By Username = By.xpath("//div[@class=\"oxd-input-group oxd-input-field-bottom-space\"]//div//input[@class=\"oxd-input oxd-input--active\"]");
    By UserRollDropdown = By.xpath("//body/div[@id=\"app\"]/div[@class=\"oxd-layout orangehrm-upgrade-layout\"]/div[@class=\"oxd-layout-container\"]/div[@class=\"oxd-layout-context\"]/div[@class=\"orangehrm-background-container\"]/div[@class=\"oxd-table-filter\"]/div[@class=\"oxd-table-filter-area\"]/form[@class=\"oxd-form\"]/div[@class=\"oxd-form-row\"]/div[@class=\"oxd-grid-4 orangehrm-full-width-grid\"]/div[2]/div[1]/div[2]/div[1]/div[1]");
    By employeeNameField = By.xpath("//input[@placeholder=\"Type for hints...\"]");
    By statusDropdown = By.xpath("//body/div[@id=\"app\"]/div[@class=\"oxd-layout orangehrm-upgrade-layout\"]/div[@class=\"oxd-layout-container\"]/div[@class=\"oxd-layout-context\"]/div[@class=\"orangehrm-background-container\"]/div[@class=\"oxd-table-filter\"]/div[@class=\"oxd-table-filter-area\"]/form[@class=\"oxd-form\"]/div[@class=\"oxd-form-row\"]/div[@class=\"oxd-grid-4 orangehrm-full-width-grid\"]/div[4]/div[1]/div[2]/div[1]/div[1]");
    By search = By.xpath("//button[@type=\"submit\"]");
    By resetButton = By.xpath("//button[normalize-space()=\"Reset\"]");
    By addButton = By.xpath("//button[normalize-space()=\"Add\"]");
    By deleteButton = By.xpath("//div[@role=\"table\"]//div[1]//div[1]//div[6]//div[1]//button[1]//i[1]");
    By checkbox = By.xpath("//div[@class=\"oxd-table-card-cell-checkbox\"]//i[@class=\"oxd-icon bi-check oxd-checkbox-input-icon\"]");
    By OkOnPopup = By.xpath("//button[normalize-space()=\"Yes, Delete\"]");
    By successfullyDeleted = By.xpath("");
    By noRecordfoText = By.xpath("//span[normalize-space()=\"No Records Found\"]");
    By shavetaText = By.xpath("//div[contains(text(),\"shaveta\")]");


    public String VerfisystemUsersText() {
        return getTextFromElement(systemUsersText);

    }

    public void clickOnAdd() {
        clickOnElement(addButton);
    }

    public void enterUsername(String name) {
        sendTextToElement(Username, name);
    }

    public void dropdown1() {
        List<WebElement> Option = driver.findElements(UserRollDropdown);
        for (WebElement options : Option) {
            if (options.getText().contains("Admin")) {
                options.click();
            }
        }

    }

    public void dropdown2() {
        List<WebElement> Option = driver.findElements(statusDropdown);
        for (WebElement options : Option) {
            if (options.getText().contains("Disabled")) {
                options.click();
            }
        }
    }

    public void enterEmployee(String employeename) {
        sendTextToElement(employeeNameField, employeename);
    }

    public void clickONSearch() {
        clickOnElement(search);

    }

    public String verifyrecordPresent() {
        return getTextFromElement(shavetaText);

    }

    public void clickOnDeleteButton() {
        clickOnElement(deleteButton);
    }

    public void clickOnCheckbox() {
        clickOnElement(checkbox);
    }

    public void clickOkOnPopup() {
        clickOnElement(OkOnPopup);
    }

    // public void clickOKOnPopup(){
    // acceptAlert();
    // }

    public String NoRecordFound() {
        return getTextFromElement(noRecordfoText);

    }


}
