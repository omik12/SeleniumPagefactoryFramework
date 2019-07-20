package controller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScriptBase {
    @Test
    public void init(String email,String email_sendkey,String Pass,String sendKeyPass){
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
        System.out.println("sigin in button");
        driver.findElement(By.name(""+email+"")).sendKeys(""+email_sendkey+"");
        System.out.println("email input properly");
        driver.findElement(By.name(""+Pass+"")).sendKeys(""+sendKeyPass+"");
        System.out.println("password input properly");
        driver.findElement(By.xpath("//*[@id='SubmitLogin']/span")).click();
        System.out.println("submit button clickable");
        driver.findElement(By.xpath("//*[@id='footer']//a[@title='Specials'")).isDisplayed();
        driver.close();
        driver.quit();






    }




}
