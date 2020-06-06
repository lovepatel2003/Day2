import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {
    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
        System.setProperty("webDriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://login.salesforce.com";

        driver.get(baseUrl);
        driver.manage().window().maximize();

        //driver.findElement(By.className("input")).sendKeys("xyz");
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("xyz");
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("xyz");
        driver.findElement(By.xpath("//*[@id='Login']")).click();

        String error_message_actual = driver.findElement(By.xpath("//*[@id='error']")).getText();
        String error_message_expected = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";

        Assert.assertEquals("Both strings are not equal", error_message_expected, error_message_actual);

    }
}
