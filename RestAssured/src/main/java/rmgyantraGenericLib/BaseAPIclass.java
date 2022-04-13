package rmgyantraGenericLib;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseAPIclass 
{
	public DataBaseUtility dutil=new DataBaseUtility();
	
	@BeforeSuite()
	public void conDatabase() throws Throwable
	
	{
	dutil.createConnection();	
    }
}
//	@AfterSuite
//	public void closeDatabase() throws Throwable
//	{
//		dutil.closeConnection();
//		}
//	}
	
