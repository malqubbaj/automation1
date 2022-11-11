package steps;

import Base.baseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class dragAndDropSteps extends baseUtil {

    public baseUtil base;

    public dragAndDropSteps(baseUtil base) {
        this.base = base;
    }


    @And("verifies that all elements are present with headers on each box")
    public void verifiesThatAllElementsArePresentWithHeadersOnEachBox() {
/*
        base.driver.findElement(By.id("column-a")).isDisplayed();
        base.driver.findElement(By.xpath("//header[normalize-space()='A']"));

        System.out.println("User checks box with Column-a id has A as a header");

        base.driver.findElement(By.id("column-b")).isDisplayed();
        base.driver.findElement(By.xpath("//header[normalize-space()='B']"));

        System.out.println("User checks box with Column-b id has B as a header");
*/
    }

    @Then("user drags box A to position of box b")
    public void userDragsBoxAToPositionOfBoxB() {

        //String box1Xpath = "//div[@id='column-a']";
        //String box2Xpath = "//div[@id='column-b']";
        WebElement boxA = base.driver.findElement(By.xpath("//div[@id='column-a']"));
        WebElement boxB = base.driver.findElement(By.xpath("//div[@id='column-b']"));


        Actions act = new Actions(base.driver);


        /*Action operation = act.clickAndHold(boxA).moveToElement(boxB).release(boxB).build();

        operation.perform();*/

        //act.clickAndHold(boxA).moveByOffset(210,0).release().build().perform();
        //act.clickAndHold(boxA).moveToElement(boxB).release().build().perform();
        act.dragAndDrop(boxA,boxB).build().perform();
        /*System.out.println("-- start the drag and drop action---");
        dndHtml5(box1Xpath, box2Xpath);
        System.out.println("-- end the drag and drop action---");*/

        //act.clickAndHold(boxA).moveToElement(boxB).release(boxB).build().perform();
        //act.dragAndDropBy(boxA,230,0).build().perform();
        //act.dragAndDrop(boxB,boxA).build().perform();


    }
/*
    public void dndHtml5(String xPathSource, String xPathDestination) {
        clickEnterKeyOnElement(xPathSource);
        clickEnterKeyOnElement(xPathDestination);
    }

    public void clickEnterKeyOnElement(String xPath) {
        setFocusOnElement(xPath);
        WebElement target = element(xPath);
        target.sendKeys(Keys.ENTER);
    }

    public void setFocusOnElement(String xPath) {
        WebElement element = element(xPath);
        Actions actions = new Actions(base.driver);
        actions.moveToElement(element).build().perform();
    }

    public WebElement element(String xPath) {
        return base.driver.findElement(By.xpath(xPath));

    }
*/
    @And("makes sure that the boxes ahve been replaced")
    public void makesSureThatTheBoxesAhveBeenReplaced() {
    }

    @Then("user redrags box A to its initial postion")
    public void userRedragsBoxAToItsInitialPostion() {
    }

    @And("makes sure its back")
    public void makesSureItsBack() {
    }
}
