class IntegerTest{
	public static void main(String [] args){
		int a = 14;//10���� decimal
		int a1 = 014; //8���� octal
		int a2 = 0x14; //16���� hexadecimal
		
		System.out.printf("%d, %d, %d\n", a, a1, a2);//a, a1, a2�� 10���� �������� ǥ��
		System.out.printf("%d, %o, %x\n", a, a1, a2);//a, a1, a2�� ���� 10����, 8����, 16���� �������� ǥ��
		System.out.printf("%d, %#o, %#x\n", a, a1, a2);//a, a1, a2�� ���� 10����, 8����, 16���� �������� ǥ��
		System.out.printf("%10d, %#10o, %#10x\n", a, a1, a2);//10ĭ Ȯ��
		System.out.printf("%1$d, %1$o, %1$x\n", a);
		//printf()������ % ���������� ��밡��
	}
}