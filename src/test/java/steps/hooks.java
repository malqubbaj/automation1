package steps;

import Base.baseUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hooks extends baseUtil{

    private baseUtil base;

    public hooks(baseUtil base) {
        this.base = base;
    }


    @Before
    public void initializeTest() {

        System.out.println("Opening the browser: Chrome");

        //Passing a WebDriver instance
        System.setProperty("webdriver.chrome.driver", "/Users/mohammadalqubbaj/ChromeDriver/chromedriver.exe" );
        driver = new ChromeDriver();

    }

    @After
    public void teardownTest() {


        System.out.println("\nclosing the browser: Chrome");
    }

}