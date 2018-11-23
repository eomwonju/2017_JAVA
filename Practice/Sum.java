public class Sum{
	//같은 클래스의 메소드 호출할때 유의할 점 : 
	//static 메소드에서 static이 아닌 메소드는 호출 불가
	
	public static void main (String [] args){
		sum(10, 20);
		
		sum(20, 30); //10, 20, 30 : 인자, argument
		
		System.out.println(sum2(10, 20));//메소드 호출 결과를 그대로 출력
		int sum3545 = sum2(35, 45);//메소드 호출 결과를 변수에 저장
		System.out.println(sum3545);//변수 출력
	}
	
	
	//메소드 헤더
	static void sum(int start, int end){//단순히 합 print
	//인자값을 저장할 start, end는 매개변수
		int sum = 0;
		for(int i=start; i<=end; i++) sum+=i;
		System.out.println(sum);
		
	}
	static int sum2(int start, int end){//합을 돌려줄 것인지(return)
		int sum = 0;
		for(int i=start; i<=end; i++) sum+=i;
		
		return sum;//sum(반환값 : 함수에서의 출력이라고 생각하면 편함)을 반환
	}
	
}