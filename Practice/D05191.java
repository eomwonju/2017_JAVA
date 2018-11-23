class D05191{
	public static void main(String [] args){
		//자동차가 10대
		//int [] arr = new int [10];
		Car [] carList = new Car [10];
		
		for(int i=0; i<carList.length; i++){
			carList[i] = new Car();
		}
		
		//10대 자동차의 정보 각각 출력하기
		for(int i=0; i<carList.lengh; i++){
			System.out.println(i+1+"번째 자동차 : "+carList[i].info());
		}
	}
}

class Car{
	int year, mileage;
	//메소드 헤더 : 수식어 반환형 메소드명(매개변수들)
	public String info(){
		return "이 자동차는 "+year+"년식이고, 주행거리는 "+mileage+"km 입니다.";
		//return String.format("이 자동차는 %d년식이고, 주행거리는 %dkm 입니다.", year, mileage);
	}
	
	
}