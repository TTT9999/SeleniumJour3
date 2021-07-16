package Pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();//polymorphisme une instance du navigateur chrome	ouvrir une page web Chrome	
		//ChromeDriver driver2 = new ChromeDriver(); driver2 ne peut être de type ChromeDriver uniquement
		driver1.get("https://opensource-demo.orangehrmlive.com");//sert à spécifier le site internet 
		driver1.manage().window().maximize();//maximiser l'affichage de la fenêtre
		String codeSource = driver1.getPageSource();//va chercher la page de code en chaîne de caractères
		//System.out.println("Le code source de la page est : " + codeSource);// affiche le code source
		if (codeSource.contains("OrangeHRM"))//vérifie si codeSource contient OrangeHRM
			System.out.println("Pass");
		else
			System.out.println("Fail");
	
	}

}
