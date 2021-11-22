package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTests {
    private WebDriver driver;
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        driver.manage().window().maximize();

//        List<WebElement> links = driver.findElements(By.tagName("a"));
//        System.out.println(links.size());

        //driver.findElement(By.linkText("Inputs")).click();
        driver.findElement(By.linkText("Shifting Content")).click();

        driver.findElement(By.linkText("Example 1: Menu Element")).click();

        List<WebElement> elements = driver.findElements(By.tagName("li"));
        System.out.println(elements.size());

        System.out.println(driver.getTitle());
        driver.quit();
    }

    public static void main(String[] args) {
        BaseTests test = new BaseTests();
        test.setUp();
    }
}
