package org.skillbrain;

import Utilities.Utils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.DemoQaPage;

import java.net.MalformedURLException;

public class DemoQaTutorial {

    private RemoteWebDriver driver;
    private String currentURL;
    private String title;
    private DemoQaPage DemoQaPage;


    @BeforeSuite
    public void initializeDriver() throws MalformedURLException {

        driver = Utils.getRemoteWebDriver();

    }

    @BeforeSuite(dependsOnMethods = "initializeDriver")
    public void initializePage() {
        DemoQaPage = new DemoQaPage(driver);
    }

    @AfterSuite
    public void closeDriver() {
        driver.quit();
    }


    @Test(dependsOnMethods = "demoQaLoginTest", testName = "Complete practice form with valid data")
    public void demoQaFormTestRefactored() {
        DemoQaPage.formsCard.click();
        DemoQaPage.practice_Form.click();
        currentURL = driver.getCurrentUrl();
        Assert.assertEquals(currentURL, "https://demoqa.com/automation-practice-form");
        DemoQaPage.firstNameId.sendKeys("Cristan");
        DemoQaPage.lastNameId.sendKeys("Sandu");
        DemoQaPage.userEmail.sendKeys("test@gmail.com");
        DemoQaPage.maleRadioButton.click();
        DemoQaPage.userNumber.sendKeys("+4012324255");
        DemoQaPage.calendar.click();
        Select selectMonth = new Select(DemoQaPage.monthOfBirth);
        selectMonth.selectByIndex(4);
        Select selectYear = new Select(DemoQaPage.yearOfBirth);
        selectYear.selectByValue("1993");
        DemoQaPage.dateOfBirth.click();
        DemoQaPage.userInput.sendKeys("Math");
        DemoQaPage.userInput.sendKeys(Keys.RETURN);
        DemoQaPage.userInput.sendKeys("Acc");
        DemoQaPage.userInput.sendKeys(Keys.RETURN);
        Actions actions = new Actions(driver);
        actions.scrollToElement(DemoQaPage.hobbiesCheckBox).build().perform();
        DemoQaPage.hobbiesCheckBox.click();
        DemoQaPage.homeAdress.sendKeys("HOme");
        DemoQaPage.selectState.sendKeys("Uttar");
        DemoQaPage.selectState.sendKeys(Keys.RETURN);
        DemoQaPage.selectCity.sendKeys("Agra");
        DemoQaPage.selectCity.sendKeys(Keys.RETURN);
        DemoQaPage.submitButton.click();
        System.out.println("Test finished without error");
    }



//    @Test(dependsOnMethods = "demoQaLoginTest", testName = "Complete Practice Form with valid data")
//    public void demoQaFormTest() {
//
//
//        WebElement formsCard = driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[2]"));
//        formsCard.click();
//
//
//        WebElement practiceForm = driver.findElement(By.xpath("(//li[@id='item-0']) [2]"));
//        practiceForm.click();
//
//        currentURL = driver.getCurrentUrl();
//        title = driver.getTitle();
//        Assert.assertEquals(currentURL, "https://demoqa.com/automation-practice-form");
//
//        driver.findElement(By.id("firstName")).sendKeys("Mustafa");
//
//
//        driver.findElement(By.id("lastName")).sendKeys("Fayed");
//
//
//        driver.findElement(By.id("userEmail")).sendKeys("fayed1111@gmail.com");
//
//
//        driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
//
//
//        driver.findElement(By.id("userNumber")).sendKeys("0721460866");
//
//
//        driver.findElement(By.id("dateOfBirthInput")).click();
//        WebElement selectMonth = driver.findElement(By.cssSelector(".react-datepicker__month-select"));
//        Select selectBirthMonth = new Select((selectMonth));
//        selectBirthMonth.selectByIndex(6);
//
//        WebElement selectYear = driver.findElement(By.cssSelector(".react-datepicker__year-select"));
//        Select selectBirthYear = new Select(selectYear);
//        selectBirthYear.selectByValue("1990");
//        driver.findElement(By.cssSelector(".react-datepicker__day.react-datepicker__day--029")).click();
//
//        driver.findElement(By.id("subjectsInput")).click();
//        WebElement subjects = driver.findElement(By.id("subjectsInput"));
//        subjects.sendKeys("Maths");
//        subjects.sendKeys(Keys.ENTER);
//
//        driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")).click();
//        driver.findElement(By.id("currentAddress")).sendKeys("Home address");
//
//        WebElement state = driver.findElement(By.id("react-select-3-input"));
//        state.sendKeys("Uttar");
//        state.sendKeys(Keys.ENTER);
//
//        WebElement city = driver.findElement(By.id("react-select-4-input"));
//        city.sendKeys("Agra");
//        city.sendKeys(Keys.ENTER);
//
//        driver.findElement(By.id("submit")).click();
//
//
//    }

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


    @DataProvider(name = "myDataProvider")
    public Object[][] myDataProvider() {
        return new Object[][]{
                {"elements"},
                {"forms"},
                {"alertsWindows"},
                {"books"},
                {"widgets"},

        };
    }

    @Test(dataProvider= "myDataProvider",testName = "Testing different URLS for demoqa page")
    public void demoQaTestUrls(String URL_LINKS_myDataProvider) {
        driver.get("https://demoqa.com/" + URL_LINKS_myDataProvider);
        System.out.println(URL_LINKS_myDataProvider);

    }

}








