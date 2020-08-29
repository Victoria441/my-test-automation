package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HomePage;
import pages.LoginPage;
import utils.Driver;
import utils.SeleniumUtils;

public class HomePageTest {
    LoginPage loginPage = new LoginPage();


    @Given("User open home page")
    public void user_open_home_page() {
        Driver.getDriver().get("http://grademe.techleadacademy.io");
    }



    @Then("User input {string} as a {string}")
    public void userInputAsA(String input, String inputField) {
        switch (inputField.toLowerCase()) {
            case "email":
                SeleniumUtils.sendKeys(loginPage.emailField, input);
                break;
            case "password":
                SeleniumUtils.sendKeys(loginPage.passwordField, input);
                break;
            default:
                System.out.println("INVALID FIELD TYPE");
        }
    }
    @Then("User click a button {string}")
    public void userClickAButton(String buttonName) {
        LoginPage loginPage = new LoginPage();
        HomePage homePage = new HomePage();

        switch (buttonName.toLowerCase()) {
            case "login":
                SeleniumUtils.click(loginPage.loginBtn);
                break;
            default:
                System.out.println("INVALID BUTTON NAME");
        }
    }
}
