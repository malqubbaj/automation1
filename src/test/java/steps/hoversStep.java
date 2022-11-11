package steps;

import Base.baseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import static Base.baseUtil.HOME_PAGE;
import static Base.baseUtil.driver;

public class hoversStep {

    private baseUtil base;

    public hoversStep(baseUtil base) {
        this.base = base;
    }

    //Used by all other steps files
    @Given("user navigates to wanted site {string}")
    public void usersNavigatesToWantedSite(String url) {

        base.setNavigate(url);

        base.setBaseurl(HOME_PAGE + base.getNavigate());

        driver.navigate().to(base.getBaseurl());

        driver.manage().window().maximize();

    }

    //Used by all other steps files
    @And("verifies that it is the wanted site")
    public void verifiesThatItIsTheWantedSite() {

        driver.findElement(By.className("example")).isDisplayed();

        System.out.println("site verified");
    }



    /* Hovering steps file Start here */


    //Unique step methods for this step file
    @When("user hovers over figure {string}")
    public void userHoversOverFigure(String fig) {

        driver.findElement(By.xpath("(//img[@alt='User Avatar'])[" + fig + "]")).isDisplayed();

        Actions act = new Actions(driver);

        WebElement figureHover = driver.findElement(By.xpath("(//img[@alt='User Avatar'])[" + fig + "]"));

        act.moveToElement(figureHover).build().perform();


    }

    @Then("user should be able to see figure {string}")
    public void userShouldBeAbleToSeeFigure(String fig) {

        driver.findElement(By.xpath("//h5[normalize-space()='name: user" + fig + "']")).isDisplayed();

        driver.findElement(By.xpath("(//a[contains(text(),'View profile')])[" + fig + "]")).isDisplayed();


    }

    @When("user clicks on figure caption {string}")
    public void userClicksOnFigureCaption(String view) {

        driver.findElement(By.xpath("(//a[contains(text(),'View profile')])[" + view + "]")).click();

    }

    @Then("user should be navigated to user {string} page")
    public void userShouldBeNavigatedToUserPage(String views) {
        String userUrl = HOME_PAGE + "users" + views;

        System.out.println(userUrl);
        System.out.println(driver.getCurrentUrl());

        if (userUrl.equals(driver.getCurrentUrl())) {

            System.out.println("Pass");

        } else {

            System.out.println("Fails");

        }

    }
}
