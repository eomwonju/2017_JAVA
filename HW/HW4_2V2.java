import java.util.Scanner;
//continue  ���
public class HW4_2V2{ 
	public static void main(String [] args){
		int input, n=0;
		double sum = 0;
		Scanner s = new Scanner(System.in);
		
		while(true){
			System.out.print("����: ");
			input = s.nextInt();
			if(input==1111) break;
			if(input%2!=0){
				if(input%7==0) continue;//continue�� ���� �߰�ȣ �Ʒ� �κ��� ��� ��ŵ, �� 7�� ������ 15, 16 ���� ��ŵ
				n++;
				sum += input;
			}
		}
		
		if(n==0) System.out.println("����� ����� Ȧ���� �����ϴ�.");
		else System.out.println("���: "+sum/n);
	}
}