package TestNG_Practice_june2023;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

public class NewTest {
	
	public WebDriver driver;
	private String BaseURL = "https://magento.softwaretestingboard.com/customer/account/create/";
	public String FirstName = "Naved";
	public String LastName = "Sayed";
	public String Email = "navedsayed300499@gmail.com";
	public String Password = "ABCDEFG@1234";
	public String ConfirmPassword = "ABCDEFG@1234";
	
	
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Browser has Invoked");
	  ChromeOptions co = new ChromeOptions();
	  co.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
	  System.setProperty("webdriver.chrome.driver", "C:\\JAVA JARS\\driver\\chromedriver.exe");
	  driver = new ChromeDriver(co);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
  }
  @Test
  public void f() throws InterruptedException {
	  System.out.println("First set of test suite running");
	  driver.get(BaseURL);
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@id='firstname']")).clear();
	  Thread.sleep(1500);
	  driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(FirstName);
	  Thread.sleep(1500);
	  driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(LastName);
	  Thread.sleep(1500);
	  driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys(Email);
	  Thread.sleep(1500);
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Password);
	  Thread.sleep(1500);
	  driver.findElement(By.xpath("//input[@id='password-confirmation']")).sendKeys(ConfirmPassword);
	  Thread.sleep(1500);
	  driver.findElement(By.xpath("//button[@class='action submit primary']")).click();
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Broswer is closed");
	  driver.close();
  }

}
