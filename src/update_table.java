import java.sql.*;
class Update_table {
	public static void main(String[] args) {
		try {
		Class.forName("org.sqlite.JDBC");
		Connection con=DriverManager.getConnection("jdbc:sqlite:movie.db");
		if(con!=null)
		{
			Statement stmt=con.createStatement();
			int st=stmt.executeUpdate("update movies set director='S.S.Rajamouli' where name='Baahubali:The Beginning'");
			System.out.println(st);
		}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
