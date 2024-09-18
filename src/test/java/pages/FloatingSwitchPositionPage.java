package pages;

import driver.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FloatingSwitchPositionPage {

    public FloatingSwitchPositionPage(){
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    @FindBy(xpath ="//span[normalize-space()='Left']")
    WebElement floatingSwitchPosition_button;

    public void click_on_plugin_button(){
        floatingSwitchPosition_button.click();
    }

}
