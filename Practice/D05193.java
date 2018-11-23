class D05193{
	//�����ڷ� Processing Two-Dimensional Arrays
	//������ �迭, �� ���Ҵ� 0�̻� 5�̸��� ������ ����, 10�� 5��
	public static void main(String [] args){
		int [][] arr = new int [10][5];
		initRandom(arr);
		printArr(arr);
		int [] indOfMax = new int [2];
		System.out.println("�ִ��� %d��, %d���� �ֽ��ϴ�.", indOfMax[0]+1, indOfMax[1]+1);
		
	}
	
	static void initRandom(int [][] arr){
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				arr[i][j]=(int)(Math.random()*5);
			}
		}
	}
	//2. Printing arrays
	static void printArr(int [][] arr){
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.printf("%d", arr[i][j]);
			}
			System.out.println();
		}
		/*
		//for(�迭 ���Ҹ� �ޱ����� ���� ���� : �迭��)
		for(int [] row : arr){
			for(int x : arr){
				System.out.printf("%d ",x);
			}
			System.out.println();
		}
		*/
			
	}
	//4. Summing all elements by column
	static void sumElt(int [][] arr){
		
	}
	//7. Random shuffling
	static void shuffe(int [][] arr){
		
		int row, col, tmp;
		//arr[i][j] <-> arr[row][col]
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				row = (int)(Math.random()*10);
				col = (int)(Math.random()*5); 
				tmp = arr[i][j];
				arr[i][j] = arr[row][col];
				arr[row][col] = tmp;
			}
		}
	}
	
	static int [] indexOfMax(int [][] arr){
		int max = arr[0][0];
		int [] index = {0,0};
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				if(max<arr[i][j]){
					max = arr[i][j];
					index[0]=i;
					index[1]=j;
				}
			}
		}
		return index;
	}
	
	//�迭 ��ȯ int[][] �޼ҵ��
}