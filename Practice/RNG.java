import java.util.Random;

class RNG{
	public static void main(String [] args){
		
		
		//Math Ŭ���� ���� ����
		//java.lang.Math //java.lang ��Ű�� -> import�� �ʿ� ���� 
		
		System.out.println(Math.random());//0�̻� 1�̸��� �Ǽ��� ���� ����
		System.out.println((int)(10*Math.random()));//1�̻� 10�̸��� ������ ���� ����
		System.put.println((int)(25*(Math.random()+23));//23�̻� 47������ ������ ���� ����
		System.put.println((int)(23*(Math.random()+103));//103�̻� 125������ ������ ���� ����
		
		//Random Ŭ���� ���� ����
		//java.util.Random //java.util ��Ű�� -> import�� �ʿ���
		
		Random r = new Random();
		
		System.out.println(r.nextInt());//int�� ���� ����
		System.out.println(r.nextInt(5));//0���� 5�̸��� ���� ����
		
		
		
		//��Ű�� : Ŭ�������� ��� ���� ����
	}
}