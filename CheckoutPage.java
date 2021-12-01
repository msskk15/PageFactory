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

    @FindBy(css="input[id='order_bill_address_attributes_address1']")
    WebElement address1;

    @FindBy (css ="input[id='order_bill_address_attributes_address2']")
    WebElement address2;

    @FindBy(id="order_bill_address_attributes_city")
    WebElement cityName;

    @FindBy(id="order_bill_address_attributes_state_id")
    WebElement state;

    @FindBy(name="order[bill_address_attributes][zipcode]")
    WebElement zipCodeNumber;

    @FindBy(id="order_bill_address_attributes_country_id")
    WebElement country;

    @FindBy(id="order_bill_address_attributes_phone")
    WebElement phoneNumber;

    @FindBy(id="save_user_address")
    WebElement unchkSaveAddress;

    @FindBy(id="order_use_billing")
    WebElement chkBillingAddress;

    @FindBy (css = "input[data-disable-with='Save and Continue']")
    WebElement SaveAndContinue;

   // @FindBy(name="commit")
    //WebElement save;

    public CheckoutPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
    public void addBillingAddress(String fname , String lname , String add1 , String add2 ,
                                  String city, String zipCode, String phoneNum){
        firstname.sendKeys(fname);
        lastname.sendKeys(lname);
        address1.sendKeys(add1);
        address2.sendKeys(add2);
        cityName.sendKeys(city);
        country.click();
        country.sendKeys("California");
        zipCodeNumber.sendKeys(zipCode);
        phoneNumber.sendKeys(phoneNum);
        SaveAndContinue.click();


    }
}

