package pages;

import driver.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnableAdminDashboardPage {
    public EnableAdminDashboardPage(){
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    @FindBy(xpath = "//div[@class='rounded text-base flex flex-col gap-3 bg-transparent gap-5']//div[1]//label[1]//div[2]//div[1]")
    WebElement enableAdminDashboard_button;

    public void click_on_enableAdminDashboard_in_button(){

        enableAdminDashboard_button.click();
    }
}
