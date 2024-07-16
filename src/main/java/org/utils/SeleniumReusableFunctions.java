package org.utils;

import org.openqa.selenium.By;
import static org.variables.GlobalVariables.*;

public class SeleniumReusableFunctions {
    public static void Click(By webElement)
    {
        cdriver.findElement(webElement).click();
    }
    public static void Send(By webElement,String text)
    {
        cdriver.findElement(webElement).sendKeys(text);
    }
    public static String GetText(By webElement)
    {
        return cdriver.findElement(webElement).getText();
            }
    public static void verifyText(By webElement,String ExpectedText)
    {
       String actText= cdriver.findElement(webElement).getText();
       if (actText==ExpectedText)
       {
           System.out.println(actText + "and " + ExpectedText + "is Match");
       }else{System.out.println(actText + "and " + ExpectedText + " is not Match");}
    }
}
