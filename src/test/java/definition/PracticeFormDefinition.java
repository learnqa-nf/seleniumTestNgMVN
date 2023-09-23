package definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeFormDefinition {
    public WebDriver driver;
    @Given("user open practice form")
    public void user_open_practice_form() throws InterruptedException {
        // Set up ChromeDriver with the configured options
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();

        // Navigate to the URL and maximize the window
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();

    }

    @When("user input firstName and LastName")
    public void user_input_first_name_and_last_name() throws InterruptedException {

        System.out.println("test 1");
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Jhon");
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Doe");

    }

    @And("input email")
    public void input_email() {
        driver.findElement(By.xpath("//*[@id='userEmail']")).sendKeys("jhon.doe@gmail.com");
    }

    @And("user choose gender")
    public void user_choose_gender() {

        driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();

    }

    @And("input mobile number")
    public void input_mobile_number() {

        driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("081908754411");
    }

    @And("input date of birth")
    public void input_date_of_birth() {

        driver.close();
//        WebElement datePicker = driver.findElement(By.xpath("//div[@class='react-datepicker__input-container']/input"));
//        datePicker.clear();
        //datePicker.sendKeys("17 Sep 1990"); // Change this date to the one you want to select

//        driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
//        driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")).click();
//        driver.findElement(By.xpath("//select[@class='")).click();

    }

    @And("user click submit")
    public void user_click_submit() {
        System.out.println("");
    }

    @Then("user validation pop up")
    public void user_validation_pop_up() {
        System.out.println("");
    }
}
