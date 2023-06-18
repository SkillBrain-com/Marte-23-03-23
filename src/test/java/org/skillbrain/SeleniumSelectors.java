package org.skillbrain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSelectors {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");

        // id selector = in pagina web se cauta dupa #numeid
        WebElement FirstNameTextBox = driver.findElement(By.id("firstName"));
        FirstNameTextBox.sendKeys("Alecu");

        WebElement LastNameTextBox = driver.findElement(By.id("lastName"));
        LastNameTextBox.sendKeys("Marco");

        WebElement UserEmailTextBox = driver.findElement(By.id("userEmail"));
        UserEmailTextBox.sendKeys("mark_hero13@yahoo.com");

        //css selector = .classname

        WebElement radioButtonMale = driver.findElement(By.cssSelector(".custom-control-label"));
        radioButtonMale.click();








    }
}
