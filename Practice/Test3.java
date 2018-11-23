import java.util.Scanner;

class Test3{
	public static void main(String [] args){
		int userInput;
		int dap = (((int)Math.random())*100)+1;
		
		Scanner s = new Scanner(System.in);
		System.out.print("맞춰 보세요 : ");
		userInput = s.nextInt();
		
		if(userInput>dap) System.out.println("정답보다 크네요 정답 : "+dap);
		else if(userInput<dap) System.out.println("정답보다 작네요 정답 : "+dap);
		else System.out.println("정답입니다");
	}
}