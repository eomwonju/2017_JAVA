import java.util.Scanner;

public class NestedIf{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		
		System.out.print("������� �������� (1[1��] �Ǵ� 2[2�� �Է�]) >> ");
		String type;
		type = s.nextLine();

		
		System.out.print("�ʱ� ������� ���� �Է� >> ");
		int score;
		score = s.nextInt();
	
		
		
		
		if(type.equals("1")||type.equals("1��")){
			if(score>=70) System.out.println("1�� ������� �հ�");
			else System.out.println("1�� ������� ���հ�");
		}
		else if(type.equals("2")||type.equals("2��")){
			if(score>=60) System.out.println("2�� ������� �հ�");
			else System.out.println("2�� ������� ���հ�");
		}
		else System.out.println("�Է� ����");
	}
}