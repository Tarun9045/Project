package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ExcelUtils.ExcelRead;

public class TestCasePage {
	
public TestCasePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

@FindBy(xpath = "//input[@name='firstname']")
private WebElement FirstnameTextField;

@FindBy(xpath = "//a[text()='Create new account']")
private WebElement CreateNewAccount ;

@FindBy(xpath = "//input[@name='lastname']")
private WebElement LastName;


@FindBy(xpath = "//input[@name='reg_email__']")
private WebElement EmailName;


@FindBy(xpath = "//input[@name='reg_passwd__']")
private WebElement Password;


@FindBy(xpath = "//input[@name='reg_email_confirmation__']")
private WebElement ReEnterEmail;



@FindBy(xpath = "(//input[@name='sex'])[1]")
private WebElement genderradioButton;

public void Enter_The_values() throws InterruptedException {
	ExcelRead ed=new ExcelRead();
	String FirstName=ed.getReaddata(0, 1);
	String Lastname=ed.getReaddata(1,1);
	String email=ed.getReaddata(2,1);
	String Reemail=ed.getReaddata(3,1);
	String password=ed.getReaddata(4,1);
	CreateNewAccount.click();
	Thread.sleep(1000);
	FirstnameTextField.sendKeys(FirstName);
	LastName.sendKeys(Lastname);
	EmailName.sendKeys(email);
	ReEnterEmail.sendKeys(Reemail);
    Password.sendKeys(password);
    genderradioButton.click();
	
}}
