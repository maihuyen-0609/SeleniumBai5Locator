package Bai24ParameterMultiBrowser;

import Bai17POM.Page.PageSignin;
import Bai20_21_ThuchanhPOM.Pages.CommonPage;
import common.BaseTestNew;
import common.BaseTestold;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTestoldParameter extends BaseTestNew {
    public PageSignin pageSignin;
    public CommonPage commonPage;

    @BeforeMethod
    public void Login() {
        pageSignin = new PageSignin(driver);
        commonPage=new CommonPage(driver);
    }

    @Test(priority = 0)
    @Parameters({"username","password"})
    public void LoginSuccess(String username,String password) {
        pageSignin.Login(username, password);
        commonPage.Logout();
    }

    @Test(priority = 1)
    @Parameters({"username","password"})
    public void LoginFailed1(String username,String password) {
        pageSignin.LoginFail(username,password);
    }

//    @Test(priority = 2)
//    public void LoginFailed2() {
//        pageSignin.LoginFail("admin", "1234567");
//    }

//    @Test(priority = 3)
//    public void LoginOA() {
//        pageSignin.LoginOA("220628201", "789789");
//
//    }
}
