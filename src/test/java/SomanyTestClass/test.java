package SomanyTestClass;

public class test {
	
	public static void main(String[] args) {
		
	//palendrom
		
		int a =152;
		int b = a;
		int rev;
		int total=0;
		
	while (a>0) {
		rev = a%10;
		total = (total*10) + rev;
		a= a/10;
	}
	
	System.out.println(total);
		
	}
	
 
}
