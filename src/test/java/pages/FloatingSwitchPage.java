package pages;

import driver.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FloatingSwitchPage {
    public FloatingSwitchPage(){
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    @FindBy(xpath = "//div[@class='flex flex-col gap-6']//div[@class='rounded text-base flex flex-col gap-3 bg-transparent gap-5']")
    WebElement floatingSwitch_button;

    public void click_on_floatingSwitch_in_button(){
        floatingSwitch_button.click();
    }
}
