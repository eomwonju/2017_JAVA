import java.util.Scanner;

class TwoDimArrTest{
	static Scanner s = new Scanner(System.in);
	public static void main(String [] args){
		int row, col;
		System.out.print("행: ");
		row = s.nextInt();
		System.out.print("열: ");
		col = s.nextInt();
		int [][] arr = new int[row][col];
		initArr(arr);
		printArr(arr);
		System.out.println("모든 원소의 합: "+sumArr(arr));
		colSum(arr);
		System.out.printf("%d행의 행별 합이 가장 큽니다.\n",rowSum(arr)+1);
		int [] index = indexOfMax(arr);
		System.out.printf("가장 큰 원소의 인덱스는 %d행 %d열 원소입니다.\n",index[0]+1,index[1]+1);
		shuffle(arr);
		printArr(arr);
	}
	public static void initArr(int [][] arr){
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.printf("%d행 %d열 원소: ", i+1, j+1);
				arr[i][j] = s.nextInt();
			}
		}
	}
	public static void printArr(int [][] arr){
		/*전통적인 for문
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.printf("%d ", arr[i][j]);
			}
			System.out.println();
		}
		*/
		for(int [] row:arr){
			for(int elt:row){
				System.out.printf("%d ", elt);
			}
			System.out.println();
		}
	}
	public static int sumArr(int [][] arr){//모든 원소의 합을 반환하는 메소드
		int sum =0;
		for(int [] row:arr){
			for(int elt:row){
				sum += elt;
			}
		}
		return sum;
	}
	public static void colSum(int [][] arr){//열별 합을 출력하는 메소드
		int sum =0;
		for(int j=0; j<arr[0].length; j++){
			sum =0;
			for(int i=0; i<arr.length; i++){
				sum += arr[i][j];
			}
			System.out.printf("%d열의 합: %d\n", j+1, sum);
		}
	}
	public static int rowSum(int [][] arr){//가장 큰 합을 가지는 행의 인덱스를 반환
		int rowSum, max=Integer.MIN_VALUE;//처음에는 최댓값을 정수중 가장 작은 값으로 설정
		int indexOfMaxSum = 0;
		for(int i=0; i<arr.length; i++){
			rowSum = 0;
			for(int j=0; j<arr[i].length; j++){
				rowSum += arr[i][j];
			}
			if(max<rowSum){
				max = rowSum;
				indexOfMaxSum = i;
			}
		}
		return indexOfMaxSum;
	}
	public static int[] indexOfMax(int [][] arr){
		//이차원 배열의 인덱스는 원소가 2개인 일차원 배열이다. 따라서 인덱스를 반환하기 위해서는 일차원 배열을 반환해야한다.
		//가장 큰 원소의 작은 인덱스 반환: 두원소가 서로 다른 행의 원소인 경우 행이 작은 원소가 더 작은 인덱스를 가지며, 같은 행의 원소인 경우 열이 작은 원소가 다 작은 인덱스를 가진다고 정의한다. 
		int max = arr[0][0];
		int [] index = {0,0};//인덱스 (0,0)의 원소를 최댓값으로 초기화했기 때문에 최댓값의 인덱스도 (0,0)으로 둔다. 
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				if(max<arr[i][j]){
					max = arr[i][j];
					index[0] = i;
					index[1] = j;
				}
			}
		}
		
		return index;
	}
	public static void shuffle(int [][] arr){//arr[i][j] <-> arr[임의의 행][임의의 열]
		int row, col, tmp;
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				row = (int)(Math.random()*arr.length);//임의의 행
				col = (int)(Math.random()*arr[i].length);//임의의 행
				
				tmp = arr[i][j];
				arr[i][j] = arr[row][col];
				arr[row][col] = tmp;
			}
		}
	}
}