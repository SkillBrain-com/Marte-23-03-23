package Utilities;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Utils {



    public static RemoteWebDriver getRemoteWebDriver() throws MalformedURLException {

        URL urlGrid = new URL("http://192.168.100.18:4444");
        return new RemoteWebDriver(urlGrid,  new ChromeOptions() );
    }
    public static void main(String[] args) throws IOException {
        System.out.println(LocalDate.now());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm");
        System.out.println(formatter.format(LocalDateTime.now()));

    }

    public static ChromeDriver getChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
//        chromeOptions.addArguments("headless");
        ChromeDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return driver;


    }

    public static void takeScreenShot(WebDriver driver) throws IOException {
        String destinationFile = null;
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File source = screenshot.getScreenshotAs(OutputType.FILE);
        destinationFile = System.getProperty("user.dir") + "/Logs/printscreen.jpeg";
        FileUtils.copyFile(source, new File(destinationFile));


    }


}
