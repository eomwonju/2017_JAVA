import java.util.Scanner;

class D0512{
	public static void main(String [] args){
		
		int score;//������ ���� 1��

		//�л� �� �Է� �޾Ƽ� �׸�ŭ�� �迭 ����
		int n;
		System.out.print("�л��� : ");
		n = s.nextInt();
		int [] scores2 = new int[n]
		
		int [] scores = new int[10];//������ ���� 10�� �迭
		//�ڹٿ����� �迭�� ��ü�� ���� : new Ű���� ���
		//1�� �л� = 100, 5�� �л� = 50
		scores[0] = 100;
		scores[4] = 50;
		
		Scanner s = new Scanner(System.in);
		
		//�л� 10���� ���� ���� �Է�
		for(int i=0; i<10/*= scores.length*/; i++){
			System.out.printf("�л� %d�� ���� : ", i+1);
			scores[i] = s.nextInt();
		}
		
		//�л� 10���� ���� ���� ���
		for(int j=0; j<10/*= scores.length*/; j++){//�������� for��
			System.out.printf("�л� %d�� ���� : ", j+1);
			System.out.println(scores[j]);
		}
		//�迭�� ���Ҵ� �ʱ�ȭ���� ������ (�ڷ����� �´�) 0���� �ڵ� �ʱ�ȭ
		
		/*
		for-each��
		
		for(�迭�� Ÿ�� ������:�迭��){
			//�ݺ��� ����
		}
		
		�迭�� ũ�⸦ ���� ��
		�б�����θ� ó�� ����
		*/
		for(int x:scores){//10 20 30 40 10 20
			System.out.println(x);
		}
		
		
		//���� ������ 50���� double Ÿ�� �迭
		double [] dArr = new double[50];
		//���� ������ 100���� String Ÿ�� �迭
		String [] sArr = new String[100];
		//���� ������ 5���� Scanner �迭
		Scanner [] scArr = new Scanner[5];
		
		//��� ���� ���
		//dArr ��� ���� ���
		for(double d:dArr) System.out.println(d);
		//scArr ��� ���� ���
		for(Scanner sc:scArr ) System.out.println(sc);
		
		String str = "��� ���б�";
		System.out.println("str�� ���� : "+str.length());
		
		
		//scores �迭�� ���� ���� : �迭��.length
		System.out.println("scores �迭�� ���� ���� : "+scores.length);
		
		
		
		double [] dArr2 = new double[] {0.0,1.1,2.2};//=double [] dArr2 = {0.0,1.1,2.2}
	}
}