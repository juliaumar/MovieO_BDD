package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class BrowseListsPage {

    public BrowseListsPage() {
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }

    @FindBy(xpath = "(//div[@class='sub-txt m-hide'])[2]")
    public WebElement browseListsBtn;
}
