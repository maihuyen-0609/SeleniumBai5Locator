package Bai12ActionRobotClass;

import common.BaseTestold;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Set;

public class LearnRobotClass extends BaseTestold {
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

}


