package steps;

import Base.baseUtil;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import java.util.List;

public class LoginPageSteps extends baseUtil {

    public baseUtil base;

    public LoginPageSteps(baseUtil base) {
        this.base = base;
    }



    @When("user enters the right credentials")
    public void userEntersTheRightCredentials(DataTable table) {

        List<List<String>> credentials = table.cells();

        base.driver.findElement(By.id("username")).sendKeys(credentials.get(1).get(0));
        base.driver.findElement(By.id("password")).sendKeys(credentials.get(1).get(1));


    }

    @And("submits")
    public void submits() {

        base.driver.findElement(By.className("radius")).click();

        System.out.println("user submits");
    }

    @Then("user should see if the credentials used are correct and logs out")
    public void userShouldSeeIfTheCredentialsUsedAreCorrectAndLogsOut() {

        base.driver.findElement(By.id("flash")).isDisplayed();

        base.driver.findElement(By.cssSelector(".subheader")).isDisplayed();

        base.driver.findElement(By.cssSelector(".button.secondary.radius")).click();

        System.out.println("user logs out");


    }

    @When("user enters {string} and {string} as wrong credentials")
    public void userEntersAndAsWrongCredentials(String username, String password) {

        base.driver.findElement(By.id("username")).sendKeys(username);
        base.driver.findElement(By.id("password")).sendKeys(password);

    }

    @And("submits wrong form")
    public void submitsWrongForm() {

        base.driver.findElement(By.className("radius")).click();

        System.out.println("user submits");

    }

    @Then("checks if the right error message appears")
    public void checksIfTheRightErrorMessageAppears() {

        base.driver.findElement(By.id("flash")).isDisplayed();

        base.driver.findElement(By.id("username")).isDisplayed();


    }









    /*
    @And("user should see if the credentials used are correct and logs out")
    public void userShouldSeeIfTheCredentialsUsedAreCorrectAndLogsOut() {

        base.driver.findElement(By.className("flash success")).isDisplayed();
        base.driver.findElement(By.className("subheader")).isDisplayed();
        System.out.println("checks the headers");

        //Logout
        base.driver.findElement(By.className("button secondary radius")).click();
        System.out.println("logs out");
        base.driver.findElement(By.id("username")).isDisplayed();
        System.out.println("navigates back to first page");


    }

*/
}
