import java.util.Scanner;

public class AgeInput3{
	public static void main(String [] args){
		int age;
		Scanner s = new Scanner(System.in);
		
		while(true){
			System.out.print("���� : ")
			age = s.nextInt();
			if(age>=0&&age<200) break;
			System.out.println("��ȿ�� ���̰� �ƴմϴ�. 0�̻� 200�̸��� ���� �Է��ϼ���.");
		}
		
		System.out.println("�Է��� ���� : "+age)
	}
}