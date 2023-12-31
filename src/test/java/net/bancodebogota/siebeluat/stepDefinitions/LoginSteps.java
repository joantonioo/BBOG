package net.bancodebogota.siebeluat.stepDefinitions;

import io.cucumber.java.en.*;
import net.bancodebogota.siebeluat.steps.HomeLoginSiebel;
import net.bancodebogota.siebeluat.steps.HomeStepLogin;
import net.serenitybdd.annotations.Steps;

public class LoginSteps {

    @Steps
    HomeStepLogin homeStepLogin;

 //   @Steps
    @Steps
    HomeLoginSiebel homeLoginSiebel;


    @Given("since the user is on the main siebel page")
    public void since_the_user_is_on_the_main_siebel_page() {
       homeStepLogin.openBrower();
       homeStepLogin.loginPeopleSoft();


    }
    @When("the user enters siebel access credentials")
    public void the_user_enters_siebel_access_credentials() {
      //  homeLoginSiebel.openBrowserSiebel();
      //  homeLoginSiebel.loginSiebel();
    }
    @Then("then the user can see the login successfully")
    public void then_the_user_can_see_the_login_successfully() {
        System.out.println("hello");
    }

}
