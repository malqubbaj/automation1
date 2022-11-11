package steps;

import Base.baseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import static Base.baseUtil.driver;

public class keyPressesSteps extends baseUtil {

    private baseUtil base;

    public keyPressesSteps(baseUtil base) {
        this.base = base;
    }



    @When("user presses keyboard keys inside of the empty field and checks if confirmation message")
    public void userPressesKeyboardKeysInsideOfTheEmptyFieldAndChecksIfConfirmationMessage() {
        //TAB
        //var x = Keys.TAB;
        driver.findElement(By.id("target")).sendKeys(Keys.TAB);
        driver.findElement(By.id("result")).isDisplayed();
        driver.findElement(By.id("result")).isDisplayed();
        System.out.println("TAB - Pass");

        //ENTER
        driver.findElement(By.id("target")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("result")).isDisplayed();

        System.out.println("ENTER - Pass");

        //ESC
        driver.findElement(By.id("target")).sendKeys(Keys.ESCAPE);
        driver.findElement(By.id("result")).isDisplayed();

        System.out.println("ESCAPE - Pass");

        //SPACE
        driver.findElement(By.id("target")).sendKeys(Keys.SPACE);
        driver.findElement(By.id("result")).isDisplayed();

        System.out.println("SPACE - Pass");

        //ARROW DOWN
        driver.findElement(By.id("target")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("result")).isDisplayed();

        System.out.println("ARROW DOWN - Pass");
        //SHIFT
        driver.findElement(By.id("target")).sendKeys(Keys.SHIFT);
        driver.findElement(By.id("result")).isDisplayed();

        System.out.println("SHIFT - Pass");

    }



   /* @Then("user checks if confirmation message appears")
    public void userChecksIfConfirmationMessageAppears() {
    }*/

 /*   @When("user presses ([^\"]*) inside of the empty field")
    public void userPressesInsideOfTheEmptyField(Keys x) {

        driver.findElement(By.id("target")).sendKeys(x);
        driver.findElement(By.id("result")).isDisplayed();
        driver.findElement(By.id("result")).isDisplayed();
        System.out.println("TAB - Pass");



    }*/

  /*  @When("user presses {string} inside of the empty field")
    public void userPressesInsideOfTheEmptyField(Keys x) {

        driver.findElement(By.id("target")).sendKeys(x);
        driver.findElement(By.id("result")).isDisplayed();
        driver.findElement(By.id("result")).isDisplayed();
        System.out.println("TAB - Pass");
    }*/
}
