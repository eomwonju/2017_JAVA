class HW10_3{
	public static void main(String [] args){
		String [] strArr1 = {"123", "234", "4567564", "���̽ʻ�"};//������ ��ȯ�� �� ���� ���ڿ� "���̽ʻ�"�� ���ҷ� ������ String �迭 strArr1
		String [] strArr2 = {"123", "234", "4567564", "34.5"}; //������ ��ȯ�� �� ���� ���ڿ� "34.5"�� ���ҷ� ������ String �迭 strArr2
		String [] strArr3 = {"123", "234", "4567564"}; //��� ���Ҹ� ������ ��ȯ�� �� �ִ� String �迭 strArr3
		//Example 1
		System.out.println("Example1: ");
		try{
			transInt(strArr1);
		}catch(NumberFormatException nfe){
			System.err.println("[���� �߻�]");
			System.err.println("�迭�� ������ �ƴ� ���� ����־� ���� Ÿ������ ��ȯ�� ������ �� �����ϴ�. ");
		}
		//�� �ڵ忡�� ���ܰ� �߻��ϴ��� ���� ó���� ����⶧���� �Ʒ� �ڵ嵵 ���� 
		
		//Example 2
		System.out.println("\n\nExample2: ");
		try{
			transInt(strArr2);
		}catch(NumberFormatException nfe){
			System.err.println("[���� �߻�]");
			System.err.println("�迭�� ������ �ƴ� ���� ����־� ���� Ÿ������ ��ȯ�� ������ �� �����ϴ�. ");
		}
		
		//Example 3
		System.out.println("\n\nExample3: ");
		try{
			transInt(strArr3);
		}catch(NumberFormatException nfe){
			System.err.println("[���� �߻�]");
			System.err.println("�迭�� ������ �ƴ� ���� ����־� ���� Ÿ������ ��ȯ�� ������ �� �����ϴ�. ");
		}
		
	}
	static void transInt(String [] stringArray) throws NumberFormatException{
		for(String s: stringArray)
			System.out.println("String Ÿ���� ������ int Ÿ���� ������ ��ȯ�߰� �� ���� "+Integer.parseInt(s)+"�Դϴ�.");
	}
}