/*
�ۼ���:������
�ۼ���:170303
*/
import java.util.Scanner;

public class Hello{
	public static void main(String [] args){
		int input;
		Scanner s = new Scanner(System.in);
		System.out.print("���� : ");
		input = s.nextInt();//�ܼ�â������ ����ڿ��� ������ �ϳ��� �Է¹���
		System.out.println("�Է��� ���̴� "+input+"�Դϴ�.");
		System.out.printf("�Է��� ���̴� %d�Դϴ�.\n", input);
		
		System.out.println("Hello, World!");//����
		System.out.print("Hello, World!");//���� X
		System.out.printf("Hello, World!");//%(���� ������) ��� ����
		System.out.printf("%d",5);
	}
}//Hello�� Ŭ���� �� : Ŭ�������� ù ���ڴ� �빮�ڷ�