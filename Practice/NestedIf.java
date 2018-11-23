import java.util.Scanner;

public class NestedIf{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		
		System.out.print("면허시험 종류선택 (1[1종] 또는 2[2종 입력]) >> ");
		String type;
		type = s.nextLine();

		
		System.out.print("필기 면허시험 점수 입력 >> ");
		int score;
		score = s.nextInt();
	
		
		
		
		if(type.equals("1")||type.equals("1종")){
			if(score>=70) System.out.println("1종 면허시험 합격");
			else System.out.println("1종 면허시험 불합격");
		}
		else if(type.equals("2")||type.equals("2종")){
			if(score>=60) System.out.println("2종 면허시험 합격");
			else System.out.println("2종 면허시험 불합격");
		}
		else System.out.println("입력 오류");
	}
}