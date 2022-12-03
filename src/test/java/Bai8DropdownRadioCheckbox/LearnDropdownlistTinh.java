package Bai8DropdownRadioCheckbox;

import common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LearnDropdownlistTinh extends BaseTest {
    @Test
    public void learndropdown1() throws InterruptedException {
        createDriver();
        driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
        Thread.sleep(2000);
        //select đơn
        Select select=new Select(driver.findElement(By.id("select-demo")));
        select.selectByVisibleText("Monday");
        Thread.sleep(2000);
        select.selectByIndex(4);
        Thread.sleep(2000);
//        select.selectByVisibleText("Friday");
//        Thread.sleep(2000);
//        select.selectByValue("Monday");
//        Thread.sleep(2000);
        //System.out.println(select.getFirstSelectedOption());
        Boolean check = select.isMultiple();
        System.out.println(check);
        //Multi select
        Select select1=new Select(driver.findElement(By.id("multi-select")));
        Boolean check1 = select1.isMultiple();
        System.out.println(check1);
        //kiểm tra dropdown có bao nhiu gtri
        System.out.println(select.getOptions().size());
        System.out.println(select1.getOptions().size());
        Thread.sleep(2000);
        //lấy giá trị đã chọn ra để đem đi so sánh
        System.out.println(select.getFirstSelectedOption().getText());
        Thread.sleep(2000);
        closeDriver();
    }
}
