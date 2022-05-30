package org.junit;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitTask {
	
	static WebDriver d;
	
	@BeforeClass
	
	public static void Launch() throws Exception {
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	@Before
	public void StartingTime() {
		System.out.println("starttime");
	}
	
	@After
	public void EndingTime() {
		System.out.println("endtome");
	}
	@AfterClass
	public static void AfterClass() {
		d.close();

	}
	@Test
	public void Script1() {
		d.findElement(By.xpath("//button[text()='✕']")).click();	
	}
	
	@Test
	public void Script2() throws Exception {
		d.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("vivo y17");
		d.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
	}
	@Test
	public void Script3() throws Exception {
		Thread.sleep(5000);
    d.findElement(By.xpath("(//*[contains(text(),'vivo Y17')])[1]")).click();
		
		String parent = d.getWindowHandle();
		Set<String> child  = d.getWindowHandles();
		
		for (String c : child) {
			if(!c.equals(parent));
			
			d.switchTo().window(c);
		}}
	@Test
	public void Script4(){
		d.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
	}

}
