package Mobile;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserStackSample {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        DesiredCapabilities caps = new DesiredCapabilities();

        // Set your access credentials
        caps.setCapability("browserstack.user", "fannyrestuanindy_BvicV6");
        caps.setCapability("browserstack.key", "WS7MqKgA8r1qZsaMipUW");

        // Set URL of the application under test
        caps.setCapability("app", "bs://bfe64c99b69c4427a29a26099d8a1f48ba14cb5d");

        // Specify device and os_version for testing
        caps.setCapability("device", "Google Pixel 2");
        caps.setCapability("os_version", "9.0");

        // Set other BrowserStack capabilities
        caps.setCapability("project", "ToDo Project");
        caps.setCapability("build", "Build - 2022/02/12");
        caps.setCapability("name", "first_test");


        // Initialise the remote Webdriver using BrowserStack remote URL
        // and desired capabilities defined above
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
                new URL("http://hub.browserstack.com/wd/hub"), caps);

        // Write your test case statements here
        
        Thread.sleep(2000);
        MobileElement klikButtonSignIn=
                driver.findElement(By.xpath("//android.widget.TextView[@text='Sign inwith Google']"));
        klikButtonSignIn.click();
        Thread.sleep(3000);
        MobileElement emailButton =
                driver.findElement(By.id("com.google.android.gms:id/account_display_name"));
        emailButton.click();
        Thread.sleep(7000);
        MobileElement continueButton =
                driver.findElement(By.xpath("//android.widget.Button[@text='Continue']"
                ));
        continueButton.click();
        Thread.sleep(6000);
        // Invoke driver.quit() after the test is done to indicate that the test is completed.
        driver.quit();
        }
}
