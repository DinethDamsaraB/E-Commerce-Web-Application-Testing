import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ButtonExample {

    WebDriver driver;

    @BeforeMethod
    public void openLinkTestPage() {
        driver = new ChromeDriver();
        Dimension newSize= new Dimension(800,600);
        driver.manage().window().setSize(newSize);
//        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/button.xhtml");

    }
        @Test

                public void buttonTests(){

        //click and confirm title
            driver.findElement(By.xpath("//button[@id='j_idt88:j_idt90']")).click();
            String expectedtitle ="Dashboard";
            String actualTitle =driver.getTitle();
//            if(expectedtitle.equals(actualTitle)) {
//                System.out.println("actual title is same as expected title");
//            }
//            else {
//                System.out.println("actual title is not same as expected title");
//            }
            Assert.assertEquals(actualTitle,expectedtitle,"Title miss matched");

            //find the position of the sunmit button

            driver.navigate().back();
            WebElement getPosition = driver.findElement(By.id("j_idt88:j_idt94"));
            Point xypoint=getPosition.getLocation();
            int x =xypoint.getX();
            int y =xypoint.getY();
            System.out.println("X position is :"+x+"Y position is"+ y);

            //Find the save button color
            WebElement buttonCcolour=driver.findElement(By.id("j_idt88:j_idt96"));
            String color=buttonCcolour.getCssValue("background-color");
            System.out.println("button color is"+ color);
            // find the gight and width of the button

            WebElement size =driver.findElement(By.id("j_idt88:j_idt98"));
           int hight= size.getSize().getHeight();
           int width =size.getSize().getWidth();
            System.out.println("height"+hight+"width"+width);





        }

        }

