import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class javaScriptExecuterExample {
    WebDriver driver;

    @BeforeMethod
    public void openJsExecuterPage(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/link.xhtml");

    }

    @Test

    public void jsExecuterTests(){
        JavascriptExecutor jsExecuter = (JavascriptExecutor) driver;
        jsExecuter.executeScript("alert('welcome to selenium...');");

        WebElement inputNameTextBox = driver.findElement(By.xpath(""));
    }
}
