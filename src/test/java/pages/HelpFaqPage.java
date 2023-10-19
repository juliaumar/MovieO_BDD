package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.List;

public class HelpFaqPage {

    public HelpFaqPage() {
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='more-cont dr-parent on-hover']")
    public WebElement infoBtn;


    @FindBy(xpath = "(//div[text()='Help/FAQ'])[1]")
    public WebElement helpFaqBtn;
    @FindBy(xpath = "//div[@class='block modal-trigger']")
    public List<WebElement> listOfBtns;

    @FindBy(xpath = "//div[@class='button']")
    public WebElement takeMoviesTourBtn;

    @FindBy(xpath = "//div[@class='button open-login-js']")
    public WebElement takeListsTourBtn;
}
