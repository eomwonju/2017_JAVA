class StringManipulate{
	String concat(String s1, String s2){
		return s1+s2;
	}
	
	void toUpper(String s){
		for(int i = 0; i<s.length(); i++){
			if(s.charAt(i)>='a'&&s.charAt(i)<='z') System.out.print((char)(s.charAt(i)-32));//대소문자 아스키 코드 차이는 32만큼 남: 따라서 소문자를 대문자로 바꾸려면 소문자의 아스키 값에서 32를 빼주면 됨. 자세한 사항은 아스키 코드 참조 바람. 
			else System.out.print(s.charAt(i));//소문자가 아닌 경우 그냥 문자 그대로 출력
		}
		System.out.println();
	}
	
	boolean equals(String s1, String s2){
		if(s1.length()!=s2.length()) return false;
		else{//s1.length()과 s2.length()가 같음.
			for(int i = 0; i<s1.length(); i++){
				if(s1.charAt(i)!=s2.charAt(i)) return false;
			}
		}
		//이라인까지 왔다는 말은 길이도 같고, i번째 문자도 모두 같았다는 말임. 아니라면 return 당했으므로~
		return true;
	}
	
}

class HW5_1{
	public static void main(String [] args){
		String s1 = "Hello.";
		String s2 = "Hello!";
		String s3 = "hi!";
		
		
		StringManipulate sm = new StringManipulate(); //StringManipulate클래스를 사용하기 위해 StringManipulate 객체(intstance, 인스턴스)생성
		
		System.out.println("s1과 s2를 연결하면: "+sm.concat(s1, s2));//concat()메소드는 메소드 자체에서 print하지 않고 결과를 반환만 하기 때문에 main()에서 print함. 
		System.out.print("s3에서 소문자를 대문자로 바꿔 출력하면: ");
		sm.toUpper(s1);//이 메소드는 자체적으로 출력하기 때문에 여기에서 따로 print하지 않음. 
		System.out.println("s1과 s2일치??: "+sm.equals(s1, s2));
		
	}
}