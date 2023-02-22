package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selenium03 {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver","C:\\Software\\driver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.co.uk/");
    }
}
