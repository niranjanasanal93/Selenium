package com.allianz.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Demo3FBSignUp {
    public static void main(String[] args)  {


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.linkText("Create new account")).click();

        driver.findElement(By.name("firstname")).sendKeys("John");
        driver.findElement(By.name("lastname")).sendKeys("Wick");
        driver.findElement(By.id("password_step_input")).sendKeys("test123");
        driver.findElement(By.name("sex")).click();
        Select selectyear= new Select(driver.findElement(By.id("year")));
        selectyear.selectByVisibleText("1970");


    }
}