package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.MyInforPage;

public class MyInforTest extends baseTest{

    @BeforeMethod
    public void preConditions() throws  InterruptedException{
        loginAsAdmin();
    }

    @Test(description = "Upload avatar")
    public void uploadAvatar() throws InterruptedException {
        MyInforPage myInforPage = new MyInforPage(driver, wait);
        myInforPage.open();
        myInforPage.uploadAvatar("logo.png");

        Assert.assertTrue(myInforPage.isSuccessUpload());
    }
}
