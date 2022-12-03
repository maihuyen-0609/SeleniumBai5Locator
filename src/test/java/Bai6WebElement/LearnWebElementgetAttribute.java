package Bai6WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebElementgetAttribute {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver; //khai báo driver chung
        // khởi tạo driver cho trình duyệt
        WebDriverManager.chromedriver().setup(); // cú pháp cài đặt driver cho chrome browser thích hợp version
        driver = new ChromeDriver(); // cú pháp khởi tạo driver cho chrome browser
        driver.manage().window().maximize();
        System.out.println(driver.manage().window().getSize());
        driver.get("http://172.18.0.246:9292/#/login");
        Thread.sleep(2000);
        String buttonLogin1 = driver.findElement(By.xpath("//button[@type='button']")).getAttribute("href");
        System.out.println(buttonLogin1);
        WebElement buttonLogin = driver.findElement(By.xpath("//button[@type='button']"));
        Dimension dimension=buttonLogin.getSize();
        System.out.println(dimension);
        WebElement buttonLogin2 = driver.findElement(By.xpath("//button[@type='button']"));
        Point point= buttonLogin2.getLocation();
        System.out.println(point);
    }
}
