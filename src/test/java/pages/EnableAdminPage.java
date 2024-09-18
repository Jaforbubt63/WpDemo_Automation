package pages;

import driver.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnableAdminPage {public EnableAdminPage(){
    PageFactory.initElements(PageDriver.getCurrentDriver(), this);
}

    @FindBy(xpath = "//div[@class='rounded text-base flex flex-col gap-3 bg-transparent gap-5']//div[1]//label[1]//div[2]//div[1]")
    WebElement enableAdmin_button;

    public void click_on_enableAdmin_in_button(){
        enableAdmin_button.click();
    }
}
