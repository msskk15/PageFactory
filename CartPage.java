package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    @FindBy(id="checkout-link")
    WebElement checkout;

    public CartPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void clickCheckOut()
    {
        checkout.click();
    }


}

