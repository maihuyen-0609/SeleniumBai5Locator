package Bai6WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver; //khai báo driver chung
        // khởi tạo driver cho trình duyệt
        WebDriverManager.chromedriver().setup(); // cú pháp cài đặt driver cho chrome browser thích hợp version
        driver = new ChromeDriver(); // cú pháp khởi tạo driver cho chrome browser
        driver.manage().window().maximize();
        driver.get("http://172.18.0.246:9292/#/login");
        Thread.sleep(2000);
        WebElement inputEmail = driver.findElement(By.xpath("//input[@placeholder='Account']"));
        inputEmail.sendKeys("admin");
        //inputEmail.clear();
        Thread.sleep(2000);
        WebElement inputPassword = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        inputPassword.sendKeys("123456");
        Thread.sleep(2000);
        WebElement buttonLogin = driver.findElement(By.xpath("//button[@type='button']"));
       buttonLogin.click();
      //  buttonLogin.submit();
        Thread.sleep(2000);
        //buttonLogin.isEnabled();
       // System.out.println(buttonLogin.isEnabled());
        String webmodule = driver.findElement(By.xpath("//h1[normalize-space()='Welcome, admin!']")).getText();
        System.out.println(webmodule);
        String webmodule1 = driver.findElement(By.xpath("//h1[normalize-space()='Welcome, admin!']")).getCssValue("font-size");
        System.out.println(webmodule1);
        String webmodule2 = driver.findElement(By.xpath("//h1[normalize-space()='Welcome, admin!']")).getAttribute("class");
        System.out.println(webmodule2);
        driver.quit();
    }

}
