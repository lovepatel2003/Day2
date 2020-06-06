import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class SpiceJet {
    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://www.spicejet.com";

        driver.get(baseUrl);
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
        driver.findElement(By.xpath("//*[@id='dropdownGroup1']/div/ul[1]/li[1]/a")).click();
        //Select s = new Select(dropdown_test);
        //s.selectByVisibleText("Ahmedabad (AMD)");
        //s.selectByIndex(10);
    }
}