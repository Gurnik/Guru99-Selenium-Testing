package Guru99Demo;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AlertsDemo {
    public static void main(String args[]) throws IOException {
        // System.setProperty("webdriver.chrome.driver", "D:\\Data_Personal\\Software\\chromedriver_win32\\chromedriver.exe");;
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/basic_auth.php");
        // Handling Username alert
        driver.switchTo().alert().sendKeys("guru99");
        driver.switchTo().alert().accept();
        // Handling Password alert
        driver.switchTo().alert().sendKeys("guru99");
        driver.switchTo().alert().accept();
    }
}