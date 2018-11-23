class HW8_3{
	public static void main(String [] args){
		Member m1 = new Member();
		Member m2 = new Member();
		Member m3 = new Member();
		Member m4 = new Member("홍길동", 20);		
		System.out.println("이 동호회의 멤버 수는 "+Member.getNumOfMember()+"명 입니다.");
	}
}

class Member{
	private String name; 
	private int age;
	private static int numOfMember;//멤버수를 static으로 두어 모든 객체가 공유하게 함!
	
	public static int getNumOfMember(){
		return numOfMember;
	}
	
	Member(){
		numOfMember++;
	}
	
	Member(String name, int age){
		this.name = name;
		this.age = age;
		numOfMember++;
	}
}