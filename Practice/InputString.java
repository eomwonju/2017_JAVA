import java.util.Scanner;

class InputString{
	public static void main(String [] args){
		
		Scanner s =  new Scanner(System.in);
		String name;//�̸��� ������ ���� ����
		int age;
		
		
		System.out.print("���� : ");
		name = s.nextInt();//���� ���� �Է� ����
		s.nextLine();//nextLine�� enter�� ������ �Է��� �޾ƹ���
		
	
		System.out.print("�̸� : ");
		name = s.nextLine();//���� ���� �Է� ����, enter �ձ��� �Է��� ����
		//name = s.next();  ���� �ձ����� �Է� ����
		
		
		System.out.println("����� �̸��� "+name+"�Դϴ�.");
		System.out.println("����� ���̴� "+age+"�� �Դϴ�.");
	}
}