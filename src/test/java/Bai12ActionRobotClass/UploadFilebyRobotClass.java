package Bai12ActionRobotClass;

import common.BaseTestold;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class UploadFilebyRobotClass extends BaseTestold {
    @Test
    public void uploadsalary() throws InterruptedException, AWTException {
        driver.get("http://172.18.0.246:9292/#/login");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@placeholder='Account']")).sendKeys("admin");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("123456");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='button']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@aria-label='menu.salary.payrollHomeManage']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//tbody/tr[3]/td[11]/div[1]/div[1]/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//span[@class='text-red-500'][normalize-space()='Annual Leave'])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='p-button p-component p-fileupload-choose p-button-sm']")).click();
        Robot robot=new Robot();
        Thread.sleep(2000);
        StringSelection stringSelection = new StringSelection("D:\\USER\\Downloads\\annual.leave.xlsx");
        Thread.sleep(2000);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,null);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_V);
        Thread.sleep(2000);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(2000);
        robot.keyRelease(KeyEvent.VK_V);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);

    }
    @Test
    public void MousePress() throws InterruptedException, AWTException {
        driver.get("https://anhtester.com/");
        Thread.sleep(2000);
        WebElement element=driver.findElement(By.id("btn-login"));
        Point point=element.getLocation();
        System.out.println(point);
        Thread.sleep(2000);
        Robot robot=new Robot();
        robot.mouseMove(1570,200); //huhu xài point x point y mà ko đúng tọa độ
        robot.delay(2000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(2000);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(2000);
    }
}
