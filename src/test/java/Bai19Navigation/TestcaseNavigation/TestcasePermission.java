package Bai19Navigation.TestcaseNavigation;

import Bai19Navigation.PageNavigation.PageDashboard;
import Bai19Navigation.PageNavigation.PageLogin;
import Bai19Navigation.PageNavigation.PermissionPage;
import common.BaseTestold;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestcasePermission extends BaseTestold {
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
    public void testAddPermission() {
        pageDashboard = pageLogin.LoginSalary("admin", "123456");
        permissionPage = pageDashboard.openPermissionpage();
        permissionPage.AddPermission("Mina1", "Mina1", "Mina", "Mina1");
    }
    @Test
    public void testDeletePermission(){
        pageDashboard = pageLogin.LoginSalary("admin", "123456");
        permissionPage = pageDashboard.openPermissionpage();
        permissionPage.DeletePermission();
    }
}
