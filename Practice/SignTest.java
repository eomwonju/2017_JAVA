//������ ���� a,b
//a�� �Է� �޾� ����̸� b=1
//a=0�̸� b=0
//a�� �����̸� b=-1
//b ���

import java.util.Scanner;

class SignTest{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int a,b;
		System.out.println("���� a : ");
		a = s.nextInt();
		if (a>0) b=1;
		else if(a==0) b=0;
		else b=-1;//�������� else��
		System.out.println(b);
		}
}