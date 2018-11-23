import java.util.Scanner;

class ScannerTest{
	public static void main(String [] args){
		
		Scanner s = new Scanner(System.in);
		String name;
		double score;
		
		System.out.print("이름 : ");
		name = s.nextLine();
		System.out.print("학점 : ");
		score = s.nextDouble();
		//학점은 총 7칸 중 소수점 아래는 1자리까지만 출력
		System.out.printf("이름 : %7s\n학점 : %7.1f\n", name, score);
	}
}