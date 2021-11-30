package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoryPage {


 //   WebDriver driver;
    @FindBy(css = "a[href='/t/bags']")
    WebElement category;
    @FindBy (css="span[title='Ruby on Rails Tote']")
    WebElement Bags;

    public CategoryPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    public void selectCategory()
    {
        category.click();
    }
    public void selectProduct()
    {
        Bags.click();
    }


}
