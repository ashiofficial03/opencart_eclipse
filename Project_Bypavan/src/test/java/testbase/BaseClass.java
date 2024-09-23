package testbase;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import pageObjects.AccountRegistrationPage;

public class BaseClass {
public WebDriver driver;
public Logger logger;
public Properties pr1;


@BeforeClass
@Parameters({"os","br"})
public void setup(String os, String br) throws Exception  {
	
	logger=LogManager.getLogger(this.getClass());
	pr1=new Properties();
	FileReader file=new FileReader("./src/test/resources/config.properties");
	pr1.load(file);
	System.out.println(pr1.getProperty("name"));
	
	switch(br) {
	case "chrome":driver=new ChromeDriver(); break;
	case "edge":driver=new EdgeDriver();break;
	case "firefox":driver=new FirefoxDriver();break;
	default :System.out.println("Enter valid broser name");
	return;
	}
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get(pr1.getProperty("link1"));
	
}
@AfterClass
public void TearDown() {
	driver.quit();
	
}

public String randomstring() {

String  rs=RandomStringUtils.randomAlphabetic(5);
return rs;
}
public String randomnumber() {

String  rn=RandomStringUtils.randomNumeric(10);
return rn;
}
public String randomnAphanumeric() {

String  ran=RandomStringUtils.randomAlphanumeric(10);
return ran;
}

}
