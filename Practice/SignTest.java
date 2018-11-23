//정수형 변수 a,b
//a를 입력 받아 양수이면 b=1
//a=0이면 b=0
//a가 음수이면 b=-1
//b 출력

import java.util.Scanner;

class SignTest{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int a,b;
		System.out.println("정수 a : ");
		a = s.nextInt();
		if (a>0) b=1;
		else if(a==0) b=0;
		else b=-1;//마지막은 else로
		System.out.println(b);
		}
}