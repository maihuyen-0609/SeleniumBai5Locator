package Bai13AlertPopupIframe;

import common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

public class LearnWindowPopup extends BaseTest {
    @Test
    public void inputText() throws InterruptedException, AWTException {

        driver.get("https://anhtester.com/");

        Thread.sleep(1000);
        WebElement inputCourseElement = driver.findElement(By.name("key"));

        inputCourseElement.click();

        Robot robot = new Robot();
        // Nhập từ khóa selenium
        robot.keyPress(KeyEvent.VK_S);
        robot.keyPress(KeyEvent.VK_E);
        robot.keyPress(KeyEvent.VK_L);
        robot.keyPress(KeyEvent.VK_E);
        robot.keyPress(KeyEvent.VK_N);
        robot.keyPress(KeyEvent.VK_I);
        robot.keyPress(KeyEvent.VK_U);
        robot.keyPress(KeyEvent.VK_M);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);

        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_T);
        Thread.sleep(2000);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        // Switch between browser windows or tabs
        Set<String> windowHandles = driver.getWindowHandles();
        String firstTab = (String)windowHandles.toArray()[0]; //Tab đầu
        String lastTab = (String)windowHandles.toArray()[1]; //Tab thứ hai
        driver.switchTo().window(lastTab);
        driver.navigate().to("http://172.18.0.246:9292/#/login");
        driver.switchTo().window(firstTab);
    }
    @Test
    public void windowpopup2() throws InterruptedException {
        driver.get("https://demo.guru99.com/popup.php");
        driver.findElement(By.xpath("//a[normalize-space()='Click Here']")).click();
        //lưu lại tan window đầu tiên
        String Mainwindow=driver.getWindowHandle();
        System.out.println(Mainwindow);
        //lấy tất cả các tab trên browser
        Set<String> windows= driver.getWindowHandles();
//Set là một Collection để lưu các phần tử giá trị KHÔNG trùng lặp.
        //Cách duyệt từng phần tử không trùng lặp trong Collection (Set) - Java Basic
        for (String window:windows){
            System.out.println(window);
            if(!Mainwindow.equals(window)){
                //So sánh nếu thằng nào khác thằng Chính (đầu tiên) thì chuyển hướng qua nó mới thao tác được
                //Switch to Child window
                driver.switchTo().window(window);
                Thread.sleep(2000);
                //Get Tilte của tab để so sánh
                System.out.println(driver.switchTo().window(window).getTitle());
                if(driver.switchTo().window(window).getTitle().equals("Guru99 Bank Home Page")){
                    driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("Mai Huyen");
                    driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
                }
                System.out.println("dã chuyển đến window khác"+window);
            }
        }


    }
    @Test
    public void windowpopup3() throws InterruptedException {
        driver.get("https://demo.guru99.com/popup.php");
        driver.findElement(By.xpath("//a[normalize-space()='Click Here']")).click();
        //lưu lại tan window đầu tiên
        String Mainwindow=driver.getWindowHandle();
        System.out.println(Mainwindow);
        //lấy tất cả các tab trên browser
        Set<String> windows= driver.getWindowHandles();
//Set là một Collection để lưu các phần tử giá trị KHÔNG trùng lặp.
        //Cách duyệt từng phần tử không trùng lặp trong Collection (Set) - Java Basic
        //dùng arraylist để lấy vị trí tab đầu tiên vừa sinh ra
        ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
        System.out.println(tabs.get(0));
        System.out.println(tabs.get(1)); //lấy tab thứ 2, array đếm từ 0
        driver.switchTo().window(tabs.get(1));
        driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("Mai Huyen");
        driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
        System.out.println("dã chuyển đến window khác"+tabs.get(1));
    }
    @Test
    public void windowpopup4() throws InterruptedException {
        driver.get("https://demo.guru99.com/popup.php");
        driver.findElement(By.xpath("//a[normalize-space()='Click Here']")).click();
        //lưu lại tan window đầu tiên
        String Mainwindow=driver.getWindowHandle();
        System.out.println(Mainwindow);
        //lấy tất cả các tab trên browser
        Set<String> windows= driver.getWindowHandles();
//Set là một Collection để lưu các phần tử giá trị KHÔNG trùng lặp.
        //Cách duyệt từng phần tử không trùng lặp trong Collection (Set) - Java Basic
        for (String window:windows){
                if(driver.switchTo().window(window).getTitle().equals("Guru99 Bank Home Page")){
                    driver.switchTo().window(window);
                    Thread.sleep(2000);
                    System.out.println("dã chuyển đến window khác"+window);
                    driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("Mai Huyen");
                    driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
                }
// Vô tình Title này bị trùng nên ko đến đúng tab thứ 2, nếu title khác là đúng gòi
            }
        }


    }

