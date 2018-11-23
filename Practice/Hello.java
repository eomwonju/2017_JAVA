/*
작성자:엄원주
작성일:170303
*/
import java.util.Scanner;

public class Hello{
	public static void main(String [] args){
		int input;
		Scanner s = new Scanner(System.in);
		System.out.print("나이 : ");
		input = s.nextInt();//콘솔창에에서 사용자에게 정수형 하나로 입력받음
		System.out.println("입력한 나이는 "+input+"입니다.");
		System.out.printf("입력한 나이는 %d입니다.\n", input);
		
		System.out.println("Hello, World!");//개행
		System.out.print("Hello, World!");//개행 X
		System.out.printf("Hello, World!");//%(서식 지정자) 사용 가능
		System.out.printf("%d",5);
	}
}//Hello는 클래스 명 : 클래스명의 첫 글자는 대문자로