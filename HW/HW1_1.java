import java.util.Scanner;

class HW1_1{
	public static void main(String [] args){
		String name;
		String tel;
		Scanner s = new Scanner(System.in);
		System.out.print("�̸�: ");
		name = s.nextLine();
		
		System.out.print("��ȭ��ȣ: ");
		tel = s.nextLine();
		
		System.out.println("\n\n-�Է��� ����-");
		System.out.println("�̸�: "+name);
		System.out.println("��ȭ��ȣ: "+tel);		
	}
}