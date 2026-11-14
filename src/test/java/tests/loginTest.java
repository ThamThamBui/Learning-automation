package tests;

import com.google.gson.Gson;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page.loginPage;
import utils.ConfigReader;

import java.io.InputStreamReader;

public class loginTest extends baseTest{
    record LoginData(String username, String password, boolean success) {

    }

    //@DataProvider: testng lấy data rồi chạy test cho data đó
    //b1: viết function doc data. json
    //Object[][] là data type mà testng hiểu được
    @DataProvider(name="loginData")
    public Object[][] loginDataProvider() {
        //doc file.json
        InputStreamReader reader = new InputStreamReader(
                LoginData.class.getResourceAsStream("/login-data.json"));
        //Gson: biến json -> object Logindata
        LoginData[] list = new Gson().fromJson(reader, LoginData[].class);
        //data mẫu
        //Admin admin123 true
        //failed admin123 false
        //Admin failed false
        // dùng LoginData[].class vì file json là 1 mảng
        // TestNG bắt buộc kiểu Object[][]: mỗi han =1 lần chạy test, mỗi cột =1 tham số của @Test
        // ở đây @Test chỉ có 1 tham số là LoginData nên mỗi hàng có 1 cột
        Object[][] dataLogin = new Object[list.length][1];
        for (int i = 0; i < list.length; i++) {
            dataLogin[i][0] = list[i];
        }
        return dataLogin;
    }


    //b2:load data vào test case
    @Test(dataProvider = "loginData")
    public void testLoginData(LoginData data) throws InterruptedException {
        loginPage loginPage = new loginPage(driver, wait);
        loginPage.openLoginPage();
        loginPage.login(data.username(), data.password());

        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl().contains("dashboard"),data.success());
    }

    @Test(description = "Test login success")
    public void loginSuccess() throws InterruptedException {
        //tao doi tượng loginpage
        loginPage loginPage = new loginPage(driver, wait);
        loginPage.openLoginPage();
        loginPage.login(ConfigReader.getProperty("username"),ConfigReader.getProperty("password"));

        //so sanh expect với actual
        String currentUrl = driver.getCurrentUrl();
        Assert.assertNotNull(currentUrl);
        Assert.assertTrue(currentUrl.contains("dashboard"));

    }
}
