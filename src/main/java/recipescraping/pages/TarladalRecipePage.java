package recipescraping.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import recipescraping.details.Recipe;

public class TarladalRecipePage {
	
	private WebDriver driver;

	@FindBy(xpath="//div[@id='show_breadcrumb']//div[@class='breadcrumb']/span[last()][not(a)]")
	private WebElement recipeName;
	
	// 2. Constructor of the page class:
	public TarladalRecipePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public Recipe getRecipeDetails(String url) {
		
		//driver. get(url);
		Recipe recipe = new Recipe();
		
		recipe.setRecipeId(getRecipeId(url));
		recipe.setRecipeName(getRecipeName(url));
		//recipe.setRecipeId(getRecipeCategory(url));
		//recipe.setRecipeId(getFoofCategory(url));
		//recipe.setRecipeId(getIngredients(url));
		
		//Add more setter here
		return recipe;
	}
	
	public String getRecipeId(String url){
		String recipeID = url.replaceAll("[^0-9]", "");
		return recipeID;
	}
	
	public String getRecipeName(String url){
		String recipeNameText=recipeName.getText();	
		System.out.println("recipeNameText::"  +recipeNameText);
		return recipeNameText;
	}
	
	public String getRecipeCategory(){
		return null;
	}

}
