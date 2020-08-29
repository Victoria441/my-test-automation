package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
import utils.SeleniumUtils;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(name = "email")
    public WebElement emailField;

    @FindBy(name = "password_logIn")
    public WebElement passwordField;

    @FindBy(className = "btn btn-primary btn-block")
    public WebElement loginBtn;

    public void logIn(String email, String password) {
        SeleniumUtils.sendKeys(emailField, email);
        SeleniumUtils.sendKeys(passwordField, password);
        SeleniumUtils.click(loginBtn);
    }
}
