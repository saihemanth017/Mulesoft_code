import java.sql.*;
class Display_table {
	public static void main(String[] args) {
		try {
		Class.forName("org.sqlite.JDBC");
		Connection con=DriverManager.getConnection("jdbc:sqlite:movie.db");
		if(con!=null)
		{
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from movies");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
			}
		}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
