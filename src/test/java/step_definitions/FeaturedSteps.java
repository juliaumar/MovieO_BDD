package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CommonPage;
import pages.FeaturedPage;
import utils.BrowserUtils;

public class FeaturedSteps implements CommonPage {
    FeaturedPage page;

    public FeaturedSteps() {
        page = new FeaturedPage();
    }


    @When("I click on the FEATURED link button on the top of the Home page")
    public void iClickOnTheFEATUREDLinkButtonOnTheTopOfTheHomePage() throws InterruptedException {
        page.featuredLink.click();
        Thread.sleep(2000);

    }
    @Then("I verify the title of the featured page {string}")
    public void iVerifyTheTitleOfTheFeaturedPage(String title) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), title);
        System.out.println(BrowserUtils.getDriver().getTitle());
    }
}

