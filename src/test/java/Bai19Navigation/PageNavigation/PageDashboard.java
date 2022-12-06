package Bai19Navigation.PageNavigation;

import anhtester.com.utils.WebUI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageDashboard {
    WebDriver driver;

    public PageDashboard(WebDriver driver) {
        this.driver = driver;
        new WebUI(driver);
    }

    public By menuPermission = By.xpath("//a[@aria-label='menu.adminTool.permission']");
    private By menuRole=By.xpath("//a[@aria-label='menu.adminTool.role']");
    private By menuRoute=By.xpath("//a[@aria-label='menu.adminTool.route']");

    public PermissionPage openPermissionpage() {
        WebUI.clickElement(menuPermission);
        return new PermissionPage(driver);
    }
    public void openTab() {

    }
}
