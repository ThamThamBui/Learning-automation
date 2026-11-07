package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginPage extends basePage{
    public static final By INPUT_USERNAME = By.xpath("//input[@name='username']");
    public static final By INPUT_PASSWORD = By.xpath("//input[@name='password']");
    public static final By LOGIN_BUTTON = By.xpath("//button[@type='submit']");

    // truong hợp muốn tìm theo class
    //public static final By LOGIN_BTN = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");
    //public static final By LOGIN_BTN = By.xpath("//button[contain(@class,'oxd-button']");
    //css selector : By.cssSelector("button.oxd-button")

    public loginPage (WebDriver driver, WebDriverWait wait){
        super(driver,wait);
    }

    // step1: truy cập vào page login
    public void openLoginPage(){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        // đợi đến khi xuất hiện thẻ input
        wait.until(ExpectedConditions.visibilityOfElementLocated(INPUT_USERNAME));
    }
    // step 2: login: enter username, password, click login btn
    // c1: viết từng step thành function
    // c2: gộp các satep thành 1 function
    public void login(String username, String password) throws InterruptedException {
       // driver.findElement(INPUT_USERNAME).sendKeys(username);
        WebElement inputUsername = driver.findElement(INPUT_USERNAME);
        inputUsername.sendKeys(username);

        WebElement inputPassword = driver.findElement(INPUT_PASSWORD);
        inputPassword.sendKeys(password);

        Thread.sleep(2000);

        WebElement loginButton = driver.findElement(LOGIN_BUTTON);
        loginButton.click();
        Thread.sleep(10_000);
    }
}
