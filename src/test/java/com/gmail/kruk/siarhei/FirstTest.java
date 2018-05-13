package com.gmail.kruk.siarhei;


import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FirstTest {

    private static WebDriver driver = new ChromeDriver();

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "/home/user/Work/chromedriver.exe");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(13, TimeUnit.SECONDS);
        driver.get("");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void page1() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement button1 = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/form/question-group-content[1]/div/div/question-content/div/button[2]"));
        button1.click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement field1 = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/form/question-group-content[3]/div/div/question-content[2]/div/div/div[2]/input"));
        field1.sendKeys("6");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement button2 = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/form/question-group-content[3]/div/div/question-content[3]/div/button[1]"));
        button2.click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement button3 = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/form/question-group-content[6]/div/div/question-content/div/label[1]/input"));
        button3.click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement button4 = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/form/question-group-content[8]/div/div/question-content/div/label/input"));
        button4.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement button5 = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/form/div[2]/button"));
        button5.click();

    }
    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}
