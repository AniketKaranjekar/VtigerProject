package mock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class VtigerProduct 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.edge.driver","C:\\Users\\mansi computer\\Downloads\\edgedriver_win64\\edgedriver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.findElement(By.id("appnavigator")).click();
		WebElement ele = driver.findElement(By.xpath("//span[text()=' SALES']"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		driver.findElement(By.linkText("Products")).click();
		driver.findElement(By.id("Products_listView_basicAction_LBL_ADD_RECORD")).click();
		driver.findElement(By.name("productname")).sendKeys("LAPTOP");
		driver.findElement(By.name("productcode")).sendKeys("4444");
		driver.findElement(By.name("sales_start_date")).click();
	    driver.findElement(By.xpath("//td[text()='10']")).click();
	    driver.findElement(By.id("select2-chosen-2")).click(); 
	    driver.findElement(By.xpath("//div[text()='AltvetPet Inc.']")).click();
	    driver.findElement(By.id("select2-chosen-4")).click(); 
	    driver.findElement(By.xpath("//div[text()='Hardware']")).click();
	    driver.findElement(By.id("Products_editView_fieldName_start_date")).click(); 
	    driver.findElement(By.xpath("//td[text()='9']")).click();
	    driver.findElement(By.id("Products_editView_fieldName_sales_end_date")).click(); 
	    driver.findElement(By.xpath("//td[text()='10']")).click();
        driver.findElement(By.id("Products_editView_fieldName_expiry_date")).click(); 
	    driver.findElement(By.xpath("//td[text()='10']")).click();
	    driver.findElement(By.id("Products_editView_fieldName_vendor_id_create")).click();
	    driver.findElement(By.name("vendorname")).sendKeys("qwe");	
	    driver.findElement(By.name("email")).sendKeys("Qsp@gmail.com");
	    driver.findElement(By.name("phone")).sendKeys("1231231212");
	    driver.findElement(By.name("saveButton")).click();
	    driver.findElement(By.name("website")).sendKeys("www.q@gmail.com");
	    driver.findElement(By.id("Products_editView_fieldName_vendor_part_no")).sendKeys("12");
	    driver.findElement(By.id("Products_editView_fieldName_mfr_part_no")).sendKeys("44");
        driver.findElement(By.id("Products_editView_fieldName_productsheet")).sendKeys("12");
        driver.findElement(By.id("Products_editView_fieldName_serial_no")).sendKeys("10022");
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,300)");
        driver.findElement(By.id("select2-chosen-6")).click();
        driver.findElement(By.xpath("//div[text()='300-Sales-Software']")).click();
        driver.findElement(By.name("unit_price")).sendKeys("1234");
        driver.findElement(By.name("commissionrate")).sendKeys("23");
		driver.findElement(By.id("tax1_check")).click();
		driver.findElement(By.id("tax2_check")).click();
		driver.findElement(By.id("tax3_check")).click();
		driver.findElement(By.name("purchase_cost")).sendKeys("231");
		js.executeScript("window.scrollBy(0,300)");
		driver.findElement(By.id("select2-chosen-8")).click();
		driver.findElement(By.xpath("//div[text()='Box']")).click();
		driver.findElement(By.name("qty_per_unit")).sendKeys("122");
		driver.findElement(By.name("qtyinstock")).sendKeys("22");
		driver.findElement(By.name("reorderlevel")).sendKeys("123");
		driver.findElement(By.name("qtyindemand")).sendKeys("12312");
		driver.findElement(By.name("description")).sendKeys("12sss");
		driver.findElement(By.xpath("//input[@name='imagename[]']")).sendKeys("E:\\mansi computer\\Pictures\\Screenshots\\Screenshot (5).png");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@title='Atlas Jeniffer(admin)']")).click();
		driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
	} 
}