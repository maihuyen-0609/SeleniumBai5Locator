package Bai11Assert;

import common.BaseTestold;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PermissionAssert  extends BaseTestold {
    @Test
    public void Loginsalary() throws InterruptedException {
        SoftAssert softAssert=new SoftAssert();
        driver.get("http://172.18.0.246:9292/#/login");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@placeholder='Account']")).sendKeys("admin");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("123456");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='button']")).click();
        Thread.sleep(2000);
        softAssert.assertAll();
    }
}
