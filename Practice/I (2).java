//포만감수치에 따라서 먹이를 준다.
//포만감이 높다면(fill>10) 놀아준다.
//포만감이 낮다면 먹이를 준다.


//강아지

class Dog{//클래스는 설계도!! 이 클래스는 강아지의 설계도
	//속성
	int fill;
	//필드는 초기화 과정이 없다면 자동으로 (자료형에 맞는) 0으로 초기화가 됨.
	//예 : boolean b;//b = false;

	
	//행동
	//1. 먹기
	void eat(int feed){
		if(feed<0) System.out.println("장난치지 마세요.");
		else if(feed<10){fill += feed; System.out.println("잘 먹었습니다.");}
		else System.out.println("배터지겠다.");
	}
	
	//2. 놀기
	void play(){
		System.out.println("재미있다. 감사합니다.");
	}		
}

public class I{
	public static void main(String [] args){
		Dog myDog = new Dog();//new Dog()를 하면서 실제 강아지(강아지 인스턴스, 객체)가 만들어짐
		
		System.out.println("강아지 포만감 : "+myDog.fill);
		
		for(int i=0; i<3; i++){
			if(myDog.fill>10) myDog.play();
			else myDog.eat(8);
		}
	}
}