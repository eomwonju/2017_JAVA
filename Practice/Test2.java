import java.util.Scanner;

class Test2{
	public static void main(String [] args){
		int month, year;
		Scanner s = new Scanner(System.in);
		
		System.out.print("�� �� : ");
		year = s.nextInt();
		System.out.print("�� �� : ");
		month = s.nextInt();
		
		switch(month){
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println(year+"�� "+month+"�� 31�ϱ��� �ֽ��ϴ�.");
			break;
			
			case 4: case 6: case 9: case 11: 
			System.out.println(year+"�� "+month+"�� 30�ϱ��� �ֽ��ϴ�.");
			
			case 2:
			System.out.println(year+"�� "+month+"�� 29�ϱ��� �ֽ��ϴ�.");
		}
		
	}
}