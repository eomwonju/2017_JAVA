class StringManipulate{
	String concat(String s1, String s2){
		return s1+s2;
	}
	
	void toUpper(String s){
		for(int i = 0; i<s.length(); i++){
			if(s.charAt(i)>='a'&&s.charAt(i)<='z') System.out.print((char)(s.charAt(i)-32));//��ҹ��� �ƽ�Ű �ڵ� ���̴� 32��ŭ ��: ���� �ҹ��ڸ� �빮�ڷ� �ٲٷ��� �ҹ����� �ƽ�Ű ������ 32�� ���ָ� ��. �ڼ��� ������ �ƽ�Ű �ڵ� ���� �ٶ�. 
			else System.out.print(s.charAt(i));//�ҹ��ڰ� �ƴ� ��� �׳� ���� �״�� ���
		}
		System.out.println();
	}
	
	boolean equals(String s1, String s2){
		if(s1.length()!=s2.length()) return false;
		else{//s1.length()�� s2.length()�� ����.
			for(int i = 0; i<s1.length(); i++){
				if(s1.charAt(i)!=s2.charAt(i)) return false;
			}
		}
		//�̶��α��� �Դٴ� ���� ���̵� ����, i��° ���ڵ� ��� ���Ҵٴ� ����. �ƴ϶�� return �������Ƿ�~
		return true;
	}
	
}

class HW5_1{
	public static void main(String [] args){
		String s1 = "Hello.";
		String s2 = "Hello!";
		String s3 = "hi!";
		
		
		StringManipulate sm = new StringManipulate(); //StringManipulateŬ������ ����ϱ� ���� StringManipulate ��ü(intstance, �ν��Ͻ�)����
		
		System.out.println("s1�� s2�� �����ϸ�: "+sm.concat(s1, s2));//concat()�޼ҵ�� �޼ҵ� ��ü���� print���� �ʰ� ����� ��ȯ�� �ϱ� ������ main()���� print��. 
		System.out.print("s3���� �ҹ��ڸ� �빮�ڷ� �ٲ� ����ϸ�: ");
		sm.toUpper(s1);//�� �޼ҵ�� ��ü������ ����ϱ� ������ ���⿡�� ���� print���� ����. 
		System.out.println("s1�� s2��ġ??: "+sm.equals(s1, s2));
		
	}
}