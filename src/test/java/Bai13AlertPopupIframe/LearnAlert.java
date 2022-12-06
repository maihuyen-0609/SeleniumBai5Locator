package Bai13AlertPopupIframe;

import common.BaseTestold;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LearnAlert extends BaseTestold {
    @Test
    public void TestAlert1() throws InterruptedException {
        driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[normalize-space()='Click me!'])[1]")).click();
        Thread.sleep(2000);
        System.out.println(driver.switchTo().alert().getText());
        Assert.assertEquals(driver.switchTo().alert().getText(), "I am an alert box!", "Text ko đúng");
        Thread.sleep(2000);
        driver.switchTo().alert().accept();//nhấn nút OK hoặc Yes hoặc Xác nhận hoặc Confirm
        Thread.sleep(2000);

    }
    @Test
    public void TestAlert2() throws InterruptedException {
        driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[normalize-space()='Click me!'])[2]")).click();
        Thread.sleep(2000);
        System.out.println(driver.switchTo().alert().getText());
        Assert.assertEquals(driver.switchTo().alert().getText(), "Press a button!", "Text ko đúng");
        Thread.sleep(2000);
        driver.switchTo().alert().accept();//nhấn nút OK hoặc Yes hoặc Xác nhận hoặc Confirm
        Thread.sleep(2000);
        WebElement textConfirm = driver.findElement(By.id("confirm-demo"));
        Thread.sleep(2000);
        Assert.assertEquals(textConfirm.getText(), "You pressed OK!", "Text ko chính xác");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[normalize-space()='Click me!'])[2]")).click();
        Thread.sleep(2000);
        System.out.println(driver.switchTo().alert().getText());
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();
        Thread.sleep(2000);
        Assert.assertEquals(textConfirm.getText(), "You pressed Cancel!", "Text ko chính xác");
    }
    @Test
    public void TestAlert3() throws InterruptedException {
        driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[normalize-space()='Click for Prompt Box']")).click();
        Thread.sleep(2000);
        System.out.println(driver.switchTo().alert().getText());
        Assert.assertEquals(driver.switchTo().alert().getText(), "Please enter your name", "Text ko đúng");
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("Mai Huyen");
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();
        Thread.sleep(2000);
        WebElement textConfirm = driver.findElement(By.id("prompt-demo"));
        Assert.assertEquals(textConfirm.getText(), "", "Text ko chính xác");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[normalize-space()='Click for Prompt Box']")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("Mai Huyen");
        Thread.sleep(2000);
        driver.switchTo().alert().accept();//nhấn nút OK hoặc Yes hoặc Xác nhận hoặc Confirm
        Thread.sleep(2000);
        Assert.assertEquals(textConfirm.getText(), "You have entered 'Mai Huyen' !", "Text ko chính xác");
        Thread.sleep(2000);

    }
}
