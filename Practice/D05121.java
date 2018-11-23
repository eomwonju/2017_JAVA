import java.util.Scanner;

class D05121{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int n;
		System.out.print("�л��� : ");
		n = s.nextInt();
		int [] scores = new int[n];
		double sum = 0;
		
		//1. �л��� ������ 0-100������ ���������� ���Ƿ� ����
		/*for(int i=0; i<scores.length; i++){
			scores[i] = (int)(Math.random()*101);
			System.out.print(scores[i]+"\t");
		}
		*/
		initRnd(scores);
		
		//2. �л��� ��� ��� : for-each��
		/*for(int x:scores){
			sum += x;
		}
		System.out.println("\n��� : "+sum/scores.length);
		*/
		System.out.println("\n��� : "+getAvrg(scores));
		
		//3. �ι�° �л��� ������ 100������ ����
		System.out.println("���� �� : "+scores[1]);
		changeScr(scores, 2, 100);
		System.out.println("���� �� : "+scores[1]);
	}
	
	//1. �л��� ���� ���Ƿ� �ʱ�ȭ�ϴ� �޼ҵ� : �Ű������� �迭, ��ȯŸ���� void
	static void initRnd(int [] arr){//main�� static�� �پ����Ƿ� static�� ���� �޼ҵ常 ȣ�� ����
		for(int i=0; i<arr.length; i++){
			arr[i] = (int)(Math.random()*101);
			System.out.print(arr[i]+"\t");
		}
	}
	
	//2. �л��� ���� ��� ����ϴ� �޼ҵ� : �Ű������� �迭, ��ȯŸ���� double(���)
	static double getAvrg(int [] arr){
		double sum =0;
		
		for(int x:arr){
			sum += x;
		}
		return sum/arr.length;
	}
	
	//3.�л��� ������ �����ϴ� �޼ҵ�
	/*
	static void changeScr(int before, int after){
		before = after;
	}//������ ������ �� �ֵ��� �ּҰ��� �����
	*/
	static void changeScr(int [] arr, int stdNbr, int after){
		arr[stdNbr-1] = after;
	}
}