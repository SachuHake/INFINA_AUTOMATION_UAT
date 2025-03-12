package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowser {

    public static void main(String[] args) {
        // Set up WebDriverManager to manage the ChromeDriver version
        WebDriverManager.chromedriver().setup();

        // Specify path to your downloaded ChromeDriver version manually if necessary
        System.setProperty("webdriver.chrome.driver", "/Downloads/chrome-linux64 (1)/chrome-linux64"); // Update with your path

        // Instantiate the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open Google
        driver.get("https://www.google.com");

        // Wait for a few seconds
        try {
            Thread.sleep(5000);  // Wait for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
        //driver.quit();
    }
}
