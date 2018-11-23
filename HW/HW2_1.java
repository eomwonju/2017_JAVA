import java.util.Scanner;
class HW2_1{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int quo, res;
		
		System.out.print("일억미만의 정수: ");
		res = s.nextInt();
		
		quo = res/10000;
		res = res%10000;
		
		
		if(quo>1)		System.out.printf("%d만 ", quo);
		else if(quo==1) System.out.printf("만 ");
		
		
		quo = res/1000;
		res = res%1000;
		
		if(quo>1)		System.out.printf("%d천 ", quo);
		else if(quo==1) System.out.printf("천 ");
		
		quo = res/100;
		res = res%100;
		
		if(quo>1)		System.out.printf("%d백 ", quo);
		else if(quo==1) System.out.printf("백 ");
		
		quo = res/10;
		res = res%10;
		
		if(quo>1)		System.out.printf("%d십 ", quo);
		else if(quo==1) System.out.printf("십 ");
		
		if(res != 0) System.out.printf("%d입니다.\n ", res);
	}
}











