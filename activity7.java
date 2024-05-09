import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Actions;

public class activity7{
    public static void main(String[] args) {
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://v1.training-support.net/selenium/drag-drop");
        String title = driver.getTitle();
        System.out.println("Page titele:"+title);
        WebElement ball=driver.findElement(By.id("ball"));
        WebElement dropzone1=driver.findElement(By.id("dropzone1"));
        WebElement dropzone2=driver.findElement(By.id("dropzone2"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(ball).moveToElement(dropzone1).release().perform();
        if (dropzone1.getText().contains("Ball")) {
            System.out.println("Ball entered Dropzone 1 successfully.");
        } else {
            System.out.println("Failed to move the ball into Dropzone 1.");
        }
        actions.clickAndHold(ball).moveToElement(dropzone2).release().perform();

        if (dropzone2.getText().contains("Ball")) {
            System.out.println("Ball entered Dropzone 2 successfully.");
        } else {
            System.out.println("Failed to move the ball into Dropzone 2.");
        }








        WebElement button=driver.findElement(By.id("target"));
        button.click();

        // Perform testing and assertions


        // Close the browser
        // Feel free to comment out the line below
        // so it doesn't close too quickly
        driver.quit();
    }
}
