package com.Qa.Step_Definitions;

import com.Qa.Page.qa_page;
import com.Qa.Utilities.ConfigurationReader;
import com.Qa.Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.lang.module.Configuration;

public class qa_step {

    qa_page qa_page = new qa_page();
    @Given("User go to website")
    public void user_go_to_website() {
        Driver.getDriver().get(ConfigurationReader.getProperty("qa.env"));
    }
    @Then("User should see web title Login")
    public void user_should_see_web_title_login() {
        Assert.assertTrue(Driver.getDriver().getTitle(), Driver.getDriver().getTitle().equalsIgnoreCase("Login | Best solution for startups"));

    }

    @When("User enter valid credentials posmanager")
    public void user_enter_valid_credentials_posmanager() {
        qa_page.username.sendKeys(ConfigurationReader.getProperty("qa.user"));
        qa_page.password.sendKeys(ConfigurationReader.getProperty("qa.pass"));
    }
    @When("User enter valid credentials salesmanager")
    public void user_enter_valid_credentials_salesmanager() {
        qa_page.username.sendKeys(ConfigurationReader.getProperty("qa.email"));
        qa_page.password.sendKeys(ConfigurationReader.getProperty("qa.password"));
    }

    @When("User click the login button")
    public void user_click_the_login_button() {
        qa_page.signinbttn.click();

    }
    @Then("User should see web title Odoo")
    public void user_should_see_web_title_odoo() {
        Assert.assertTrue(Driver.getDriver().getTitle(), Driver.getDriver().getTitle().equalsIgnoreCase("Odoo") );

    }
    @When("User enter invalid username")
    public void user_enter_invalid_username() {
        qa_page.username.sendKeys("abc");
    }
    @When("User enter valid password")
    public void user_enter_valid_password() {
        qa_page.password.sendKeys(ConfigurationReader.getProperty("qa.password"));
    }
    @Then("User should see {string} alert")
    public void user_should_see_alert(String string) {
        qa_page.alert.isDisplayed();

    }

    @When("User enter valid username")
    public void user_enter_valid_username() {
        qa_page.username.sendKeys(ConfigurationReader.getProperty("qa.email"));
    }
    @When("User enter invalid password")
    public void user_enter_invalid_password() {
        qa_page.password.sendKeys("abc");
    }

    @When("User enter nothing as username")
    public void user_enter_nothing_as_username() {
        qa_page.username.sendKeys("");
    }

    @When("User enter nothing as password")
    public void user_enter_nothing_as_password() {
        qa_page.password.sendKeys("");

    }

}
