package org.skillbrain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumSelector {
    //driver.quit();
    //driver.close();
    // id selector -> in pagina web se cauta dupa webID

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();
        FirefoxDriver firefoxDriver = new FirefoxDriver();

        WebElement firstNameTextBox = driver.findElement(By.id("firstName"));
        WebElement lastNameTextBox = driver.findElement(By.id("lastName"));
        WebElement radioButtonMale = driver.findElement(By.cssSelector(".custom-control-label"));
        WebElement userEmailBox = driver.findElement(By.id("userEmail"));
        WebElement userNumberBox = driver.findElement(By.id("userNumber"));

        driver.get("https://demoqa.com/automation-practice-form");
        firstNameTextBox.sendKeys("Mustafa Saleh");
        lastNameTextBox.sendKeys("Fayed");
        userEmailBox.sendKeys("fayedmustafa48@gmail.com");
        radioButtonMale.click();
        userNumberBox.sendKeys("0722334689");


    }
}
