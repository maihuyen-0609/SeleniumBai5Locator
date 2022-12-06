package Bai20_21_ThuchanhPOM.Testcase;

import Bai17POM.Page.PageSignin;
import Bai20_21_ThuchanhPOM.Pages.CommonPage;
import common.BaseTestNew;
import common.BaseTestold;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestcaseSignin extends BaseTestNew {
    public PageSignin pageSignin;
    public CommonPage commonPage;

    @BeforeMethod
    public void Login() {
        pageSignin = new PageSignin(driver);
        commonPage=new CommonPage(driver);
    }

    @Test(priority = 0)
    public void LoginSuccess() {
        pageSignin.Login("admin", "123456");
        commonPage.Logout();
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
}
