package pages;

import org.openqa.selenium.By;
import utility.browserDriver;
import static org.junit.Assert.assertEquals;

public class onlineProductsPage extends browserDriver {

    public static String formalShoesDropdown_className = "formalshoedropdown";
    public static String formalShoesWebtable_xPath = "/html/body/div[2]/table";
    public static String formalShoesWebtableTr_xPath = "/html/body/div[2]/table/tbody/tr[1]/td[1]";

    public static void click_formalShoesDropdown() {
        driver.findElement(By.className(formalShoesDropdown_className)).click();
    }

    public static void getText_FormalShoesFirstValue() {
        String getText = driver.findElement(By.xpath(formalShoesWebtableTr_xPath)).getText();
        assertEquals("   Classic Cheltenham", getText);
    }
}
