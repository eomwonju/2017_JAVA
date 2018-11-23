import java.util.Scanner;

class D05122{
	static Scanner s = new Scanner(System.in);	
	
	public static void main(String [] args){
		int n;
		System.out.print("�迭 ���� ����: ");
		n = s.nextInt();
		double [] dArr = new double[n];
		
		init2(dArr);
		printArr(dArr);
		System.out.println("\n�迭 ������ ��: "+sumArr(dArr));
		System.out.println("�迭 ������ �ִ�: "+maxElt(dArr));
		System.out.println("�ִ��� �ε��� �� ���� ���� ��: "+smallIndOfMaxElt(dArr));
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
		//i��° ���ҿ� ����(Math.random())�� ���� ����
		//arr[i] <-> arr[����(r)]
		
		int r;
		double tmp;
		
		for(int i=0; i<arr.length; i++){
			r = (int)(Math.random()*arr.length);//i��° ���Ҷ� �ٲ� ������ index
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



