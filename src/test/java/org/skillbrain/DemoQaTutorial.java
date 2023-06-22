package org.skillbrain;

import Utillitles.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DemoQaTutorial {

    private ChromeDriver driver;
    private String currentUrl;
    private String title;

    @BeforeSuite
    public void initializeDriver(){
         driver = Utils.getChromeDriver();

    }
    @AfterSuite
    public void closeDriver(){
        driver.quit();
    }
    @Test
    public void demoQaFormTest()throws InterruptedException{

        try {


            driver.get("https://demoqa.com/automation-practice-form");
            driver.manage().window().maximize();



            WebElement header = driver.findElement(By.tagName("header"));
            // tag name-> div, header, strong,a;
            header.click();
            //css-> class ->.clasName(class property)
            //xpath ->//tagName[@property='value']->
            WebElement formsCard = driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[2]"));
            formsCard.click();

            WebElement practiceForm = driver.findElement(By.xpath("(//li[@id='item-0'])[2]"));
            practiceForm.click();
            currentUrl = driver.getCurrentUrl();
            title = driver.getTitle();
            Assert.assertEquals(currentUrl,"https://demoqa.com/automation-practice-form");

            driver.findElement(By.id("firstName")).sendKeys("katea");
            driver.findElement(By.id("lastName")).sendKeys("Manoila");
            driver.findElement(By.id("userEmail")).sendKeys("katea@gmai.com");
            driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
            driver.findElement(By.id("userEmail")).sendKeys("0123456789");



            WebElement calendar = driver.findElement(By.id("dateOfBirthInput"));
            calendar.click();
            WebElement selectMonth = driver.findElement(By.cssSelector(".react-datepicker__month-selectMonth"));
            Select selectBirthMonth = new Select(selectMonth);
            selectBirthMonth.selectByIndex(1);
            WebElement selectYear = driver.findElement(By.cssSelector(".react-datepicker__yeat-select"));
            Select selectBirthYear = new Select(selectYear);
            selectBirthYear.selectByValue("1993");
            driver.findElement(By.cssSelector(".react-datepicker__day.react-datepicker__day--015")).click();



            WebElement subjects = driver.findElement(By.id("subjectsInput" ));subjects.sendKeys("Math");
            subjects.sendKeys(Keys.RETURN);
            subjects.sendKeys("Acc");
            subjects.sendKeys(Keys.RETURN);
            driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")).click();
            driver.findElement(By.id("currentAddress")).sendKeys("Home address");
            WebElement state = driver.findElement(By.id("react-select-3-input"));
            state.sendKeys("Uttar");
            state.sendKeys(Keys.RETURN);
            WebElement city = driver.findElement(By.id("react-select-4-input"));
            city.sendKeys("Agra");
            city.sendKeys(Keys.RETURN);



        }catch (Exception e){
            String errorMessage = e.getMessage();
            System.out.println(errorMessage);

        }




    }
    @Test
    public void demoQaLoginTest(){
        driver.get("https://demoqa.com");
        title = driver.getTitle();
        currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(title,"DEMOQA");
        Assert.assertEquals(currentUrl,"https://demoqa.com/");
        System.out.println(currentUrl);

    }






}
