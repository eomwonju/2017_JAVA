import java.util.Scanner;

class HW1_1{
	public static void main(String [] args){
		String name;
		String tel;
		Scanner s = new Scanner(System.in);
		System.out.print("이름: ");
		name = s.nextLine();
		
		System.out.print("전화번호: ");
		tel = s.nextLine();
		
		System.out.println("\n\n-입력한 정보-");
		System.out.println("이름: "+name);
		System.out.println("전화번호: "+tel);		
	}
}