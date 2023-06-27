package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends BaseTest
{
    String baseUrl = "= https://opensource-demo.orangehrmlive.com/";
    @Before
    public void setUp()
    {
         openUrl( );
    }
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully()
    {
         // click on the ‘Forgot your password’ link
        driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
        //Verify the text ‘Reset Password
        String expected = "Reset Password";
        String actual = driver.findElement(By.tagName("h6")).getText();
        Assert.assertEquals("Mwssage",expected,actual);
        System.out.println(actual+" text should be display");
    }
}
