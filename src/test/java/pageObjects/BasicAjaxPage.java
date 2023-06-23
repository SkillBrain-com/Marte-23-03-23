package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasicAjaxPage {

    private static final String CATEGORY_LIST = "//select[@id='combo1']";
    private static final String LANGUAGE_LIST = "//select[@id='combo2']";
    private static final String CODE_IN_IT_BUTTON = "//input[@class = 'styled-click-button']";








    @FindBy(xpath = CATEGORY_LIST)
    public WebElement categoryList;

    @FindBy(xpath = LANGUAGE_LIST)
    public WebElement languageList;

    @FindBy(xpath = CODE_IN_IT_BUTTON)
    public WebElement codeInItButton;



    public BasicAjaxPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }



}
