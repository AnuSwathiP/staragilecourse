package org.staragile.june26;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class D01LaunchingYoutube {
    // https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java
    //this dependency should paste and sync  in pom.xml
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.youtube.com/");

        System.out.println("Title: " + driver.getTitle());

        driver.close();
    }
}
