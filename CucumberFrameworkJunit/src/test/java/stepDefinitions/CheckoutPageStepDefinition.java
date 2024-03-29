package stepDefinitions;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CheckoutPage;
import pageObjects.LandingPage;
import utils.TestContextSetup;

public class CheckoutPageStepDefinition {
	public WebDriver driver;
	TestContextSetup testContextSetup;
	public CheckoutPage checkoutPage;

	public CheckoutPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.checkoutPage = testContextSetup.pageObjectManager.getCheckoutPage();
	}

	@And("verify user has ability to enter promo code and place the order")
	public void verify_user_has_ability_enter_promo() {
		//This work will be done in constructor it is done so we can change dependency of object on eacgh other step here upper method object is required in below method
		//checkoutPage = testContextSetup.pageObjectManager.getCheckoutPage();
	
		Assert.assertTrue(checkoutPage.verifyPromoBtn());
		Assert.assertTrue(checkoutPage.verifyPlaceOrder());
	}
	
	@Then("^user proceeds to checkout and validate the (.+) items in checkout page$")
	public void User_proceeds_to_checkout(String name) throws InterruptedException {
		Thread.sleep(2000);
		checkoutPage.checkoutItems();
		Thread.sleep(2000);
		
	}

}
