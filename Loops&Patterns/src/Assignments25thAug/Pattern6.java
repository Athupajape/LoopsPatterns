package Assignments25thAug;

public class Pattern6 {


//    *
//   ***
//  *****
// *******
//*********
	
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
	}
	
	public static void main(String[] args) {
		Pattern6 obj=new Pattern6();
		obj.PrintPattern();	
	}
}
