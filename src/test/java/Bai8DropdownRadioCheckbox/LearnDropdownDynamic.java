package Bai8DropdownRadioCheckbox;

import common.BaseTestold;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LearnDropdownDynamic extends BaseTestold {
    @Test
    public  void learndropdown() throws InterruptedException {
        createDriver();
        driver.get("https://techydevs.com/demos/themes/html/listhub-demo/listhub/index.html");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[normalize-space()='Select a Category']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='chosen-container chosen-container-single chosen-with-drop chosen-container-active']//input[@type='text']")).sendKeys("Hotels");
        Thread.sleep(2000);
        //driver.findElement(By.xpath("//em[normalize-space()='Hotels']")).click();
        //Enter (dành cho 1 gtri nằm đầu tiên) KEY.ENTER
        driver.findElement(By.xpath("//div[@class='chosen-container chosen-container-single chosen-with-drop chosen-container-active']//input[@type='text']")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.xpath("//div[@class='chosen-container chosen-container-single chosen-container-active']//a[@class='chosen-single']")).getText());
        Thread.sleep(2000);
        WebElement textfordropdown = driver.findElement(By.xpath("//div[@class='chosen-container chosen-container-single chosen-container-active']//a[@class='chosen-single']"));
        //ktra lại text đã chọn với giá trị trong requirement
        if(textfordropdown.getText().equals("Shop")){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        closeDriver();
    }
}
