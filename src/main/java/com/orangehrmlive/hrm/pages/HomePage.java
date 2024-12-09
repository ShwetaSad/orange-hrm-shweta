package com.orangehrmlive.hrm.pages;

import com.orangehrmlive.hrm.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    //Search, Admin, PIM, Leave, and Dashboard locators
    //  and create appropriate methods for it.

    By adminTab = By.xpath("//span[normalize-space()=\"Admin\"]");
    By PIM = By.xpath("//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"][normalize-space()=\"PIM\"]");
    By searchLeft = By.xpath("//input[@placeholder=\"Search\"]");
    By leave = By.xpath("//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"][normalize-space()=\"Leave\"]");
    By orangeLogo = By.xpath("//img[@alt=\"company-branding\"]");
    By anotherLogo = By.xpath("//div[@class=\"orangehrm-login-logo\"]//img[@alt=\"orangehrm-logo\"]");
    By userProfileLogo = By.xpath("//p[@class=\"oxd-userdropdown-name\"]");
    By logoutButton = By.xpath("//a[normalize-space()=\"Logout\"]");
    By loginText = By.xpath("//h5[@class=\"oxd-text oxd-text--h5 orangehrm-login-title\"]");


    public void clickOnAdmin() {
        clickOnElement(adminTab);
    }

    public void getCurrectPage() {
        driver.getCurrentUrl();
    }

    public String getOrangeLogo() {
        return getTextFromElement(orangeLogo);
    }

    public String getAnothreLogo() {
        return getTextFromElement(anotherLogo);
    }

    public void clickOnUserProfileLogo() {
        clickOnElement(userProfileLogo);
    }

    public void mouseHoverAndClickOnLogoutButton() {
        mouseHoverToElementAndClick(logoutButton);
    }

    public String getLoginText() {
        return getTextFromElement(loginText);
    }


}
