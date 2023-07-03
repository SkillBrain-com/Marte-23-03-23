package org.skillbrain;

import Utilities.Utils;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.BasicAjaxPage;

public class BasicAjaxRunTest {


    private ChromeDriver driver;
    private String currentURL;

    private String title;

    private BasicAjaxPage BasicAjaxPage;


    @BeforeSuite
    public void initializeDriver() {
        driver = Utils.getChromeDriver();

    }

    @BeforeSuite(dependsOnMethods = "initializeDriver")
    public void initializePage() {
        BasicAjaxPage = new BasicAjaxPage(driver);

    }

    @AfterSuite
    public void closeDriver() {
        driver.quit();
    }


    @Test(testName = "Validating results for AjaxPage")
    public void ajaxPageSelection() {
        driver.get("https://testpages.herokuapp.com/styled/basic-ajax-test.html");

        BasicAjaxPage.categoryList.click();
        Select selectCategory = new Select(BasicAjaxPage.categoryList);
        selectCategory.selectByIndex(1);


        BasicAjaxPage.languageList.click();
        Select selectList = new Select(BasicAjaxPage.categoryList);
        selectList.selectByIndex(1);
        BasicAjaxPage.languageList.click();


        BasicAjaxPage.codeInItButton.click();

    }


    @DataProvider(name = "dataProviderAjaxPage")
    public Object[][] dataProviderAjaxPage() {
        return new Object[][]{
                {1, 0},
                {1, 1},
                {1, 2},
                {2, 10},
                {2, 11},
                {2, 12},
                {2, 13},
                {3, 20},
                {3, 21},
                {3, 22},
                {3, 23},
        };

    }

    @Test(dataProvider = "dataProviderAjaxPage", testName = "Testing different choices from a WebPage")
    public void ajaxPageTestPage(Integer PAGE_CHOICES_dataProviderAjaxPage) {
        driver.get("https://testpages.herokuapp.com/styled/basic-ajax-test.html" + PAGE_CHOICES_dataProviderAjaxPage);




    }


}
















