package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage {

    @FindBy(name="order[bill_address_attributes][firstname]")
    WebElement firstname;

    @FindBy(name="order[bill_address_attributes][lastname]")
    WebElement lastname;

    @FindBy(name="order[bill_address_attributes][address1]")
    WebElement address1;

    @FindBy(id="order_bill_address_attributes_city")
    WebElement city;

    @FindBy(id="order_bill_address_attributes_state_id")
    WebElement state;

    @FindBy(name="order[bill_address_attributes][zipcode]")
    WebElement zipcode;

    @FindBy(id="order_bill_address_attributes_country_id")
    WebElement country;

    @FindBy(id="order_bill_address_attributes_phone")
    WebElement phone;

    @FindBy(id="save_user_address")
    WebElement unchkSaveAddress;

    @FindBy(name="commit")
    WebElement save;

    public CheckoutPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
    public void addBillingAddress(String firstname, String lastname, String address, String city,String state,String zipcode,String country, String phoneno)
    {
        this.firstname.sendKeys(firstname);
        this.lastname.sendKeys(lastname);
        this.address1.sendKeys(address);
        this.city.sendKeys(city);

        Select st=new Select(this.state);
        st.selectByVisibleText(state);

        this.zipcode.sendKeys(zipcode);

        Select cntry=new Select(this.country);
        cntry.selectByVisibleText(country);

        phone.sendKeys(phoneno);
        unchkSaveAddress.click();
        save.click();
    }
}

