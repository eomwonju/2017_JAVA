//100라인일 경우 8이 100으로 바뀌면 됩니다. 
//100으로 두고 컴파일, 실행하면 콘솔창에서 직각삼각형을 제대로 볼 수 없어 일단은 8로 뒀습니다. 
public class Test4_05{
	public static void main(String [] args){
		for(int i=0; i<8; i++){
			for(int j=0; j<i; j++) System.out.print(" ");//공백의 일반항: i
			for(int j=0; j<8-i; j++){ //직각삼각형 일반항: line(8)-i
				//직각 삼각형에서 출력되는 요소 중 홀수번째 요소는 *
				if(j%2==1) System.out.print("*");
				//직각 삼각형에서 출력되는 요소 중 짝수번째 요소는 +
				else System.out.print("+");
			}
			System.out.println();//공백+{+,*}출력하면 한 라인 완성되었으므로 개행
		}
	}
}















