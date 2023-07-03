package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoQaPage {

    private static final String HEADER = "header";
    private static final String FORM_CARD = "(//div[@class='card mt-4 top-card'])[2]";
    private static final String PRACTICE_FORM = "(//li[@id='item-0']) [2]";

    private static final String FIRST_NAME_ID = "firstName";

    private static final String LAST_NAME_ID = "lastName";

    private static final String USER_EMAIL = "userEmail";

    private static final String MALE_RADIOBUTTON = "//label[@for='gender-radio-1']";

    private static final String USER_NUMBER = "userNumber";

    private static final String DATE_OF_BIRTH = ".react-datepicker__day.react-datepicker__day--015";
    private static final String Calendar = "dateOfBirthInput";
    private static final String MONTH_OF_BIRTH = ".react-datepicker__month-select";

    private static final String YEAR_OF_BIRTH = ".react-datepicker__year-select";

    private static final String USER_INPUT = "subjectsInput";

    private static final String HOBBIES_CHECKBOX = "//label[@for='hobbies-checkbox-1']";

    private static final String SELECT_STATE = "react-select-3-input";

    private static final String SELECT_CITY = "react-select-4-input";

    private static final String HOME_ADDRESS = "currentAddress";

    private static final String SUBMIT = "submit";

    @FindBy(id = Calendar)
    public WebElement calendar;

    @FindBy(css = MONTH_OF_BIRTH)
    public WebElement monthOfBirth;

    @FindBy(id = SUBMIT)
    public WebElement submitButton;

    @FindBy(id = HOME_ADDRESS)
    public WebElement homeAdress;

    @FindBy(id = SELECT_CITY)
    public WebElement selectCity;

    @FindBy(id= SELECT_STATE)
    public WebElement selectState;

    @FindBy(xpath = HOBBIES_CHECKBOX)
    public WebElement hobbiesCheckBox;
    @FindBy(id = USER_INPUT)
    public WebElement userInput;

    @FindBy(css = YEAR_OF_BIRTH)
    public WebElement yearOfBirth;
    @FindBy(css = DATE_OF_BIRTH)
    public WebElement dateOfBirth;

    @FindBy(id = USER_NUMBER)
    public WebElement userNumber;
    @FindBy(xpath = MALE_RADIOBUTTON)
    public WebElement maleRadioButton;

    @FindBy(id = USER_EMAIL)
    public WebElement userEmail;
    @FindBy(id = LAST_NAME_ID)
    public WebElement lastNameId;
    @FindBy(id = FIRST_NAME_ID)
    public WebElement firstNameId;

    @FindBy(xpath = PRACTICE_FORM)
    public WebElement practice_Form;
    @FindBy(xpath = FORM_CARD)
    public WebElement formsCard;
    @FindBy(tagName = HEADER)
    public WebElement headerElement;

    public DemoQaPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }


}


