import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {
    public static void main(String[] args) {
        // Set up the FirefoxDriver automatically using WebDriverManager
        WebDriverManager.firefoxdriver().setup();

        // Instantiate FirefoxDriver
        WebDriver driver = new FirefoxDriver();

        // Open a website
        driver.get("https://www.google.com");

        // Perform your test steps here
        System.out.println("Title of the page: " + driver.getTitle());

        // Quit the driver after the test
        driver.quit();
    }
}
