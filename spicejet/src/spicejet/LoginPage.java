package spicejet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

	public static void main(String[] args) 
	{

      System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://book.spicejet.com/Login.aspx");
      
      WebElement signup = driver.findElement(By.xpath("//a[@class = 'signup-link buttonN']"));
      signup.click();
      
      WebElement title = driver.findElement(By.xpath("//select[@id = 'CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_DropDownListTitle']"));
      Select op1 = new Select(title);
      op1.selectByVisibleText("MR");
      
      WebElement firstName = driver.findElement(By.xpath("//input[@id = 'CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxFirstName']"));
      firstName.sendKeys("Vikash");
      
      WebElement lastName = driver.findElement(By.xpath("//input[@id = 'CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxLastName']"));
      lastName.sendKeys("Singh");
      
      WebElement mobileNo = driver.findElement(By.xpath("//input[@id = 'CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TEXTBOXINTLMOBILENUMBER']"));
      mobileNo.sendKeys("9006877703");
      
      WebElement password = driver.findElement(By.xpath("//input[@id = 'CONTROLGROUPREGISTERVIEW_MemberInputRegisterView_PasswordFieldAgentPassword']"));
      password.sendKeys("vikash@123");
      
      WebElement confirmPassword = driver.findElement(By.xpath("//input[@id = 'CONTROLGROUPREGISTERVIEW_MemberInputRegisterView_PasswordFieldPasswordConfirm']"));
      confirmPassword.sendKeys("vikash@123");
      
      WebElement emaiId = driver.findElement(By.xpath("//input[@id = 'CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxEmail']"));
      emaiId.sendKeys("vikram@gmail.com");
      
      WebElement dateOfBirth = driver.findElement(By.xpath("//input[@id = 'CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TEXTBOXINPUTDOB']"));
      dateOfBirth.click();
      
      WebElement year = driver.findElement(By.xpath("//th[@class='datepickerGoPrev']//a//span"));
      year.click();
      
      WebElement selectYear = driver.findElement(By.xpath("//tbody[@class='datepickerYears']//span[contains(text(),'1994')]"));
      selectYear.click();
      
      WebElement selectMonth = driver.findElement(By.xpath("//span[contains(text(),'Jun')]"));
      selectMonth.click();
      
      WebElement selectDate = driver.findElement(By.xpath("//td[@class='datepickerSaturday validDate']//span[contains(text(),'18')]"));
      selectDate.click();
      
      WebElement termsAndCondition = driver.findElement(By.xpath("//input[@id = 'chkSpiceClubTnC']"));
      termsAndCondition.click();
      
      WebElement submit = driver.findElement(By.xpath("//input[@id = 'CONTROLGROUPREGISTERVIEW_ButtonSubmit']"));
      submit.click();
  
      
      driver.close();
      
      

	}

}
