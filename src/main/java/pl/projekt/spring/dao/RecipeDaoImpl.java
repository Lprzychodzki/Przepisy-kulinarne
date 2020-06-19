package pl.projekt.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pl.projekt.spring.model.Recipe;
import pl.projekt.spring.util.JDBCUtils;

public class RecipeDaoImpl {
	private static final String INSERT_RecipeS_SQL = "INSERT INTO Recipes"
			+ "  (title, username, description, target_date,  is_done) VALUES " + " (?, ?, ?, ?, ?);";

	private static final String SELECT_Recipe_BY_ID = "select id,name,type,hardtype,intregients,time,description,author from Recipes where id =?";
	private static final String SELECT_ALL_RecipeS = "select * from Recipes";
	private static final String DELETE_Recipe_BY_ID = "delete from Recipes where id = ?;";
	private static final String UPDATE_Recipe = "update Recipes set name = ?, type= ?, hardtype= ?, intregients= ?, time= ?, description =?, author =? where id = ?;";

	public RecipeDaoImpl() {
	}

	@Override
	public void insertRecipe(Recipe Recipe) throws SQLException {
		System.out.println(INSERT_RecipeS_SQL);
		// try-with-resource statement will auto close the connection.
		try (Connection connection = JDBCUtils.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_RecipeS_SQL)) {
			preparedStatement.setString(1, Recipe.getName());
			preparedStatement.setString(2, Recipe.getType());
			preparedStatement.setString(3, Recipe.getHardType());
			preparedStatement.setDate(4, Recipe.getIngredients());
			preparedStatement.setDate(4, Recipe.getTime());
			preparedStatement.setDate(4, Recipe.getDescription());
			preparedStatement.setBoolean(5, Recipe.getAuthor());
			System.out.println(preparedStatement);
			preparedStatement.executeUpdate();
		} catch (SQLException exception) {
			JDBCUtils.printSQLException(exception);
		}
	}

	@Override
	public Recipe selectRecipe(long RecipeId) {
		Recipe Recipe = null;
		try (Connection connection = JDBCUtils.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_Recipe_BY_ID);) {
			preparedStatement.setLong(1, RecipeId);
			System.out.println(preparedStatement);
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				preparedStatement.setString(1, Recipe.getName());
				preparedStatement.setString(2, Recipe.getType());
				preparedStatement.setString(3, Recipe.getHardType());
				preparedStatement.setDate(4, Recipe.getIngredients());
				preparedStatement.setDate(4, Recipe.getTime());
				preparedStatement.setDate(4, Recipe.getDescription());
				preparedStatement.setBoolean(5, Recipe.getAuthor());
				Recipe = new Recipe(id, name, type, hardtype, time, description, author);
			}
		} catch (SQLException exception) {
			JDBCUtils.printSQLException(exception);
		}
		return Recipe;
	}


	@Override
	public boolean deleteRecipe(int id) throws SQLException {
		boolean rowDeleted;
		try (Connection connection = JDBCUtils.getConnection();
				PreparedStatement statement = connection.prepareStatement(DELETE_Recipe_BY_ID);) {
			statement.setInt(1, id);
			rowDeleted = statement.executeUpdate() > 0;
		}
		return rowDeleted;
	}

	@Override
	public boolean updateRecipe(Recipe Recipe) throws SQLException {
		boolean rowUpdated;
		try (Connection connection = JDBCUtils.getConnection();
				PreparedStatement statement = connection.prepareStatement(UPDATE_Recipe);) {
			preparedStatement.setString(1, Recipe.getName());
			preparedStatement.setString(2, Recipe.getType());
			preparedStatement.setString(3, Recipe.getHardType());
			preparedStatement.setDate(4, Recipe.getIngredients());
			preparedStatement.setDate(4, Recipe.getTime());
			preparedStatement.setDate(4, Recipe.getDescription());
			preparedStatement.setBoolean(5, Recipe.getAuthor());
			statement.setLong(6, Recipe.getId());
			rowUpdated = statement.executeUpdate() > 0;
		}
		return rowUpdated;
	}
}
