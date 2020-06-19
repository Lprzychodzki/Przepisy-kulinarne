package pl.projekt.spring.dao;

import java.sql.SQLException;

import pl.projekt.spring.model.User;
import pl.projekt.spring.util.JDBCUtils;

public class UserDao {

	public int registerEmployee(User employee) throws ClassNotFoundException {
		String INSERT_USERS_SQL = "INSERT INTO users"
				+ "  (login, password) VALUES "
				+ " (?, ?, ?, ?);";

		int result = 0;
		try (Connection connection = JDBCUtils.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
			preparedStatement.setString(1, employee.getLogin());
			preparedStatement.setString(2, employee.getPassword());

			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			result = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			// process sql exception
			JDBCUtils.printSQLException(e);
		}
		return result;
	}

}
