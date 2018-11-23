//자전거 클래스 설계
/*
<필드>
바퀴 개수 : int
속력 : double
주행거리 : int

<메소드>
현재 상태 보고 : report(), 현재 필드 print
직진 : 몇 m(int) 직진할 것인지를 매개변수로 받아 직진 후 print
우회전 : 우회전했다고 print
좌회전 : 좌회전했다고 print
*/

class Bicycle{
	//필드
	private int numOfWheel = 4;//외부에서 변경 불가
	private double speed;
	private int mileage;
	
	//setter : private 필드의 속성을 설정할 때 사용하는 메소드, set필드명
	void setNumOfWheel(int n){
		if(n>0 && n<=4)
		numOfWheel = n;
	}
	
	//getter : private 필드에 대한 정보를 반환하는 메소드, get필드명
	int getMileage(){
		return mileage;
	}
	
	double getSpeed(){
		return speed;
	}
	
	
	
	
	//매소드
	void report(){
		System.out.println("numofWheel : "+numOfWheel);
		System.out.println("speed : "+speed);
		System.out.println("mileage : "+mileage);
	}
	void goStraight(int dist){
		mileage += dist;
		System.out.println(dist+"m 직진");
	}
	void turnRight(){
		System.out.println("우회전 합니다.");
	}
	void turnLeft(){
		System.out.println("좌회전 합니다.");
	}
}