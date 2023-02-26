package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup13 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//type='file' should be there in console
		
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		WebElement fileUploadBtn=driver.findElement(By.xpath("//input[@name='upfile']"));
		fileUploadBtn.sendKeys("C:\\Users\\pb610335\\Pictures\\myscreenshot\\13006.png");
		WebElement pressBtn=driver.findElement(By.xpath("//input[@value='Press']"));
		Thread.sleep(3000);
		System.out.println("--------");
		pressBtn.click();
	}

}


