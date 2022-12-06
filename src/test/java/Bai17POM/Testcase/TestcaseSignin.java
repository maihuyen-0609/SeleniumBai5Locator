package Bai17POM.Testcase;

import Bai17POM.Page.PageSignin;
import common.BaseTestold;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestcaseSignin extends BaseTestold {
    public PageSignin pageSignin;

    @BeforeMethod
    public void Login() {
        pageSignin = new PageSignin(driver);
    }

    @Test(priority = 0)
    public void LoginSuccess() {
        pageSignin.Login("admin", "123456");
    }
    @Test(priority = 1)
    public void LoginFailed1() {
        pageSignin.LoginFail("admin1", "123456");
    }
    @Test(priority = 2)
    public void LoginFailed2() {
        pageSignin.LoginFail("admin", "1234567");
    }

    @Test(priority = 3)
    public void LoginOA() {
        pageSignin.LoginOA("220628201", "789789");

    }

//    @Test(priority = 2)
//    public void ForgotPassword() {
//        pageSignin.ForgotPassword("client01@mailinator.com");
//
//    }
}
