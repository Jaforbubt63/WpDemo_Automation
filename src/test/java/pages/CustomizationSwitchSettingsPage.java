package pages;

import driver.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomizationSwitchSettingsPage {
    public CustomizationSwitchSettingsPage(){
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    @FindBy(xpath = "//a[normalize-space()='Switch Settings']")
    WebElement customizationSwitchSetting_button;

    public void click_on_customizationSwitchSetting_in_button(){

        customizationSwitchSetting_button.click();
    }
}
