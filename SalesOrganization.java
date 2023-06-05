package mock;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class SalesOrganization
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","E:\\mansi computer\\Downloads\\edgedriver_win64\\edgedriver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.findElement(By.id("appnavigator")).click();
		WebElement ele = driver.findElement(By.xpath("//span[text()=' SALES']"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()=' Organizations'])[2]")).click();
		driver.findElement(By.id("Accounts_listView_basicAction_LBL_ADD_RECORD")).click();
		driver.findElement(By.name("accountname")).sendKeys("Aniket");
		driver.findElement(By.name("website")).sendKeys("www.ani.com");
		driver.findElement(By.name("phone")).sendKeys("987654326");
		driver.findElement(By.name("tickersymbol")).sendKeys("333");
		driver.findElement(By.name("fax")).sendKeys("sellli");
		driver.findElement(By.id("Accounts_editView_fieldName_account_id_create")).click();
		driver.findElement(By.xpath("(//input[@name='accountname'])[2]")).sendKeys("Ani");
		driver.findElement(By.xpath("(//input[@name='website'])[2]")).sendKeys("www.q@gmail.com");
		driver.findElement(By.xpath("(//input[@name='accountname'])[1]")).sendKeys("1234567855");
		driver.findElement(By.name("saveButton")).click();
		driver.findElement(By.name("otherphone")).sendKeys("1234189040");
		driver.findElement(By.name("employees")).sendKeys("43");
		driver.findElement(By.name("email1")).sendKeys("kbc@gmail.com");
		driver.findElement(By.name("email2")).sendKeys("kbc1@gmail.com");
		driver.findElement(By.name("ownership")).sendKeys("ak");
		driver.findElement(By.id("select2-chosen-2")).click();
		driver.findElement(By.xpath("//div[text()='Apparel']")).click();
		driver.findElement(By.id("select2-chosen-4")).click();
		driver.findElement(By.xpath("//div[text()='Acquired']")).click();
		driver.findElement(By.id("select2-chosen-6")).click();
		driver.findElement(By.xpath("//div[text()='Analyst']")).click();
		driver.findElement(By.name("siccode")).sendKeys("98723");
		JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,400)");
		driver.findElement(By.id("Accounts_editView_fieldName_emailoptout")).click();
		driver.findElement(By.name("annual_revenue")).sendKeys("500000");
		driver.findElement(By.id("Accounts_editView_fieldName_notify_owner")).click();
		driver.findElement(By.name("bill_street")).sendKeys("pune");
		driver.findElement(By.name("ship_street")).sendKeys("pune");
		driver.findElement(By.name("bill_pobox")).sendKeys("13");
		driver.findElement(By.name("ship_pobox")).sendKeys("12");
		driver.findElement(By.name("bill_city")).sendKeys("Pune");
		driver.findElement(By.name("ship_city")).sendKeys("Pune");
		driver.findElement(By.name("bill_state")).sendKeys("Maharashtra");
		driver.findElement(By.name("ship_state")).sendKeys("Maharashtra");
		driver.findElement(By.name("bill_code")).sendKeys("12Q2A");
		driver.findElement(By.name("ship_code")).sendKeys("12A321");
		driver.findElement(By.name("bill_country")).sendKeys("India");
		driver.findElement(By.name("ship_country")).sendKeys("India");
		driver.findElement(By.name("description")).sendKeys("QWERTYUIOPLKJHGGDDSAAZXVBMM");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[@title='Atlas Jeniffer(admin)']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
    }

}