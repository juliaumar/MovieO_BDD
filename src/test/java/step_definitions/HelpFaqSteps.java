package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.CommonPage;
import pages.HelpFaqPage;
import utils.BrowserUtils;

import java.awt.*;
import java.util.Set;



public class HelpFaqSteps implements CommonPage {

    HelpFaqPage page;

    public HelpFaqSteps(){
        page = new HelpFaqPage();

    }
    @When("I click on {string} button")
    public void iClickOnButton(String btn) throws InterruptedException, AWTException {

        BrowserUtils.click(page.infoBtn);
        Thread.sleep(3000);

    }
    @And("I click on the {string} button")
    public void iClickOnTheButton(String arg0) throws AWTException, InterruptedException {
        BrowserUtils.getDriver().findElement(By.xpath("(//div[text()='Help/FAQ'])[1]")).click();
        Thread.sleep(3000);
    }
    @And("I click on {string}")
    public void iClickOn(String btn) throws InterruptedException {

        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT_CONTAINS, btn))));
            Thread.sleep(5000);

        System.out.println(BrowserUtils.getDriver().getTitle());
BrowserUtils.switchToNewWindow();

       //   BrowserUtils.click(page.takeListsTourBtn);
//Thread.sleep(5000);
          //  System.out.println(BrowserUtils.getDriver().getTitle());
        }

    @Then("Verify {string} of that pages")
    public void verifyOfThatPages(String title) {
        System.out.println(BrowserUtils.getDriver().getTitle());
BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), title);

    }



    }

