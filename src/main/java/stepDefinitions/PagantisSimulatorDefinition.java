package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import junit.framework.Assert;
import java.util.concurrent.TimeUnit;

public class PagantisSimulatorDefinition {

  WebDriver driver;


  @Given("^user launched the Swag labs$")
  public void user_launched_the_pagantis() {

    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
    driver = new ChromeDriver();
    driver.get("https://www.saucedemo.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
  }

  @Then("^verify the title of page$")
  public void verify_the_title_of_page() {
    String title = driver.getTitle();
    System.out.println(title);
    Assert.assertEquals("Swag Labs", title);
  }

	@Then("^verify the header$")
	public void verify_the_header() {
		System.out.println("Verify the headers");
		WebElement menuIcon = driver.findElement(By.xpath("//*[text()=\"Open Menu\"]"));
		Assert.assertTrue("menu icon is not displayed", menuIcon.isDisplayed());
		WebElement cartIcon = driver.findElement(By.xpath("//a[@class=\"shopping_cart_link\"]"));
		Assert.assertTrue("cartIcon is not displayed", cartIcon.isDisplayed());
	}

	@And("^verify the sort filter$")
	public void validate_sort_filter(){
		WebElement sortFilterButton = driver.findElement(By.xpath("//select[@class=\"product_sort_container\"]"));
		Assert.assertTrue("shortFilterButton is not displayed", sortFilterButton.isDisplayed());
	}

  @When("^login with valid user$")
  public void log_in_with_valid_user() {
    WebElement userName = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
    userName.sendKeys("standard_user");
    WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
    password.sendKeys("secret_sauce");
    WebElement login = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
    login.submit();
    System.out.println("Logged In successfully");
    WebElement addToCartIcon = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
    WebElement productText = driver.findElement(By.xpath("//*[text()='Products']"));
    Assert.assertTrue("Add to Cart icon not displayed", addToCartIcon.isDisplayed());
    Assert.assertTrue("Add to Cart icon not displayed", productText.isDisplayed());
  }

  @When("^add product in cart$")
  public void add_product_in_cart() {
    System.out.println("Adding the one product in Cart");
    WebElement addTheItemInCartElement = driver.findElement(By.xpath("(//button[@class=\"btn btn_primary btn_small btn_inventory \"])[1]"));
    addTheItemInCartElement.click();
  }

  @Then("^validate the cart functionality$")
  public void validate_the_cart_functionality() {
    WebElement cartIcon = driver.findElement(By.xpath("//span[@class=\"shopping_cart_badge\"]"));
    String addedQuantity = cartIcon.getText();
    System.out.println(String.format("Added quantity= %s", addedQuantity));
    Assert.assertEquals("quantity did not match", "1", addedQuantity);
  }

  @When("^remove the product from cart$")
  public void remove_the_product_from_cart() {
    System.out.println("Removing the one product in Cart");
    WebElement removeProductButton = driver.findElement(By.xpath("(//button[@class=\"btn btn_secondary btn_small btn_inventory \"])[1]"));
    removeProductButton.click();
  }

  @Then("^validate the cart functionality after removing the product$")
  public void validate_the_cart_functionality_after_remove() {
    WebElement cartIcon = driver.findElement(By.xpath("//a[@class=\"shopping_cart_link\"]"));
    String addedQuantity = cartIcon.getText();
    System.out.println(String.format("Cart quantity After removing= %s", addedQuantity));
    Assert.assertTrue("validate empty cart", addedQuantity.isEmpty());
  }

  @When("^open cart page$")
  public void open_cart_page() {
    System.out.println("Click on Cart Icon and open cart page");
		WebElement cartIcon = driver.findElement(By.xpath("//a[@class=\"shopping_cart_link\"]"));
		cartIcon.click();
  }

  @Then("^validate the cart page$")
  public void validate_the_cart_page() {
		System.out.println("Validate the Cart Page");
		System.out.println("Validating the Your Cart text");
    WebElement yourCartText = driver.findElement(By.xpath("//span[text()=\"Your Cart\"]"));
    Assert.assertTrue("Your cart test is not displayed", yourCartText.isDisplayed());
		System.out.println("Validate the quantity text");
		WebElement quantity = driver.findElement(By.xpath("//*[text()=\"QTY\"]"));
		Assert.assertTrue("Quantity is not shown", quantity.isDisplayed());
		System.out.println("Validate the quantity text");
		WebElement description = driver.findElement(By.xpath("//*[text()=\"Description\"]"));
		Assert.assertTrue("Description text is not shown", description.isDisplayed());
		System.out.println("Validate the Continue shopping button");
		WebElement continueShopping = driver.findElement(By.xpath("//button[@name=\"continue-shopping\"]"));
		Assert.assertTrue("continueShopping button is not shown", continueShopping.isDisplayed());
		System.out.println("Validate the checkout button");
		WebElement checkoutButton = driver.findElement(By.xpath("//button[@name=\"checkout\"]"));
		Assert.assertTrue("Checkout button is not shown", checkoutButton.isDisplayed());

  }

  @Then("^Close the browser$")
  public void close_the_browser() {
    driver.quit();
  }

}
