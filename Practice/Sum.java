public class Sum{
	//���� Ŭ������ �޼ҵ� ȣ���Ҷ� ������ �� : 
	//static �޼ҵ忡�� static�� �ƴ� �޼ҵ�� ȣ�� �Ұ�
	
	public static void main (String [] args){
		sum(10, 20);
		
		sum(20, 30); //10, 20, 30 : ����, argument
		
		System.out.println(sum2(10, 20));//�޼ҵ� ȣ�� ����� �״�� ���
		int sum3545 = sum2(35, 45);//�޼ҵ� ȣ�� ����� ������ ����
		System.out.println(sum3545);//���� ���
	}
	
	
	//�޼ҵ� ���
	static void sum(int start, int end){//�ܼ��� �� print
	//���ڰ��� ������ start, end�� �Ű�����
		int sum = 0;
		for(int i=start; i<=end; i++) sum+=i;
		System.out.println(sum);
		
	}
	static int sum2(int start, int end){//���� ������ ������(return)
		int sum = 0;
		for(int i=start; i<=end; i++) sum+=i;
		
		return sum;//sum(��ȯ�� : �Լ������� ����̶�� �����ϸ� ����)�� ��ȯ
	}
	
}