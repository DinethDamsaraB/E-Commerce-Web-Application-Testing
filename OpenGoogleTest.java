
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenGoogleTest {

    @Test
    public void googleTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.lk/");
        driver.findElement(By.name("q")).sendKeys("colombo"+ Keys.ENTER);
        //driver.quit();
    }


}
