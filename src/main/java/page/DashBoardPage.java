package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashBoardPage extends basePage {
    public static final By MENU_ADMIN = By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']");
    //c2: //spand[text()='Admin']
    //c3: //a[.//spand[text()='Admin']]
    // giải thích: //a -> tìm tất cả thẻ a
    //   .//spand -> tìm tất cả thẻ spand có trong thẻ a
    private static final By ADMIN_HEADER = By.xpath("//h6[text()='Admin']");
    public DashBoardPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    public boolean isElementPresent() throws InterruptedException {
        boolean checkLocator = true;
        WebElement menuAdmin = driver.findElement(MENU_ADMIN);
        if(!menuAdmin.isDisplayed()){
            checkLocator = false;
            System.out.println("Khong tìm thấy menuAdmin");
            return checkLocator;

        }
        menuAdmin.click();

//        boolean checkLocator = true;
//        if(!menuAdmin.isDisplayed()){
//            checkLocator = false;
//        }
//
        WebElement menuAdminHeader = wait.until(ExpectedConditions.visibilityOfElementLocated(ADMIN_HEADER));
        if(!menuAdminHeader.isDisplayed()){
            checkLocator = false;
            System.out.println("Khong tim thay locator admin hearder");
            return checkLocator;
        }

        Thread.sleep(2000);
        return checkLocator;

       // return menuAdmin.isDisplayed();
    }


}
