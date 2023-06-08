package org.skillbrain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSelectors {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");

        // id selector -> in pagin web se cauta dupa #numeId
        WebElement firstNameTextBox = driver.findElement(By.id("firstName"));
        WebElement lastNameTextBox = driver.findElement(By.id("lastName"));
        // cssSelector ->  .className -> cauta dupa clasa
        WebElement radioButtonMale = driver.findElement(By.cssSelector(".custom-control-label"));

        firstNameTextBox.sendKeys("Cristian-Claudiu");
        lastNameTextBox.sendKeys("Sandu");
        radioButtonMale.click();

        driver.quit();






    }


}
