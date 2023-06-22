package org.skillbrain;

import Utilities.Utils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pageObjects.DemoQaPage;

public class DemoQaTutorial {

    private ChromeDriver driver;
    private String currentUrl;
    private String title;
    private DemoQaPage demoQaPage;

    @BeforeSuite
    public void initializeDriver() {
        driver = Utils.getChromeDriver();
    }

    @BeforeSuite(dependsOnMethods = "initializeDriver")
    public void initializePage() {
        demoQaPage = new DemoQaPage(driver);
    }

    @AfterSuite
    public void closeDriver() {
        driver.quit();
    }

    @Test(dependsOnMethods = "demoQaLoginTest", testName = "Complete practice form with valid data")
    public void demoQaFormTestRefactored() {
        demoQaPage.formsCard.click();
        demoQaPage.practiceForm.click();
        currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://demoqa.com/automation-practice-form");
        demoQaPage.firstName.sendKeys("Cristan");
        demoQaPage.lastName.sendKeys("Sandu");
        demoQaPage.userEmail.sendKeys("test@gmail.com");
        demoQaPage.maleRadioButton.click();
        demoQaPage.userNumber.sendKeys("+4012324255");
        demoQaPage.doB.click();
        Select selectMonth = new Select(demoQaPage.selectMonth);
        selectMonth.selectByIndex(4);
        Select selectYear = new Select(demoQaPage.selectYear);
        selectYear.selectByValue("1993");
        demoQaPage.selectDay.click();
        demoQaPage.subjectInput.sendKeys("Math");
        demoQaPage.subjectInput.sendKeys(Keys.RETURN);
        demoQaPage.subjectInput.sendKeys("Acc");
        demoQaPage.subjectInput.sendKeys(Keys.RETURN);
        demoQaPage.checkHobbies.click();
        demoQaPage.homeAddress.sendKeys("HOme");
        demoQaPage.selectState.sendKeys("Uttar");
        demoQaPage.selectState.sendKeys(Keys.RETURN);
        demoQaPage.selectCity.sendKeys("Agra");
        demoQaPage.selectCity.sendKeys(Keys.RETURN);
        System.out.println("Test finished without error");
    }

    @Test(dependsOnMethods = "demoQaLoginTest", testName = "Complete practice form with valid data")
    public void demoQaFormTest() throws InterruptedException {
        try {
            // tag name -> div, header, strong, a
            WebElement header = driver.findElement(By.tagName("header"));
//        header.click();
            // css -> class -> .className  (class property)
            // xpath -> //tagName[@property='value'] ->
            WebElement formsCard = driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[2]"));
            formsCard.click();
            WebElement practiceForm = driver.findElement(By.xpath("(//li[@id='item-0'])[2]"));
            practiceForm.click();
            currentUrl = driver.getCurrentUrl();
            title = driver.getTitle();
            Assert.assertEquals(currentUrl, "https://demoqa.com/automation-practice-form");
            driver.findElement(By.id("firstName")).sendKeys("Cristian");
            driver.findElement(By.id("lastName")).sendKeys("Sandu");
            driver.findElement(By.id("userEmail")).sendKeys("test@gmail.com");
            driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
            driver.findElement(By.id("userNumber")).sendKeys("0123456789");
            WebElement calendar = driver.findElement(By.id("dateOfBirthInput"));
            calendar.click();
            WebElement selectMonth = driver.findElement(By.cssSelector(".react-datepicker__month-select"));
            Select selectBirthMonth = new Select(selectMonth);
            selectBirthMonth.selectByIndex(4);
            WebElement selectYear = driver.findElement(By.cssSelector(".react-datepicker__year-select"));
            Select selectBirthYear = new Select(selectYear);
            selectBirthYear.selectByValue("1993");
            driver.findElement(By.cssSelector(".react-datepicker__day.react-datepicker__day--015")).click();
            WebElement subjects = driver.findElement(By.id("subjectsInput"));
            subjects.sendKeys("Math");
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
        } catch (NoSuchElementException | ElementNotInteractableException |
                 StaleElementReferenceException e) {
            String errorMessage = e.getMessage();
            System.out.println(errorMessage);
        }
    }

    @Test(testName = "Login to demoqa page with valid user")
    public void demoQaLoginTest() throws InterruptedException {
        driver.get("https://demoqa.com");
        title = driver.getTitle();
        currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(title, "DEMOQA");
        Assert.assertEquals(currentUrl,"https://demoqa.com/");
    }


}
