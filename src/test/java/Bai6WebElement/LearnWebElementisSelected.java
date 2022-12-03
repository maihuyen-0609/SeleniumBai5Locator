package Bai6WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebElementisSelected {
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
        Thread.sleep(2000);
        WebElement menuroute = driver.findElement(By.xpath("//a[@aria-label='menu.adminTool.route']"));
        menuroute.click();  Thread.sleep(2000);
        WebElement checkbox1 = driver.findElement(By.xpath("//body[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]"));
        //checkbox1.click();
        // Thread.sleep(2000);
        //WebElement checkbox2 = driver.findElement(By.xpath("//body[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]"));
        checkbox1.isSelected();
        System.out.println(checkbox1.isSelected());

        driver.quit();
    }

}
