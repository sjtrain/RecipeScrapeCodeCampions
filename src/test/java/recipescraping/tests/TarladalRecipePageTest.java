package recipescraping.tests;

import static org.testng.Assert.assertEquals;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.cucumber.java.Before;
import recipescraping.details.Recipe;
import recipescraping.pages.TarladalRecipePage;
import recipescraping.utils.ConfigReader;
import recipescraping.utils.DriverFactory;

public class TarladalRecipePageTest {
	
	private DriverFactory driverFactory;
	private WebDriver driver;
	private ConfigReader configReader;
	Properties prop;

	@BeforeTest
	public void initProperty() { //getProperty() method called in the below method launchBrowser()
		//System.out.println("initProperty");
		configReader = new ConfigReader();
		prop = configReader.init_prop(); //init_prop() is the function call where method defined in ConfigReader class
		String browserName = prop.getProperty("browser");
		driverFactory = new DriverFactory();
		driver = driverFactory.init_driver(browserName);//init_driver() method defined in DriverFactory class which takes the browser name read from the property file and return the corresponding driver of it
	
	}

	
	@Test
	public void testGetReceipeDetails() {
		String url = "https://www.tarladalal.com/baba-ganoush-22576r";
		driver. get(url);
		TarladalRecipePage page = new TarladalRecipePage(driver);//page instantiation
		Recipe recipe = page.getRecipeDetails(url);
		//assertEquals("22576", recipe.getRecipeId());
		System.out.println(recipe);
		
		
	}

}

