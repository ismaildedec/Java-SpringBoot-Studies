package jdbcIntro;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws SQLException {
		
		selectDemo();

	}
	
	public static void selectDemo() throws SQLException {
		
		Connection connection = null;
		DbHelper helper = new DbHelper();
		// sql cümlesi
		java.sql.Statement statement = null;
		// Sorgunun sonucu
		ResultSet result = null;

		try {
 
			connection = helper.getConnection();
			statement = connection.createStatement();
			result = statement.executeQuery("select Code,Name,region from country");
			ArrayList<Country> countries = new ArrayList<Country>();

			while (result.next()) {
				countries.add(
						new Country(
								result.getString("Code"), 
								result.getString("Name"),
								result.getString("Region")));

			}
			System.out.println(countries.size());
		} catch (SQLException e) {
			helper.showErrorMessage(e);
		} finally {
			connection.close();
		}
		
	}
	
	public static void insertDemo() throws SQLException{
		
		Connection connection = null;
		DbHelper helper = new DbHelper();
		java.sql.PreparedStatement statement = null;
		ResultSet result = null;
		
		try {
			 
			connection = helper.getConnection();
			//Soru işaretleri kullanıcadan alınacağını belirtir.
			String sql = "insert into city (Name,CountryCode,District,Population) values (?,?,?,?)";
			statement = connection.prepareStatement(sql);
			
			//1 kaçıncı soru işaretiyse onu belirtir.
			statement.setString(1,"Duzce" );
			statement.setString(2,"TUR" );
			statement.setString(3,"Duzce" );
			statement.setInt(4,5000 );
			statement.executeUpdate();
			System.out.println("Kayıt eklendi");
			
		} catch (SQLException e) {
			helper.showErrorMessage(e);
		} finally {
			statement.close();
			connection.close();
		}
		
		/*
		 *Manuel olarak ekleme yapacağımız zaman bu şekilde yapabilriz.
		 * try {
		 * 
		 * connection = helper.getConnection(); statement = connection.
		 * prepareStatement("insert into city (Name,CountryCode,District,Population) values ('Duzce','TR','Duzce',5000)"
		 * ); statement.executeUpdate(); System.out.println("Kayıt eklendi");
		 * 
		 * } catch (SQLException e) { helper.showErrorMessage(e); } finally {
		 * statement.close(); connection.close(); }
		 */
	}
	
	public static void updateDemo() throws SQLException{
		
		Connection connection = null;
		DbHelper helper = new DbHelper();
		java.sql.PreparedStatement statement = null;
		ResultSet result = null;
		
		try {
			 
			connection = helper.getConnection();
			
			String sql = "update city set population = 8000 where id = 4085";
			statement = connection.prepareStatement(sql);
			statement.executeUpdate();
			System.out.println("Kayıt Güncellendi");
			
		} catch (SQLException e) {
			helper.showErrorMessage(e);
		} finally {
			statement.close();
			connection.close();
		}
	}
	
	public static void deleteDemo() throws SQLException{
		
		Connection connection = null;
		DbHelper helper = new DbHelper();
		java.sql.PreparedStatement statement = null;
		ResultSet result = null;
		
		try {
			 
			connection = helper.getConnection();
			
			String sql = "delete from city  where id = ?";
			statement = connection.prepareStatement(sql);
			
			statement.setInt(1, 4085);
			statement.executeUpdate();
			System.out.println("Kayıt Silindi");
			
		} catch (SQLException e) {
			helper.showErrorMessage(e);
		} finally {
			statement.close();
			connection.close();
		}
	}

}