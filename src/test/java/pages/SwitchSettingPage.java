package pages;

import driver.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwitchSettingPage {
    public SwitchSettingPage(){
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    @FindBy(xpath = "//a[normalize-space()='Switch Settings']")
    WebElement switchSetting_button;

    public void click_on_switchSetting_in_button(){
        switchSetting_button.click();
    }
}
