import java.util.Scanner;

class D0512{
	public static void main(String [] args){
		
		int score;//정수형 변수 1개

		//학생 수 입력 받아서 그만큼의 배열 생성
		int n;
		System.out.print("학생수 : ");
		n = s.nextInt();
		int [] scores2 = new int[n]
		
		int [] scores = new int[10];//정수형 변수 10개 배열
		//자바에서는 배열도 객체로 간주 : new 키워드 사용
		//1번 학생 = 100, 5번 학생 = 50
		scores[0] = 100;
		scores[4] = 50;
		
		Scanner s = new Scanner(System.in);
		
		//학생 10명의 점수 각각 입력
		for(int i=0; i<10/*= scores.length*/; i++){
			System.out.printf("학생 %d의 점수 : ", i+1);
			scores[i] = s.nextInt();
		}
		
		//학생 10명의 점수 각각 출력
		for(int j=0; j<10/*= scores.length*/; j++){//전통적인 for문
			System.out.printf("학생 %d의 점수 : ", j+1);
			System.out.println(scores[j]);
		}
		//배열의 원소는 초기화하지 않으면 (자료형에 맞는) 0으로 자동 초기화
		
		/*
		for-each문
		
		for(배열의 타입 변수명:배열명){
			//반복할 내용
		}
		
		배열의 크기를 몰라도 됨
		읽기용으로만 처리 가능
		*/
		for(int x:scores){//10 20 30 40 10 20
			System.out.println(x);
		}
		
		
		//원소 개수가 50개인 double 타입 배열
		double [] dArr = new double[50];
		//원소 개수가 100개인 String 타입 배열
		String [] sArr = new String[100];
		//원소 개수가 5개인 Scanner 배열
		Scanner [] scArr = new Scanner[5];
		
		//모든 원소 출력
		//dArr 모든 원소 출력
		for(double d:dArr) System.out.println(d);
		//scArr 모든 원소 출력
		for(Scanner sc:scArr ) System.out.println(sc);
		
		String str = "경북 대학교";
		System.out.println("str의 길이 : "+str.length());
		
		
		//scores 배열의 원소 개수 : 배열명.length
		System.out.println("scores 배열의 원소 개수 : "+scores.length);
		
		
		
		double [] dArr2 = new double[] {0.0,1.1,2.2};//=double [] dArr2 = {0.0,1.1,2.2}
	}
}