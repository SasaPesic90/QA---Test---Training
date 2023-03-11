//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Pages;

import java.time.Duration;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class asePage {
    public static WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10L));
    }

    public void assertElementVisible(By elementBy) {
        boolean isVisible = driver.findElement(elementBy).isDisplayed();
        Assert.assertTrue(isVisible);
    }

    public void click(By elementBy) {
        this.wait.until(ExpectedConditions.elementToBeClickable(elementBy));
        driver.findElement(elementBy).click();
    }

    public void waitVisibility(By elementBy) {
        this.wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    public String readText(By elementBy) {
        this.waitVisibility(elementBy);
        return driver.findElement(elementBy).getText();
    }

    public void assertTextEquals(String expectedText, String actualText) {
        Assert.assertEquals(expectedText, actualText);
    }

    public int countItems(By elementBy) {
        this.waitVisibility(elementBy);
        return driver.findElements(elementBy).size();
    }

    public void assertIntegerEquals(int expectedNumber, int actualNumber) {
        Assert.assertEquals((long)expectedNumber, (long)actualNumber);
    }

    public void writeText(By elementBy, String text) {
        this.wait.until(ExpectedConditions.elementToBeClickable(elementBy));
        driver.findElement(elementBy).clear();
        driver.findElement(elementBy).sendKeys(new CharSequence[]{text});
    }
}
