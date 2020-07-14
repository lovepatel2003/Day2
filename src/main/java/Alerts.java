import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        // declaration and instant iation of objects/variables
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://rahulshettyacademy.com/AutomationPractice";

        driver.get(baseUrl);
        driver.manage().window().maximize();


        // ALERT PRACTICE
        /*String test = "Love";

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id='name']")).sendKeys("dhjfvdsjhf");
        driver.findElement(By.xpath("//*[@id='alertbtn']")).click();

        String testCheck = driver.switchTo().alert().getText();
        System.out.println(testCheck);

        if (testCheck.contains(test)){
            driver.switchTo().alert().accept();
        }
        else {
            System.out.println("Test not found");
        }

        // NEW TAB PRACTICE
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        driver.findElement(By.xpath("//*[@id='opentab']")).click();

        Thread.sleep(000);
        String newActualTitle = driver.getTitle();
        System.out.println(newActualTitle);

        Set<String> IDS= driver.getWindowHandles();
        System.out.println(IDS);

        Iterator<String> obj = IDS.iterator();
        String parentID = obj.next();
        System.out.println(parentID);

        String childID = obj.next();
        System.out.println(childID);

        driver.switchTo().window(childID);
        newActualTitle = driver.getTitle();
        System.out.println(newActualTitle);

        driver.switchTo().window(parentID);
        actualTitle = driver.getTitle();
        System.out.println(actualTitle);


        // NEW WINDOW PRACTICE
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        driver.findElement(By.xpath("//*[@id='openwindow']")).click();

        Thread.sleep(2000);
        String newActualTitle = driver.getTitle();
        System.out.println(newActualTitle);

        Set<String> IDS = driver.getWindowHandles();
        System.out.println(IDS);

        Iterator<String> obj = IDS.iterator();
        String parentID = obj.next();
        System.out.println(parentID);

        String childID = obj.next();
        System.out.println(childID);
        driver.switchTo().window(childID);

        driver.manage().window().maximize();


        // FRAMES PRACTICE
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");

        List<WebElement> test = driver.findElements(By.tagName("iframe"));
        System.out.println(test.size());
        //driver.findElement(By.xpath("/html/body/app-root/div/header/div[2]/div/div/div[2]/nav/div[2]/ul/li[2]/a")).click();

        driver.switchTo().frame(0);
        driver.findElement(By.xpath("/html/body/app-root/div/header/div[2]/div/div/div[2]/nav/div[2]/ul/li[2]/a")).click();

        driver.switchTo().parentFrame();
        driver.findElement(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul/li[2]/a")).click();*/




        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");

        List<WebElement> test2 = driver.findElements(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[2]"));
        System.out.println(test2);

        System.out.println(test2.get(0).findElements(By.tagName("a")).size());

        for (int i=0;i<test2.get(0).findElements(By.tagName("a")).size();i++){
            System.out.println(test2.get(0).findElements(By.tagName("a")).get(i).getText());
        }
    }
}
