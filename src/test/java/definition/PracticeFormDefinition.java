package definition;

import insurance.FillSignupForm;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PracticeFormDefinition {

    @Given("user open practice form")
    public void user_open_practice_form() {

//        FillSignupForm.signup();
        FillSignupForm.fname();

    }

    @When("user input firstName and LastName")
    public void user_input_first_name_and_last_name() {

        FillSignupForm.lname();

    }

    @And("input email")
    public void input_email() {

        FillSignupForm.emailAddress();
    }

    @And("user choose gender")
    public void user_choose_gender() {

        FillSignupForm.gender();

    }

    @And("input mobile number")
    public void input_mobile_number() {

        FillSignupForm.mobileNuber();
    }

    @And("input date of birth")
    public void input_date_of_birth() {

        System.out.println("");

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
