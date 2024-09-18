package pages;

import driver.PageDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DarkPage {
    public DarkPage(WebDriver driver){
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    @FindBy(xpath ="//span[normalize-space()='Dark']")
    WebElement darkPage_button;

    public void click_on_dark_in_button(){

        darkPage_button.click();
    }
}
