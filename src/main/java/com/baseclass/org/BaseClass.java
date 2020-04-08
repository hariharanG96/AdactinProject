package com.baseclass.org;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver getDriver(String browserName) {

		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + ("\\Drivers\\chromedriver.exe"));
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir") + ("\\Drivers\\IEDriverServer.exe"));
				driver = new InternetExplorerDriver();
			} else if (browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + ("\\Drivers\\geckodriver.exe"));
				driver = new FirefoxDriver();
			} else {
				System.out.println("browser name is invalid");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static void getUrlBC(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void inputValueElementBC(WebElement element, String value) {

		try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void selectOptionsBC(WebElement element, String value, String Option) {

		Select sc = new Select(element);
		try {
			if (Option.equalsIgnoreCase("byIndex")) {
				int parseInt = Integer.parseInt(value);
				sc.selectByIndex(parseInt);
			} else if (Option.equalsIgnoreCase("byValue")) {
				sc.selectByValue(value);
			} else if (Option.equalsIgnoreCase("byVisibleText")) {
				sc.selectByVisibleText(value);
			} else {
				System.out.println("Invalid option");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void getCurrentUrlBC() {
		try {
			driver.getCurrentUrl();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void scrollBC(WebElement element) {

		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", element);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void getTitleBC() {

		try {
			driver.getTitle();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void clickOnElementBC(WebElement element) {

		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void navigateToBC(String url) {

		try {
			driver.navigate().to(url);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void navigateBackBC() {

		try {
			driver.navigate().back();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void navigateForwardBC() {

		try {
			driver.navigate().forward();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void refreshBC() {

		try {
			driver.navigate().refresh();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void getTextBC(WebElement element) {

		try {
			element.getText();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void getAttributeBC(WebElement element, String attributeName) {

		try {
			element.getAttribute(attributeName);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void radioButtonClickBC(WebElement element) {

		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void screenshotBC(String filepath) throws Throwable {

		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dst = new File(filepath);
			FileUtils.copyFile(src, dst);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void windowHandlesBC(String switchTitle) {

		try {
			Set<String> allID = driver.getWindowHandles();

			for (String id : allID) {

				System.out.println(id);
				String titles = driver.switchTo().window(id).getTitle();
				System.out.println(titles);

			}

			String switchString = switchTitle;

			for (String id : allID) {

				if (driver.switchTo().window(id).getTitle().equals(switchString)) {
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void windowHandleBC(String id) {

		try {
			id = driver.getWindowHandle();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void alertSimpleBC() {

		try {
			driver.switchTo().alert().accept();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void alertConfirmBC(String confirmation) {

		try {
			if (confirmation.equalsIgnoreCase("ok")) {

				driver.switchTo().alert().accept();

			} else if (confirmation.equalsIgnoreCase("dismiss")) {

				driver.switchTo().alert().dismiss();
			} else {
				System.out.println("Invalid command");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void alertPromptBC(String confirmation, String message) {

		try {
			if (confirmation.equalsIgnoreCase("ok")) {

				driver.switchTo().alert().sendKeys(message);
				driver.switchTo().alert().accept();

			} else if (confirmation.equalsIgnoreCase("dismiss")) {

				driver.switchTo().alert().sendKeys(message);
				driver.switchTo().alert().dismiss();
			} else {
				System.out.println("Invalid command");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void closeBC() {
		try {
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void quitBC() {
		try {
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void actionsBC(String type, WebElement element) {

		try {
			Actions ac = new Actions(driver);

			if (type.equalsIgnoreCase("doubleclick")) {
				ac.doubleClick(element).build().perform();
			} else if (type.equalsIgnoreCase("click")) {
				ac.click(element).build().perform();
			} else if (type.equalsIgnoreCase("clickandhold")) {
				ac.clickAndHold(element).build().perform();
			} else if (type.equalsIgnoreCase("contextclick")) {
				ac.contextClick(element).build().perform();
			} else if (type.equalsIgnoreCase("movetoelement")) {
				ac.moveToElement(element).build().perform();
			} else {
				System.out.println("Invalid selection");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void dragAndDropBC(WebElement source, WebElement target) {
		try {
			Actions ac = new Actions(driver);
			ac.dragAndDrop(source, target).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void robotBC(WebElement source, WebElement target) throws Throwable {

		try {
			Robot r = new Robot();

			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);

			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void framesBC(String value, String type, WebElement element) {
		try {
			if (type.equalsIgnoreCase("byindex")) {
				int parseInt = Integer.parseInt(value);
				driver.switchTo().frame(parseInt);
			} else if (type.equalsIgnoreCase("byvalue")) {
				
				driver.switchTo().frame(value);
		
			} else if (type.equalsIgnoreCase("byelement")) {
				driver.switchTo().frame(element);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

	}

	public static void implicitWaitBC(int seconds) {

		try {
			driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void explicitWaitBC(int seconds, WebElement element) {

		try {
			WebDriverWait wait1 = new WebDriverWait(driver, seconds);
			wait1.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@SuppressWarnings("deprecation")
	public static void fluentWaitBC(int seconds, WebElement element, Wait<WebDriver> wait1) {

		try {
			wait1 = new FluentWait<WebDriver>(driver).withTimeout(seconds, TimeUnit.SECONDS)
					.pollingEvery(seconds, TimeUnit.SECONDS).ignoring(Exception.class);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void elementIsDisplayedBC(WebElement element, String type) {

		try {
			if (type.equalsIgnoreCase("isDisplayed")) {
				element.isDisplayed();
			} else if (type.equalsIgnoreCase("isEnabled")) {
				element.isEnabled();
			} else if (type.equalsIgnoreCase("isSelected")) {
				element.isSelected();
			} else {
				System.out.println("Invalid type");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void checkBoxBC(List<WebElement> elements, String attributeName, String attributeValue) {

		try {
			for (WebElement element : elements) {
				if (element.getAttribute(attributeName).equals(attributeValue)
						|| element.getAttribute(attributeName).equals(attributeValue)) {
					element.click();

				} else {
					System.out.println("Out of Condition");
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

}
