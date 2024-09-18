package pages;

import driver.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomizationPage {
    public CustomizationPage(){
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    @FindBy(xpath = "//h4[normalize-space()='Customization']")
    WebElement customizationPage_button;

    public void click_on_customization_in_button(){

        customizationPage_button.click();
    }
}
