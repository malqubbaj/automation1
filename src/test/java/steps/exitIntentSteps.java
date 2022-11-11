package steps;

import Base.baseUtil;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;

import static Base.baseUtil.driver;

public class exitIntentSteps {

    private baseUtil base;

    public exitIntentSteps(baseUtil base) {
        this.base = base;
    }

    @When("user places mouse cursor Text written and then moves it out of viewport")
    public void userPlacesMouseCursorTextWrittenAndThenMovesItOutOfViewport() {
        System.out.println("0----");
        Actions act = new Actions(driver);
        System.out.println("1----");
        //WebElement header = driver.findElement(By.xpath("//h3[normalize-space()='Exit Intent']"));
        System.out.println("2----");
        //act.moveToElement(header).perform();
        System.out.println("3----");
        //act.moveToElement(header).
        act.moveByOffset(600,-2).build().perform();
        //act.moveByOffset(0, -80).perform();
        System.out.println("4----");
    }

    @Then("user should see a pop up message appear")
    public void userShouldSeeAPopUpMessageAppear() {
        //Pop up message header text
        driver.findElement(By.xpath("//h3[normalize-space()='This is a modal window']")).isDisplayed();
        System.out.println("5----");
        //Pop up message content text
        driver.findElement(By.xpath("//div[@class='modal-body']//p[1]")).isDisplayed();
        System.out.println("6----");
    }

    @When("user clicks on close")
    public void userClicksOnClose() {
        System.out.println("7----");
        driver.findElement(By.xpath("//p[normalize-space()='Close']")).click();
        System.out.println("8----");
    }

    @Then("user should be back to homepage")
    public void userShouldBeBackToHomepage() {
        driver.findElement(By.className("example")).isDisplayed();
        System.out.println("9----");
    }
}
