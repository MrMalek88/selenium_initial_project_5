import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

import java.util.List;

public class TestCase2 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://automationexercise.com/");

        List<WebElement> headerItems = driver.findElements(By.xpath("//ul[@class='nav navbar-nav']"));

        //String[] headers = {"Home", "Products", "Cart", "Signup / Login","Test Cases", "API Testing", "Video Tutorials", "Contact us"};

        for (WebElement item: headerItems) {
            System.out.println(item.getText());
            if(item.isDisplayed() && item.isEnabled()) System.out.println("Validation passed!");
            else System.out.println("failed!!!");

        }
    }
}
