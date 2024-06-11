package SomanyTestClass;

import org.testng.annotations.DataProvider;

public class DataInventory {
	
	@DataProvider(name="loginMOBno")
	public  Object[] MOBnumberData() {
		Object[] data=new Object[1];
//		data[0]="";
//		data[1]="12472415424165";
//		data[2]="123dhsgg12";
//		data[3]="sdgfuggbgu";
//		data[4]="213354678";
//		data[5]="3425666666";
		data[0]="9021336929";
		return data;
		
	}
	
	@DataProvider(name="loginOTP")
	public  Object[] OTPdata() {
		Object[] data=new Object[1];
//		data[0]="";
//		data[1]="124724";
//		data[2]="123dhsgg12";
//		data[3]="sdgfuggbgu";
//		data[4]="2133";
		data[0]="1111";
		
		return data;
		
	}
	
	
}
