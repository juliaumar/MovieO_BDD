package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BrowseListsPage;
import utils.BrowserUtils;


public class BrowserListsSteps {
    BrowseListsPage page;

    public BrowserListsSteps() {
        page = new BrowseListsPage();
    }

    @When("I click on Browse Lists button")
    public void iClickOnBrowseListsButton() throws InterruptedException {
        BrowserUtils.click(page.browseListsBtn);
Thread.sleep(3000);
    }

    @Then("Verify the url of Browse Lists page is {string}")
    public void verifyTheUrlOfBrowseListsPageIs(String url) {
        /**
         * create a method to wait for a text to contain certain string
         * Example: wait for current url to contain a string "trending"
         * BrowserUtils.waitForTextToBePresentOnPage()
         * BrowserUtils.waitForUrlToContainText()
         */
       // BrowserUtils.assertEquals(BrowserUtils.getDriver().getCurrentUrl(), url);

    }

    @Then("Verify the title of Browse Lists page is {string}")
    public void verifyTheTitleOfBrowseListsPageIs(String title) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), title);
        System.out.println("Current title is: " + BrowserUtils.getDriver().getTitle());
    }
}
