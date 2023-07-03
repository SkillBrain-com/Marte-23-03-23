package org.skillbrain;

import Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.Set;

public class DiscordWebPageLoginTest {
    private ChromeDriver driver;
    private String currentURL;
    private String title;


    @BeforeSuite
    public void initializeDriver() {
        driver = Utils.getChromeDriver();
        driver.get("https://discord.com/");


    }

    @AfterSuite
    public void closeDriver() {
        driver.quit();
    }

    @Test
    public void openBrowser() {

        currentURL = driver.getCurrentUrl();
        Assert.assertEquals(currentURL, "https://discord.com/");
        System.out.println(currentURL);

    }

    @Test
    public void gdprBox() {

        WebElement gdprBox = driver.findElement(By.id("onetrust-accept-btn-handler"));
        gdprBox.click();}

    @Test
    public void loginOnPage(){

        WebElement loginOnPage = driver.findElement(By.xpath("//a[@class='button-ZGMevK buttonWhite-1M-wED buttonSmall-1FIG7u gtm-click-class-login-button button-1I7cbj']"));
        loginOnPage.click();
    }
    @Test
    public void registerButton(){

        WebElement registerButton = driver.findElement(By.xpath("//button[@class='smallRegisterLink-1qEJhz linkButton-2ax8wP button-ejjZWC lookLink-13iF2K lowSaturationUnderline-Z6CW6z colorLink-34zig_ sizeMin-3Yqxk5 grow-2T4nbg']"));
        registerButton.click();
        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles);
    }



    @Test(dependsOnMethods = "loginOnPage")
    public void emailBox(){

//        Set<String> windowHandles = driver.getWindowHandles();
//        System.out.println(windowHandles);
//        Iterator<String> windowHandlesIterator = windowHandles.iterator();
//        String parentID = windowHandlesIterator.next();
//        String childID = windowHandlesIterator.next();
//        driver.switchTo().window(childID);
        WebElement emailBox = driver.findElement(By.xpath("//input[@name='email']"));
        emailBox.click();
        emailBox.sendKeys("testdiscord95@gmail.com");

    }

    @Test()
    public void userName(){
        WebElement userName = driver.findElement(By.xpath("(//div[@class='inputWrapper-2K8ds1']) [2]"));
        userName.click();
        userName.sendKeys("Faymus1995");
    }
    @Test()
    public void password(){
        WebElement password = driver.findElement(By.xpath("(//div[@class='inputWrapper-2K8ds1']) [3]"));
        password.click();
        password.sendKeys("12345Xyo95");
    }




}

