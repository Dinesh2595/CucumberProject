package org.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	 public  static WebDriver d;

	public static WebDriver launchBrowser(String browsername) {

		switch (browsername) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			d = new ChromeDriver();
			d.manage().window().maximize();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			d = new FirefoxDriver();
			d.manage().window().maximize();

		default:
			System.out.println("Invalid BrowserName");
			break;
		}
		return d;
	}

	public static void launchurl(String url) {
		d.get(url);

	}
	
	public static  void implicitywait( int sec) {

		d.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	} 

	public static void fillTextBox(WebElement e, String value) {

		e.sendKeys(value);
	}

	public static void click(WebElement e) {
		e.click();
	}

	public static void currenturl() {
		d.getCurrentUrl();

	}

	public static void select(String selectorname, WebElement e, String value) {

		if (selectorname.equals("value")) {
			Select s = new Select(e);
			s.selectByValue(value);

		} else if (selectorname.equals("visibletext")) {

			Select s = new Select(e);
			s.selectByVisibleText(value);

		} else {
			System.out.println("Invalid selectorname");
		}

	}

	public static void screenshot(String filename) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) d;
		File src = ts.getScreenshotAs(OutputType.FILE);

		File des = new File("./ScreenShot//" + filename + ".png");

		FileUtils.copyFile(src, des);

	}

	public static void javascript(String value, WebElement e) {

		if (value.equals("scrolldown")) {

			JavascriptExecutor js = (JavascriptExecutor) d;
			js.executeScript("arguments[0].scrollIntoView(true)", e);
		} else if (value.equals("scrollup")) {

			JavascriptExecutor js = (JavascriptExecutor) d;
			js.executeScript("arguments[0].scrollIntoView(false)", e);
		} else if (value.equals("get")) {
			JavascriptExecutor js = (JavascriptExecutor) d;
			js.executeScript("return arguments[0].getAttribute('value')",e);

		} else {
			System.out.println("Invalid select value");
		}
	}

	public static void quit() {

		d.quit();
	}

}
