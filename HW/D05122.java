import java.util.Scanner;

class D05122{
	static Scanner s = new Scanner(System.in);	
	
	public static void main(String [] args){
		int n;
		System.out.print("배열 원소 개수: ");
		n = s.nextInt();
		double [] dArr = new double[n];
		
		init2(dArr);
		printArr(dArr);
		System.out.println("\n배열 원소의 합: "+sumArr(dArr));
		System.out.println("배열 원소의 최댓값: "+maxElt(dArr));
		System.out.println("최댓값의 인덱스 중 가장 작은 값: "+smallIndOfMaxElt(dArr));
		shuffle(dArr);
		printArr(dArr);
		shiftR1(dArr);
		printArr(dArr);
	}
	
	static void init1(double [] arr){//1
		for(int i=0; i<arr.length; i++){
			System.out.print(i+1+": ");
			arr[i] = s.nextDouble();
		}
	}
	
	static void init2(double [] arr){//2
		for(int i=0; i<arr.length; i++){
			arr[i] = Math.random()*10;
		}
	}
	
	static void printArr(double [] arr){//3
		for(double d:arr){
			System.out.format("%.2f\t", d);
		}
		System.out.println();
	}
	
	static double sumArr(double [] arr){//4
		double sum = 0;
		for(double d:arr){
			sum += d;
		}
		return sum;
	}
	
	static double maxElt(double [] arr){//5
		double max = arr[0];
		for(double d:arr){
			if(max<d) max = d;
		}
		/*
		for(int i=0; i<arr.length; i++){
			if(max<arr[i]) max = arr[i];
		}
		*/
		return max;
	}
	static int smallIndOfMaxElt(double [] arr){//6
		double max = arr[0];
		int index = 0;
		
		for(int i=0; i<arr.length; i++){
			if(max<arr[i]){
				max = arr[i];
				index = i;
			}
		}
		
		return index;
	}
	
	static void shuffle(double [] arr){//7
		//i번째 원소와 임의(Math.random())의 원소 변경
		//arr[i] <-> arr[난수(r)]
		
		int r;
		double tmp;
		
		for(int i=0; i<arr.length; i++){
			r = (int)(Math.random()*arr.length);//i번째 원소랑 바꿀 원소의 index
			tmp = arr[i];
			arr[i] = arr[r];
			arr[r] = tmp;
		}
	}
	
	static void shiftR1(double [] arr){
		double tmp = arr[arr.length-1];
		for(int i=arr.length-2; i>=0; i--){
			arr[i+1] = arr[i];
		}
		arr[0] = tmp;
	}
}



