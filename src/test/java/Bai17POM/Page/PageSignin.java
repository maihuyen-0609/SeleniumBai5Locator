package Bai17POM.Page;

import anhtester.com.utils.WebUI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class PageSignin {
    private WebDriver driver;
    private WebDriverWait wait;
    public PageSignin(WebDriver driver) {
        this.driver=driver;
        new WebUI(driver);
        wait=new  WebDriverWait(driver, Duration.ofSeconds(10));
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
    private By alertMessage=By.xpath("//div[@class='p-toast p-component p-toast-top-right']");
    private By textWelcome=By.xpath("//h1[normalize-space()='Welcome, admin!']");



    public void Login(String account, String password) {
        WebUI.openURL("http://172.18.0.246:9292/#/login");
        WebUI.checkElementExist(textPage);
        WebUI.getElementText(textPage);
        Assert.assertEquals(WebUI.getElementText(textPage).trim(),"Salary system", "Không tìm thấy trang login");
        WebUI.setText(inputAccount,account);
        WebUI.setText(inputPassword,password);
        WebUI.clickElement(buttonLogin);
        WebUI.sleep(10);
        WebUI.waitForElementVisible(textWelcome);
    }
    public void LoginFail(String account, String password) {
        WebUI.openURL("http://172.18.0.246:9292/#/login");
        WebUI.checkElementExist(textPage);
        WebUI.getElementText(textPage);
        Assert.assertEquals(WebUI.getElementText(textPage).trim(),"Salary system", "Không tìm thấy trang login");
        WebUI.setText(inputAccount,account);
        WebUI.setText(inputPassword,password);
        WebUI.clickElement(buttonLogin);
        WebUI.waitForElementVisible(alertMessage);
        boolean checkAlertError=WebUI.checkElementExist(alertMessage);
        Assert.assertTrue(checkAlertError,"Error not display");
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
        WebUI.sleep(10);
        WebUI.waitForElementVisible(textWelcome);
    }

}

