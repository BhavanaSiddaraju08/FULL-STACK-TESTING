import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class test6 {
    // Declare the WebDriver object
    static WebDriver driver;

    @BeforeClass
    public static void beforeClass() {

        System.out.println("before class is executed");
    }
    @BeforeSuite
    public static void beforeSuite(){
        System.out.println("before suite is executed");

    }
    @AfterClass
    public static void  afterClass(){
        System.out.println("After class is executed");
    }

    @AfterSuite
    public static void afterSuite(){
        System.out.println("After suite is executed");

    }
    @BeforeGroups
    public static void beforeGroups(){
        System.out.println("before group is executed");

    }
    @Test
    public static void test(){
        System.out.println("Test is executed");

    }
    @BeforeTest
    public static void beforeTest(){
        System.out.println("BeforeTest is executed");

    }
    @AfterTest
    public static void afterTest(){
        System.out.println("AfterTest is executed");

    }
    @BeforeMethod
    public static void beforeMethod() {
        System.out.println("beforeMethod is executed");
    }
    @AfterMethod
    public static void afterMethod() {
        System.out.println("AfterMethosis executed");
    }





    }