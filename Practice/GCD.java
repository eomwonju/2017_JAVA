import java.util.Scanner;

public class GCD{
	public static void main(String [] args){
		int x, y, r, tmp;
		Scanner s = new Scanner(System.in);
		System.out.print("����1 : ");
		x = s.nextInt();
		System.out.print("����2 : ");
		y = s.nextInt();
		

		if(y>x){
			r = x;
			x = y;
			y = r;
		}
		
		while(y!=0){
			r = x%y;
			x = y;
			y = r;
		}
			
		System.out.println("�ִ� ������� "+x+"�Դϴ�.");
		
	}
}