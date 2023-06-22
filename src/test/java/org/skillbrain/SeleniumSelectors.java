package org.skillbrain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSelectors {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver" ,"drivers/chromedriver" );
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");

        //id selector ->in pagin web se cauta dupa #numeId
        WebElement fristNameTextBox = driver.findElement(By.id("fristName"));
        WebElement lastNameTextBox = driver.findElement(By.id("lastName"));
        // cassSelector -> .className ->cauta dupa clasa
        WebElement radioButtonMale = driver.findElement(By.cssSelector(".costom-control-label"));






        fristNameTextBox.sendKeys("katea Manoila");
        lastNameTextBox.sendKeys("Manoila");
        radioButtonMale.click();
        driver.quit();






        driver.close();





    }







}
