package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class selenium02 {

    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","C:\\Software\\driver\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.lloydsbank.com/");


    }
}
