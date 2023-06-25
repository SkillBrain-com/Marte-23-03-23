package org.skillbrain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQATutorial {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();

        WebElement formsCard = driver.findElement(By.xpath("//div[@class='card mt-4 top-card'] [2]"));
        formsCard.click();

        driver.quit();


        // xpath -->   //TagName[@property='value']  -->



     // tag name --> div, header, strong, a

//        WebElement header = driver.findElement(By.tagName("header"));
//        header.click();
//
//
//        Thread.sleep(2000);

















        driver.quit();
    }
}
