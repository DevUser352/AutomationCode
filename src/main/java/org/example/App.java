package org.example;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.asserts.SoftAssert;

public class App {
    public static void main(String[] args) throws InterruptedException {

        SoftAssert softAssert = new SoftAssert();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://demo.opencart.com/en-gb?route=account/login");
        softAssert.assertTrue(driver.getCurrentUrl().equals("RaviBhagat"));

        System.out.println("if you are seeing this message so i can say you have used softAssert");
        System.out.println("Hello Soft Assert");
        softAssert.assertAll();


    }
}
