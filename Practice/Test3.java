import java.util.Scanner;

class Test3{
	public static void main(String [] args){
		int userInput;
		int dap = (((int)Math.random())*100)+1;
		
		Scanner s = new Scanner(System.in);
		System.out.print("���� ������ : ");
		userInput = s.nextInt();
		
		if(userInput>dap) System.out.println("���亸�� ũ�׿� ���� : "+dap);
		else if(userInput<dap) System.out.println("���亸�� �۳׿� ���� : "+dap);
		else System.out.println("�����Դϴ�");
	}
}