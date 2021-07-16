package Pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();//polymorphisme une instance du navigateur chrome	ouvrir une page web Chrome	
		//ChromeDriver driver2 = new ChromeDriver(); driver2 ne peut être de type ChromeDriver uniquement
		driver1.get("https://opensource-demo.orangehrmlive.com");//sert à spécifier le site internet 
		driver1.manage().window().maximize();//maximiser l'affichage de la fenêtre
		String titlePage = driver1.getTitle();// chercher le titre
		System.out.println("Le titre est : " + titlePage);
		if (titlePage.equals("OrangeHRM1") )
		{
			System.out.println("Le test est réussi.");
		}
		else
		{
			System.out.println("Le test a échoué.");	
		}
		
		String nameURL = driver1.getCurrentUrl();
				
		System.out.println("L'URL est : " + nameURL);
		if (nameURL.equals("https://opensource-demo.orangehrmlive.com/") )
		{
			System.out.println("L'URL est bon.");
		}
		else
		{
			System.out.println("L'URL n'est pas bon.");	
		}
				
	}

}
