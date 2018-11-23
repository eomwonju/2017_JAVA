import java.util.Scanner; 

class Test3_05{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		double input;
		int n, abs;
		
		System.out.print("실수: ");
		input = s.nextDouble();
		n = (int)input;
		System.out.println("입력한 값의 정수 부분: "+n);
		
		abs = (n&0x80000000)==0x80000000?~n+1:n;
		//abs = (n&0x80000000)==0?n:~n+1;
		//abs = (n>>31)&1==0?n:~n+1;
		//abs = (n>>31)==-1?~n+1:n;
		//등...
		
		System.out.println("그 절댓값: "+abs);		
		System.out.println("절댓값에 16을 곱한 값: "+(abs<<4));	
		System.out.println("절댓값을 16으로 나눈 몫: "+(abs>>4));	
		System.out.println("절댓값을 16으로 나눈 나머지: "+(abs&15));
	}
}















