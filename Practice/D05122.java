import java.util.Scanner;

class D05122{
	static Scanner s = new Scanner(System.in);
	
	public static void main(String [] args){
	int n;
	System.out.print("배열 원소 개수 : ");
	n = s.nextInt();
	double [] dArr = new double[n];
	
	init1(dArr);
	printArr(dArr);
	System.out.println();
	
	init2(dArr);
	printArr(dArr);
	
	System.out.println("배열 원소의 합 : "+sumArr(dArr));
	System.out.println();
	
	System.out.println("배열 원소의 최댓값 : "+maxElt(dArr));
	
	System.out.println("최댓값의 인덱스 중 가장 작은 값 : "+smallestIndOfMaxElt(dArr));
	
	ranShuffle(dArr);
	printArr(dArr);
	System.out.println();
	
	shiftR1(dArr);
	printArr(dArr);
	}
	
	//1. Initializing arrays with input values
	static void init1(double [] arr){
		for(int i=0; i<arr.length; i++){
			System.out.print(i+1+" : ");
			arr[i] = s.nextDouble();
		}
	}
	
	//2. Initializing arrays with random vlalues, 0<=r<10
	static void init2(double [] arr){
		for(int i=0; i<arr.length; i++){
			arr[i] = Math.random()*10;
		}
	}
	
	//3. Printing arrays
	static void printArr(double [] arr){
		for(double d:arr){
			System.out.format("%.2f\t",d);
		}
	}
	
	//4. Summing all elements - return type : double
	static double sumArr(double [] arr){
		double sum = 0;
		for(double d:arr){
			sum += d;
		}
		return sum;
	}
	
	//5. Finding the largest element - return type : double
	static double maxElt(double [] arr){
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
	
	//6. Finding the smallest index of the largest element - return type : 
	static int smallestIndOfMaxElt(double [] arr){
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
	
	//7. Random shuffling
	static void ranShuffle(double [] arr){
		//i번재 원소와 임의(Math.random())의 원소 변경
		//arr[i] <-> arr[난수(r)]
		int r;
		double tmp;
		
		for(int i=0; i<arr.length; i++){
			r = (int)(Math.random()*arr.length);//i번재 원소랑 바꿀 원소의 index
			tmp =  arr[i];
			arr[i] = arr[r];
			arr[r] = tmp;
		}
		
	}
	
	//8. Shift elements : 오른쪽으로 한 칸 시프트
	static void shiftR1(double [] arr){
		double tmp = arr[arr.length-1];
		for(int i=arr.length-2; i>=0; i--){
			arr[i+1] = arr[i];
		}
		arr[0] = tmp;
	}
}