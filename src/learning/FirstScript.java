package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstScript {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "~/Downloads/chromedrive");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://web.facebook.com/");
        driver.findElement(By.id("u_0_m")).sendKeys("Jirawan");
        driver.findElement(By.id("u_0_o")).sendKeys("Jirawan");
        driver.findElement(By.id("u_0_r")).sendKeys("111111");
        driver.findElement(By.id("u_0_w")).sendKeys("2tfytujgyujgyuj67890-2222");
        Select day = new Select(driver.findElement(By.id("day")));
        day.selectByVisibleText("5");
        Select month = new Select(driver.findElement(By.id("month")));
        month.selectByVisibleText("ก.พ.");
        driver.findElement(By.xpath("//input[@value='1']")).click();
        driver.findElement(By.xpath("//button[@name='websubmit']")).click();
        Thread.sleep(1000);
        driver.close();
    }
}
