package OrangeHRM.OrangeHRM_Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Login_OrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\\\Download2018-19\\\\chromedriver_win32\\\\chromedriver.exe");
	    WebDriver d = new ChromeDriver();
	    d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    d.manage().window().maximize();
	    d.get("https://opensource-demo.orangehrmlive.com/");
	    Thread.sleep(2000);
	    d.findElement(By.name("txtUsername")).sendKeys("Admin");
	    Thread.sleep(2000);
        d.findElement(By.id("txtPassword")).sendKeys("admin123");
        Thread.sleep(2000);
        d.findElement(By.className("button")).click();
        Thread.sleep(2000);
        d.findElement(By.linkText("Admin")).click();
        Thread.sleep(2000);
        d.findElement(By.id("menu_admin_Organization")).click();
        Thread.sleep(2000);
        d.findElement(By.id("menu_admin_viewOrganizationGeneralInformation")).click();
        Thread.sleep(2000);
        d.findElement(By.xpath("//input[@id='btnSaveGenInfo']")).click();
        Thread.sleep(2000);
        d.findElement(By.xpath("//input[@id='organization_name']")).clear();
        Thread.sleep(2000);
        d.findElement(By.xpath("//input[@id='organization_name']")).sendKeys("TestComp");
        Thread.sleep(2000);
        d.findElement(By.xpath("//input[@id='organization_taxId']")).clear();
        Thread.sleep(2000);
        d.findElement(By.xpath("//input[@id='organization_taxId']")).sendKeys("2345");
        Thread.sleep(2000);
        d.findElement(By.xpath("//input[@id='organization_registraionNumber']")).clear();
        Thread.sleep(2000);
        d.findElement(By.xpath("//input[@id='organization_registraionNumber']")).sendKeys("B2345");
        Thread.sleep(2000);
        d.findElement(By.name("organization[phone]")).clear();
        Thread.sleep(2000);
        d.findElement(By.name("organization[phone]")).sendKeys("9632800504");
        Thread.sleep(2000);
        d.findElement(By.xpath("//input[@id='organization_fax']")).clear();
        Thread.sleep(2000);
        d.findElement(By.xpath("//input[@id='organization_fax']")).sendKeys("60904-045959");
        Thread.sleep(2000);
        d.findElement(By.xpath("//input[@id='btnSaveGenInfo']")).click();
	    Thread.sleep(2000);
	    
	    d.findElement(By.id("menu_pim_viewPimModule")).click();
	    Thread.sleep(2000);
	    
	    d.findElement(By.linkText("Add Employee")).click();
	    Thread.sleep(2000);
	    
	    d.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Ashish");
	    Thread.sleep(2000);
	    d.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Kumar");
	    //String photopath="E:\\ashish\\Passport Size Photo and Sign\\PHOTOS2";
	    d.findElement(By.name("photofile")).sendKeys("E:\\ashish\\Passport Size Photo and Sign\\PHOTOS2.jpg");
	   // d.findElement(By.name("photofile")).sendKeys(photopath);
	    Thread.sleep(2000);
	    //d.findElement(By.xpath("//input[@type='submit']")).click();
	    //Thread.sleep(2000);
	    d.findElement(By.xpath("//input[@id='btnSave']")).click();
	    Thread.sleep(2000);
	    d.findElement(By.xpath("//b[contains(text(),'Dashboard')]")).click();
	    Thread.sleep(2000);
	        Actions a= new Actions(d);
	      a.moveToElement(d.findElement(By.xpath("//canvas[@class='flot-overlay']"))).click()
	      .perform();  
	       Thread.sleep(4000);
	        d.close();
	        
	        
	    
	}
	

}

