import org.openqa.selenium.By;

public class LoginPageElements {

    // Element Locators
    public By usernameField = By.xpath("//*[@id='lego-input-1']");
    public By passwordField = By.xpath("//*[@id='lego-input-2']");
    public By loginButton = By.xpath("/html/body/app-portal/app-login/standard-login/div/div/div[2]/div[1]/div/div[5]/div[1]/lego-button");
    //public By someElementAfterLogin = By.id("someElementId");  // You need to use the correct ID or another locator
}
