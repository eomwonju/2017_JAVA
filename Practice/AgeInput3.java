import java.util.Scanner;

public class AgeInput3{
	public static void main(String [] args){
		int age;
		Scanner s = new Scanner(System.in);
		
		while(true){
			System.out.print("나이 : ")
			age = s.nextInt();
			if(age>=0&&age<200) break;
			System.out.println("유효한 나이가 아닙니다. 0이상 200미만의 값을 입력하세요.");
		}
		
		System.out.println("입력한 나이 : "+age)
	}
}