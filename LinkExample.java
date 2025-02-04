import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class LinkExample
{
    WebDriver driver;

    @BeforeMethod
    public void openLinkTestPage(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/link.xhtml");
    }
@Test
    public void LinkTests(){
    //take me to dashboard
    WebElement homeLink = driver.findElement(By.linkText("Go to Dashboard"));
    homeLink.click();
    driver.navigate().back();


    //find my destination

    WebElement wheretoGo = driver.findElement(By.partialLinkText("Find the URL without clicking me."));
    String path = wheretoGo.getAttribute("href");
    System.out.println("this link is going to"+ path);


    //am I broken link`
     WebElement brokenLink =driver.findElement(By.linkText("Broken?"));
     brokenLink.click();

    String title =  driver.getTitle();
    if(title.contains("404")){
        System.out.println("the link is broken");
    }
    else{
        System.out.println("not broken");
    }
    driver.navigate().back();

    //Duplicate link

    WebElement homeLink1 = driver.findElement(By.linkText("Go to Dashboard"));
    homeLink1.click();
    driver.navigate().back();

    //count page links
    List<WebElement>  countfullpagelinks = driver.findElements(By.tagName("a"));
    int pageLinkCount = countfullpagelinks.size();
    System.out.println("count of full page links"+ pageLinkCount);

    // count layout links

    WebElement layoutElement = driver.findElement(By.className("layout-main-content"));
    List<WebElement> countOfLsyoutElement= layoutElement.findElements(By.tagName("a"));
    System.out.println("count of layout links"+ countOfLsyoutElement.size());


    }
}
