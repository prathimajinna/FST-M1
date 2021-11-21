package projects;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Activity6 {
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
        
        WebElement Activities = driver.findElement(By.xpath("//a[text()='Activities']"));
        Assert.assertTrue(Activities.isDisplayed());
        Assert.assertTrue(Activities.isEnabled());
        Activities.click();
        
    }
    	@AfterMethod
        public void afterMethod() {
            //Close the browser
            driver.quit();
        }

      
      
    }
    

  

