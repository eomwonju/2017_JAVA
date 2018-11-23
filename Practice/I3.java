class Car{//자동차를 프로그래밍 = 자동차 클래스를 만듦
	//필드
	String brand;
	int age;
	int mileage;//주행거리, 필드는 0으로 자동 초기화 됨
	
	//메소드
	void goStraight(int dist){//직진하는 메소드
		System.out.println(dist+"m 직진합니다.");	
		mileage += dist;
	}

	void turnRight (){//우회전하는 메소드
		System.out.println("우회전합니다.");		
	}
	
	void turnLeft (){//좌회전하는 메소드
		System.out.println("좌회전합니다.");		
	}
	
	void goBack (int dist){//후진하는 메소드
		System.out.println(dist+"m 후진합니다.");
		mileage += dist;
	}
}

class I{
	public static void main (String [] args){
		Car myCar1 = new Car();//자동차가 한 대 만들어짐
		System.out.println("내 차의 주행거리 : "+myCar1.mileage);
		myCar1.goStraight(100);
		System.out.println("내 차의 주행거리 : "+myCar1.mileage);
		myCar1.goBack(100);
		System.out.println("내 차의 주행거리 : "+myCar1.mileage);
		myCar1.turnLeft();
		myCar1.turnRight();
		System.out.println("내 차의 주행거리 : "+myCar1.mileage);
		
		Car myCar2 = new Car();
		myCar2.goStraight(100);
		
	}
}