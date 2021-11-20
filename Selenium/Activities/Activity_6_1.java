package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity_6_1 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        
        //Open browser
        driver.get("https://training-support.net/selenium/dynamic-controls");

        //Find checkbox and toggle button
        WebElement checkbox = driver.findElement(By.xpath("//div[@id='dynamicCheckbox']/input"));
        WebElement toggleCheckboxButton = driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));
        
        //Click the toggle button
        toggleCheckboxButton.click();
        
        Thread.sleep(2000);
        
        //Wait for checkbox to disappear
        wait.until(ExpectedConditions.invisibilityOf(checkbox));
        
        Thread.sleep(2000);
        
        //Click toggle button again
        toggleCheckboxButton.click();
        
        
        Thread.sleep(2000);
        //Wait for checkbox to appear
        wait.until(ExpectedConditions.visibilityOf(checkbox));
        
        Thread.sleep(2000);
        
        checkbox.click();
        
        //Close browser
        driver.close();
    }

}