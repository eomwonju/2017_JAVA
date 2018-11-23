import java.util.Scanner;

public class HW3_2{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int input, n=0;
		double sum=0;//평균값이 실수이므로 sum도 실수이어야 함에 주의한다.
		
		while(true){
			System.out.print("정수를 입력하라 : ");
			input = s.nextInt();
			if(n==1111) break;
			else if(n%2==0) continue;
			else if(n%7==0) continue;
			sum += input;
			n++;
		}
		
		if(n!=0) System.out.printf("평균은 %.2f입니다.\n", sum/n);
		else System.out.println("평균을 계산할 수가 없습니다.");
		
	}
}

//사용자가 1111을 입력할 때까지 정수를 입력 받아 그 중 홀수들의 평균을 계산하여 출력한다.
//단 7의 배수를 입력하면 평균 계산에서 제외하고, 마지막에 입력한 1111역시 평균 게산에서 제외한다.
//평균을 계산할 홀수가 없는 경우 적절한 처리를 한다.