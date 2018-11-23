class BicycleTest{
	public static void main(String [] args){
		Bicycle b = new Bicycle();
		b.report();

		
		//자전거 바퀴개수를 2로 변경 후 report()
		b.setNumOfWheel(2);
		b.report();
		
		
		//자전거 바퀴개수를 200으로 변경 후 report()
		b.setNumOfWheel(200);
		b.report();
		
		//현재 주행거리만 출력하고 싶음
		//System.out.println(b.mileage); 접근 불가
		System.out.println(b.getMileage());
		
		//현재 속력만 출력하고 싶음
		System.out.println(b.getSpeed());
	}
}