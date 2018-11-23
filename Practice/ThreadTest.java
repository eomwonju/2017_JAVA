class ThreadTest{
	public static void main(String [] args){
		/*
		//1출력 후 1초 후 2출력
		System.out.println("1");
		try{
			Thread.sleep(1000);//단위 ms
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("2");
		*/
		
		//1~5 출력
		//1 출력 후 0.5 쉬고, 2 출력 후 1초 쉬고, 3 출력 후 1.5초 쉬고....
		
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