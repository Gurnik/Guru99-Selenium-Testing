import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {

    public static void main(String[] args) {
        String baseUrl = "http://demo.guru99.com/test/accessing-link.html";
        // System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(baseUrl);
        driver.findElement(By.partialLinkText("here")).click();
        System.out.println("Title of page is: " + driver.getTitle());
        driver.quit();
    }
    /*
    public static void main(String[] args) {
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(baseUrl);
        String theLinkText = driver.findElement(By
                .partialLinkText("egis"))
                .getText();
        System.out.println(theLinkText);
        theLinkText = driver.findElement(By
                .partialLinkText("EGIS"))
                .getText();
        System.out.println(theLinkText);

        driver.quit();

    }
     */
    /*
        public static void main(String[] args) {
        String baseUrl = "http://demo.guru99.com/test/block.html";
        System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(baseUrl);
        driver.findElement(By.partialLinkText("Inside")).click();
        System.out.println(driver.getTitle());
        driver.navigate().back();
        driver.findElement(By.partialLinkText("Outside")).click();
        System.out.println(driver.getTitle());
        driver.quit();
    }
     */
}