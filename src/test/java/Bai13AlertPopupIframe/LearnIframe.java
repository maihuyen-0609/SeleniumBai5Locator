package Bai13AlertPopupIframe;

import common.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LearnIframe extends BaseTest {
    @Test
    public void iframe1() throws InterruptedException {
        driver.get("https://anhtester.com/contact");
        Thread.sleep(5000);
        //1. lấy ra tất cả các thẻ iframe tồn tại trong trang
        System.out.println("iframe total:"+driver.findElement(By.tagName("iframe")).getSize());

        //2. Chuyển hướng theo vị trí của iframe
        driver.switchTo().frame(0);
        Thread.sleep(7000);
        System.out.println(driver.findElement(By.tagName("strong")).getText());
        Thread.sleep(2000);
        //3. Chuyển hướng tới tab đầu hok phải iframe
        driver.switchTo().parentFrame();
        Thread.sleep(2000);
        //
    }
    @Test
    public void iframe2() throws InterruptedException {
        driver.get("https://app.hrsale.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[normalize-space()='Super Admin']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href='https://app.hrsale.com/erp/projects-grid']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[normalize-space()='Add Project'])[1]")).click();
        Thread.sleep(2000);
        //1. lấy ra tất cả các thẻ iframe tồn tại trong trang
        System.out.println("iframe total:"+driver.findElement(By.tagName("iframe")).getSize());

        //2. Chuyển hướng theo vị trí của iframe
        driver.switchTo().frame(0);
        Thread.sleep(2000);
      driver.findElement(By.xpath("//body[@contenteditable='true']")).sendKeys("Mai Huyen");
        Thread.sleep(2000);
        //
    }
    @Test
    public void iframe3() throws InterruptedException {
        driver.get("http://172.18.0.246:9292/#/login");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[@class='ml-2 font-bold text-blue-800']")).click();
        Thread.sleep(2000);
       driver.switchTo().frame(0);
       Thread.sleep(2000);
       driver.findElement(By.xpath("//input[@placeholder='ID number']")).sendKeys("220628201");
       Thread.sleep(2000);
       driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("789789");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='el-button login-button el-button--primary el-button--medium']"));
        Thread.sleep(2000);

    }
}
