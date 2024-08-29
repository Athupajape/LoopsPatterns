package Assignments25thAug;

public class Pattern8 {
	
//      *
//     ***
//    *****
//	 *******
//	*********
//	 ******* 
//	  *****
//	   ***
//	    *
	
	public void PrintPattern() {
		
		for(int i=1;i<=5;i++) {
			for(int j=i;j<5;j++) {
				System.out.print(" ");
		   }
			for(int j=1;j<=(2*i-1);j++) {
				System.out.print("*");
			}
		System.out.println("");
	  }
		
		for(int i=4;i>=1;i--) {
			for(int j=5;j>i;j--) {
				System.out.print(" ");
		   }
			for(int j=1;j<=(2*i-1);j++) {
				System.out.print("*");
			}
		System.out.println("");
	  }
	}
	
	public static void main(String[] args) {
		Pattern8 obj=new Pattern8();
		obj.PrintPattern();	
	}
}
