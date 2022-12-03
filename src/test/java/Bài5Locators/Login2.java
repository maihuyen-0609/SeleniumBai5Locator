package Bài5Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://172.18.0.246:9292/#/login");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@placeholder='Account']")).sendKeys("admin");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("123456");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='button']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@aria-label='menu.adminTool.permission']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='p-button p-component p-button-success mr-4']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@role='dialog']//div[1]//span[1]//input[1]")).sendKeys("Mina");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[2]/div[2]/span/input")).sendKeys("Mina1");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[2]/div[3]/span/input")).sendKeys("Mina1");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='p-button p-component']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[normalize-space()='Success']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//th[@class='is-tooltip name']//span[@class='pi pi-filter-icon pi-filter']")).click();
        Thread.sleep(2000);

        driver.close();
        driver.quit();
    }
}
