package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class basePage {
    // thuộc tính giúp tương taác trên website
    // như là truy cập, click, checkbox, fill value,...
    protected WebDriver driver;

    //thuộc tính giúp tìm locator dễ dàng hơn, tránh flaky test
    protected WebDriverWait wait;

    // thuộc tính để chèn code java script giúp tương tác trên website
    // như là scroll, highlight, double click,...
    protected JavascriptExecutor js;

    public basePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        js = (JavascriptExecutor) driver;
    }
}
