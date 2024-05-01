package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.browserDriver;

public class homePage extends browserDriver {



    public  static  String hambergerMenu_Xpath = "//*[@id=\"menuToggle\"]/input";
    public  static  String signinLink_LinkText = "Sign In Portal";

    public static void click_humbergerMenu() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        Thread.sleep(2000);
        driver.findElement(By.xpath(hambergerMenu_Xpath)).click();
    }

    public static void click_signinLink() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.linkText(signinLink_LinkText)).click();
    }
}
