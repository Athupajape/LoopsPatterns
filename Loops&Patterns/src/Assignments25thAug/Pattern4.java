package Assignments25thAug;

public class Pattern4 {

//	1
//    2 3
//    4 5 6
//    7 8 9 10
	
	int m=1;
	
   public void PrintPattern() {
		
		for(int i=1;i<=4;i++) {
			for(int k=1;k<i+1;k++) {
				System.out.print(m + " ");
				m++;
		   }
		System.out.println("");
	  }
	}
	
	public static void main(String[] args) {
		Pattern4 obj=new Pattern4();
		
		obj.PrintPattern();
		
	}
	
}
