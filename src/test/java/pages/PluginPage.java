package pages;

import driver.PageDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PluginPage extends BasePage {

    public PluginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }


    By plugin_button = By.xpath("//div[@id=\"adminmenuwrap\"]//div[text()=\"Plugins \"]");

    public void click_on_plugin_button() {
        clickOnElement(plugin_button);
    }
}
