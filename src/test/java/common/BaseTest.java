package common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;
    @BeforeSuite
    public void setupAutomation(){
        System.out.println("Load file config ");
    }
    @BeforeTest
    public static void createDriver(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
    }
    @AfterTest
    public static void closeDriver(){
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if(driver!=null){
        driver.quit();
    }
    }
    @AfterSuite
    public void setupCloseAutomation(){
        System.out.println("close automation test");
    }
}
