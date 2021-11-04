import java.sql.*;
public class Create_table {

	public static void main(String[] args) {
		try {
		Class.forName("org.sqlite.JDBC");
		Connection con=DriverManager.getConnection("jdbc:sqlite:movie.db");
		if(con!=null)
		{
			Statement stmt=con.createStatement();
			int st=stmt.executeUpdate("create table movies(name text,actor text,actress text,release_date text,director text);");
			System.out.println(st);
		}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
