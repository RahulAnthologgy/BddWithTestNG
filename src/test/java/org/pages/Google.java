package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static org.utils.SeleniumReusableFunctions.*;
import static org.variables.GlobalVariables.*;
public class Google {
    static By txt_Search= By.name("q");

    public static void enterText(String text)
    {
        Send(txt_Search,text);
    }
    public static void enterKeyPress()
    {
        cdriver.findElement(By.name("txt_Search")).sendKeys(Keys.ENTER);
    }
}
