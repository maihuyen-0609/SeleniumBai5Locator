package Bai11Assert;

import common.BaseTestold;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearnSoftAssert extends BaseTestold {
    @Test(priority = 0)
    public void Permission(){
        driver.get("https://anhtester.com/");
        SoftAssert softAssert=new SoftAssert();
        String actualTitle = driver.getTitle();
        String expectedTitle = "Anh Tester - Testing";
        System.out.println("Check title first time");
        softAssert.assertEquals(actualTitle, expectedTitle); //Fail
        System.out.println("Check title second time");
        softAssert.assertEquals(actualTitle, "Anh Tester - Automation Testing");
        driver.findElement(By.id("btn-login")).click();
        softAssert.assertAll();

    }
}
