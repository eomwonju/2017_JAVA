import java.util.Scanner;

class HW1_3{
	public static void main(String [] args){
		String name;	
		int age;
		double weight;
		
		Scanner s = new Scanner(System.in);
		System.out.print("�̸� : ");
		name = s.nextLine();
		System.out.print("���� : ");
		age = s.nextInt();
		System.out.print("������ : ");
		weight = s.nextDouble();
		
		
		System.out.printf("\"���� �̸��� '%s', \n���̴� %#x,\n\t�����Դ� %-10.3f�̴�.\"\n", name, age, weight);	
		
	}
}