package rmgyantraGenericLib;

import java.util.Random;

public class javautilityLibrary {
	
	public int generateRandomNumber()
	{
		
		Random r=new Random();
		int jutil=r.nextInt(1000);
		return jutil;
				
	}

}
