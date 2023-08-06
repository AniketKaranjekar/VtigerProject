package SeleniumTutorials;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClickHold 
{
	public static void main(String[]args)
	{
	System.setProperty("webdriver.edge.driver","C:\\Users\\mansi computer\\Downloads\\edgedriver_win64\\edgedriver\\msedgedriver.exe");
	WebDriver driver =new EdgeDriver();
        driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
        WebElement source=driver.findElement(By.xpath("//h1[text()='Block 1']"));
        WebElement destination=driver.findElement(By.id("column-3"));
        Actions a=new Actions(driver);
        a.clickAndHold(source).moveToElement(destination).release().perform();
	}
}
