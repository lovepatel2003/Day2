import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
        System.setProperty("webDriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        driver.get(baseUrl);

        actualTitle = driver.getTitle();

        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }

        driver.findElement(By.name("userName")).sendKeys("xyz");
        driver.findElement(By.name("password")).sendKeys("xyz");

        driver.findElement(By.name("submit")).click();
        //driver.findElement()

        //close Fire fox
        //driver.close();

    }
}
