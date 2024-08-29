package Assignments25thAug;

public class Pattern2 {

//	  *****
//    ****
//    ***
//    **
//    *
	
	public void PrintPattern() {
		
		for(int i=5;i>0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
		}
			System.out.println("");
	 }
	}
	
	public static void main(String[] args) {
		Pattern2 obj=new Pattern2();
		
		obj.PrintPattern();
		
	}
	
	
}
