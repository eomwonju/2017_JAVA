import java.util.Scanner;

class HW1_2{
	public static void main(String [] args){
		int a;
		int b;
		
		Scanner s = new Scanner(System.in);
		System.out.print("첫번째 양의 정수 : ");
		a = s.nextInt();
		System.out.print("두번째 양의 정수 : ");
		b = s.nextInt();
	
		System.out.printf("\n\n%-10s|%-10s|%-10s|%-11s|\n", "number","decimal","otcal","hexadecimal");
		System.out.printf("%-10s|%+10d|%10o|%11x|\n", "number 1",a,a,a);
		System.out.printf("%-10s|%+10d|%10o|%11x|\n", "number 2",b,b,b);
		System.out.printf("%-10s|%+-10d|%-10o|%-11x|\n", "sum",a+b,a+b,a+b);
	}
}