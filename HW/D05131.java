import java.util.Scanner;

class D05131{
	static Scanner s = new Scanner(System.in);
	
	public static void main(String [] args){
		System.out.print("�迭 ũ��: ");
		int size = s.nextInt();
		
		double [] dArr = new double[size];
		//init1(dArr);
		printArr(dArr);
		init2(dArr);
		printArr(dArr);
		System.out.printf("�迭 ������ ��: %.2f\n", sumArr(dArr));
		System.out.printf("�迭 ������ �ִ�: %.2f\n", maxElt(dArr));
		System.out.printf("�迭 ������ �ִ��� �ε���: %d\n", indOfMax(dArr));
		shuffle(dArr);
		printArr(dArr);
		shiftR1(dArr);
		printArr(dArr);
		shiftL1(dArr);
		printArr(dArr);
		
	}
	
	static void init1(double [] arr){//1
		for(int i=0; i<arr.length; i++){
			System.out.printf("%d��° ����: ", i+1);
			arr[i] = s.nextDouble();
		}
	}
	
	static void init2(double [] arr){//2
		for(int i=0; i<arr.length; i++){
			arr[i] = Math.random()*10;
		}
	}
	
	static void printArr(double [] arr){//3
		for(double x:arr){
			System.out.printf("%.2f\t",x);
		}
		System.out.println();
	}
	
	static double sumArr(double [] arr){//4
		double sum = 0;
		for(double x: arr) sum += x;
		return sum;
	}
	
	static double maxElt(double [] arr){//5
		double max = arr[0];
		for(int i=0; i<arr.length; i++){
			if(max<arr[i]) max = arr[i];
		}
		return max;
	}
	
	static int indOfMax(double [] arr){//6
		double max = arr[0];
		int index = 0;
		for(int i=0; i<arr.length; i++){
			if(max<arr[i]){ //�ִ��� ����Ǹ� index�� ����
				max = arr[i];
				index = i;
			}
		}
		return index;
	}
	
	
	static void shuffle(double [] arr){//7. arr[i]<->arr[r(����)]: i��° ���ҿ� r��° ���Ҹ� ��ȯ
		int r;
		double tmp;
		for(int i=0; i<arr.length;i++){
			r = (int)(Math.random()*arr.length);
			tmp = arr[i];
			arr[i] = arr[r];
			arr[r] = tmp;
		}
	}
	
	static void shiftR1(double [] arr){
		int lastIndex = arr.length-1;
		double tmp = arr[lastIndex];
		for(int i=lastIndex-1; i>=0;i--)	arr[i+1] = arr[i];
		arr[0] = tmp;
	}
	
	static void shiftL1(double [] arr){
		int lastIndex = arr.length-1;
		double tmp = arr[0];
		for(int i=1; i<arr.length;i++)	arr[i-1] = arr[i];
		arr[lastIndex] = tmp;
	}
}







