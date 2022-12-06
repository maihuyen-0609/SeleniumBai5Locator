package Bai8DropdownRadioCheckbox;

import common.BaseTestold;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class LearnMultiRadioButton extends BaseTestold {
    @Test
    public void learnmultiradio() throws InterruptedException {
        createDriver();
        driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
        Thread.sleep(2000);
        List<WebElement> listradio=driver.findElements(By.xpath("//body/div[@id='easycont']/div[@class='row']/div[@class='col-md-6 text-left']/div[2]/div[2]//div//label"));
        System.out.println(listradio.size());
        for (int i =0; i<listradio.size();i++){
            listradio.get(i).click();
            Thread.sleep(2000);
        }
        for (int i=0; i<listradio.size();i++){
            System.out.println(listradio.get(i).isSelected());
            Thread.sleep(2000);
        }
        // chỗ này đáng lí isSelected là Boolean nhưng mà ko bik cho dô list , huhu
        closeDriver();
    }
}
