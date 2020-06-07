/*import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SpiceJet {
    public static void main(String[] args) throws InterruptedException {
        // declaration and instantiation of objects/variables
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://www.spicejet.com";

        driver.get(baseUrl);
        driver.manage().window().maximize();

        //Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
        //driver.findElement(By.xpath("//a[@value='AMD']")).click();
        //Select s = new Select(dropdown_test);
        //s.selectByVisibleText("Ahmedabad (AMD)");
        //s.selectByIndex(10);

        //Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Actions a = new Actions(driver);
        a.moveToElement(driver.findElement(By.id("familyandfriend"))).click().build().perform();

        if (driver.findElement(By.id("familyandfriend")).isSelected()){
            driver.findElement(By.id("familyandfriend")).click();
        }
        else{

        }


        driver.findElement(By.cssSelector("#familyandfriend")).click();
        driver.findElement(By.cssSelector("div[id='familyandfriend']")).click();
        driver.findElement(By.cssSelector("div#familyandfriend")).click();

        //driver.findElement(By.cssSelector("div.fleft")).click();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
}*/