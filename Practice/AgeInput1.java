//���̸� �Է�
//������� ���Է�
//200�� �̻��̶� ���Է�

import java.util.Scanner;

public class AgeInput1{
	public static void main(String [] args){
		int age;
		Scanner s = new Scanner(System.in);
		System.out.print("���� : ")
		age = s.nextInt();
		
		while(age<0||age>=200){
			System.out.println("��ȿ�� ���̰� �ƴմϴ�. 0�̻� 200�̸��� ���� �Է��ϼ���.")
			System.out.print("���� : ")
			age = s.nextInt();
		}
		
		System.out.println("�Է��� ���� : "+age)
	}
}