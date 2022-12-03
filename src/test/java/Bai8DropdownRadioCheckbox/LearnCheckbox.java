package Bai8DropdownRadioCheckbox;

import common.BaseTest;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public  class LearnCheckbox extends BaseTest {
    @Test
    public void learncheckbox() throws InterruptedException {
        //đoạn setup browser >> class riêng
        //kế thừa lại class setup
  createDriver();
  driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
  //driver.findElement(By.id("isAgeSelected")).click();
  Thread.sleep(2000);
  //kiểm tra check box đã dc chọn chưa
        System.out.println( driver.findElement(By.id("isAgeSelected")).isSelected());
        //multi check box
       // System.out.println(driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).isSelected());
       // System.out.println(driver.findElement(By.xpath("//label[normalize-space()='Option 2']/child::input")).isSelected());
        List <WebElement> listCheckbox =driver.findElements(By.xpath("(//div[@class='panel-body'])[3]//div//input"));
        System.out.println(listCheckbox.size());
        for (int i =0; i< listCheckbox.size();i++){
            listCheckbox.get(i).click();
            Thread.sleep(2000);
        }
        for (int i = 0; i< listCheckbox.size();i++){
            System.out.println(listCheckbox.get(i).isSelected());
            //Assert.assertTrue(listCheckbox.get(i).isSelected(), "Vị trí"+i+ "bị sai");
            
            Thread.sleep(2000);
        }
  closeDriver();
   }
}
