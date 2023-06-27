package org.skillbrain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoQATutorial {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();

        WebElement formsCard = driver.findElement(By.xpath("//div[@class='card mt-4 top-card'] [2]"));
        formsCard.click();

        WebElement practiceForms = driver.findElement(By.xpath("(//li[@id='item-0'])[2]"));
        practiceForms.click();

        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys("Alecu");

        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys("Marco");

        WebElement userEmail = driver.findElement(By.id("userEmail"));
        userEmail.sendKeys("mark_hero13@yahoo.com");

        WebElement radioButton = driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
        radioButton.click();

        WebElement userNumber = driver.findElement(By.id("userNumber"));
        userNumber.sendKeys("0729663849");

        WebElement selectBirthYear = driver.findElement(By.id("dateOfBirthInput"));
        selectBirthYear.click();
        WebElement select = driver.findElement(By.cssSelector(".react-datepicker__month-select"));
        org.openqa.selenium.support.ui.Select selectMonth = new org.openqa.selenium.support.ui.Select(select);
        selectMonth.selectByIndex(8);

        WebElement selectYear = driver.findElement(By.cssSelector(".react-datepicker__year-select"));
        Select selectYear2 = new Select(selectYear);
        selectYear2.selectByValue("2000");


        












        // xpath -->   //TagName[@property='value']  -->



     // tag name --> div, header, strong, a

//        WebElement header = driver.findElement(By.tagName("header"));
//        header.click();
//
//
//        Thread.sleep(2000);


















    }
}
