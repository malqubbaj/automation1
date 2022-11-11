package steps;

//Imports
import Base.baseUtil;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DefaultParameterTransformer;
import io.cucumber.java.Transpose;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.cucumberexpressions.Transformer;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.ArrayList;
import java.util.List;


public class LoginStep extends baseUtil {

    private baseUtil base;

    public LoginStep(baseUtil base) {
        this.base = base;
    }

    @Given("I navigate to the login page")
    public void iNavigateToTheLoginPage() {

        System.out.println("Navigate to login page");
        //base.driver.navigate().to("https://demosite.executeautomation.com/Login.html");
        base.driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
        base.driver.manage().window().maximize();
    }

    @And("I click login button")
    public void iClickLoginButton() {

        System.out.println("Click login button");

        base.driver.findElement(By.className("button")).click();


    }

    @And("I enter the following for login")
    public void iEnterTheFollowingForLogin(DataTable table) {

        List<List<String>> user = table.cells();

        base.driver.findElement(By.name("username")).sendKeys(user.get(1).get(0));
        base.driver.findElement(By.name("password")).sendKeys((user.get(1).get(1)));

    }

    @Then("I should see userform page")
    public void iShouldSeeUserformPage() {

        System.out.println("I should see user form page");
        base.driver.findElement(By.className("title")).isDisplayed();

    }



/* for databale with one scenario
    @And("I enter the following for login")
    public void iEnterTheTheFollowingForLogin(DataTable table) {

        List<List<String>> data = table.cells();//we use this instead of raw
        System.out.println("The user namename is " + data.get(1).get(0));

        System.out.println("The password is " + data.get(1).get(1));


    }

 */


}



//old trial and error

        /*
        //Create an Array list
        List<ConsUser> users = new ArrayList<ConsUser>();

        //Store all the users
        users = table.asList(ConsUser.class);

        for (ConsUser user : users) {
            System.out.println("The Username is " + user.username);
            System.out.println("The Password is " + user.password);
        }

    }

    public class ConsUser {
        private String username;
        private String password;

        public ConsUser(String userName, String passWord) {
            username = userName;
            password = passWord;
        }

    }
*/
//this is the old way we did when we didn't use a datatable
//feature file text was And I enter the username as "admin" and the password as "adminpassword" //
 /*   @And("I enter the username as {string} and password as {string}")
    public void iEnterTheUsernameAsAndPasswordAs(String username, String password) {

        System.out.println("Username is " + username + " and password is " + password);
    }*/


/*  For scenario outline. with more than one data table data
  @And("I enter ([^\"]*) and ([^\"]*)$")
    public void iEnterUsernameAndPassword(String userName, String passWord) {

        for ( userName : userName)
        System.out.println("The Username is " + userName);
        System.out.println("The Username is " + passWord);
    }

 */