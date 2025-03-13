import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest {

    private WebDriver driver;
    private LoginPage loginPage;

    @BeforeMethod
    public void setUp() {
        // Set up the FirefoxDriver automatically using WebDriverManager
        WebDriverManager.firefoxdriver().setup();

        // Instantiate the WebDriver
        driver = new FirefoxDriver();

        // Open the website
        driver.get("https://sunrise-uat.serviceurl.in/portal/?instId=9631#/login");

        // Maximize the window
        driver.manage().window().maximize();

        // Instantiate the LoginPage
        loginPage = new LoginPage();
    }

    @Test
    public void testLoginWithCredentials() throws InterruptedException {
        // Perform your test steps here
        System.out.println("Title of the page: " + driver.getTitle());

        // Wait for 2 seconds before entering the username
        Thread.sleep(2000);

        // Use the locators from the LoginPage object
        driver.findElement(loginPage.usernameField).sendKeys("SACHIN_INFINA");

        // Wait for 2 seconds before entering the password
        Thread.sleep(2000);

        // INPUT PASSWORD
        driver.findElement(loginPage.passwordField).sendKeys("Sachin@9922");

        // Wait for 15 seconds for any potential CAPTCHA or other delays
        Thread.sleep(15000);

        // Click on login button
        driver.findElement(loginPage.loginButton).click();

        // Adding a simple assertion to verify login attempt or some page element after login
        WebElement loginElement = driver.findElement(loginPage.someElementAfterLogin);  // Use the correct element here
        Assert.assertTrue(loginElement.isDisplayed(), "Login failed or page not loaded correctly.");
    }

    @AfterMethod
    public void tearDown() {
        // Quit the driver after the test
       // driver.quit();
    }
}
