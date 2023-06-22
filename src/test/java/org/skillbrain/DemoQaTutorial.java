package org.skillbrain;

import Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoQaTutorial {

    private ChromeDriver driver;
    private String currentURL;
    private String title;


    @BeforeTest
    public void initializeDriver() {

        driver = Utils.getChromeDriver();

    }

    @AfterTest
    public void closeDriver() {
        driver.quit();
    }


    @Test(dependsOnMethods = "demoQaLoginTest", testName = "Complete Practice Form with valid data")
    public void demoQaFormTest() {

        driver.get("https://demoqa.com");

        WebElement formsCard = driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[2]"));
        formsCard.click();


        WebElement practiceForm = driver.findElement(By.xpath("(//li[@id='item-0']) [2]"));
        practiceForm.click();

        currentURL = driver.getCurrentUrl();
        title = driver.getTitle();
        Assert.assertEquals(currentURL, "https://demoqa.com/automation-practice-form");

        driver.findElement(By.id("firstName")).sendKeys("Mustafa");


        driver.findElement(By.id("lastName")).sendKeys("Fayed");


        driver.findElement(By.id("userEmail")).sendKeys("fayed1111@gmail.com");


        driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();


        driver.findElement(By.id("userNumber")).sendKeys("0721460866");


        driver.findElement(By.id("dateOfBirthInput")).click();
        WebElement selectMonth = driver.findElement(By.cssSelector(".react-datepicker__month-select"));
        Select selectBirthMonth = new Select((selectMonth));
        selectBirthMonth.selectByIndex(6);

        WebElement selectYear = driver.findElement(By.cssSelector(".react-datepicker__year-select"));
        Select selectBirthYear = new Select(selectYear);
        selectBirthYear.selectByValue("1990");
        driver.findElement(By.cssSelector(".react-datepicker__day.react-datepicker__day--029")).click();

        driver.findElement(By.id("subjectsInput")).click();
        WebElement subjects = driver.findElement(By.id("subjectsInput"));
        subjects.sendKeys("Maths");
        subjects.sendKeys(Keys.ENTER);

        driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")).click();
        driver.findElement(By.id("currentAddress")).sendKeys("Home address");

        WebElement state = driver.findElement(By.id("react-select-3-input"));
        state.sendKeys("Uttar");
        state.sendKeys(Keys.ENTER);

        WebElement city = driver.findElement(By.id("react-select-4-input"));
        city.sendKeys("Agra");
        city.sendKeys(Keys.ENTER);

        driver.findElement(By.id("submit")).click();


    }

    @Test(testName = "Login to demoqa page with valid user")
    public void demoQaLoginTest() {
        driver.get("https://demoqa.com");
        title = driver.getTitle();
        currentURL = driver.getCurrentUrl();
//       System.out.println(currentUrl);
        Assert.assertEquals(title, "DEMOQA");
        Assert.assertEquals(currentURL, "https://demoqa.com/");
//       System.out.println(title);
    }

}








