import java.util.Scanner;

public class Game{
	public static void main(String [] args){
		int jungdap = 79;
		int userInput;
		int tries = 0;
		
		Scanner s = new Scanner(System.in);
		do{
			System.out.print("0~100������ ������ �Է��Ͽ� ���� ���纸���� : ");
			userInput = s.nextInt();
			if(userInput>jungdap) System.out.println("���� �� �� ���� �� �Դϴ�.");
			else if(userInput<jungdap )System.out.println("���� �� �� ū �� �Դϴ�.");
			tries += 1;
		}while(userInput!=jungdap);
		
		System.out.println("\n�����մϴ�. "+userInput+"�� �����Դϴ�. "+tries+"������ ���߼̽��ϴ�.");
	}
}