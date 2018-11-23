import java.util.Scanner;

class Test2{
	public static void main(String [] args){
		int month, year;
		Scanner s = new Scanner(System.in);
		
		System.out.print("몇 년 : ");
		year = s.nextInt();
		System.out.print("몇 월 : ");
		month = s.nextInt();
		
		switch(month){
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println(year+"년 "+month+"는 31일까지 있습니다.");
			break;
			
			case 4: case 6: case 9: case 11: 
			System.out.println(year+"년 "+month+"는 30일까지 있습니다.");
			
			case 2:
			System.out.println(year+"년 "+month+"는 29일까지 있습니다.");
		}
		
	}
}