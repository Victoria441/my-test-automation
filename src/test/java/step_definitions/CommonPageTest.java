package step_definitions;

import io.cucumber.java.en.And;
import pages.HomePage;
import pages.LoginPage;
import utils.SeleniumUtils;

public class CommonPageTest {
    LoginPage loginPage = new LoginPage();

//    @And("User click a button {string}")
//    public void userClickAButton(String buttonName) {
//        LoginPage loginPage = new LoginPage();
//        HomePage homePage = new HomePage();
//
//        switch (buttonName.toLowerCase()) {
//            case "login":
//                SeleniumUtils.click(loginPage.loginBtn);
//                break;
//            default:
//                System.out.println("INVALID BUTTON NAME");
//        }
//    }
}
