import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Actions;

public class activity6 {
    public static void main(String[] args) {
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://v1.training-support.net/selenium/input-events");
        String title = driver.getTitle();
        System.out.println("Training Support");
        String pageSource=driver.getPageSource();
        System.out.println("Page Source");
        System.out.println(pageSource);

        Actions actions=new Actions(driver);

        actions.sendKeys(Keys.SHIFT,"A");

        actions.sendKeys(Keys.CONTROL,"a");
        actions.sendKeys(Keys.CONTROL,"c");

        actions.build().perform();

        WebElement button=driver.findElement(By.id("target"));
        button.click();


        driver.quit();
    }
}
