import java.util.Scanner;

public class HW3_2{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int input, n=0;
		double sum=0;//��հ��� �Ǽ��̹Ƿ� sum�� �Ǽ��̾�� �Կ� �����Ѵ�.
		
		while(true){
			System.out.print("������ �Է��϶� : ");
			input = s.nextInt();
			if(n==1111) break;
			else if(n%2==0) continue;
			else if(n%7==0) continue;
			sum += input;
			n++;
		}
		
		if(n!=0) System.out.printf("����� %.2f�Դϴ�.\n", sum/n);
		else System.out.println("����� ����� ���� �����ϴ�.");
		
	}
}

//����ڰ� 1111�� �Է��� ������ ������ �Է� �޾� �� �� Ȧ������ ����� ����Ͽ� ����Ѵ�.
//�� 7�� ����� �Է��ϸ� ��� ��꿡�� �����ϰ�, �������� �Է��� 1111���� ��� �Ի꿡�� �����Ѵ�.
//����� ����� Ȧ���� ���� ��� ������ ó���� �Ѵ�.