import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.*;

public class test7{
    WebDriver driver;
    @BeforeTest
    public void beforeMethod() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/login-form");
    }


    @Test
    @Parameters({"sUsername", "sPassword"})
    public void test(String sUsername,String sPassword){
        WebElement usernameField = driver.findElement(By.xpath("//*[@id=\"username\"]"));

        usernameField.sendKeys(sUsername);
        WebElement passwordField = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        passwordField.sendKeys(sPassword);
        WebElement loginbutton = driver.findElement(By.cssSelector("button[type = 'submit']"));
        loginbutton.click();

    }
    @AfterMethod
    public void teardown() {
        if (driver!= null) {
            driver.close();
        }
    }

}



