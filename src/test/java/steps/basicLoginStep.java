package steps;

import Base.baseUtil;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;


public class basicLoginStep extends baseUtil {

private baseUtil base;


    public basicLoginStep(baseUtil base) {
        this.base = base;
    }


    @And("user enters the following given credentials")
    public void userEntersTheFollowingGivenCredentials(DataTable table) {

        List<List<String>> data = table.cells();

        String url = "https://" + data.get(1).get(0) + ":" + data.get(1).get(1) + "@" + "the-internet.herokuapp.com/basic_auth";
        base.driver.get(url);

        //base.driver.navigate("https://" + data.get(1).get(0) + ":" + data.get(1).get(1) + "@" + "the-internet.herokuapp.com/basic_auth");

    }

    @And("user click on the login on button")
    public void userClickOnTheLoginOnButton() {
    }

    @Then("user should see confirmation page")
    public void userShouldSeeConfirmationPage() {

        base.driver.findElement(By.className("example")).isDisplayed();

    }
}
