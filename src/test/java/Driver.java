import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.net.MalformedURLException;
import java.net.URL;

public class Driver {
    public static AppiumDriver<MobileElement> runner;
    public static DesiredCapabilities desiredCap;

    public static void skip(){
        WebDriverWait wait = new WebDriverWait(Driver.runner,30);
        WebElement skip = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.ril.ajio:id/login_toolbar_tv_skip")));
        Assert.assertEquals(skip.getText(),"Skip");
        skip.click();
    }

    public static void desiredCap() throws MalformedURLException {
        desiredCap = new DesiredCapabilities();
        desiredCap.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
        desiredCap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        //calender capabilities
        //desiredCap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.simplemobiletools.calendar");
        //desiredCap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.simplemobiletools.calendar.activities.MainActivity");

        //Myntra Capabitlities
        //desiredCap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.myntra.android");
        //desiredCap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.myntra.android.activities.react.ReactActivity");

        //Ajio
        desiredCap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.ril.ajio");
        desiredCap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.ril.ajio.home.category.activity.HomeCategoryActivity");

        try{
            runner = new AppiumDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCap);
            System.out.println("Established");
        }
        catch (Throwable t){
            System.out.println("Not Established");
        }
    }

}
