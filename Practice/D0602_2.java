import java.util.Scanner;
import java.io.*;

class D0602_2{
	public static void main(String [] args){
		File f = new File("Scores.java");
		if(!f.exists()){
			System.out.println("읽어올 파일이 존재하지 않습니다.");
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
				System.out.format("%d 이름 : %s, 학점 %.2f\n", num, name, grade);
			}			
			s.close();
		}catch(Exception e){
			System.out.println("파일 열기 및 읽기에 실패했습니다.");
			return;
		}
	}
}