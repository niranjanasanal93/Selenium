package com.allianz.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Demo5Citibank {
    public static void main(String[] args)  {


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.citibank.co.in/ssjsps/forgetuseridmidssi.jsp");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.className("sbSelector")).click();
        driver.findElement(By.xpath("//a[@rel='Credit Card']")).click();
        driver.findElement(By.id("citiCard1")).sendKeys("4545");
        driver.findElement(By.id("citiCard2")).sendKeys("5656");
        driver.findElement(By.id("citiCard3")).sendKeys("8887");
        driver.findElement(By.id("citiCard4")).sendKeys("9998");
        driver.findElement(By.name("CCVNO")).sendKeys("223");
        driver.findElement(By.id("bill-date-long")).click();
        Select month = new Select(driver.findElement(By.className("ui-datepicker-month")));
        month.selectByValue("1");
        Select year= new Select(driver.findElement(By.className("ui-datepicker-year")));
        year.selectByVisibleText("2022");
        //Select day



        driver.quit();

    }
}
