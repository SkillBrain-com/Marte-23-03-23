package Utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Utils {

    public static void main(String[] args) throws IOException {
        System.out.println(LocalDateTime.now());

    }

    public static ChromeDriver getChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
//        chromeOptions.addArguments("headless");
        ChromeDriver driver = new ChromeDriver(chromeOptions);
        return driver;
    }

    public static void takeScreenshot(WebDriver driver) throws IOException {
        String destinationFile = null;
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File source = screenshot.getScreenshotAs(OutputType.FILE);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss");
        destinationFile = System.getProperty("user.dir")
                + "/logs/printscreen-"+ formatter.format(LocalDateTime.now()) + ".png";
        FileUtils.copyFile(source, new File(destinationFile));
    }




}
