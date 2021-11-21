package projects;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Activity7 {
    WebDriver driver;
    WebDriverWait wait;
    
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
        
        WebElement Sales = driver.findElement(By.xpath("//a[text()='Sales']"));
    
        Sales.click();
    
        WebElement Leads= driver.findElement(By.id("moduleTab_9_Leads"));
        Leads.click();
        
        Thread.sleep(2000);
        
     
        

		
		driver.findElement(By.id("adspan_683f9f93-9423-1a6e-4a4d-5fd8a89ceaab")).click();
		System.out.println("Clicked on Additional information icon.");
		
		driver.switchTo().activeElement();
		
		String mobNum = driver.findElement(By.className("phone")).getText();
		System.out.println("Selected Lead's mobile number is "+mobNum);
        
    }
    
    
    	@AfterMethod
        public void afterMethod() {
            //Close the browser
            driver.quit();
        }

      
      
    }
    

  

