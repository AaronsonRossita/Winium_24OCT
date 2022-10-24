import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.Test;

import java.net.URL;

public class CalculatorTest {

    @Test
    void testOne() throws Exception {
        DesktopOptions options = new DesktopOptions();
        options.setApplicationPath("C:\\Windows\\System32\\calc.exe");
        WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"),options);
        Thread.sleep(5000);
        driver.findElement(By.id("num1Button")).click();
        driver.findElement(By.id("plusButton")).click();
        driver.findElement(By.id("num2Button")).click();
        driver.findElement(By.id("equalButton")).click();
        String result = driver.findElement(By.id("CalculatorResults")).getAttribute("Name");
        System.out.println(result);
    }

    @Test
    void testTwo() throws Exception{
        DesktopOptions options = new DesktopOptions();
        options.setApplicationPath("C:\\Users\\User\\Desktop\\New Text Document.txt");
        URL url = new URL("http://localhost:9999");
        WiniumDriver driver = new WiniumDriver(url,options);
        Thread.sleep(5000);
        driver.findElement(By.id("15")).sendKeys("Hello");
    }

}
