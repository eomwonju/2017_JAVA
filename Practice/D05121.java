import java.util.Scanner;

class D05121{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int n;
		System.out.print("학생수 : ");
		n = s.nextInt();
		int [] scores = new int[n];
		double sum = 0;
		
		//1. 학생들 점수를 0-100이하의 정수값으로 임의로 설정
		/*for(int i=0; i<scores.length; i++){
			scores[i] = (int)(Math.random()*101);
			System.out.print(scores[i]+"\t");
		}
		*/
		initRnd(scores);
		
		//2. 학생들 평균 계산 : for-each문
		/*for(int x:scores){
			sum += x;
		}
		System.out.println("\n평균 : "+sum/scores.length);
		*/
		System.out.println("\n평균 : "+getAvrg(scores));
		
		//3. 두번째 학생의 점수를 100점으로 변경
		System.out.println("변경 전 : "+scores[1]);
		changeScr(scores, 2, 100);
		System.out.println("변경 후 : "+scores[1]);
	}
	
	//1. 학생들 점수 임의로 초기화하는 메소드 : 매개변수는 배열, 반환타입은 void
	static void initRnd(int [] arr){//main에 static이 붙었으므로 static이 붙은 메소드만 호출 가능
		for(int i=0; i<arr.length; i++){
			arr[i] = (int)(Math.random()*101);
			System.out.print(arr[i]+"\t");
		}
	}
	
	//2. 학생들 점수 평균 계산하는 메소드 : 매개변수는 배열, 반환타입은 double(평균)
	static double getAvrg(int [] arr){
		double sum =0;
		
		for(int x:arr){
			sum += x;
		}
		return sum/arr.length;
	}
	
	//3.학생의 점수를 변경하는 메소드
	/*
	static void changeScr(int before, int after){
		before = after;
	}//원본에 접근할 수 있도록 주소값을 줘야함
	*/
	static void changeScr(int [] arr, int stdNbr, int after){
		arr[stdNbr-1] = after;
	}
}