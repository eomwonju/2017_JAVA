import java.util.Scanner;
class HW2_1{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int quo, res;
		
		System.out.print("�Ͼ�̸��� ����: ");
		res = s.nextInt();
		
		quo = res/10000;
		res = res%10000;
		
		
		if(quo>1)		System.out.printf("%d�� ", quo);
		else if(quo==1) System.out.printf("�� ");
		
		
		quo = res/1000;
		res = res%1000;
		
		if(quo>1)		System.out.printf("%dõ ", quo);
		else if(quo==1) System.out.printf("õ ");
		
		quo = res/100;
		res = res%100;
		
		if(quo>1)		System.out.printf("%d�� ", quo);
		else if(quo==1) System.out.printf("�� ");
		
		quo = res/10;
		res = res%10;
		
		if(quo>1)		System.out.printf("%d�� ", quo);
		else if(quo==1) System.out.printf("�� ");
		
		if(res != 0) System.out.printf("%d�Դϴ�.\n ", res);
	}
}











