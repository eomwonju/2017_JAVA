//나이를 입력
//음수라면 재입력
//200살 이상이라도 재입력

import java.util.Scanner;

public class AgeInput1{
	public static void main(String [] args){
		int age;
		Scanner s = new Scanner(System.in);
		System.out.print("나이 : ")
		age = s.nextInt();
		
		while(age<0||age>=200){
			System.out.println("유효한 나이가 아닙니다. 0이상 200미만의 값을 입력하세요.")
			System.out.print("나이 : ")
			age = s.nextInt();
		}
		
		System.out.println("입력한 나이 : "+age)
	}
}