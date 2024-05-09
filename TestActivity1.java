import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestActivity1 {

        public static void main(String[] args) {
            WebDriverManager.firefoxdriver().setup();
            WebDriver driver = new FirefoxDriver();


            driver.get("https://www.google.com/");
            driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("cheese");
            driver.findElement(By.xpath("//*[@id=\"result-stats\"]")).click();
            WebElement result = driver.findElement(By.xpath("//*[@id=\"result-stats\"]"));
            System.out.println(result.getText());
            driver.quit();
        }

    }

