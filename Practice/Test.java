import java.util.Scanner;

class Test{
	public static void main(String [] args){
		int CupSize;
		Scanner s = new Scanner(System.in);
		
		System.out.print("ÄÅ »çÀÌÁî : ");
		CupSize = s.nextInt();
		
		if(CupSize<100) System.out.println("small");
		else if(100<=CupSize&CupSize<200) System.out.println("medium");
		else System.out.println("large");
		
	}
}