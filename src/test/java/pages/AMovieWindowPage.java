package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class AMovieWindowPage {

    public AMovieWindowPage(){
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }
 @FindBy(id = "nav-pl-movie")
    public WebElement browseMoviesBtn;

    @FindBy(xpath = "//div[@data-id='409931']")
    public WebElement firstMovie;

    @FindBy(xpath = "//span[text()='Comments']")
    public WebElement commentField;

}
