import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SpiceJet {
    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
        System.setProperty("webDriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://www.spicejet.com";

        driver.get(baseUrl);
        driver.manage().window().maximize();

        //List<WebElement> dropdown_test = driver.findElements(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']']"));
        List<WebElement> dropdown_test = driver.findElements(By.name("ctl00_mainContent_ddl_originStation1_CTXT"));
        System.out.println(dropdown_test.size());

        //Select s = new Select(dropdown_test);

        //s.selectByVisibleText("Ahmedabad (AMD)");
        //s.selectByIndex(10);
    }
}