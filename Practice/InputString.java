import java.util.Scanner;

class InputString{
	public static void main(String [] args){
		
		Scanner s =  new Scanner(System.in);
		String name;//이름을 저장할 변수 선언
		int age;
		
		
		System.out.print("나이 : ");
		name = s.nextInt();//공백 포함 입력 받음
		s.nextLine();//nextLine는 enter를 누르면 입력을 받아버림
		
	
		System.out.print("이름 : ");
		name = s.nextLine();//공백 포함 입력 받음, enter 앞까지 입력을 받음
		//name = s.next();  공백 앞까지만 입력 받음
		
		
		System.out.println("당신의 이름은 "+name+"입니다.");
		System.out.println("당신의 나이는 "+age+"세 입니다.");
	}
}