class ForTest{
	public static void main(String [] args){
		
		int sum = 0, fact = 1;
		long fact2 = 1L;
		
		
		for(int i=0; i<10; i++)//j<(반복횟수)//i+=2하면 5번 출력
			System.out.println("자바");
		
		for(int j=1; j<11; j++) System.out.println(j);
		
		for(int k=0; k<20; k++) System.out.println(7+k*5);
		
		for(int i=1; i<=10; i++) sum += i;
		System.out.println(sum);
		
		for(int i=1; i<=10; i++) fact *= i;
		System.out.println(fact);//10!
		
		for(int i=1; i<=49; i++) fact2 *= i;
		System.out.println(fact2);//49!
		
		//오버플로우 발생시점
		//50! 구하기
		//몇 ! 구하는 과정에서 오버플로우 발생시점
		//마지막으로 구한 정상적인 팩토리얼값은 몇 !
		
		//1) fact<0되는 시점
		
		int i;
		fact2 = 1;
		long prevFact = fact2;
		for(i=1; i<=50; i++){
			fact2 *= i;
			if(fact2<0)break;
			prevFact = fact2;//prevFact는 정상적인 factorial 값만 들어가게 됨.
		}
		System.out.printf("%d! 구하는 과정에서 오버플로우 발생\n", i);
		System.out.printf("마지막으로 구한 정상적인 팩토리얼 값은 %d!(=%d)입니다.\n", i-1, prevFact);
		
		//2)n!/n = (n-1)!이 나오지 않는 시점
		
		fact2 = 1;
		prevFact = fact2;
		for(int i=1; i<=50; i++){
			fact2 *=i;
			if(fact2/i!=prevFact) break;
			prevFact = fact2;
		}
		
		System.out.printf("%d! 구하는 과정에서 오버플로우 발생\n", i);
		System.out.printf("마지막으로 구한 정상적인 팩토리얼 값은 %d!(=%d)입니다.\n", i-1, prevFact);
	
	
		//사용자는 양수, 0, 음수 입력가능
		//+, 0 , -를 출력할 것
		
		/*String st;
		java.util.Scanner s = new Scanner(System.in);
		st = s.next();
		
		if(st=="양수") System.out.println("+");
		else if(st=="음수") System.out.println("-");
		else if(st=="0") System.out.println("0");
		else System.out.println("입력오류!");*/
		
		//오류
	}
}