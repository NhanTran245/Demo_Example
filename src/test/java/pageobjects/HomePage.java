package pageobjects;

import org.openqa.selenium.By;

public class HomePage extends BasePage{
    private By welcomeMessage = By.xpath("//div[@class='account']");
    private By createAccLink = By.xpath("//a[text() = 'create an account']");
    public HomePage() {
        pageTitle = "Safe Railway";
    }
}
