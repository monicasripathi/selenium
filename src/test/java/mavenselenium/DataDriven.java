package mavenselenium;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven {

	@Test(dataProvider="getdata")
	public void testcase( String cname, String cpass) {
		System.out.println(cname + "========"+cpass);
	}
	
	@DataProvider
	public String[][] getdata(){
		
		String obj[][]={{"Name1", "pass1"}, {"Name2","Pass2"}};
		return obj;
		

		}
	}

