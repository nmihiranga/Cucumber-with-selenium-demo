package pages;

import org.openqa.selenium.By;
import utility.browserDriver;
import static org.junit.Assert.assertEquals;

public class registrationPage extends browserDriver {

    public static String userRegistration_xPath = "/html/body/center/h1";

    public static void  visibility_userRegistrationPage() {
        String actualProductCategory = driver.findElement(By.xpath(userRegistration_xPath)).getText();
        assertEquals("User Registration Page", actualProductCategory);
    }
}
