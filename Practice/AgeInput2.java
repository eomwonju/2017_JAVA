import java.util.Scanner;

public class AgeInput2{
	public static void main(String [] args){
		int age;
		Scanner s = new Scanner(System.in);
		
		do{
			System.out.print("나이 : ")
			age = s.nextInt();
			if(age<0||age>=200) System.out.println("유효한 나이가 아닙니다. 0이상 200미만의 값을 입력하세요.");
		}while(age<0||age>=200);
		
		System.out.println("입력한 나이 : "+age)
	}
}