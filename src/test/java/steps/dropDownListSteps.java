package steps;

import Base.baseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class dropDownListSteps extends baseUtil {


    private baseUtil base;

    public dropDownListSteps(baseUtil base) {
        this.base = base;
    }



    @When("user clicks on the dropdown list options and chooses option {string}")
    public void userClicksOnTheDropdownListOptionsAndChoosesOption(String option) {

        driver.findElement(By.xpath("//select[@id='dropdown']")).click();

        driver.findElement(By.xpath("//option[@value='"+ option +"']")).click();

    }

    @Then("verifies that options {string} was chosen")
    public void verifiesThatOptionsWasChosen(String option) {

        driver.findElement(By.xpath("//option[@value='"+ option +"']")).isDisplayed();

    }




}
