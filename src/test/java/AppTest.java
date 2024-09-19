import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URI;

public class AppTest {
    static AppiumDriver driver;
    public static void main(String[] args) throws MalformedURLException, URISyntaxException {
    openMobileApp();
    }

    public static void openMobileApp() throws MalformedURLException, URISyntaxException {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("deviceName", "Pixel 7 API 34");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("platformName", "Android");
        cap.setCapability("automationName", "uiAutomator2");
        cap.setCapability("platformVersion", "14");
        cap.setCapability("appPackage", "com.reddit.frontpage");
        cap.setCapability("appActivity", "com.reddit.launch.main.MainActivity");

        URI uri = new URI("http://192.168.213.240:4723/");
        URL url = uri.toURL();
        driver = new AppiumDriver(url,cap);

        System.out.println("Application started");
    }
}
