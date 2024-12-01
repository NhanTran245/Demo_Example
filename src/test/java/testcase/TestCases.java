package testcase;

import dataobjects.Menu;
import helper.Logger;
import org.testng.annotations.Test;
import pageobjects.HomePage;

public class TestCases extends TestBase{
    @Test
    public void TC001() {
        Logger.log("Print screen");
        HomePage homePage = new HomePage();
        homePage.selectMenu(Menu.LOGIN.toString());

    }
}
