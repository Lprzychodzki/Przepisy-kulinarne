package pl.projekt.spring.dao;

import pl.projekt.spring.model.Recipe;

public class RecipeDao {
	
	void insertRecipe(Recipe recipe) throws SQLException;

	Recipe selectRecipe(long recipeId);

	ListRecipe> selectAllRecipe();

	boolean deleteRecipe(int id) throws SQLException;

	boolean updateRecipe(Recipe recipe) throws SQLException;
}
