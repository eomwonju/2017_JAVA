import java.util.Scanner;

class TwoDimArrTest{
	static Scanner s = new Scanner(System.in);
	public static void main(String [] args){
		int row, col;
		System.out.print("��: ");
		row = s.nextInt();
		System.out.print("��: ");
		col = s.nextInt();
		int [][] arr = new int[row][col];
		initArr(arr);
		printArr(arr);
		System.out.println("��� ������ ��: "+sumArr(arr));
		colSum(arr);
		System.out.printf("%d���� �ະ ���� ���� Ů�ϴ�.\n",rowSum(arr)+1);
		int [] index = indexOfMax(arr);
		System.out.printf("���� ū ������ �ε����� %d�� %d�� �����Դϴ�.\n",index[0]+1,index[1]+1);
		shuffle(arr);
		printArr(arr);
	}
	public static void initArr(int [][] arr){
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.printf("%d�� %d�� ����: ", i+1, j+1);
				arr[i][j] = s.nextInt();
			}
		}
	}
	public static void printArr(int [][] arr){
		/*�������� for��
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
	public static int sumArr(int [][] arr){//��� ������ ���� ��ȯ�ϴ� �޼ҵ�
		int sum =0;
		for(int [] row:arr){
			for(int elt:row){
				sum += elt;
			}
		}
		return sum;
	}
	public static void colSum(int [][] arr){//���� ���� ����ϴ� �޼ҵ�
		int sum =0;
		for(int j=0; j<arr[0].length; j++){
			sum =0;
			for(int i=0; i<arr.length; i++){
				sum += arr[i][j];
			}
			System.out.printf("%d���� ��: %d\n", j+1, sum);
		}
	}
	public static int rowSum(int [][] arr){//���� ū ���� ������ ���� �ε����� ��ȯ
		int rowSum, max=Integer.MIN_VALUE;//ó������ �ִ��� ������ ���� ���� ������ ����
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
		//������ �迭�� �ε����� ���Ұ� 2���� ������ �迭�̴�. ���� �ε����� ��ȯ�ϱ� ���ؼ��� ������ �迭�� ��ȯ�ؾ��Ѵ�.
		//���� ū ������ ���� �ε��� ��ȯ: �ο��Ұ� ���� �ٸ� ���� ������ ��� ���� ���� ���Ұ� �� ���� �ε����� ������, ���� ���� ������ ��� ���� ���� ���Ұ� �� ���� �ε����� �����ٰ� �����Ѵ�. 
		int max = arr[0][0];
		int [] index = {0,0};//�ε��� (0,0)�� ���Ҹ� �ִ����� �ʱ�ȭ�߱� ������ �ִ��� �ε����� (0,0)���� �д�. 
		
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
	public static void shuffle(int [][] arr){//arr[i][j] <-> arr[������ ��][������ ��]
		int row, col, tmp;
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				row = (int)(Math.random()*arr.length);//������ ��
				col = (int)(Math.random()*arr[i].length);//������ ��
				
				tmp = arr[i][j];
				arr[i][j] = arr[row][col];
				arr[row][col] = tmp;
			}
		}
	}
}