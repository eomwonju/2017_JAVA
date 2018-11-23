class IntegerTest{
	public static void main(String [] args){
		int a = 14;//10진수 decimal
		int a1 = 014; //8진수 octal
		int a2 = 0x14; //16진수 hexadecimal
		
		System.out.printf("%d, %d, %d\n", a, a1, a2);//a, a1, a2를 10진수 형식으로 표현
		System.out.printf("%d, %o, %x\n", a, a1, a2);//a, a1, a2를 각각 10진수, 8진수, 16진수 형식으로 표현
		System.out.printf("%d, %#o, %#x\n", a, a1, a2);//a, a1, a2를 각각 10진수, 8진수, 16진수 형식으로 표현
		System.out.printf("%10d, %#10o, %#10x\n", a, a1, a2);//10칸 확보
		System.out.printf("%1$d, %1$o, %1$x\n", a);
		//printf()에서는 % 서식지정자 사용가능
	}
}