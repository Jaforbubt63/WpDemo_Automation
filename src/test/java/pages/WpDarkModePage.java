package pages;

import driver.PageDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WpDarkModePage extends BasePage{


    public WpDarkModePage(WebDriver driver){
        super(driver);
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }


    By wpDarkMode_button = By.xpath("//div[normalize-space()='WP Dark Mode']");

    public void click_on_woDarkMode_in_button(){
        clickOnElement(wpDarkMode_button);
    }
}
