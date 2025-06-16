package org.example.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class LoginPage extends PageObject {

    //Locator strategy implemented with Selenium IDE Plugin for Chrome
    public static final Target USERNAME_FIELD = Target.the("Username input field").located(By.id("username"));
    public static final Target PASSSWORD_FIELD = Target.the("Password input field").located(By.id("password"));
    public static final Target LOGIN_BUTTON = Target.the("Login button").located(By.cssSelector(".fa"));
    public static final Target ALERT_FLASH_MESSAGE = Target.the("Alert flash message").located(By.id("flash"));
}
