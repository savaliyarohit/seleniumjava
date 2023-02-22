package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium01 {



    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Software\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");


    }
}
