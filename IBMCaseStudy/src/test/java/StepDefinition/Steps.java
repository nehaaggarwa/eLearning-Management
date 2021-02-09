package StepDefinition;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.internal.com.google.gson.annotations.Until;
import junit.framework.Assert;

public class Steps {
	WebDriver driver;
	WebDriverWait wait;

@Given("Login application present")
public void login_application_present() {

    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\NehaGoel\\Desktop\\SDet\\lib\\geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get("http://elearningm1.upskills.in/");
	driver.manage().window().maximize();

	
}

@When("Enter valid Name {string}")
public void enter_valid_name(String string) {
	
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.name("login")).sendKeys(string);
}


@When("Enter valid password {string}")
public void enter_valid_password(String string)  throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.name("password")).sendKeys(string);
	
	  Thread.sleep(3000);
}


@When("click on submit validButton")
public void click_on_submit_valid_button() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.name("submitAuth")).click();
	  Thread.sleep(3000);
   
}

@Then("I should see Compose")
public void i_should_see_compose() throws InterruptedException {
	 Assert.assertTrue(driver.findElement(By.xpath("//a[contains(.,'Compose')]")).isDisplayed());
	 Thread.sleep(2000);
	 driver.close();
	 
}


@When("User clicks on Compose")
public void user_clicks_on_compose() throws InterruptedException {
	 driver.findElement(By.xpath("//a[@href='http://elearningm1.upskills.in/main/messages/new_message.php']")).click();
	 Thread.sleep(2000);
	   
}


@When("user enters send to {string}")
public void user_enters_send_to(String string) throws InterruptedException {
	 driver.findElement(By.className("select2-search__field")).sendKeys(string);
	 Thread.sleep(2000);
	 driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
	 Thread.sleep(2000);
}
@When("user enters subject {string}")
public void user_enters_subject(String string) throws InterruptedException {
	 driver.findElement(By.id("compose_message_title")).sendKeys(string);
	 Thread.sleep(2000);
}
@When("user enters message {string}")
public void user_enters_message(String string) {
	//driver.findElement(By.className("cke_editable cke_editable_themed cke_contents_ltr cke_show_borders")).sendKeys(string);
}
@When("user click on Send button")
public void user_click_on_send_button() throws InterruptedException {
	 driver.findElement(By.id("compose_message_compose")).click();
	 Thread.sleep(2000);
	
}
@Then("I should see message sent {string}")
public void i_should_see_message_sent(String string) throws InterruptedException {
	//driver.findElement(By.className("alert alert-success"));
	 String ActualString=driver.findElement(By.xpath("//b[contains(.,'Test user user (username0987)')]")).getText();
     Assert.assertEquals(string, ActualString);
     Thread.sleep(2000);
     driver.close();
}


@Given("User is logged into the application")
public void user_is_logged_into_the_application() throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\NehaGoel\\Desktop\\SDet\\lib\\geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get("http://elearningm1.upskills.in/");
	driver.manage().window().maximize();
	driver.findElement(By.name("login")).sendKeys("neha.agrwl08");
	driver.findElement(By.name("password")).sendKeys("neha.agrwl08");
	Thread.sleep(3000);
	driver.findElement(By.name("submitAuth")).click();
	Thread.sleep(3000);

	  
	
}



}
