package Assignments25thAug;

public class Pattern1 {

	//To print
	//	  *
	//    **
	//    ***
	//    ****
	
	public void PrintPattern() {
		
		for(int i=1;i<5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
		}
			System.out.println("");
	 }
   }
	
	public static void main(String[] args) {
		Pattern1 obj=new Pattern1();
		
		obj.PrintPattern();
		
	}
	
}
