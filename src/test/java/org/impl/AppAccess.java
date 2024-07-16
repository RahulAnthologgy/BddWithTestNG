package org.impl;

import static org.utils.WbdriverUtils.getDriver;
import static org.variables.GlobalVariables.*;
public class AppAccess {
    public static void appAccess(String url)
    {
        if(cdriver==null||cdriver.toString().contains("null"))
        {

            cdriver=getDriver();
            openUrl(url);
        }
    }
    public static void openUrl(String url)
    {
        cdriver.get("https://www.google.com/?gws_rd=ssl");
    }
}
