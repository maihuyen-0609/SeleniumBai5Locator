package Bai11Assert;

import common.BaseTestold;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LearnHardAssert extends BaseTestold {
    @Test(priority = 0)
    public void CheckTitle(){
        driver.get("https://anhtester.com/");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Anh Tester - Automation Testing";
        //nếu đúng thì mới click login, sai thì ko bấm login
        System.out.println("Check title");
        Assert.assertEquals(actualTitle,expectedTitle);
        Assert.assertEquals(driver.findElement(By.id("btn-login")).getText().trim(),"LOG IN", "Text passed");
        Assert.assertTrue(driver.findElement(By.id("btn-login")).isEnabled(), "Button Login enable");
        driver.findElement(By.id("btn-login")).click();
    }

}
