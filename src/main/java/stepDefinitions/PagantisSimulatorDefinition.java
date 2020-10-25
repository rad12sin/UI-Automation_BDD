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

public class PagantisSimulatorDefinition{

	 WebDriver driver;


	 @Given("^user launched the pagantis$")
	 public void user_launched_the_pagantis(){

		 System.setProperty("webdriver.chrome.driver", "F:\\ui-automation\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("file:///E:/workspace/o4s/api_automation/pg-qa-assignment/test1/index.html");
	 }

	 @Then("^verify the title of page$")
	 public void verify_the_title_of_page(){
	 String title = driver.getTitle();
	 System.out.println(title);
	 Assert.assertEquals("Simulator", title);
	 }

	 @When("^user enters 2 months for installment$")
	 public  void user_enters_2_months_for_installment(){

	 }

	 @Then("^verify the installment amount$")
	 public void verify_the_installment_amount(){

	 }

	 @Then("^Close the browser$")
	 public void close_the_browser(){
		 driver.quit();
	 }




}
