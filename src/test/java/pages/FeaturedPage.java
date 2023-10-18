package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.List;
import java.util.Set;


public class FeaturedPage {
    public  FeaturedPage() {
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }

    @FindBy(id = "nav-pl-featured")
    public WebElement featuredLink;

    @FindBy(xpath = "//*[contains(text(), 'Oscar Winner Movies 2016')]")
    public WebElement oscarWinnerMovies2016;




        }











//  @FindBy(xpath = "//*[@data-gtm-location='left nav']")
//    public List<WebElement> list;