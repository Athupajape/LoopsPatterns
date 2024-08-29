package Assignments25thAug;

public class Pattern5 {

//    *
//   **
//  ***
// ****
//*****
	
	public void PrintPattern() {
		
		for(int i=1;i<=5;i++) {
			for(int j=5;j>i;j--) {
				System.out.print(" ");
		   }
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
		System.out.println("");
	  }
	}
	
	public static void main(String[] args) {
		Pattern5 obj=new Pattern5();
		obj.PrintPattern();	
	}
	
}
