package anhtester.com.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebUI {
    private static int TIMEOUT = 10;
    //luôn đợi 10s
    private static int STEP_TIME = 1;
    private static WebDriver driver;

    public WebUI(WebDriver driver) {
        WebUI.driver = driver;
    }

    public static void sleep(long second) {
        try {
            Thread.sleep(1000 * second);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void logConsole(Object message) {
        System.out.println(message);
    }

    public static void openURL(String url) {
        driver.get(url);
        logConsole("Open:" + url);
    }

    public static void clickElement(By by) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        sleep(STEP_TIME);
        driver.findElement(by).click();
        logConsole("Click:" + by);
    }

    //đợi theo timeout tự set
    public static void clickElement(By by, long timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        sleep(STEP_TIME);
        driver.findElement(by).click();
        logConsole("Click:" + by);
    }

    public static void setText(By by, String value) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        sleep(STEP_TIME);
        driver.findElement(by).sendKeys(value);
        logConsole("Set text:" + value + "on element" + by);
    }

    public static void waitForElementVisible(By by) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public static void waitForElementClickable(By by) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    //    public static void switchtoElement(, By by, String value) {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
//        driver.switchTo().frame(value);
//    }
    public static String getElementText(By by) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        sleep(STEP_TIME);
        logConsole("Get text:" + by);
        return driver.findElement(by).getText();
    }
}
