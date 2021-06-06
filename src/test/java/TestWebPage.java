import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWebPage
{
 public static void main(String[] args) throws InterruptedException {
    
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

    driver.get("https://www.google.com/");
    driver.quit();
    
}
}