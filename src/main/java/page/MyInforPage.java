package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

public class MyInforPage extends basePage {
    private static final By AVATAR_IMG = By.xpath("//img[@class='employee-image']");
    private static final By UPLOAD_BTN = By.xpath("//i[@class='oxd-icon bi-plus']");
    private static final By FILE_INPUT = By.xpath("//input[@type='file']");
    private static final By SAVE_BTN = By.xpath("//button[@type='submit']");
    private static final By SUCCESS_TOAST = By.xpath("//p[normalize-space()='Successfully Updated']");

    public MyInforPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //để vào page My Infor có 2 cách
    //c1: vào bằng đường dẫn
    //c2: click vào nút My Infor trong menu
    public void open() throws InterruptedException {
        By myInforLocator = By.xpath("//span[text()='My Info']");
        WebElement myInforMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(myInforLocator));
        myInforMenu.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(AVATAR_IMG));
    }
    public void uploadAvatar(String imageName) throws InterruptedException {
        // sau khi click thì đợi xuâất hiện avatar_img
        //elementToBeClickable vì avatarImg có thể click được
        WebElement avatarImg = wait.until(ExpectedConditions.elementToBeClickable(AVATAR_IMG));
        avatarImg.click();

        WebElement uploadBtn = wait.until(ExpectedConditions.elementToBeClickable(UPLOAD_BTN));
        uploadBtn.click();

        WebElement fileInput = wait.until(ExpectedConditions.presenceOfElementLocated(FILE_INPUT));
        //Note: vì inputFile thì selenium không thể thao tác trực tiếp để tìm file hình
        // sendKeys de truyen duong dan tuyet doi cua hinh can upload
        //TIPS: luu hinh vao trong project
        String filePath = new File("src/test/resources/images/" + imageName).getAbsolutePath();
        fileInput.sendKeys(filePath);
        Thread.sleep(3000);

        WebElement saveBtn = wait.until(ExpectedConditions.elementToBeClickable(SAVE_BTN));
        saveBtn.click();

    }

    public boolean isSuccessUpload() throws InterruptedException {
        WebElement successToast = wait.until(ExpectedConditions.visibilityOfElementLocated(SUCCESS_TOAST));
        return successToast.isDisplayed();
    }




}
