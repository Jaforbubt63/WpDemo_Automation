package pages;

import driver.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FloatingSwitchSizePage {

    public FloatingSwitchSizePage(){
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    @FindBy(xpath ="//span[normalize-space()='S']")
    WebElement floatingSize_button;

    public void click_on_plugin_button(){
        floatingSize_button.click();
    }


}
