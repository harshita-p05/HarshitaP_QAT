package QatTest_HarshitaP;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCclass {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String username = "SYSTEM";
		String password = "0000";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("Connection created");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("UPDATE STUD SET NAME = 'ABC', CITY = 'MYSORE' WHERE ID = 3");
		
		ResultSet rs2 = stmt.executeQuery("SELECT*FROM STUD");
		while (rs2.next()) {
			System.out.println(rs2.getString("ID")+":"+rs2.getString("NAME")+":"+rs2.getString("CITY"));
		}
		
		System.out.println("query execution");
		con.close();
	}

}
