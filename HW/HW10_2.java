import java.util.*;

class HW10_2{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int a, b;
		
		System.out.println("a�� b�� ���� ���� ����ϴ� ���α׷��Դϴ�.");
		
		try{
			System.out.print("a: ");
			a = s.nextInt();
			
			System.out.print("b: ");
			b = s.nextInt();
			
			System.out.printf("a�� b�� ���� ��: %\n", a/b);
		}catch(ArithmeticException ae){
			System.out.println("[���� �߻����� ���� �������� ������ �� �����ϴ�]");
			System.out.println("���� ���� b�� 0�ƴ� ������ �Է����ּ���.");
		}catch(InputMismatchException im){
			System.out.println("[���� �߻����� ���� �������� ������ �� �����ϴ�]");
			System.out.println("���� ���� ���ڴ� �������·� �Է����ּ���.");
		}
		
		System.out.println("���� �ð��� ���ܰ� �߻��ϴ��� ���� ó���� ����� ������ ���α׷��� ��� ����˴ϴ�.");
		
	}
}