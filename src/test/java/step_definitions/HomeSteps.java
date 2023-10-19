package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.CommonPage;
import pages.HomePage;
import utils.BrowserUtils;

public class HomeSteps implements CommonPage {
    HomePage page;

    public HomeSteps() {
        page = new HomePage();

    }
    @Given("I open url of homepage")
    public void i_open_url_of_homepage() {
        BrowserUtils.getDriver();
    }

    @Then("Verify Title of Home page is {string}")
    public void verifyTitleOfHomePageIs(String title) {
        Assert.assertEquals(title, BrowserUtils.getDriver().getTitle());
    }
    @When("Click in the Browse Movies button")
    public void clickInTheBrowseMoviesButton() throws InterruptedException {
        BrowserUtils.click(page.browseMoviesBtn);
        Thread.sleep(3000);
    }

    @Then("Verify the Title of Browse Movies page is {string}")
    public void verifyTheTitleOfBrowseMoviesPageIs(String title) {
        Assert.assertEquals(title, BrowserUtils.getDriver().getTitle());
        System.out.println(BrowserUtils.getDriver().getTitle());
    }
    }
