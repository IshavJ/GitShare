import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.net.MalformedURLException;

public class Alarm {
    public static void main(String[] args) throws MalformedURLException {
        Driver.desiredCap();

        //alarm button
        Driver.runner.findElementByAccessibilityId("Alarm").click();

        //switch
        WebElement Switch = Driver.runner.findElementByXPath("(//android.widget.Switch[@text=\"OFF\"])[1]");

        //setting alarm
        Switch.click();

        //Assertion
        try{
            Assert.assertFalse(Switch.isDisplayed());
        }catch (Throwable t){
            System.out.println("Switch Visible");
        }

        //closed
        Driver.runner.quit();
    }
}
