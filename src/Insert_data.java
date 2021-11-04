import java.sql.*;
class Insert_data {
	public static void main(String[] args) {
		try {
		Class.forName("org.sqlite.JDBC");
		Connection con=DriverManager.getConnection("jdbc:sqlite:movie.db");
		if(con!=null)
		{
			Statement stmt=con.createStatement();
			stmt.executeUpdate("insert into movies values('Baahubali:The Beginning','Prabhas','Anushka','10 July 2015','Rajamouli')");
			int st=stmt.executeUpdate("insert into movies values('Gabber Singh','Pawan Kalyan','Shruti Hassan','11 May 2012',' Harish Shankar')");
			System.out.println(st);
		}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
