package test;

import driver.BaseDriver;
import org.testng.annotations.Test;
import pages.*;

public class TestCases extends BaseDriver {


    @Test
    public void login_to_wordpress() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        PluginPage pluginPage = new PluginPage(driver);
        WpDarkModePage wpDarkModePage = new WpDarkModePage(driver);
        CustomizationPage customizationPage = new CustomizationPage();
        EnableAdminDashboardPage enableAdminDashboardPage = new EnableAdminDashboardPage();
        SwitchSettingPage switchSettingPage = new SwitchSettingPage();
        WpSettingsPage wpSettingsPage = new WpSettingsPage();1

        loginPage.perform_login("Admin", "Admin123");
        pluginPage.click_on_plugin_button();
        wpDarkModePage.click_on_woDarkMode_in_button();

    }
}
