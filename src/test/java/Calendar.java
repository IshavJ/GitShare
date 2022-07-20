import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calendar {
    public static void main(String[] args) {
        WebDriverWait wait = new WebDriverWait(Driver.runner,10);
        //changing view
        Driver.runner.findElementById("com.simplemobiletools.calendar:id/change_view").click();

        //daily view
        Driver.runner.findElementByXPath("(//android.widget.RadioButton)[1]").click();

        //new Event button
        Driver.runner.findElementByAccessibilityId("New Event").click();

        //title
        WebElement title =  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.simplemobiletools.calendar:id/event_title")));
        title.click();
        title.sendKeys("Discussion Session");

        //location
        WebElement location = Driver.runner.findElementById("com.simplemobiletools.calendar:id/event_location");
        location.click();
        location.sendKeys("IT Park");

        //switch
        Driver.runner.findElementById("com.simplemobiletools.calendar:id/event_all_day").click();

        //saving
        Driver.runner.findElementById("com.simplemobiletools.calendar:id/save").click();

        //alert
        Driver.runner.findElementByXPath("//android.widget.Button[@text='OK']").click();

        System.out.println("Clear");
    }
}
