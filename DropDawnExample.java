import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class DropDawnExample {

    WebDriver driver;

    @BeforeMethod
    public void dropDawnTestPage(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Test

    public void leafgroundpageDropDawnTest() throws InterruptedException {

        //ways to selecct basic dropdawns
        driver.get("https://www.leafground.com/select.xhtml");
        WebElement dropDawn =driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
        Select select = new Select(dropDawn);
        select.selectByIndex(1);
        Thread.sleep(3000);
        select.selectByVisibleText("Playwright");
        Thread.sleep(3000);



        //Get the number of dropdawn options
         //generics
        List<WebElement> listoptions =select.getOptions();
        int size = listoptions.size();
        System.out.println("Number of elements in the dropdawn"+ size);

        for (WebElement element:listoptions){
            System.out.println(element.getText());

        }
        //using sendkeys select dropdawn value
        dropDawn.sendKeys("Puppeteer");
        Thread.sleep(3000);


        //selecting the bootsrap dropdawn

        WebElement dropdawn2= driver.findElement(By.xpath("//div[@id='j_idt87:country']"));
        dropdawn2.click();
        List<WebElement>  listofdripdawn2values =driver.findElements(By.xpath("//ul[@id='j_idt87:country_items']/li"));
        for (WebElement element :listofdripdawn2values){
            String dropDawnValue =element.getText();
            if(dropDawnValue.equals("USA")){
                element.click();
                break;
            }
        }

        //google search-pick a value from suggestions


    }
    //google search-pick a value from suggestions
    // @Test
    public void googleSearchDropDawn() throws InterruptedException {
        driver.get("https://www.google.lk/");
        driver.findElement(By.name("q")).sendKeys("palitha");
        Thread.sleep((2000));
        List<WebElement> googleSearchList=driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@class='wM6W7d WggQGd']"));
        System.out.println(googleSearchList.size());
        for (WebElement element:googleSearchList){
            System.out.println(element.getText());
        }

    }
    //handle hidden auto suggestions drop dawn and search using dom debugger trick



}
