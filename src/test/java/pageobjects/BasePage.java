package pageobjects;

import helper.BrowserUtils;
import helper.Constant;
import helper.ElementUtils;
import helper.Logger;
import org.openqa.selenium.By;

public class BasePage {
    protected String pageTitle;

    private String xpathMenu = "//li//a[span[text() = '%s']]";

    private By getMenuLocator(String menu) {
        return By.xpath(String.format(xpathMenu, menu));
    }

    public void selectMenu (String menu) {
        Logger.log("Select menu " + menu);
        var locator = getMenuLocator(menu);
        ElementUtils.waitForElementClickable(locator, Constant.ELEMENT_WAIT_TIMEOUT);
        ElementUtils.findElement(locator).click();
    }

    public void waitForPageLoad() {
        BrowserUtils.waitForTitle(pageTitle, Constant.PAGE_WAIT_TIMEOUT);
    }

    public Boolean isMenuExists (String menu, int timeoutInSeconds) {
        var locator = getMenuLocator(menu);
        return ElementUtils.isElementExists(locator, timeoutInSeconds);
    }
}
