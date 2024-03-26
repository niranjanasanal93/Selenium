package com.allianz.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo6Medibuddy {
    public  static void main(String[] args)  {
    WebDriver driver = new ChromeDriver();
        driver.get("https://www.medibuddy.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.className("wzrkClose")).click();
        driver.findElement(By.className("active-color"));
        driver.findElement(By.linkText("I have a Corporate Account")).click();
        driver.findElement(By.linkText("Learn More")).click();
        driver.findElement(By.linkText("skip")).click();
        driver.findElement(By.linkText("Login using Username & Password")).click();
        driver.findElement(By.id("username")).sendKeys("John");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.id("password")).sendKeys("john123");



        driver.quit();

}
}
