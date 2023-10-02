package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

@CucumberOptions(
        plugin = {"pretty",
                "html:target/cucumber-report/cucumber.html",
                "json:target/cucumber-report/cucumber.json",
        },
        features = {"src/test/resources/Features/submitForm.feature"},
        glue = {"definition"}
)
public class Signup extends AbstractTestNGCucumberTests {
    public static WebDriver driver;
    private TestNGCucumberRunner testNGCucumberRunner;
    @BeforeClass
    public void setup() {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
        // Set up ChromeDriver with the configured options
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void close() {

        driver.close();
    }
}
