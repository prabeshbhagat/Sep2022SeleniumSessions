package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class crricinfoTableConcept17 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get(
				"https://www.espncricinfo.com/series/england-in-bangladesh-2022-23-1351394/bangladesh-vs-england-1st-odi-1351397/full-scorecard");

		Thread.sleep(4000);

		System.out.println(getWktTkrname("Shakib Al Hasan"));
		System.out.println(getBatsmanRuns("Shakib Al Hasan"));
		System.out.println(getBatsmanBallsPlayed("Shakib Al Hasan"));
		
		System.out.println(getWktTkrname("Mustafizur Rahman"));
		System.out.println(getBatsmanRuns("Mustafizur Rahman"));
		System.out.println(getBatsmanBallsPlayed("Mustafizur Rahman"));

	}

	public static String getWktTkrname(String batsmanName) {
		String wkTkrname = driver.findElement(By.xpath("((//span[contains(text(),'" + batsmanName
				+ "')]/ancestor::td)[position()=1]/following-sibling::td)[1]")).getText();
		return wkTkrname;
	}
	
	public static String getBatsmanRuns(String batsmanName) {
		String runs = driver.findElement(By.xpath("((//span[contains(text(),'"+batsmanName+"')]/ancestor::td)[position()=1]/following-sibling::td)[2]")).getText();
		return runs;
	}
	
	public static String getBatsmanBallsPlayed(String batsmanName) {
		String balls = driver.findElement(By.xpath("((//span[contains(text(),'"+batsmanName+"')]/ancestor::td)[position()=1]/following-sibling::td)[3]")).getText();
		return balls;
	}
	

}
