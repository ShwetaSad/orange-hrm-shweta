package com.orangehrmlive.hrm.pages;

import com.orangehrmlive.hrm.utilities.Utility;
import org.openqa.selenium.By;

public class DashboardPage extends Utility {

    // Dashboard text Locator
    //  and create appropriate methods for it.

    By dashboardText = By.xpath("//h6[@class=\"oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module\"]");


    public String getDashBoardText() {
        return getTextFromElement(dashboardText);
    }


}
