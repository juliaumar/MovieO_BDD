package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class BrowseListsPage {

    public BrowseListsPage() {
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }

    @FindBy(xpath = "//a[@id='nav-pl-list']")
    public WebElement browseListsBtn;

//    @FindBy(xpath = "//body[@id='lists_index']")
//    public WebElement browseListsPage;
//
////    @FindBy(xpath = "//a[@id='nav-pl-movie']")
////    public WebElement browseMoviesPage;
//
//
//    @FindBy(xpath = "//a[text()='Start Exploring'])[1]")
//    public WebElement startExploring;
//    @FindBy(xpath = "//div[@class='button new-list open-login-js m-hide']")
//    public WebElement createAList;
}
