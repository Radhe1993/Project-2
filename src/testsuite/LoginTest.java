package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest
{
     String baseUrl = "https://opensource-demo.orangehrmlive.com/";
     @Before
     public void setup()
     {
         openUrl();
     }
     @Test
     public void userSholdLoginSuccessfullyWithValidCredentials()
     {
         //Enter “Admin” username
         driver.findElement(By.name("username")).sendKeys("Admin");
         //Enter “admin123 password
         driver.findElement(By.name("password")).sendKeys("admin123");
         //Click on ‘LOGIN’ button
         driver.findElement(By.xpath("//button[@type='submit']")).click();
         //Verify the ‘Dashboard’ text is display
         String expected = "Dashboard";
         String text = driver.findElement(By.className("oxd-topbar-header-title")).getText();
         Assert.assertEquals("Message",expected,text);
          System.out.println(text+" text should display");


     }


}
