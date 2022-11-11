package steps;

import Base.baseUtil;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static Base.baseUtil.HOME_PAGE;
import static Base.baseUtil.driver;

public class floatingMenuSteps {

    private baseUtil base;

    public floatingMenuSteps(baseUtil base) {
        this.base = base;
    }

    @When("user clicks on {string}")
    public void userClicksOn(String menuItem) {

        driver.findElement(By.xpath("//a[normalize-space()='" + menuItem + "']")).click();


    }

    @Then("user checks url to see {string} was added there")
    public void userChecksUrlToSeeWasAddedThere(String menuItem) {
        String userUrl = HOME_PAGE + "floating_menu#" + menuItem;

        System.out.println(userUrl);
        System.out.println(driver.getCurrentUrl());

        if (userUrl.equals(driver.getCurrentUrl())) {

            System.out.println("Pass");

        } else {

            System.out.println("Fails");

        }
    }
}
