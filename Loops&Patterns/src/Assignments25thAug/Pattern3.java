package Assignments25thAug;

public class Pattern3 {

//	1
//    12
//    123
//    1234
//    12345
	
	public void PrintPattern() {
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		Pattern3 obj=new Pattern3();
		
		obj.PrintPattern();
		
	}
}
