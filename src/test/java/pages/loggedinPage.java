package pages;

import org.openqa.selenium.By;
import utility.browserDriver;
import static org.junit.Assert.assertEquals;

public class loggedinPage extends browserDriver {

    public static String productCategory_formalShoes = "//*[text()='Formal Shoes']";
    public static String productCategory_sportsShoes = "//*[text()='Sports']";
    public static String productCategory_sneakersShoes = "//*[text()='Sneakers']";

    public static void visibilityProductCategory_formalShoes() {
        String actualProductCategory_fs = driver.findElement(By.xpath(productCategory_formalShoes)).getText();
        assertEquals(actualProductCategory_fs, "Formal Shoes");
    }

    public static void visibilityProductCategory_sportsShoes() {
        String actualProductCategory_ss = driver.findElement(By.xpath(productCategory_sportsShoes)).getText();
        assertEquals(actualProductCategory_ss, "Sports");
    }

    public static void visibilityProductCategory_sneakersShoes() {
        String actualProductCategory_s = driver.findElement(By.xpath(productCategory_sneakersShoes)).getText();
        assertEquals(actualProductCategory_s, "Sneakers");
    }
}
