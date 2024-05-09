

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import subtest9.dataprovider;

import java.time.Duration;

public class test9 {
    WebDriver driver;

    @BeforeClass
    public void beforeMethod() {
        // Set up the Firefox driver
        WebDriverManager.firefoxdriver().setup();
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://v1.training-support.net/selenium/simple-form");

    }



    @Test(dataProvider = "Authentication",dataProviderClass = dataprovider.class)

    public void test(String firstname, String lastname,String email, String number,String message)
    {
        WebElement fname=driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
        new Actions(driver)
                .click(fname)
                .sendKeys(firstname)
                .sendKeys(Keys.TAB)
                .sendKeys(lastname)
                .sendKeys(Keys.TAB)
                .sendKeys(email)
                .sendKeys(Keys.TAB)
                .sendKeys(number)
                .sendKeys(Keys.TAB)
                .sendKeys(message)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .sendKeys(Keys.TAB)
                .perform();

    }
}