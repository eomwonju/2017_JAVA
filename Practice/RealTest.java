class RealTest{
	public static void main(String [] args){
		
		
		final double PI = 3.14; //pi�� ����� �ΰ� �ʹ� -> final, �빮��
		
		//PI = 3.14152;//�Ұ���. pi�� ����̱� ������!!!!
		
		boolean tf1 = true;
		boolean tf2 = false;
		boolean tf3 = 5>3;//true ����
		
		
		
		
		String st = "Hello";//���ڿ�
		// C ��� ������ char st[] = "Hello"
		
		char c1 = 'a';//���� �ϳ�
		String c2 = "a";//���ڿ�, �������� null�� ����
		//char ������ ���� ����ǥ �ȿ�
		//String�� ū ����ǥ �ȿ�
		
		
		
		double a = 35.3;
		float b = 35.3f;
		//float b = (float)35.3;
		
		//float b = 35.3;
		//����ȯ �߻�. ū Ÿ�� -> ���� Ÿ�� : ������ ����, ���� Ÿ�� -> ū Ÿ�� : �ڵ� ����ȯ �߻�
		
		long l1 = 24;//������ ����. �ڵ� ����ȯ �߻�. ���� Ÿ�� -> ū Ÿ��
		
		System.out.format("%5.2f", a);//printf()�� ����
	}
}