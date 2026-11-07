package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import page.loginPage;
import utils.ConfigReader;

import java.time.Duration;

//baseTest là class thiết lập môi trường test
public class baseTest {
    protected WebDriver driver;
    protected WebDriverWait wait;

    //ham setup môi trường test
    // thêm key Beforemethod để chạy hàm này trước khi chạy test
    @BeforeMethod(alwaysRun = true)
    public void setup(){
        WebDriverManager.chromedriver().setup();
        //câu hình giao diện chrome
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        int timeout = Integer.parseInt(ConfigReader.getProperty("timeout"));
        wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));

    }

    // hàm teardown test env
    @AfterMethod(alwaysRun = true)
    public void teardown(){
        if (driver != null) {
            driver.quit();
        }
    }
    //các page con đều cần login trước nên define fuction trong class cha
    protected void loginAsAdmin() throws InterruptedException {
        loginPage loginPage = new loginPage(driver, wait);
        loginPage.openLoginPage();
        loginPage.login(ConfigReader.getProperty("username"),ConfigReader.getProperty("password"));
        wait.until(ExpectedConditions.urlContains("dashboard"));
    }

}
