import java.util.Scanner;

public class AgeInput2{
	public static void main(String [] args){
		int age;
		Scanner s = new Scanner(System.in);
		
		do{
			System.out.print("���� : ")
			age = s.nextInt();
			if(age<0||age>=200) System.out.println("��ȿ�� ���̰� �ƴմϴ�. 0�̻� 200�̸��� ���� �Է��ϼ���.");
		}while(age<0||age>=200);
		
		System.out.println("�Է��� ���� : "+age)
	}
}