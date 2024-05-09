
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class activity777 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/drag-drop");
        WebElement x= driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
        WebElement yy= driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
        WebElement yyy= driver.findElement(By.xpath("//*[@id=\"dropzone2\"]"));
        new Actions(driver)
                .sendKeys(("s"))
                .keyDown(Keys.CONTROL)
                .sendKeys("a")
                .keyDown(Keys.CONTROL)
                .sendKeys("c")
                .dragAndDrop(x,yy)
                .dragAndDrop(x,yyy)
                .perform();
        if (yy.getText().contains("Dropped")){
            System.out.println("Dropped on left");
        }
        if (yyy.getText().contains("Dropped")){
            System.out.println("Dropped on right");
        }
        driver.quit();
    }
}