package pages;

import driver.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomizationSiteAnimationPage {
    public CustomizationSiteAnimationPage(){
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    @FindBy(xpath ="//a[normalize-space()='Site Animation']")
    WebElement customizationSiteAnimation_button;

    public void click_on_customizationSiteAnimation_in_button(){
        customizationSiteAnimation_button.click();
    }
}
