import java.sql.*;
public class Connect_db {

	public static void main(String[] args) {
		try {
		Class.forName("org.sqlite.JDBC");
		Connection con=DriverManager.getConnection("jdbc:sqlite:movie.db");
		if(con!=null)
		{
			System.out.println("Connected");
		}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
