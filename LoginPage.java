package PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;


public class LoginPage {
    WebDriver driver;


    @FindBy(css="input[id='spree_user_email']")
    WebElement email;

    @FindBy(id= "spree_user_password")
    WebElement pwd;

    @FindBy(css="input[data-disable-with=\"Login\"]")
    WebElement buttonLogin;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void login(String userEmail, String password) {
        email.sendKeys(userEmail);
        pwd.sendKeys(password);
        buttonLogin.click();
    }
}








