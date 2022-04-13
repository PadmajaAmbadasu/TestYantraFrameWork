package rmgyantraGenericLib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;
public class DataBaseUtility {


public  Connection con =null;

public void createConnection() throws SQLException
{
Driver dref=new Driver();
DriverManager.registerDriver(dref);
con= DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
}
public void closeConnection() throws SQLException
{
	con.close();
}
public ResultSet executeQueryTest(String query) throws SQLException {
	
	Statement stmt = con.createStatement();
	return stmt.executeQuery(query);
	
}

}

	
