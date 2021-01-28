import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnectivity {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// load the driver
		try{
			Class.forName("com.mysql.jdbc.Driver");


			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","Vishal90040");

			Statement st = conn.createStatement();
			int i = st.executeUpdate("insert into employee values(101,'vish')");

			System.out.println(i + "recorded successfully");
			conn.close();
		}
		catch(Exception e)
		{
			System.out.println("Error");
			e.printStackTrace();
		}

	}
}