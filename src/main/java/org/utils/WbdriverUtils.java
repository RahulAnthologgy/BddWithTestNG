package org.utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public  class WbdriverUtils {
  public static  WebDriver driver;
public static  WebDriver getDriver()
{   
    System.setProperty("webdriver.chrome.driver","C:\\SeleniumScripts\\BddWithTestNG\\src\\resources\\Driver\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
   return driver;
}

}
