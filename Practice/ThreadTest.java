class ThreadTest{
	public static void main(String [] args){
		/*
		//1��� �� 1�� �� 2���
		System.out.println("1");
		try{
			Thread.sleep(1000);//���� ms
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("2");
		*/
		
		//1~5 ���
		//1 ��� �� 0.5 ����, 2 ��� �� 1�� ����, 3 ��� �� 1.5�� ����....
		
		for(int i=1; i<=5; i++){
			System.out.println(i);
			try{
				Thread.sleep(500*i);
			}catch(Exception e){
				e.printStackTrace();
			}
		}	
	}
}