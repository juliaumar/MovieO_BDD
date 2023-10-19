package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.List;

public class HomePage {

    @FindBy(xpath = "//*[@data-gtm-location='left nav']")
    public List<WebElement> list;
    @FindBy(xpath = "/html//a[@id='nav-pl-movie']")
    public WebElement browseMoviesBtn;

    public HomePage() {
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }

}
