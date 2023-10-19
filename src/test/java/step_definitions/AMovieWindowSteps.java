package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.AMovieWindowPage;
import pages.CommonPage;
import utils.BrowserUtils;

import static pages.CommonPage.XPATH_TEMPLATE_TEXT_CONTAINS;

public class AMovieWindowSteps implements CommonPage {
    AMovieWindowPage page;

    public AMovieWindowSteps() {
        page = new AMovieWindowPage();
    }

    @When("I click on Browse Movies button")
    public void i_click_on_browse_movies_button() throws InterruptedException {
        BrowserUtils.click(page.browseMoviesBtn);
        //Thread.sleep(3000);
    }

    @And("I click on first movie window")
    public void iClickOnFirstMovieWindow() {
        BrowserUtils.click(page.firstMovie);

    }

    @And("I click on comment field")
    public void iClickOnCommentField() throws InterruptedException {
        BrowserUtils.click(page.commentField);
        Thread.sleep(3000);

    }

    @And("I click on Share your thoughts field")
    public void iClickOnShareYourThoughtsField() throws InterruptedException {
        BrowserUtils.getDriver().findElement(By.xpath("//textarea[@class='full-width open-login-js']")).click();
        Thread.sleep(5000);
    }

    @Then("Verify {string} is displayed")
    public void verifyIsDisplayed(String text) {
        BrowserUtils.isDisplayed(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT, text))));

    }
}
