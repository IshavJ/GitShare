import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.net.MalformedURLException;

public class Ajio {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        //initilizations
        Driver.desiredCap();
        WebDriverWait wait = new WebDriverWait(Driver.runner, 30);

        //selecting men section
        Driver.runner.findElementById("com.ril.ajio:id/category_detailview_imv_two").click();

        //Home page
        WebElement searchUnderBar = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.ril.ajio:id/row_search_component_layout")));
        searchUnderBar.click();
        searchUnderBar.click();

        //Search Bar
        WebElement searchBarKeys = Driver.runner.findElementById("com.ril.ajio:id/search_src_text");
        searchBarKeys.click();
        searchBarKeys.sendKeys("watches" + "\\n");

        //Item Page
        WebElement watch = Driver.runner.findElementByXPath("//android.widget.TextView[@text='FS5164I Analogue Watch with Chain Strap']");
        watch.click();
        watch.click();

        //Assertion
        WebElement color = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.ril.ajio:id/pdp_tv_selected_color")));
        Assert.assertEquals(color.getText(), "Black");

        //Add to bag
        WebElement addToBag = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.ril.ajio:id/add_to_cart_layout_tv")));
        Assert.assertTrue(addToBag.isDisplayed());
        addToBag.click();
        //wait
        addToBag.click();

        //proceed shopping
        WebElement proceedToshop = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.ril.ajio:id/fragment_cart_list_tv_proceed")));
        Assert.assertTrue(proceedToshop.isDisplayed());
        proceedToshop.click();

        Driver.skip();

        //confirmOrder
        WebElement confirmation = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.ril.ajio:id/fragment_cart_list_tv_proceed")));
        Assert.assertTrue(confirmation.isDisplayed());
        confirmation.click();

        //login Field Assertion
        WebElement loginField = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.ril.ajio:id/tv_login_emailid_mobile_label")));
        Assert.assertTrue(loginField.isDisplayed());

        //Continue Button Asssertion
        Assert.assertTrue(Driver.runner.findElementById("com.ril.ajio:id/btn_login_checkuser").isDisplayed());

        //Title Assertion
        Assert.assertEquals(Driver.runner.findElementById("com.ril.ajio:id/tv_login_header").getText(), "Welcome to AJIO");

        //google button assertion
        Assert.assertTrue(Driver.runner.findElementById("com.ril.ajio:id/google_login_layout").isDisplayed());

        Driver.runner.quit();
    }
}
