package Bai14JavaScriptExecutor;

import common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LearnJSExecutor extends BaseTest {
    JavascriptExecutor js; //khai báo
    @Test
    public void jsExecutorDemo01() throws InterruptedException {
        // Creating the JavascriptExecutor interface object
        //  JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://anhtester.com/");
        Thread.sleep(1000);
        js=(JavascriptExecutor) driver; // khởi tạo giá trị
        // Click on "Website Testing" module using JavascriptExecutor
        WebElement button = driver.findElement(By.xpath("//h3[normalize-space()='Website Testing']"));
        js.executeScript("arguments[0].click();", button);//click ngầm
        Thread.sleep(1000);

        // Get page title and Domain using JavascriptExecutor
        String titleText = js.executeScript("return document.title;").toString(); //get Title
        System.out.println("Page Title is: " + titleText);

        String domainName = js.executeScript("return document.URL;").toString(); //get URL domain
        System.out.println("Domain is: " + domainName);
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,1000)");
        // Add Alert window using JavascriptExecutor
        js.executeScript("alert('Successfully Logged In');"); //get alert

        Thread.sleep(2000);
    }
    //testcase cuộn chuột tới element , move to element
    @Test
    public void jsExecutorDemo02() throws InterruptedException {
        driver.get("https://anhtester.com/");
        Thread.sleep(1000);
        js=(JavascriptExecutor) driver; // khởi tạo giá trị
        WebElement element = driver.findElement(By.xpath("//a[@class='theme-btn theme-btn-hover-light']"));
        Thread.sleep(2000);
        js.executeScript("arguments[0].scrollIntoView(true);", element); //true thì đối tượng nằm đầu
        Thread.sleep(2000);
        js.executeScript("arguments[0].scrollIntoView(false);", element); //true thì đối tượng nằm cuối
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
        Thread.sleep(2000);
    }
    //testcase highlight
    @Test
    public void jsExecutorDemo03() throws InterruptedException {
        driver.get("https://anhtester.com/");
        Thread.sleep(1000);
        js=(JavascriptExecutor) driver; // khởi tạo giá trị
        Thread.sleep(2000);
        WebElement element=driver.findElement(By.xpath("(//a)[33]"));
        Thread.sleep(2000);
        js.executeScript("arguments[0].style.border='3px solid red'", element);
        Thread.sleep(2000);
    }

    @Test
    public void jsExecutorDemo04() throws InterruptedException {
        driver.get("https://demo.activeitzone.com/ecommerce/home");
        Thread.sleep(1000);
        js=(JavascriptExecutor) driver; // khởi tạo giá trị
        Thread.sleep(2000);
        WebElement element=driver.findElement(By.xpath("//a[normalize-space()='All Categories']"));
        Thread.sleep(2000);

//        String att= js.executeScript("arguments[0].getAttribute('class')", element).toString();
//        Thread.sleep(2000);
        js.executeScript("arguments[0].click();", element);
        Thread.sleep(2000);
    }
}
