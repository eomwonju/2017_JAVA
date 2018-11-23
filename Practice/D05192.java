class  D05192{
	public static void main(String [] args){
		//극장의 한 관 예약상황을 나타내는 배열
		boolean [][] seats = new boolean [10][20];
		//5라인, 10번째 좌석의 예매 상황 출력
		System.out.println("5라인, 10번재 좌석의 예매 상황 : "+seats[4][9]);
		//7라인의 예매상황 출력
		for(int i=0; i<seats[6].length; i++) System.out.println("7라인 "+(i+1)+"번째 열의 예매상황 : "+seats[6][i]);
		//20번쩨 열의 예매상황
		for(int i=0; i<seats.length; i++) System.out.println("20번째 열의 "+(i+1)+"번째 라인의 예매상황 : "+seats[i][19]);
		
		//seats.length = 행의 개수
		//seats[n].length = n행의 열 개수
		
		int [][] arr = {{1,2,3},{4,5,6}};
		int [][] arr2 = {{1,2,3},{4,5}{7,7,7,7,7,7,7}};
		//행 개수
		System.out.println("행 개수 : "+arr2.length);
		// 각 행의 열 개수
		for(int i=0; i<arr2.length; i++) System.out.println("열 개수"+arr2[i].length);
	}
}