package Mobile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Latihan<Public> {
    private static AppiumDriver<MobileElement> driver;
    private static DesiredCapabilities capabilities;

    public static void main(String[] args) throws MalformedURLException,
            InterruptedException {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "135814dd");
        capabilities.setCapability("udid", "135814dd");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "10");
        capabilities.setCapability("app", "C:\\Users\\Fanny Restu Anindi\\Downloads\\ToDo.apk");
        //capabilities.setCapability("appPackage", "staging.cicle");
        //capabilities.setCapability("appActivity", "staging.cicle.MainActivity");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(url, capabilities);

        driver.findElement(By.id("fab")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("editTextTitre")).sendKeys("BelajarMobile");
//        Thread.sleep(2000);
//        MobileElement klikButtonSignIn=
//                driver.findElement(By.xpath("//android.widget.TextView[@text='Sign inwith Google']"));
//        klikButtonSignIn.click();
//        Thread.sleep(3000);
//        MobileElement emailButton =
//                driver.findElement(By.id("com.google.android.gms:id/account_display_name"));
//        emailButton.click();
//        Thread.sleep(7000);
//        MobileElement continueButton =
//                driver.findElement(By.xpath("//android.widget.Button[@text='Continue']"
//                ));
//        continueButton.click();
//        Thread.sleep(6000);
//        driver.quit();
    }
}

