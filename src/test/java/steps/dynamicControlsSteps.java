package steps;

import Base.baseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Base.baseUtil.driver;

public class dynamicControlsSteps {

    private baseUtil base;

    public dynamicControlsSteps(baseUtil base) {
        this.base = base;
    }

    @Then("user verifies that controls {string} subheaders are showing")
    public void userVerifiesThatControlsSubheadersAreShowing(String subHeaders) {
        System.out.println("0------");
        driver.findElement(By.xpath("//h4[normalize-space()='" + subHeaders + "']")).isDisplayed();
        System.out.println("1------");
    }

    @When("user checks checkbox")
    public void userChecksCheckbox() {
        System.out.println("2------");
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        System.out.println("3------");
    }

    @When("user clicks on {string} button")
    public void userClicksOnButton(String actionButton) {

        System.out.println("4------");
        driver.findElement(By.xpath("//button[normalize-space()='" + actionButton +"']")).click();
        System.out.println("5------");

    }

    @Then("waits for action to be done")
    public void waitsForActionToBeDone() {
        System.out.println("6------");
        Duration times = Duration.ofSeconds(10);
        System.out.println("7------");
        WebDriverWait wait = new WebDriverWait(driver,times);
        System.out.println("8------");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
        System.out.println("9------");

    }

    @And("verifies that the action was executed and confirmation message is present")
    public void verifiesThatTheActionWasExecutedAndConfirmationMessageIsPresent() {
        System.out.println("10------");
        driver.findElement(By.xpath("//p[@id='message']")).isDisplayed();


    }

    @And("verifies that the check box is back and confirmation message is present")
    public void verifiesThatTheCheckBoxIsBackAndConfirmationMessageIsPresent() {
        System.out.println("11------");
        driver.findElement(By.xpath("//div[normalize-space()='A checkbox']")).isDisplayed();
        driver.findElement(By.xpath("//p[@id='message']")).isDisplayed();

    }


    @And("writes {string} in the enabled empty field")
    public void writesInTheEnabledEmptyField(String text) {
        System.out.println("12 send keys------");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys(text);
        System.out.println("12 send keys------");


    }
}
