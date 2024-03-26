package com.allianz.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Demo4Salesforce {
    public static void main(String[] args)  {


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.name("UserFirstName")).sendKeys("John");
        driver.findElement(By.name("UserLastName")).sendKeys("Wick");
        driver.findElement(By.name("UserEmail")).sendKeys("John@gmail.com");
        driver.findElement(By.name("UserTitle")).click();
        Select user= new Select(driver.findElement(By.name("UserTitle")));
        user.selectByVisibleText("IT Manager");
        driver.findElement(By.name("CompanyName")).sendKeys("Allianz");
        Select emp= new Select(driver.findElement(By.name("CompanyEmployees")));
          emp.selectByVisibleText("201 - 500 employees");
        driver.findElement(By.name("UserLastName")).click();

        driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[2]")).click();
        driver.findElement(By.name("UserLastName")).click();
        driver.findElement(By.name("start my free trial")).click();
        driver.findElement(By.name("UserLastName")).click();
        String error= driver.findElement(By.xpath("(//span[@class='error-msg'])[7]")).getText();
      //  driver.findElement(By.name("UserLastName")).click();
       System.out.println(error);



        driver.quit();

    }
}
