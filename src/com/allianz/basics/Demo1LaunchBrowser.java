package com.allianz.basics;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1LaunchBrowser {

    public static void main(String[] args) {

        WebDriver driver = null;
        String browser = "edge";
        if (browser.equalsIgnoreCase("ch")) {
            driver = new ChromeDriver();
        } else {
            driver = new EdgeDriver();
        }

        WebDriver driver1 = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL" +currentURL);
        driver1.get("https://www.google.com/");
        String pagesource = driver1.getPageSource();
        System.out.println("Pagesource" +pagesource);


    }

}
