import java.util.Scanner;
import java.io.*;

class D0602_2{
	public static void main(String [] args){
		File f = new File("Scores.java");
		if(!f.exists()){
			System.out.println("�о�� ������ �������� �ʽ��ϴ�.");
			return;
			
		}
		
		int num;
		String name;
		double grade ;
		
	
		try{
			Scanner s = new Scanner(f);
			
			while(s.hasNext()){
				num = s.nextInt();
				name = s.next();
				grade = s.nextDouble();
				System.out.format("%d �̸� : %s, ���� %.2f\n", num, name, grade);
			}			
			s.close();
		}catch(Exception e){
			System.out.println("���� ���� �� �б⿡ �����߽��ϴ�.");
			return;
		}
	}
}