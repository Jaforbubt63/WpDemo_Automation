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
        AdminPanelPage adminPanelPage = new AdminPanelPage();
        EnableAdminDashboardPage enableAdminDashboardPage = new EnableAdminDashboardPage();
        SwitchSettingPage switchSettingPage = new SwitchSettingPage();
        WpSettingsPage wpSettingsPage = new WpSettingsPage();
        CustomizationSwitchSettingsPage customizationSwitchSettingsPage = new CustomizationSwitchSettingsPage();
        FloatingSwitchPage floatingSwitchPage = new FloatingSwitchPage();
        FloatingSwitchStylePage floatingSwitchStylePage = new FloatingSwitchStylePage();
        FloatingSwitchSizePage floatingSwitchSizePage = new FloatingSwitchSizePage();
        FloatingSwitchPositionPage floatingSwitchPositionPage = new FloatingSwitchPositionPage();
        CustomizationSiteAnimationPage customizationSiteAnimationPage = new CustomizationSiteAnimationPage();


        loginPage.perform_login("Admin", "Admin123");
        Assert.assertEquals(driver.getCurrentUrl(),"http://wpword.local/wp-admin/");
        pluginPage.click_on_plugin_button();
        wpDarkModePage.click_on_woDarkMode_in_button();
        Assert.assertEquals(driver.getCurrentUrl(),"http://wpword.local/wp-admin/admin.php?page=wp-dark-mode#/admin");
        wpSettingsPage.click_on_wpSettings_in_button();
        adminPanelPage.click_on_adminPanel_button();
        enableAdminDashboardPage.click_on_enableAdminDashboard_in_button();
        customizationPage.click_on_customization_in_button();
        customizationSwitchSettingsPage.click_on_customizationSwitchSetting_in_button();
        floatingSwitchPage.click_on_floatingSwitch_in_button();
        floatingSwitchStylePage.click_on_floatingSwitchStyle_in_button();
        floatingSwitchSizePage.click_on_floatingSize_in_button();
        floatingSwitchPositionPage.click_on_floatingSwitchPosition_in_button();
        customizationSiteAnimationPage.click_on_customizationSiteAnimation_in_button();
    }
}
