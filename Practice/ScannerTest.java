import java.util.Scanner;

class ScannerTest{
	public static void main(String [] args){
		
		Scanner s = new Scanner(System.in);
		String name;
		double score;
		
		System.out.print("�̸� : ");
		name = s.nextLine();
		System.out.print("���� : ");
		score = s.nextDouble();
		//������ �� 7ĭ �� �Ҽ��� �Ʒ��� 1�ڸ������� ���
		System.out.printf("�̸� : %7s\n���� : %7.1f\n", name, score);
	}
}