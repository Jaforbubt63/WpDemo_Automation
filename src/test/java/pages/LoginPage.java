package pages;

import driver.PageDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }


    By email_input = By.id("user_login");
    By password_input = By.id("user_pass");
    By login_button = By.id("wp-submit");


    public void perform_login(String email, String password) throws InterruptedException {
        sendText(email_input, email);
        sendText(password_input, password);
        clickOnElement(login_button);
    }

}
