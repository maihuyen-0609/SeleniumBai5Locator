package Bài5Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDynamic {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("http://172.18.0.246:9292/#/login");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@placeholder='Account']")).sendKeys("admin");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("123456");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='button']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@aria-label='menu.salary.payroll']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@aria-label='menu.salary.payrollSlipDetails']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='p-dropdown-label p-inputtext p-placeholder']")).click();
        Thread.sleep(2000);
       driver.findElement(By.xpath("//input[@class='p-dropdown-filter p-inputtext p-component']")).sendKeys("Mina");
       Thread.sleep(2000);
       driver.findElement(By.xpath("//li[@aria-label='(2022-08) Mina test Lion']")).click();
       Thread.sleep(2000);
       driver.close();
       driver.quit();

    }
}
