package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstAutoMationEx {
	public static void main(String[] args) {
		System.out.println(1);
		WebDriver driver = new FirefoxDriver();
		System.out.println(2);
		driver.get("file:///C:/Users/avanti/Desktop/Selenium%20Software/Offline%20Website/index.html");
		System.out.println(3);
		WebElement weEmail = driver.findElement(By.id("email"));
		System.out.println(4);
		weEmail.sendKeys("");
		System.out.println(5);
		WebElement wePassword = driver.findElement(By.id("password"));
		wePassword.sendKeys("");
		WebElement weXpath = driver.findElement(By.xpath(".//*[@id='form']/div[3]/div/button"));
		weXpath.click();
		WebElement weEmail1 = driver.findElement(By.id("email"));
		weEmail1.sendKeys("kiran@gmail.com");
		WebElement wePassword1 = driver.findElement(By.id("password"));
		wePassword1.sendKeys("123456");
		weXpath.click();
		WebElement Welabel = driver.findElement(By.className("login box boby"));
		String label = Welabel.getText();
		System.out.println(label);
	}

}
