package pages;

import driver.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPanelPage {
    public AdminPanelPage(){
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    @FindBy(xpath = "//a[normalize-space()='Admin Panel Dark Mode']")
    WebElement adminPanel_button;

    public void click_on_adminPanel_button(){
        adminPanel_button.click();
    }
}
