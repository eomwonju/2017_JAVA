import java.lang.String;

class StringPractice{
	pubic static void main(String [] args){
		
		String st = "Hello", st1 = "abc", st2 = "ad", st3 = "abc", st4 = "abcd";
		System.out.println("���ڿ� ���� : "+st.length());
		System.out.println("5��° ���� : "+st.charAt(4));
		System.out.println("st1�� st2 �� : "+st1.compareTo(st2));//st1 - st2 = -2
		System.out.println("st1�� st2 �� : "+st2.compareTo(st1));//st2 - st1 = 2
		System.out.println("st1�� st2 �� : "+st3.compareTo(st1));//st3 - st1 = 0
		System.out.println("st1�� st2 �� : "+st4.compareTo(st1));//st4 - st1 = d�� ASCII�ڵ� ��
		
		if(st1.equals(st3)) System.out.println("�� ���ڿ��� ����");//���� ��
		else System.out.println("�� ���ڿ��� �ٸ���");
	}
}