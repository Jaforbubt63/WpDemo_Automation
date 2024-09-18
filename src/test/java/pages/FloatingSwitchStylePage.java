package pages;

import driver.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FloatingSwitchStylePage {

    public FloatingSwitchStylePage(){
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    @FindBy(xpath = "//div[contains(@class,'_selected bg-//span[contains(@class,'wp-dark-mode-ignore')][normalize-space()='Light']")
    WebElement floatingSwitchStyle_button;

    public void click_on_enableAdminDashboard_in_button(){

        floatingSwitchStyle_button.click();
    }
}
