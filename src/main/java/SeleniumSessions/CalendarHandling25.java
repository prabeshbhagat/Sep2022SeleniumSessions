package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalendarHandling25 {
	static WebDriver driver;
	//add corner case for leap year...
	
	//pseudo code for 30 t & 31st of month 
	//12
	//feb
	//30 days-November, April, June, and September.--4
	//31 days--January, March, May, July, August, October, and December.--7

	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(opt);
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		WebElement datepicker = driver.findElement(By.id("datepicker"));
		datepicker.click();

//		WebElement date = driver.findElement(By.xpath("//a[text()='20']"));
//		date.click();

//		String actDateMonth = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
//		while (!actDateMonth.equalsIgnoreCase("c")) {
//			driver.findElement(By.linkText("Next")).click();
//			actDateMonth = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
//			System.out.println(actDateMonth);
//		}
//		selectDate("26");

//		selectDate("26");
//		selectCalendarDate("15");

//		selectFuturedate("selectFuturedate","26");
//		selectFuturedate("March 2025","26");
//		selectFuturedate("February 2025", "35");
		selectPreviousdate("April 2022", "31");
	}
	
	//pseudo code for 30 t & 31st of month 
	//12
	//feb
	//30 days-November, April, June, and September.--4
	//31 days--January, March, May, July, August, October, and December.--7
	
	public static void selectPreviousdate(String monthYear, String Day) {

		// corner cases to avoid exception

		// case:1 what about feb month which has 29 days
		if (monthYear.contains("February") && Integer.parseInt(Day) > 29) {
			System.out.println("Day?date passed is wrong ..Please pass the right date for the month of feb" + Day);
			return;
		}

		// case:2 what about feb month which has 29 days
		if (monthYear.contains("February") && Integer.parseInt(Day) > 29) {
			System.out.println("Day?date passed is wrong ..Please pass the right date for the month of feb" + Day);
			return;
		}
		
		// case:4 30 days month
		if (monthYear.contains("April") || monthYear.contains("June") ||monthYear.contains("September") ||monthYear.contains("November")  && Integer.parseInt(Day) > 30) {
			System.out.println("Day?date passed is wrong ..Please pass the right date for the month with 30 days" + Day);
			return;
		}

		// case:3 date greater than 31
		if (Integer.parseInt(Day) > 31) {
			System.out.println("Day?date passed is wrong ..pPlease pass the right date" + Day);
			return;
		}

		String actDateMonth = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		while (!actDateMonth.equalsIgnoreCase(monthYear)) {
			driver.findElement(By.linkText("Prev")).click();
			actDateMonth = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
			System.out.println(actDateMonth);
		}
		selectDate(Day);

	}

	public static void selectFuturedate(String monthYear, String Day) {

		// corner cases to avoid exception

		// case:1 what about feb month which has 29 days
		if (monthYear.contains("February") && Integer.parseInt(Day) > 29) {
			System.out.println("Day?date passed is wrong ..Please pass the right date for the month of feb" + Day);
			return;
		}

		// case:2 what about feb month which has 29 days
		if (monthYear.contains("February") && Integer.parseInt(Day) > 29) {
			System.out.println("Day?date passed is wrong ..Please pass the right date for the month of feb" + Day);
			return;
		}

		// case:3 date greater than 31
		if (Integer.parseInt(Day) > 31) {
			System.out.println("Day?date passed is wrong ..pPlease pass the right date" + Day);
			return;
		}

		String actDateMonth = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		while (!actDateMonth.equalsIgnoreCase(monthYear)) {
			driver.findElement(By.linkText("Next")).click();
			actDateMonth = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
			System.out.println(actDateMonth);
		}
		selectDate(Day);

	}

	public static void selectDate(String Day) {
		driver.findElement(By.xpath("//a[text()='" + Day + "']")).click();
	}

	public static void selectCalendarDate(String Day) {
		List<WebElement> daysList = driver.findElements(By.cssSelector("table.ui-datepicker-calendar a"));
		System.out.println(daysList.size());
		for (WebElement e : daysList) {
			String day = e.getText();
			if (day.equals(Day)) {
				e.click();
				break;
			}
		}
	}

}
