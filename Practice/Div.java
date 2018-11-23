public class Div{
	public static void main(String [] args){
		for(int i=1; i<=10; i++){
			System.out.printf("%2d의 약수는 ", i);
			for(int j=1; j<=i; j++) if(i%j==0) System.out.printf("%d, ", j);
			System.out.println("\b\b  ");//\b는 커서를 한 칸 앞으로 당김.
		}
	}
}

