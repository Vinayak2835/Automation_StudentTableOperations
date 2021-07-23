package com.saleniumautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StudentTable {

	public static void main(String[] args) {
		 int totalSum = 0;
		 
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("file:///C:/Users/VINAYAK/Desktop/studentdata.html");
		 
		 List<WebElement>  list = driver.findElements(By.xpath("//table[@id=\"studentdata\"]/tbody/tr/td[3]"));
		 String total = driver.findElement(By.xpath("//table[@id='studentdata']/tbody/tr[5]/td[3]")).getText();
		 int totalMarks = Integer.parseInt(total);
		 System.out.println("Total Marks "+totalMarks);
		 
		for(int i = 0; i <= list.size()-2; i++) {
		     String value = list.get(i).getText();
		     totalSum = totalSum + Integer.parseInt(value);
		    
		 }
		 System.out.println("Sum of Marks "+totalSum);
		 if(totalSum == totalMarks) {
			 System.out.println("Marks equals to 100");
		 }else {
			 System.out.println("Not equal");
		 }
	
		 driver.close();
	}

}
