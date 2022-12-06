package Bai19Navigation.PageNavigation;

import anhtester.com.utils.WebUI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class PageLogin {
    private WebDriver driver;
    private WebDriverWait wait;
    private PageDashboard pageDashboard;
    public PageLogin(WebDriver driver) {
        this.driver=driver;
        new WebUI(driver);
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        pageDashboard=new PageDashboard(driver);
    }
    private By inputAccount = By.xpath("//input[@placeholder='Account']");
    private By inputPassword=By.xpath("//input[@placeholder='Password']");
    private By buttonLogin=By.xpath("//button[@type='button']");
    private By buttonOAAccount=By.xpath("//span[@class='ml-2 font-bold text-blue-800']");
    private By inputIDNumber = By.xpath("//input[@placeholder='ID number']");
    private By inputPasswordOA=By.xpath("//input[@placeholder='Password']");
    private By buttonLoginOA=By.xpath("//button[@class='el-button login-button el-button--primary el-button--medium']");
    private By textPage=By.xpath("//h1[@class='text-center font-bold text-white text-6xl']");
    private By textPageOA=By.xpath("//div[@class='title-container']");



    public PageDashboard LoginSalary (String account, String password) {
        WebUI.openURL("http://172.18.0.246:9292/#/login");
        boolean checkLoginPage=WebUI.checkElementExist(textPage);
        WebUI.getElementText(textPage);
        Assert.assertTrue(checkLoginPage,"Không tìm thấy Login page");
        WebUI.setText(inputAccount,account);
        WebUI.setText(inputPassword,password);
        WebUI.clickElement(buttonLogin);
        WebUI.waitForElementVisible(pageDashboard.menuPermission);
        //đợi trang load
        //check sự tồn tại của element
        boolean checkMenu=WebUI.checkElementExist(pageDashboard.menuPermission);
        Assert.assertTrue(checkMenu,"Không tìm thấy menu");

        return new PageDashboard(driver);
    }
    public void LoginOA(String accountOA, String passwordOA) {
        WebUI.openURL("http://172.18.0.246:9292/#/login");
        WebUI.clickElement(buttonOAAccount);
        driver.switchTo().frame(0);
        WebUI.getElementText(textPageOA);
        Assert.assertEquals(WebUI.getElementText(textPageOA).trim(),"Office management system", "Text sai");
        WebUI.setText(inputIDNumber,accountOA);
        WebUI.setText(inputPasswordOA,passwordOA);
        WebUI.clickElement(buttonLoginOA);
    }

}
