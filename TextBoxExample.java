import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextBoxExample {


    WebDriver driver;

    @BeforeMethod
    public void openLinkTestPage() throws InterruptedException {
        ChromeOptions chromeOptions= new ChromeOptions();
        chromeOptions.setBrowserVersion("123");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/input.xhtml");
        Thread.sleep(3000);
    }

    @Test
    public  void textBoxTests(){

        //Type your name

        WebElement name = driver.findElement(By.id("j_idt88:name"));
        name.sendKeys("Dineth Damsara");

        //Append country to the city
        WebElement appendText= driver.findElement(By.id("j_idt88:j_idt91"));
        appendText.sendKeys("India");


        //verify text box is desabled
        boolean enabled =driver.findElement(By.name("j_idt88:j_idt91")).isEnabled();
        System.out.println("is text box enebled" + enabled);

        //clear the typed text

        WebElement clearText =driver.findElement(By.xpath("//*[@id='j_idt88:j_idt95']"));
        clearText.clear();

        //Retrive the typed text
        WebElement textElement=driver.findElement(By.id("j_idt88:j_idt91"));
        String value=textElement.getAttribute("value");
        System.out.println(value);

        //Type email and tab. Confirm control moved to next element.
        driver.findElement(By.id("j_idt88:j_idt99")).sendKeys("dinethdamsarab@gmail.com"+ Keys.TAB+"Confirm control moved to next element.");

    }

}
