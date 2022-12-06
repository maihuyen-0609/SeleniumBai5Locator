package Bai8DropdownRadioCheckbox;

import common.BaseTestold;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LearnRadioButton extends BaseTestold {
    @Test
    public void learnradio() throws InterruptedException {
        createDriver();
        driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
        Thread.sleep(2000);
        Boolean radioMale=driver.findElement(By.xpath("//label[normalize-space()='Male']//input[@name='optradio']")).isSelected();
        System.out.println(radioMale);
        driver.findElement(By.xpath("//label[normalize-space()='Male']//input[@name='optradio']")).click();
        Boolean radioMale2=driver.findElement(By.xpath("//label[normalize-space()='Male']//input[@name='optradio']")).isSelected();
        System.out.println(radioMale2);
        //Kiểm tra dạng radio
        // Click chọn gtri 2
        //Ktra gtri 2 >>TRUE Ktra gtri 1 >> False
        driver.findElement(By.xpath("//label[normalize-space()='Female']//input[@name='optradio']")).click();
        Boolean radioMale3=driver.findElement(By.xpath("//label[normalize-space()='Female']//input[@name='optradio']")).isSelected();
        System.out.println(radioMale3);
        closeDriver();
    }
}
