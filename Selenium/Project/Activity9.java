package projects;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Activity9 {
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
        
       driver.findElement(By.xpath("//a[text()='Sales']")).click();
       driver.findElement(By.id("moduleTab_9_Leads")).click();
       
       
       Thread.sleep(2000);
       
       System.out.println("Print the first 10 values of 'Names' coloumn :");
 	  
 	  System.out.println(driver.findElement(By.xpath("//table[contains(@class, 'table-responsive')]/tbody/tr[1]/td[3]")).getText());
 	  System.out.println(driver.findElement(By.xpath("//table[contains(@class, 'table-responsive')]/tbody/tr[2]/td[3]")).getText());
 	  System.out.println(driver.findElement(By.xpath("//table[contains(@class, 'table-responsive')]/tbody/tr[3]/td[3]")).getText());
 	  System.out.println(driver.findElement(By.xpath("//table[contains(@class, 'table-responsive')]/tbody/tr[4]/td[3]")).getText());
 	  System.out.println(driver.findElement(By.xpath("//table[contains(@class, 'table-responsive')]/tbody/tr[5]/td[3]")).getText());
 	  System.out.println(driver.findElement(By.xpath("//table[contains(@class, 'table-responsive')]/tbody/tr[6]/td[3]")).getText());
 	  System.out.println(driver.findElement(By.xpath("//table[contains(@class, 'table-responsive')]/tbody/tr[7]/td[3]")).getText());
 	  System.out.println(driver.findElement(By.xpath("//table[contains(@class, 'table-responsive')]/tbody/tr[8]/td[3]")).getText());
 	  System.out.println(driver.findElement(By.xpath("//table[contains(@class, 'table-responsive')]/tbody/tr[9]/td[3]")).getText());
 	  System.out.println(driver.findElement(By.xpath("//table[contains(@class, 'table-responsive')]/tbody/tr[10]/td[3]")).getText());
 	  
 	  System.out.println("Print the first 10 values of 'User' coloumn :");
 	  
 	  System.out.println(driver.findElement(By.xpath("//table[contains(@class, 'table-responsive')]/tbody/tr[1]/td[8]")).getText());
 	  System.out.println(driver.findElement(By.xpath("//table[contains(@class, 'table-responsive')]/tbody/tr[2]/td[8]")).getText());
 	  System.out.println(driver.findElement(By.xpath("//table[contains(@class, 'table-responsive')]/tbody/tr[3]/td[8]")).getText());
 	  System.out.println(driver.findElement(By.xpath("//table[contains(@class, 'table-responsive')]/tbody/tr[4]/td[8]")).getText());
 	  System.out.println(driver.findElement(By.xpath("//table[contains(@class, 'table-responsive')]/tbody/tr[5]/td[8]")).getText());
 	  System.out.println(driver.findElement(By.xpath("//table[contains(@class, 'table-responsive')]/tbody/tr[6]/td[8]")).getText());
 	  System.out.println(driver.findElement(By.xpath("//table[contains(@class, 'table-responsive')]/tbody/tr[7]/td[8]")).getText());
 	  System.out.println(driver.findElement(By.xpath("//table[contains(@class, 'table-responsive')]/tbody/tr[8]/td[8]")).getText());
 	  System.out.println(driver.findElement(By.xpath("//table[contains(@class, 'table-responsive')]/tbody/tr[9]/td[8]")).getText());
 	  System.out.println(driver.findElement(By.xpath("//table[contains(@class, 'table-responsive')]/tbody/tr[10]/td[8]")).getText());
        
    }
    	@AfterMethod
        public void afterMethod() {
            //Close the browser
            driver.quit();
        }

      
      
    }
    

  

