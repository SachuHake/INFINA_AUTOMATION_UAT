import io.github.bonigarcia.wdm.WebDriverManager;
import net.sourceforge.tess4j.TesseractException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.util.ImageHelper;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class OpenBrowser {
    public static void main(String[] args) throws InterruptedException, IOException, TesseractException {
        // Set up the FirefoxDriver automatically using WebDriverManager
        WebDriverManager.firefoxdriver().setup();

        // Instantiate FirefoxDriver
        WebDriver driver = new FirefoxDriver();

        // Open a website
        driver.get("https://sunrise-uat.serviceurl.in/portal/?instId=9631#/login");

        // Maximize the window
        driver.manage().window().maximize();

        // Perform your test steps here
        System.out.println("Title of the page: " + driver.getTitle());

        // Wait for 2 seconds before entering the username
        Thread.sleep(2000);

        // Input username
        driver.findElement(By.xpath("//*[@id=\"lego-input-1\"]")).sendKeys("SACHIN_INFINA");

        // Wait for 2 seconds before entering the password
        Thread.sleep(2000);

        // INPUT PASSWORD
        driver.findElement(By.xpath("//*[@id=\"lego-input-2\"]")).sendKeys("Sachin@9922");

        // Wait for 2 seconds before entering the password
        Thread.sleep(15000);

        // Enter the CAPTCHA text into the CAPTCHA field
        //driver.findElement(By.xpath("//*[@id=\"lego-input-4\"]")).sendKeys();

        //Click on login button
        driver.findElement(By.xpath("/html/body/app-portal/app-login/standard-login/div/div/div[2]/div[1]/div/div[5]/div[1]/lego-button"))
                .click();

        // Quit the driver after the test
        //driver.quit();
    }
}
