package Bai15Bai16Wait;

import anhtester.com.utils.WebUI;
import common.BaseTestold;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LearnWait extends BaseTestold {
    @Test
    public void createProject() {
        driver.get("https://app.hrsale.com");
        WebUI.clickElement(By.xpath("//button[normalize-space()='Super Admin']"));
        WebUI.clickElement(By.xpath("//button[@type='submit']"));
        WebUI.clickElement( By.xpath("//a[@href='https://app.hrsale.com/erp/projects-grid']"));
       // driver.findElement(By.xpath("//button[normalize-space()='Super Admin']")).click();

       // driver.findElement(By.xpath("//button[@type='submit']")).click();

       // driver.findElement(By.xpath("//a[@href='https://app.hrsale.com/erp/projects-grid']")).click();

        String pageProjectURL = driver.getCurrentUrl();
        System.out.println("URL"+ pageProjectURL);
        Assert.assertTrue(pageProjectURL.contains("projects-grid"), "không đúng URL");
        WebUI.sleep(2);
        driver.findElement(By.xpath("//li[@class='nav-item active']//div[1]")).click();
        driver.findElement(By.xpath("//input[@class='form-control form-control-sm']")).sendKeys("Advertising Platform AD.");
        WebUI.waitForElementVisible(By.xpath("//tr[contains(.,'AD')]"));
//        WebDriverWait wait =new WebDriverWait( Duration.ofSeconds(50));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[contains(.,'AD')]")));
String titleProject = driver.findElement(By.xpath("//table[@id='xin_table']")).getText().trim();

//Assert.assertEquals(titleProject,"Advertising Platform AD.","search sai");
    }

}
