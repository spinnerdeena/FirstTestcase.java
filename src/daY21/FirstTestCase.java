package daY21;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		System.setProperty("Webdriver.Chrome,driver","C:\\Users\\Shiva5692\\Downloads\\chromedriver_win32.zip");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vmmap.vivax-metrotech.com/login");
		driver.window().manage().maximize();

		WebElement txtbox = driver.findElement(By.id("email"));
		txtbox.sendkeys("dheenadhayalan2905"+click());

		WebElement password = driver.findelement(By.xpath("/html/body/app-root/app-login/div/div/div[1]/div[2]/form/mat-form-field[2]/div"));
		password.sendkeys("Deena123"+click());

		driver.findelement(By.xpath("/html/body/app-root/app-login/div/div/div[1]/div[2]/form/div[1]")).click();

		driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div[1]/div[2]/form/div[2]/p[1]/a")).click();

		driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div[1]/div[2]/form/div[2]/p[2]/a").click());

		driver.findElement(By.id("FirstName")).sendkeys("Deena");
		driver.findelement(By.xpath("/html/body/app-root/app-register/div/div/div[1]/div[2]/form/mat-form-field[2]")).sendkeys("dhayalan");
		driver.findElement(By.id("FirstName")).sendkeys("deenaautomationtester@gmail.com");
		//dropdown

		WebElement dropDown1=driver,findElement(By.xpath("//*[@id=\"mat-select-value-11\"]/span"));
		Select select = new SelectI(dropDown);
		Select.selectByIndex(2);

// By using Selenium we cannot automate Barcodes and captcha...



	}





}
