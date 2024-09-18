package pages;

import driver.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WpSettingsPage {
    public WpSettingsPage(){
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    @FindBy(xpath = "//a[@href='admin.php?page=wp-dark-mode'][normalize-space()='Settings']")
    WebElement wpSettings_button;

    public void click_on_wpSettings_in_button(){
        wpSettings_button.click();
    }
}
