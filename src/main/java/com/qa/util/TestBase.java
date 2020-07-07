package com.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase(){
		try{
			prop=new Properties();
			FileInputStream fis = new FileInputStream("G:/Eclipse Worspace/FreeCRMpom/src/main/java/com/qa/config/config.properties");
			prop.load(fis);
			
		}catch (IOException e){
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void Initillization(){
		
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")){
			
			System.setProperty("webdriver.chrome.driver", "");
			driver=new ChromeDriver();
		}
		
	}

}
