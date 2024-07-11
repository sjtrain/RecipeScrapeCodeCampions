package recipescraping.details;

public class Recipe {
	
	private String recipeId;
	private String recipeName;
	private String recipeUrl;
	
	
	public String getRecipeName() {
		return recipeName;
	}

	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}

	private  RecipeCategory recipeCategory;
	
	private FoodCategory foodCategory;

	public String getRecipeId() {
		return recipeId;
	}

	public void setRecipeId(String recipeId) {
		this.recipeId = recipeId;
	}

	public String getRecipeUrl() {
		return recipeUrl;
	}

	public void setRecipeUrl(String recipeUrl) {
		this.recipeUrl = recipeUrl;
	}

	public RecipeCategory getRecipeCategory() {
		return recipeCategory;
	}

	public void setRecipeCategory(RecipeCategory recipeCategory) {
		this.recipeCategory = recipeCategory;
	}

	public FoodCategory getFoodCategory() {
		return foodCategory;
	}

	public void setFoodCategory(FoodCategory foodCategory) {
		this.foodCategory = foodCategory;
	}

	@Override
	public String toString() {
		return "Recipe [recipeId=" + recipeId + ", recipeName=" + recipeName + ", recipeUrl=" + recipeUrl
				+ ", recipeCategory=" + recipeCategory + ", foodCategory=" + foodCategory + "]";
	}

	
	
	

}
