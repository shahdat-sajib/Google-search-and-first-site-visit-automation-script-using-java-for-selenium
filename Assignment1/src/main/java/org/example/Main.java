package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Main {
    public static WebDriver selectBrowser(String browserName) {
        WebDriver driver = null;
        if (browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().arch64().setup();
            driver= new ChromeDriver();
            System.out.println("I'm in the Chrome browser!");
        } else if (browserName.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().arch64().setup();
            driver= new FirefoxDriver();
            System.out.println("I'm in the Firefox browser!");
        } else if (browserName.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().arch64().setup();
            driver = new EdgeDriver();
            System.out.println("I'm in the Edge browser!");
        } else {
            System.out.println("Invalid Browser");
        }
        return driver;
    }
    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\BJIT\\IdeaProjects\\test2\\drivers\\chromedriver.exe");
//        WebDriver driver= new ChromeDriver();

//        WebDriverManager.chromedriver().arch64().setup();
//        WebDriver driver= new ChromeDriver();

//        WebDriverManager.firefoxdriver().setup();
//        WebDriver driver= new FirefoxDriver();


//        for(int i=1; i<11; i++){
//            System.out.println("Hello world! line: "+i);
//        }
//        System.out.println("Hello world!");
//        driver.get("https://google.com");

//        WebDriverManager.chromedriver().arch64().setup();
//        WebDriver driver= new ChromeDriver();
//
//        String URL = "https://www.google.com";
//
//        driver.get(URL);
//        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//
//        System.out.println("Website is opened successfully");
//
//        driver.close();
        WebDriver driver = selectBrowser("chrome");
        if(driver == null){
            System.out.println("Task Ended");
        }else {
            driver.get("https://google.com");
            driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("bjitgroup", Keys.ENTER);
            driver.findElement(By.tagName("h3")).click();
            driver.quit();
        }

    }
}