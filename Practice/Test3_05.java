import java.util.Scanner; 

class Test3_05{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		double input;
		int n, abs;
		
		System.out.print("�Ǽ�: ");
		input = s.nextDouble();
		n = (int)input;
		System.out.println("�Է��� ���� ���� �κ�: "+n);
		
		abs = (n&0x80000000)==0x80000000?~n+1:n;
		//abs = (n&0x80000000)==0?n:~n+1;
		//abs = (n>>31)&1==0?n:~n+1;
		//abs = (n>>31)==-1?~n+1:n;
		//��...
		
		System.out.println("�� ����: "+abs);		
		System.out.println("���񰪿� 16�� ���� ��: "+(abs<<4));	
		System.out.println("������ 16���� ���� ��: "+(abs>>4));	
		System.out.println("������ 16���� ���� ������: "+(abs&15));
	}
}















