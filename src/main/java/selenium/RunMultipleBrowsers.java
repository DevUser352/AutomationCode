package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunMultipleBrowsers {

    public static void main(String[] args) {
        String browserName = "edge";

        WebDriver driver = null;
        if (browserName.equals("chrome")){
            driver = new ChromeDriver();
        } else if (browserName.equals("edge")) {

            driver = new EdgeDriver();
        } else if (browserName.equals("firefox")) {

            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/");
        driver.findElement(By.name("search")).sendKeys("HP");
        driver.findElement(By.className("input-group-btn")).click();
    }
}
