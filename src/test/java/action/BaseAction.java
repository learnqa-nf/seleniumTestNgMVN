package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static runner.Signup.driver;

public class BaseAction {

    public static void click(By locator) {

        waitElementVisible(locator, 15);
        driver.findElement(locator).click();
    }

    public static void setText(By locator, String v) {
        waitElementVisible(locator, 15);
        driver.findElement(locator).sendKeys(v);
    }

    public static void getText(By locator) {

    }

    public static void clear(By locator) {
        waitElementVisible(locator, 15);
        driver.findElement(locator).click();
    }

    public static void waitElementVisible(By locator, int seconds) {

        WebDriverWait wait = new WebDriverWait(driver, seconds);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }
}
