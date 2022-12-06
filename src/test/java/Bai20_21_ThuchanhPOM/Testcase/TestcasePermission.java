package Bai20_21_ThuchanhPOM.Testcase;

import Bai19Navigation.PageNavigation.PageDashboard;
import Bai19Navigation.PageNavigation.PageLogin;
import Bai19Navigation.PageNavigation.PermissionPage;
import common.BaseTestNew;
import common.BaseTestold;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestcasePermission extends BaseTestNew {
    private PageLogin pageLogin;
    private PageDashboard pageDashboard;
    private PermissionPage permissionPage;

    @BeforeMethod
    public void setupTest() {
        //lúc nào nó cũng khởi tạo trước
        //vì login luôn là hành động đầu tiên
        pageLogin = new PageLogin(driver);
    }

    @Test
    @Parameters({"username","password"})
    public void testAddPermission(String username,String password) {
        pageDashboard = pageLogin.LoginSalary(username, password);
        permissionPage = pageDashboard.openPermissionpage();
        permissionPage.AddPermission("Mina1", "Mina1", "Mina", "Mina1");
    }
    @Test
    @Parameters({"username","password"})
    public void testDeletePermission(String username,String password){
        pageDashboard = pageLogin.LoginSalary(username, password);
        permissionPage = pageDashboard.openPermissionpage();
        permissionPage.DeletePermission();
    }
}
