package Bai17POM.Testcase;

import Bai17POM.Page.PageSignin;
import common.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestcaseSignin extends BaseTest {
    public PageSignin pageSignin;

    @BeforeMethod
    public void Login() {
        pageSignin = new PageSignin(driver);
    }

    @Test(priority = 0)
    public void Login1() {
        pageSignin.Login("admin", "123456");
    }

    @Test(priority = 1)
    public void LoginOA() {
        pageSignin.LoginOA("220628201", "789789");

    }

//    @Test(priority = 2)
//    public void ForgotPassword() {
//        pageSignin.ForgotPassword("client01@mailinator.com");
//
//    }
}
