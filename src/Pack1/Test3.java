package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();//polymorphisme une instance du navigateur chrome	ouvrir une page web Chrome	
		//ChromeDriver driver2 = new ChromeDriver(); driver2 ne peut être de type ChromeDriver uniquement
		driver1.get("https://opensource-demo.orangehrmlive.com");//sert à spécifier le site internet 
		driver1.manage().window().maximize();//maximiser l'affichage de la fenêtre
		String codeSource = driver1.getPageSource();//va chercher la page de code 
		WebElement username = driver1.findElement(By.id("txtUsername"));//trouver un élément
		username.sendKeys("Admin");
		//driver1.findElement(By.id("txtUsername")).sendKeys("Admin"); remplace les 2 lignes précédents
		WebElement password = driver1.findElement(By.name("txtPassword"));//trouver un élément
		password.sendKeys("admin123");
		WebElement logButton = driver1.findElement(By.id("btnLogin"));//trouver un élément
		logButton.click();
		WebElement welcomeLink = driver1.findElement(By.id("welcome"));//trouver un élément
		welcomeLink.click();
		Thread.sleep(4000);
		WebElement logoutLink = driver1.findElement(By.linkText("Logout"));//trouver un élément
		logoutLink.click();
						
	}

}
