package com.orangehrmlive.hrm.pages;

import com.orangehrmlive.hrm.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    //Store usename, password, Login Button, HR for All logo, and LOGIN Panel text Locators
    //  and create appropriate methods for it.

    By usernamefield = By.xpath("//body/div[@id='app']/div[@class='orangehrm-login-layout']/div[@class='orangehrm-login-layout-blob']/div[@class='orangehrm-login-container']/div[@class='orangehrm-login-slot-wrapper']/div[@class='orangehrm-login-slot']/div[@class='orangehrm-login-form']/form[@class='oxd-form']/div[1]/div[1]/div[2]/input[1]");
    By passwordfield = By.xpath("//input[@type='password']");
    By loginButton = By.xpath("//button[@type=\"submit\"]");


    public void inputUsername() {
        sendTextToElement(usernamefield, "Admin");
    }

    public void inputPassword() {
        sendTextToElement(passwordfield, "admin123");
    }

    public void clickonLoginButton() {
        clickOnElement(loginButton);
    }

}
