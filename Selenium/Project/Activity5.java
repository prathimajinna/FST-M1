package projects;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Activity5 {
    WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://alchemy.hguy.co/crm/");
        }

    @Test
    public void exampleTestCase() throws InterruptedException {
        // Check the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        
        
        WebElement username= driver.findElement(By.id("user_name"));
        WebElement userpassword= driver.findElement(By.id("username_password"));
        
        username.sendKeys("admin");
        userpassword.sendKeys("pa$$w0rd");
        
     
        driver.findElement(By.id("bigbutton")).click();
        
        Thread.sleep(2000);
        
        WebElement element= driver.findElement(By.id("toolbar"));
        String s = element.getCssValue("color");
        String headerColor = Color.fromString(s).asHex();
        
 
        System.out.println("Page title is: " + headerColor);
  
        

    }
    

   
	@AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}