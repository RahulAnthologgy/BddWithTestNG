package org.pages;

import org.openqa.selenium.By;

import static org.utils.SeleniumReusableFunctions.*;

import static org.variables.GlobalVariables.cdriver;


public class LoginPage {
   static By txt_username= By.id("Username");
   static By txt_password=By.id("Password");
   static By btn_Login=By.id("login");
   By link_reset=By.linkText("Reset password");

   public static void enterUsername(String username)
   {
            Send(txt_username,username);
   }
   public static void enterPassword(String username)
   {
      Send(txt_password,username);
   }
   public static void clickOnLogin()
   {
      Click(btn_Login);
   }
}
