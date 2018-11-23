import java.util.Scanner;

public class Game{
	public static void main(String [] args){
		int jungdap = 79;
		int userInput;
		int tries = 0;
		
		Scanner s = new Scanner(System.in);
		do{
			System.out.print("0~100까지의 정수를 입력하여 답을 맞춰보세요 : ");
			userInput = s.nextInt();
			if(userInput>jungdap) System.out.println("답은 좀 더 작은 수 입니다.");
			else if(userInput<jungdap )System.out.println("답은 좀 더 큰 수 입니다.");
			tries += 1;
		}while(userInput!=jungdap);
		
		System.out.println("\n축하합니다. "+userInput+"은 정답입니다. "+tries+"번만에 맞추셨습니다.");
	}
}