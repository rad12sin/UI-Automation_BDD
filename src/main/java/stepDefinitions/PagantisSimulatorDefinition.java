package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class PagantisSimulatorDefinition{

	 WebDriver driver;


	 @Given("^user launched the pagantis$")
	 public void user_launched_the_pagantis(){

		 System.setProperty("webdriver.chrome.driver", "F:\\ui-automation\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("file:///E:/workspace/o4s/api_automation/pg-qa-assignment/test1/index.html");
		 driver.manage().window().maximize();
	 }

	 @Then("^verify the title of page$")
	 public void verify_the_title_of_page(){
	 String title = driver.getTitle();
	 System.out.println(title);
	 Assert.assertEquals("Simulator", title);
	 }

	 @When("^installment of 12 months verify the installment amount$")
	 public  void user_enters_12_months_for_installment(){
		 driver.switchTo().frame(
				 driver.findElements(By.tagName("iframe")).get(0));
		 new WebDriverWait(driver, 20).until(
				 ExpectedConditions.elementToBeClickable(By
						 .xpath("//*[@id=\"SimControl-formSelector\"]/button[1]")));
		 WebElement emiEle = driver.findElement(By.xpath("//*[@id=\"value-quotes\"]"));
		 String emiValue = emiEle.getText();
		 System.out.println("emi amount for 12 months tenure is "+emiValue);
		 Assert.assertEquals(emiValue,"55.43");

	//	 new WebDriverWait(driver, 20).until(
	//			 ExpectedConditions.elementToBeClickable(By
	//					 .xpath("//*[@id=\"SimControl-formSelector\"]/button[1]"))).click();

	 }

	 @Then("^verify the installment amount of 11 months$")
	 public void verify_the_installment_amount(){
		 WebElement minusEle = driver.findElement(By.xpath("//*[@id=\"SimControl-formSelector\"]/button[1]"));
		 minusEle.click();
		 WebElement emiEle11 = driver.findElement(By.xpath("//*[@id=\"value-quotes\"]"));
		 String emiValue11 = emiEle11.getText();
		 System.out.println("emi amount for 12 months tenure is "+ emiValue11);
		 Assert.assertEquals(emiValue11,"59.93");
	 }
	@Then("^verify the installment amount of 10 months$")
	public void verify_the_installment_amount_for_10_month(){
		WebElement minusEle = driver.findElement(By.xpath("//*[@id=\"SimControl-formSelector\"]/button[1]"));
		minusEle.click();
		WebElement emiEle11 = driver.findElement(By.xpath("//*[@id=\"value-quotes\"]"));
		String emiValue = emiEle11.getText();
		System.out.println("emi amount for 10 months tenure is "+ emiValue);
		Assert.assertEquals(emiValue,"65.33");
	}
	@Then("^verify the installment amount of 9 months$")
	public void verify_the_installment_amount_for_9_month(){
		WebElement minusEle = driver.findElement(By.xpath("//*[@id=\"SimControl-formSelector\"]/button[1]"));
		minusEle.click();
		WebElement emiEle11 = driver.findElement(By.xpath("//*[@id=\"value-quotes\"]"));
		String emiValue = emiEle11.getText();
		System.out.println("emi amount for 9 months tenure is "+ emiValue);
		Assert.assertEquals(emiValue,"71.94");
	}
	@Then("^verify the installment amount of 8 months$")
	public void verify_the_installment_amount_for_8_month(){
		WebElement minusEle = driver.findElement(By.xpath("//*[@id=\"SimControl-formSelector\"]/button[1]"));
		minusEle.click();
		WebElement emiEle11 = driver.findElement(By.xpath("//*[@id=\"value-quotes\"]"));
		String emiValue = emiEle11.getText();
		System.out.println("emi amount for 8 months tenure is "+ emiValue);
		Assert.assertEquals(emiValue,"80.2");
	}
	@Then("^verify the installment amount of 7 months$")
	public void verify_the_installment_amount_for_7_month(){
		WebElement minusEle = driver.findElement(By.xpath("//*[@id=\"SimControl-formSelector\"]/button[1]"));
		minusEle.click();
		WebElement emiEle11 = driver.findElement(By.xpath("//*[@id=\"value-quotes\"]"));
		String emiValue = emiEle11.getText();
		System.out.println("emi amount for 7 months tenure is "+ emiValue);
		Assert.assertEquals(emiValue,"90.82");
	}
	@Then("^verify the installment amount of 6 months$")
	public void verify_the_installment_amount_for_6_month(){
		WebElement minusEle = driver.findElement(By.xpath("//*[@id=\"SimControl-formSelector\"]/button[1]"));
		minusEle.click();
		WebElement emiEle11 = driver.findElement(By.xpath("//*[@id=\"value-quotes\"]"));
		String emiValue = emiEle11.getText();
		System.out.println("emi amount for 6 months tenure is "+ emiValue);
		Assert.assertEquals(emiValue,"105");
	}
	@Then("^verify the installment amount of 5 months$")
	public void verify_the_installment_amount_for_5_month(){
		WebElement minusEle = driver.findElement(By.xpath("//*[@id=\"SimControl-formSelector\"]/button[1]"));
		minusEle.click();
		WebElement emiEle11 = driver.findElement(By.xpath("//*[@id=\"value-quotes\"]"));
		String emiValue = emiEle11.getText();
		System.out.println("emi amount for 5 months tenure is "+ emiValue);
		Assert.assertEquals(emiValue,"124.85");
	}
	@Then("^verify the installment amount of 4 months$")
	public void verify_the_installment_amount_for_4_month(){
		WebElement minusEle = driver.findElement(By.xpath("//*[@id=\"SimControl-formSelector\"]/button[1]"));
		minusEle.click();
		WebElement emiEle11 = driver.findElement(By.xpath("//*[@id=\"value-quotes\"]"));
		String emiValue = emiEle11.getText();
		System.out.println("emi amount for 4 months tenure is "+ emiValue);
		Assert.assertEquals(emiValue,"154.64");
	}
	@Then("^verify the installment amount of 3 months$")
	public void verify_the_installment_amount_for_3_month(){
		WebElement minusEle = driver.findElement(By.xpath("//*[@id=\"SimControl-formSelector\"]/button[1]"));
		minusEle.click();
		WebElement emiEle11 = driver.findElement(By.xpath("//*[@id=\"value-quotes\"]"));
		String emiValue = emiEle11.getText();
		System.out.println("emi amount for 3 months tenure is "+ emiValue);
		Assert.assertEquals(emiValue,"204.21");
	}
	@Then("^verify the installment amount of 2 months$")
	public void verify_the_installment_amount_for_2_month(){
		WebElement minusEle = driver.findElement(By.xpath("//*[@id=\"SimControl-formSelector\"]/button[1]"));
		minusEle.click();
		WebElement emiEle11 = driver.findElement(By.xpath("//*[@id=\"value-quotes\"]"));
		String emiValue = emiEle11.getText();
		System.out.println("emi amount for 2 months tenure is "+ emiValue);
		Assert.assertEquals(emiValue,"303.3");
	}

	 @Then("^Close the browser$")
	 public void close_the_browser(){
		 //driver.quit();
	 }




}
