package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {


    @FindBy(css="input[name='quantity']")
    WebElement quantity;

    @FindBy(id="add-to-cart-button")
    WebElement addToCart;

    @FindBy(css="td[class='lead']")
    WebElement total;

    public ProductPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    public void addProducttocart()
    {
        quantity.clear();
        quantity.sendKeys("1");
        addToCart.click();
    }
}
