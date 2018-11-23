import java.util.Scanner;

public class HW2_3{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		double p1x, p1y, p2x, p2y;	//각각 두 점 p1, p2의 x,y 좌표
		double width, height; //직사각형 가로, 세로
		
		System.out.print("첫번째 점의 x 좌표: ");
		p1x = s.nextDouble();
		System.out.print("첫번째 점의 y 좌표: ");
		p1y = s.nextDouble();		
		System.out.print("두번째 점의 x 좌표: ");
		p2x = s.nextDouble();
		System.out.print("두번째 점의 y 좌표: ");
		p2y = s.nextDouble();
		
		width = p1x-p2x;
		height = p1y-p2y;
		
		if(width<0) width *= -1;	//가로가 음수인 경우 양수로 변환
		if(height<0) height *= -1;	//세로가 음수인 경우 양수로 변환
		
		if(width==0 || height==0) System.out.println("입력한 점들은 직사각형을 이루지 않습니다. "); 	//가로나 세로가 0인 경우 직사각형을 이루지 않음
		else{
			System.out.printf("직사각형의 둘레 길이: %.1f\n", 2*(width+height));
			System.out.printf("직사각형의 넓이: %.1f\n", width*height);
		}
		
		s.close(); //스캐너 사용을 마치면 닫아줌. 
		//수업시간에 말씀드리겠습니다~~
	}
}