package com.commerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class AppTest {
    public static void main(String[] args) {
        // Selenium 4 automatically handles binary driver downloads
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       
            // Open target URL
            driver.get("https://automationexercise.com");
            System.out.println("Page Title: " + driver.getTitle());
            driver.manage().window().maximize();
            driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li/a[text()=' Signup / Login']")).click();
            System.out.println("Page Title: " + driver.getTitle());

            //Login with valid credentials
            driver.findElement(By.cssSelector("input[data-qa='login-email']")).sendKeys("100testing001@gmail.com");
            driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("test@123");
            driver.findElement(By.xpath("//button[text()='Login']")).click();
            // Close the browser window
            driver.quit();
    }
}
