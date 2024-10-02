package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class SeleniumMain {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://blinkit.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.className("mask-button")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("img[alt='3 - Fruits & Vegetables']")).click();
        List<WebElement> elements =driver.findElements(By.cssSelector("div[class*='Product__UpdatedDetailContainer']"));
        System.out.println(elements.size());
        System.out.println("Hello");
        //

    }
}
