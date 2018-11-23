import java.util.Scanner;
class HW2_2{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int n, abs;
		String sign;
		
		System.out.print("정수: ");
		n = s.nextInt();
		sign = (n>>31 == 0)?"양수":"음수";
		
		//또는 		
		//sign = (n&0x80000000)==0?"양수":"음수"; 	//도 가능
		
		abs = ~n+1;		
		
		System.out.printf("\"%d은 %s입니다. 이 수의 절댓값은 %d이고, \n", n, sign, abs);
		System.out.printf("\t이를 4로 나눈 몫은 %d이고, \n", abs>>2);
		System.out.printf("\t\t나머지는 %d입니다.\"\n", abs&0b11);

		/* 부호확인
			부호는 MSB(MSB:1이면 음수, 0이면 양수)를 통해 알 수 있다. 
			int형은 32비트이므로 최상위 비트가 1인지 여부를 판단하기 위해서는
			입력값을 31비트만큼 오른쪽으로 시프트하고 그 값이 1인지 확인하면 된다. 
			((input>>31)&1)==1 이 참이면 음수, 거짓이면 양수이다. 
			
		*/
		
		// 4로 나눈 몫은 단순히 오른쪽으로 2칸 시프트시키면 됨
		
		// 4로 나눈 나머지는 마지막 2비트(0, 1, 2,3 중 하나 )이기 때문에  0b11과 AND 시키면(마지막 2비트만 남음)알아낼 수 있다. 
		
	}
}