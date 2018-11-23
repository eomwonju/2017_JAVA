public class ContinueTest{
	public static void main(String [] args){
		//1~10까지 출력, 4의 배수는 제외하고 출력하기
		
		for(int i=1; i<=10; i++){
			if(i%4==0) continue;//아래 문장들을 실행하지 말고 그 다음 반복으로 넘어감.
			System.out.print(i+" ");
		}
		
		for(int i=1; i<=10; i++){
			if(i%4!=0) System.out.print(i+" ");
		}
	
	}
}