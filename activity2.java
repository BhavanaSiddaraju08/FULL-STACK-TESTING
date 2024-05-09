import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class activity2 {
    public static void main(String[] args) {
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://v1.training-support.net/selenium/login-form");
        WebElement username =driver.findElement(By.id("username"));
        username.sendKeys("bhavana");
        WebElement password =driver.findElement(By.id("password"));
        password.sendKeys("lasi");
        WebElement button =driver.findElement(By.id("login"));
        button.click();


        driver.quit();
    }
}