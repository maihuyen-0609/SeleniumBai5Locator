package Bai12ActionRobotClass;

import common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.security.Key;

public class LearnActionClass extends BaseTest {
    @Test(priority = 0)
    public void TestSendKey1() throws InterruptedException {
        driver.get("http://172.18.0.246:9292/#/login");
        WebElement account =driver.findElement(By.xpath("//input[@placeholder='Account']"));
        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        WebElement buttonlogin=driver.findElement(By.xpath("//button[@type='button']"));
        Actions action=new Actions(driver);
        action.sendKeys(account, "admin").build().perform();
        Thread.sleep(2000);
        action.sendKeys(password, "123456").build().perform();
        Thread.sleep(2000);
       /// action.click(buttonlogin).build().perform();
        action.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2000);

    }
    @Test(priority = 1)
    public void Google() throws InterruptedException {
        driver.get("https://www.google.com/");
        WebElement search =driver.findElement(By.xpath("//input[@name='q']"));
        Actions actions=new Actions(driver);
        actions.sendKeys(search,"Anh Tester").build().perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2000);
    }
    @Test(priority = 2)
    public void ClickandHold() throws InterruptedException {
        driver.get("https://anhtester.com/");
        WebElement loginbutton=driver.findElement(By.id("btn-login"));
        Actions actions=new Actions(driver);

        actions.moveToElement(loginbutton).clickAndHold().build().perform();
        Thread.sleep(2000);
    }
    @Test(priority = 3)
    public  void dragAndDrop() throws InterruptedException {
        driver.get("http://demo.guru99.com/test/drag_drop.html");
        Thread.sleep(2000);
        // Element which needs to drag.
        WebElement From = driver.findElement(By.xpath("//*[@id='credit2']/a"));
        // Element on which need to drop.
        WebElement To = driver.findElement(By.xpath("//*[@id='bank']/li"));

        Actions action = new Actions(driver);

        // Gọi hàm dragAndDrop giữa Element
        action.dragAndDrop(From, To).build().perform();

        Thread.sleep(1000);

        // Drag and Drop by Pixel.
        WebElement from_5000 = driver.findElement(By.xpath("//*[@id='fourth']/a"));
        action.dragAndDropBy(from_5000, 168, 40).build().perform();

        Thread.sleep(2000);
}

    @Test(priority = 4)
    public void inputTextUppercase() throws InterruptedException {
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("//input[@name='q']"));

        Actions action = new Actions(driver);

        // Đè giữ phím SHIFT và nhập text -> Chữ in hoa
        action.keyDown(element, Keys.SHIFT).sendKeys("anh tester").build().perform();

        Thread.sleep(2000);
    }
    @Test(priority = 5)
    public void scrollPageDownAndUp() throws InterruptedException {
        driver.get("https://anhtester.com/");
        Actions action = new Actions(driver);

        Thread.sleep(1000);
        // Scroll down
        action.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
        Thread.sleep(2000);
        // Scroll up
        action.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();

        Thread.sleep(2000);
    }
    @Test(priority = 6)
    public void copyAndPaste() throws InterruptedException {
        driver.get("https://anhtester.com/blogs");
        Thread.sleep(2000);

        WebElement inputCourseElement = driver.findElement(By.xpath("//input[contains(@placeholder, 'Tìm kiếm khóa học')]"));
        WebElement inputBlogElement = driver.findElement(By.xpath("//input[contains(@placeholder, 'Tìm kiếm bài viết')]"));

        Actions action = new Actions(driver);

        Thread.sleep(1000);
        // Nhập text vào ô search course
        inputCourseElement.sendKeys("Selenium");
        Thread.sleep(1000);
        //Ctrl + a để bôi đen
        action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
        Thread.sleep(1000);
        //Ctrl + c để copy
        action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
        Thread.sleep(1000);
        //click vào ô Blog search
        inputBlogElement.click();
        Thread.sleep(1000);
        //Ctrl + v để dán
        action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
        action.keyDown(Keys.CONTROL).sendKeys(Keys.F5).build().perform();
        Thread.sleep(2000);
    }

}
