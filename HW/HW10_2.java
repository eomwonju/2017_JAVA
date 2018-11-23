import java.util.*;

class HW10_2{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int a, b;
		
		System.out.println("a를 b로 나눈 몫을 계산하는 프로그램입니다.");
		
		try{
			System.out.print("a: ");
			a = s.nextInt();
			
			System.out.print("b: ");
			b = s.nextInt();
			
			System.out.printf("a를 b로 나눈 몫: %\n", a/b);
		}catch(ArithmeticException ae){
			System.out.println("[예외 발생으로 인해 나눗셈을 진행할 수 없습니다]");
			System.out.println("다음 번엔 b는 0아닌 값으로 입력해주세요.");
		}catch(InputMismatchException im){
			System.out.println("[예외 발생으로 인해 나눗셈을 진행할 수 없습니다]");
			System.out.println("다음 번엔 숫자는 정수형태로 입력해주세요.");
		}
		
		System.out.println("실행 시간에 예외가 발생하더라도 예외 처리를 해줬기 때문에 프로그램은 계속 진행됩니다.");
		
	}
}