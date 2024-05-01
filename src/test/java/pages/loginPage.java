package pages;

import org.openqa.selenium.By;
import utility.browserDriver;

public class loginPage extends browserDriver {

    public static String username_TextId = "usr";
    public static String password_TextId = "pwd";
    public static String loginBtn_Xpath = "//*[@id=\"second_form\"]/input";
    public static String newRegisterBtn_Id = "NewRegistration";

    public static void sendkeys_username() {
        driver.findElement(By.id(username_TextId)).sendKeys("Scott.gale@gmail.com");
    }

    public static void sendkeys_password() {
        driver.findElement(By.id(password_TextId)).sendKeys("P@sword!");
    }

    public static void click_loginBtn() {
        driver.findElement(By.xpath(loginBtn_Xpath)).click();
    }

    public static void click_newRegisterBtn() {
        driver.findElement(By.id(newRegisterBtn_Id)).click();
    }
}
