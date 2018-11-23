class Car{
	//필드 : 주행거리, 연식
	//메소드 : info() - 반환타입 : String
	//기능 : 자동차의 정보 반환
	//자동차의 정보 : 이 자동차의 주행거리는 %d km이고, %d년식 입니다.
	int mileage;
	int year;
	//위에 두 필드는 객체가 관리
	static int numOfCar;//이 필드는 모든 객체가 공유하도록 만들어줌//키워드 : static//클래스가 관리
	
	/*
	static void printYear(){//불가능
		System.out.println("year: "+year);//year는 객체가 생성되어야 존재하지만 이 메소드는 static 메소드 이므로 생성된 자동차(객체)가 없을 때도 호출 가능
		//자동차가 없는데, 몇년식이냐고 묻는 것과 같으므로 이치에 맞지 않아 컴파일 불가.
		//static은 static 붙은 멤버(메소드, 필드)만 호출 가능
	}
	*/
	
	String info(){
		return String.format("이 자동차의 주행거리는 %d km이고, %d년식 입니다.", mileage, year);
	}
	
	//생성자 : 특별한 메소드
	//메소드 이름 = 클래스 이름
	//반환 타입이 없음, void도 아님
	//기능 : 객체를 생성할 때 호출되어, 객체의 필드를 초기화하는 역할
	
	Car(){//생성자-디폴트 생성자 : 매개변수가 없는 생성자
		//연식을 2017년으로 초기화 할 것.
		this(2017);//this.year = 2017
	}
	
	Car (int y){//연도를 초기화하는 생성자
		if(y>0&&y<=2017) year = y;
		else year = 2017;
		numOfCar++;//Car를 생성할 때 무조건 실행됨
	}
	
	/*
	Car (int m){
		this.mileage = mileage;
	}
	*/
	//메소드 signature가 같기 때문에 중복 정의 불가
	
	Car(int year, int mileage){//주행거리와 연식을 초기화하는 생성자
		//this.year = year;//this.year = 이 클래스의 year
		this(year);
		this.mileage = mileage;//this.mileage = 이 클래스의 mileage
	}
}
class CarTest0526{
		public static void main(String [] args){
			System.out.printf("이제까지 생성된 자동차는 %d대 입니다.", Car.numOfCar);//static 필드는 객체가 만들어지지 않은 상황에서도 호출 가능
			
			Car myCar = new Car(2017, 50);
			//자동차 생성 시에 2017년식, 주행거리는 50km
			System.out.println("자동차의 정보 : "+myCar.info());
			
			Car yourCar = new Car(2010, 500000);
			//자동차 생성 시에 2010년식, 주행거리는 500000km
			System.out.println("자동차의 정보 : "+yourCar.info());
			
			Car c1 = new Car(2016);
			Car c2 = new Car(2015);
			
			System.out.printf("이제까지 생성된 자동차는 %d대 입니다.", Car.numOfCar);//static 키워드가 붙은 필드는 객체참조변수.필드가 아니라 클래스.필드
		}
	}
	
	//static 메소드의 특징 1. 객체가 만들어지지 않은 상황에서도 호출 가능  2. 객체별로 결과 값이 차이가 없는 경우 (Math 클래스)
	//main에서 호출 하는 메소드는 static을 붙여야함