import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.sql.Driver;

public class AjioMain
{
    public static void main(String[] args) throws MalformedURLException {
        Ajio.desiredCap();

        Actions action=new Actions(Ajio.Driver);
        WebDriverWait obj = new WebDriverWait(Ajio.Driver,30);

        WebElement menClick=obj.until(ExpectedConditions.presenceOfElementLocated(By.id("com.ril.ajio:id/category_detailview_imv_two")));
        menClick.click();

        WebElement emptyClick=obj.until(ExpectedConditions.presenceOfElementLocated(By.id("com.ril.ajio:id/searchbar_layout")));
        emptyClick.click();
        WebElement searchClick=obj.until(ExpectedConditions.presenceOfElementLocated(By.id("com.ril.ajio:id/row_search_component_layout")));
        searchClick.click();

        WebElement searchType=obj.until(ExpectedConditions.presenceOfElementLocated(By.id("com.ril.ajio:id/search_src_text")));
        searchType.sendKeys("Caps"+"\\n"); //to enter

        Ajio.Driver.findElementByClassName("android.widget.ImageView").click();
        Ajio.Driver.findElementByXPath("(//android.widget.ImageView[@content-desc=\"Product Image Thumbnail\"])[1]").click();

        WebElement addToCart=obj.until(ExpectedConditions.presenceOfElementLocated(By.id("com.ril.ajio:id/add_to_cart_layout_tv")));
        addToCart.click();

        WebElement viewcart=obj.until(ExpectedConditions.presenceOfElementLocated(By.id("com.ril.ajio:id/pdp_toolbar_layout_cart")));
        viewcart.click();

        try
        {
        WebElement skip=obj.until(ExpectedConditions.presenceOfElementLocated(By.id("com.ril.ajio:id/login_toolbar_tv_skip")));
       skip.click();
        }
        catch (Throwable th)
        {
            System.out.println("error");
        }

        String verify=Ajio.Driver.findElementById("com.ril.ajio:id/toolbar_title").getText();

         Assert.assertEquals(verify,"Bag (1 items)");
        System.out.println();

    }
}
