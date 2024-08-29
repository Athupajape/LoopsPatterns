package Assignments25thAug;

public class Pattern7 {
	
//	*********
//	 ******* 
//	  *****
//	   ***
//	    *
	
	public void PrintPattern() {
		
		for(int i=5;i>=1;i--) {
			for(int j=6;j>i;j--) {
				System.out.print(" ");
		   }
			for(int j=1;j<=(2*i-1);j++) {
				System.out.print("*");
			}
		System.out.println("");
	  }
		
//		for(int i=0;i<=5;i++) {
//			for(int j=0;j<=i;j++) {
//				System.out.print(" ");
//		   }
//			for(int k=0;k<=(2*(5-i)-1);k++) {
//				System.out.print("*");
//			}
//		System.out.println("");
//	  }
	}
	
	public static void main(String[] args) {
		Pattern7 obj=new Pattern7();
		obj.PrintPattern();	
	}
}
