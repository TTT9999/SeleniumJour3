package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();//polymorphisme une instance du navigateur chrome	ouvrir une page web Chrome	
		//ChromeDriver driver2 = new ChromeDriver(); driver2 ne peut �tre de type ChromeDriver uniquement
		driver1.get("https://opensource-demo.orangehrmlive.com");//sert � sp�cifier le site internet 
		driver1.manage().window().maximize();//maximiser l'affichage de la fen�tre
		String codeSource = driver1.getPageSource();//va chercher la page de code 
		WebElement username = driver1.findElement(By.id("txtUsername"));//trouver un �l�ment
		username.sendKeys("Admin");
		//driver1.findElement(By.id("txtUsername")).sendKeys("Admin"); remplace les 2 lignes pr�c�dents
		WebElement password = driver1.findElement(By.name("txtPassword"));//trouver un �l�ment
		password.sendKeys("admin123");
		WebElement logButton = driver1.findElement(By.id("btnLogin"));//trouver un �l�ment
		logButton.click();
		WebElement welcomeLink = driver1.findElement(By.id("welcome"));//trouver un �l�ment
		welcomeLink.click();
		Thread.sleep(4000);
		WebElement logoutLink = driver1.findElement(By.linkText("Logout"));//trouver un �l�ment
		logoutLink.click();
						
	}

}
