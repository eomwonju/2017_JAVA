class RealTest{
	public static void main(String [] args){
		
		
		final double PI = 3.14; //pi는 상수로 두고 싶다 -> final, 대문자
		
		//PI = 3.14152;//불가능. pi가 상수이기 때문에!!!!
		
		boolean tf1 = true;
		boolean tf2 = false;
		boolean tf3 = 5>3;//true 저장
		
		
		
		
		String st = "Hello";//문자열
		// C 언어 에서는 char st[] = "Hello"
		
		char c1 = 'a';//문자 하나
		String c2 = "a";//문자열, 마지막에 null이 붙음
		//char 변수는 작은 따옴표 안에
		//String은 큰 따옴표 안에
		
		
		
		double a = 35.3;
		float b = 35.3f;
		//float b = (float)35.3;
		
		//float b = 35.3;
		//형변환 발생. 큰 타입 -> 작은 타입 : 컴파일 오류, 작은 타입 -> 큰 타입 : 자동 형변환 발생
		
		long l1 = 24;//컴파일 가능. 자동 형변환 발생. 작은 타입 -> 큰 타입
		
		System.out.format("%5.2f", a);//printf()와 유사
	}
}