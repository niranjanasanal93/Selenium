package com.allianz.framesdemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Demo2Open {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("//demo.openemr.io/b/openemr/");
        driver.findElement(By.id("authUser")).sendKeys("admin");
        driver.findElement(By.id("clearPass")).sendKeys("pass");
        Select language= new Select(driver.findElement(By.name("languageChoice")));
        language.selectByVisibleText("English (Indian)");
        driver.findElement(By.id("login-button")).click();

    }

}
