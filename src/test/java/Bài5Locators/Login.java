package Bài5Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello");
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //1 - Maximize browser của mình
        driver.manage().window().maximize();
        //2 - Đi đến 1 url
        driver.navigate().to("https://katalon.com/sign-in");
        Thread.sleep(2000);
        //3. Tìm element bằng thuộc tính html
        driver.findElement(By.id("signin_email")).sendKeys("born.to.shine0609@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.name("user_pass")).sendKeys("Maihuyen69@");
        Thread.sleep(1000);
        driver.findElement(By.className("sign-in-btn")).click();
        Thread.sleep(6000);
        //4. Tìm element bằng xpath tuyệt đối
        //driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/button[1]/span[1]/svg")).click();
       //Thread.sleep(6000);
        //5 - Lấy title và in ra console
        //System.out.println(driver.getTitle());
        //6 - Đóng browser
        driver.quit();
    }
}
