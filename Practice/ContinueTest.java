public class ContinueTest{
	public static void main(String [] args){
		//1~10���� ���, 4�� ����� �����ϰ� ����ϱ�
		
		for(int i=1; i<=10; i++){
			if(i%4==0) continue;//�Ʒ� ������� �������� ���� �� ���� �ݺ����� �Ѿ.
			System.out.print(i+" ");
		}
		
		for(int i=1; i<=10; i++){
			if(i%4!=0) System.out.print(i+" ");
		}
	
	}
}