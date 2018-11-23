public class HW7_1_EXTRA{
    public static void main(String [] args){
		int [] scores = new int[50]; //각 학생의 점수 담을 배열
		int [] arr = new int[10]; //점수대 별로 인원 담을 배열
		
		for(int i=0; i<scores.length; i++){
			scores[i] = (int)(Math.random()*101);
			if(scores[i]==100) arr[9]++; //100점이라면 90점대
			else arr[scores[i]/10]++; //100점이 아니라면 각 점수대에 맞는 배열 원소 증가
		}
		
		//히스토그램의 최고 높이 계산
		int max = arr[0];
		for(int i=1; i<arr.length; i++){
			if(max<arr[i]) max = arr[i];
		}
		//또는 	for(int i:arr)	if(max<i) max=i; 도 가능
		
		for(;max>0; max--){
			for(int i=0; i<arr.length; i++){
				if(arr[i]>=max){
					System.out.print("  * ");
				}
				else System.out.print("    ");
			}
			System.out.println();
		}
		
		for(int i=0;i<10;i++) System.out.printf(" %2d ", 10*i+5);
    } 
}