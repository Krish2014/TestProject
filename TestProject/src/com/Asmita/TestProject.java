package com.Asmita;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestProject {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    
		System.setProperty("webdriver.chromedriver.driver","C:\\Selenium\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://todo-list-login.firebaseapp.com/");
		
		
		
		String parentWindow=driver.getWindowHandle();
		System.out.println("parent window ="+parentWindow);
		
		driver.findElement(By.xpath("//a[@class='btn btn-social btn-github']")).click();
       Thread.sleep(4000);
		
		
		Set <String> allwindowhandle=driver.getWindowHandles();
		System.out.println("all window ="+allwindowhandle);
		
				
		for(String childwindow1:allwindowhandle )
		{
			System.out.println("childwindows  ="+childwindow1);
		
		if (!(childwindow1.equalsIgnoreCase(parentWindow)))
		{
			driver.switchTo().window(childwindow1);
			String title=driver.getTitle();
			System.out.println("title is"  +title);
	
			if (title.contains("GitHub"))
			{
				
				Thread.sleep(2000);
				driver.findElement(By.id("login_field")).sendKeys("asmitasunil@gmail.com");
				//Thread.sleep(30);
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Pushpa@1958");
				driver.findElement(By.xpath("//input[@name='commit']")).click();
				
				Thread.sleep(6000);
				Set <String> allwindowhandle2=driver.getWindowHandles();
				System.out.println("all windows ="+allwindowhandle2);
				
				driver.switchTo().window(parentWindow);
				System.out.println(driver.getTitle());
		        int i;
				for(i=0;i<=9;i++)
				{
					String displayrandomstring=RandomStringUtils.randomAlphanumeric(1);
					
					driver.findElement(By.xpath("//body/ng-view[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys(displayrandomstring);
					
					driver.findElement(By.xpath("//button[normalize-space()='Add List']")).click();
					
					
					
				}
				
			
				driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
								
							
				driver.findElement(By.xpath("//a[@class='btn btn-social btn-github']")).click();
				
					
				
					
				driver.findElement(By.xpath("//body/ng-view[1]/div[1]/div[3]/div[1]/ul[1]/li[5]/div[1]/div[2]/button[1]")).click();
				driver.findElement(By.xpath("//body/ng-view[1]/div[1]/div[3]/div[1]/ul[1]/li[5]/div[1]/div[2]/button[1]")).click();
				driver.findElement(By.xpath("//body/ng-view[1]/div[1]/div[3]/div[1]/ul[1]/li[5]/div[1]/div[2]/button[1]")).click();
				driver.findElement(By.xpath("//body/ng-view[1]/div[1]/div[3]/div[1]/ul[1]/li[5]/div[1]/div[2]/button[1]")).click();
				driver.findElement(By.xpath("//body/ng-view[1]/div[1]/div[3]/div[1]/ul[1]/li[5]/div[1]/div[2]/button[1]")).click();
				driver.findElement(By.xpath("//body/ng-view[1]/div[1]/div[3]/div[1]/ul[1]/li[5]/div[1]/div[2]/button[1]")).click();
				
				Thread.sleep(2000);
				

				driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
				
			}
			
			else 
			{
				
				break;
				
			}
			
			
			
		}
			
		}
		
	}

}
