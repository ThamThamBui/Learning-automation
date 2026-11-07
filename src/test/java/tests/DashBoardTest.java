package tests;

import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.DashBoardPage;
import page.loginPage;

import java.util.Objects;

public class DashBoardTest extends baseTest{

    @BeforeMethod
    public void preCondition() throws InterruptedException {
        loginAsAdmin();
    }

    @Test(description="Find locator")
    public void findLocator() throws InterruptedException {
//        loginPage loginPage = new loginPage(driver, wait);
//        loginPage.openLoginPage();
//        loginPage.login("Admin","admin123");

        //vì từ login đến dashboard cần time --> tìm điều kiện đợi
        //Thread.sleep(10_000);
//        wait.until(ExpectedConditions.urlContains("dashboard"));
        //wait.until(url -> Objects.requireNonNull(driver.getCurrentUrl()).contains("dashboard"));

        //đợi xuất hiện 1 trong các element thì bypass
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']")
        ));

        DashBoardPage dashBoardPage = new DashBoardPage(driver, wait);
        Assert.assertTrue(dashBoardPage.isElementPresent());
    }
}
