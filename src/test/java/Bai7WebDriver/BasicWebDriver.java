package Bai7WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BasicWebDriver {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize(); //fullscreen khac maximize
//        driver.get("http://172.18.0.246:9292/#/login");
//        Thread.sleep(2000);
//        driver.navigate().to("http://oa.pbe.com/#/login");
//        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //thời gian tối đa để tìm element - dành cho WebElement
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.get("https://katalon.com/");
        driver.findElement(By.xpath("//a[@class='btn_secondary btn_contact']")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        //Get the title of the page
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        String html = driver.getPageSource();
        //System.out.println(driver.getPageSource());
        System.out.println(html.contains("placeholder=\"Full name*\""));
        Thread.sleep(2000);
        driver.quit();

    }
}
