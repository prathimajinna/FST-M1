package activities;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Activity_10_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        Actions actions = new Actions(driver);
        String pressedKeyText1;
        String pressedKeyText2;

        //Open browser
        driver.get("https://www.training-support.net/selenium/input-events");
        WebElement pressedKey = driver.findElement(By.id("keyPressed"));
        
        //Create action sequence for initials
        org.openqa.selenium.interactions.Action actionSequence1 = actions.sendKeys("P").build();
        actionSequence1.perform();
        pressedKeyText1 = pressedKey.getText();
        System.out.println("Pressed key is: " + pressedKeyText1);
        
        Thread.sleep(2000);
        
        
        //Create action sequence for Spacebar
        org.openqa.selenium.interactions.Action actionSequence2 = actions
                .keyDown(Keys.CONTROL)
                .sendKeys("a")
                .sendKeys("c")
                .keyUp(Keys.CONTROL)
                .build();
        actionSequence2.perform();
        pressedKeyText2 = pressedKey.getText();
        System.out.println("Pressed key is: " + pressedKeyText2);

        //Close browser
        driver.close();
    }
}