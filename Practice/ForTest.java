class ForTest{
	public static void main(String [] args){
		
		int sum = 0, fact = 1;
		long fact2 = 1L;
		
		
		for(int i=0; i<10; i++)//j<(�ݺ�Ƚ��)//i+=2�ϸ� 5�� ���
			System.out.println("�ڹ�");
		
		for(int j=1; j<11; j++) System.out.println(j);
		
		for(int k=0; k<20; k++) System.out.println(7+k*5);
		
		for(int i=1; i<=10; i++) sum += i;
		System.out.println(sum);
		
		for(int i=1; i<=10; i++) fact *= i;
		System.out.println(fact);//10!
		
		for(int i=1; i<=49; i++) fact2 *= i;
		System.out.println(fact2);//49!
		
		//�����÷ο� �߻�����
		//50! ���ϱ�
		//�� ! ���ϴ� �������� �����÷ο� �߻�����
		//���������� ���� �������� ���丮���� �� !
		
		//1) fact<0�Ǵ� ����
		
		int i;
		fact2 = 1;
		long prevFact = fact2;
		for(i=1; i<=50; i++){
			fact2 *= i;
			if(fact2<0)break;
			prevFact = fact2;//prevFact�� �������� factorial ���� ���� ��.
		}
		System.out.printf("%d! ���ϴ� �������� �����÷ο� �߻�\n", i);
		System.out.printf("���������� ���� �������� ���丮�� ���� %d!(=%d)�Դϴ�.\n", i-1, prevFact);
		
		//2)n!/n = (n-1)!�� ������ �ʴ� ����
		
		fact2 = 1;
		prevFact = fact2;
		for(int i=1; i<=50; i++){
			fact2 *=i;
			if(fact2/i!=prevFact) break;
			prevFact = fact2;
		}
		
		System.out.printf("%d! ���ϴ� �������� �����÷ο� �߻�\n", i);
		System.out.printf("���������� ���� �������� ���丮�� ���� %d!(=%d)�Դϴ�.\n", i-1, prevFact);
	
	
		//����ڴ� ���, 0, ���� �Է°���
		//+, 0 , -�� ����� ��
		
		/*String st;
		java.util.Scanner s = new Scanner(System.in);
		st = s.next();
		
		if(st=="���") System.out.println("+");
		else if(st=="����") System.out.println("-");
		else if(st=="0") System.out.println("0");
		else System.out.println("�Է¿���!");*/
		
		//����
	}
}