class StringTest{
	public static void main(String [] args){
		
		//String [] args;//args�� ���ڿ� �������� ������ �� �ִ� �迭
		//�迭�� i��° �ε��� ���ҿ� ���� : args[i]
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		//������ ���� 1��° ���� + 2��° ����
		System.out.println(args[1]+args[2]);//1��° ���ҿ� 2��° ���Ұ� �����
		//Wrapper class : Integer, Double, Boolean ...
		//args[0]�� ���������� ����ȯ �ϰ� ����
		System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1]));
		//args�� 2��° �ε��� ���Ҹ� Double�� ����ȯ �� ���
		System.out.println(Double.parseDouble(args[2]));
		
		
		String a1 = "Hello!";
		String a2 = "hello!";
		
		
		System.out.println(a1+a2);
		System.out.println(a1.concat(a2));
		
		
		//a1�� a2 ������?
		System.out.println(a1==a2);//false, a1�� a2 �������� ������?
		System.out.println(a1.equals(a2));//false
		System.out.println(a1.equalsIgnoreCase(a2));//true, ��ҹ��� �����ϰ� ������?
		System.out.println(a1.compareTo(a2));//ù ��°�� �ٸ� ������ ASCII code ���� �� ��, a1-a2
		
		
		System.out.println(a1.charAt(0));//H
		System.out.println(a2.charAt(0));//h
		
		
		//a1���� ������!�� .���� �����ؼ� ����
		//a1.charAt(5)='.';//���ڿ��� ����� ���뺯�� �Ұ�.
		a1 = "Hello.";
		
		
		//substring()
		System.out.println(a1.substring(1,3));//el
		//toUpperCase();, toLowerCase();//��� ���ڸ� �빮�� �Ǵ� �ҹ��ڷ� ���������
		System.out.println(a1.toUpperCase());
		System.out.println(a1.toLowerCase());
		
		//replace();
		System.out.println(a1.replace('l','e'));//a1 ���ڿ����� l�� ��� e�� ����
	}
}//class�� �����ϴ� method�� 1�� : main method//java�� method�� �׻� class�ȿ� ����