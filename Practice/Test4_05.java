//100������ ��� 8�� 100���� �ٲ�� �˴ϴ�. 
//100���� �ΰ� ������, �����ϸ� �ܼ�â���� �����ﰢ���� ����� �� �� ���� �ϴ��� 8�� �׽��ϴ�. 
public class Test4_05{
	public static void main(String [] args){
		for(int i=0; i<8; i++){
			for(int j=0; j<i; j++) System.out.print(" ");//������ �Ϲ���: i
			for(int j=0; j<8-i; j++){ //�����ﰢ�� �Ϲ���: line(8)-i
				//���� �ﰢ������ ��µǴ� ��� �� Ȧ����° ��Ҵ� *
				if(j%2==1) System.out.print("*");
				//���� �ﰢ������ ��µǴ� ��� �� ¦����° ��Ҵ� +
				else System.out.print("+");
			}
			System.out.println();//����+{+,*}����ϸ� �� ���� �ϼ��Ǿ����Ƿ� ����
		}
	}
}















