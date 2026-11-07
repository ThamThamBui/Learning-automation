package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hrmAdminPage {
    By adminMenu =  By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']");
    By PIMMenu = By.xpath("//a[@href='/web/index.php/pim/viewPimModule']");
    By leaveMenu = By.xpath("//a[@href='/web/index.php/leave/viewLeaveModule']");
    By userName = By.xpath("//label[text()='Username']/ancestor::div[contains(@class,'oxd-input-group')]//input");
    By userRoleDropdown = By.xpath("//label[text()='User Role']/following::div[contains(@class,'oxd-select-text')][1]");
    By adminOption = By.xpath("//div[@role='option']//span[text()='Admin']");
    By essOption = By.xpath("//div[@role='option']//span[text()='ESS']");
    By employeeName = By.xpath("//input[@placeholder='Type for hints...']");
    By resetButton = By.xpath("//button[normalize-space()='Reset']");
    By searchButton = By.xpath("//button[normalize-space()='Search']");
    By userManagementTab = By.xpath("//span[normalize-space()='User Management']");
    By usernameText = By.xpath("//div[normalize-space()='adm_457699'][1]");
    By usernameRow3 = By.xpath(
            "(//div[contains(@class,'oxd-table-body')])[1]" +
                    "//div[contains(@class,'oxd-table-card')][3]" +
                    "//div[@role='cell'][2]"
    );

    By userRoleRow3 = By.xpath(
            "(//div[contains(@class,'oxd-table-body')])[1]" +
                    "//div[contains(@class,'oxd-table-card')][3]" +
                    "//div[@role='cell'][3]"
    );
    By deleteButtonRow3 = By.xpath(
            "(//div[contains(@class,'oxd-table-body')])[1]" +
                    "//div[contains(@class,'oxd-table-card')][3]" +
                    "//button[.//i[contains(@class,'bi-trash')]]"
    );
    By editButtonRow3 = By.xpath(
            "(//div[contains(@class,'oxd-table-body')])[1]" +
                    "//div[contains(@class,'oxd-table-card')][3]" +
                    "//button[.//i[contains(@class,'bi-pencil-fill')]]"
    );
    By userRoleHeader = By.xpath(
            "//div[contains(@class,'oxd-table-header-cell')][text()[normalize-space()='User Role']]"
    );

    By employeeNameHeader = By.xpath(
            "//div[contains(@class,'oxd-table-header-cell')][text()[normalize-space()='Employee Name']]"
    );
    By breadcumAdminUsermanagement = By.xpath("//h6[text()='Admin']");
    By collapseSidePanelButton = By.xpath("//button[@class='oxd-icon-button oxd-main-menu-button']");
    By collapseSystemUserButton = By.xpath("//i[@class='oxd-icon bi-caret-up-fill']");
    By addButton = By.xpath("//button[normalize-space()='Add']");
}
