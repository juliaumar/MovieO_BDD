package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BrowseListsPage;
import utils.BrowserUtils;

public class BrowserListsSteps {
    BrowseListsPage page;

    public BrowserListsSteps() {
        page = new BrowseListsPage();
    }

    @When("I click on Browse Lists button")
    public void iClickOnBrowseListsButton() {


        BrowserUtils.click(page.browseListsBtn);
    }

    @Then("Verify the title of Browse Lists page is {string}")
    public void verifyTheTitleOfBrowseListsPageIs(String Title) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), Title);
        System.out.println(BrowserUtils.getDriver().getTitle());
    }
}
