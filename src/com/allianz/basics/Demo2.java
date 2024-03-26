package com.allianz.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo2 {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("Hello123");
        driver.findElement(By.id("pass")).sendKeys("123@@");
        driver.findElement(By.name("login")).click();
    }
}
