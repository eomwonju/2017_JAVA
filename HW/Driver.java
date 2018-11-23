class Driver {//HW8_2
	static String string;
	public static void main(String [] args){
		System.out.println(string);
		Car myCar = new Car();//내 차 하나 생성
		//A->B까지 굵은 선으로만 이동할 수 있으므로 
		//일단 25m직진 후
		myCar.goStraight(25);
		//좌회전 후
		myCar.turnLeft();
		//30m직진 후
		myCar.goStraight(30);
		//우회전 후
		myCar.turnRight();
		//15m직진 후
		myCar.goStraight(15);
		//좌회전 후
		myCar.turnLeft();
		//20m직진하면 B에 도착
		myCar.goStraight(20);
		
		System.out.println("총 주행 거리는 "+myCar.getMileage()+"m 입니다.");
	}
}

class Car{
	private int mileage; //총 주행거리
	
	public void goStraight(int dist){
		mileage += dist; //총 주행거리에 이동 거리 합산
		System.out.println(dist+"m 직진했습니다.");
	}
	public void turnLeft(){
		System.out.print("좌회전 후 ");
	}
	public void turnRight(){
		System.out.print("우회전 후 ");
		
	}
	public int getMileage(){
		return mileage;
	}
}






