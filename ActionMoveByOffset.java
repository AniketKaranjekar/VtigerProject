package SeleniumTutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMoveByOffset
{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.edge.driver","C:\\Users\\mansi computer\\Downloads\\edgedriver_win64\\edgedriver\\msedgedriver.exe");
	    WebDriver driver =new EdgeDriver();
        driver.get("https://www.google.com/");
        Actions a=new Actions(driver);
        a.moveByOffset(400,100).contextClick().perform();
    }
}