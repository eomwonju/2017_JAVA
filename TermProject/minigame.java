//미니게임 클래스...minigame(int n)으로 호출함. 진상손님은 n을 크게 설정하고 일반손님은 작게 설정하여 판매난이도를 조절함
import java.util.Scanner;//필드에 static으로 미리 선언해야됨
class minigame{
	public static boolean game_WASD(int n){
		//game_WASD(int n)으로 수정후 적용
		Scanner s=new Scanner(System.in);
		
		String result="",input="";
		long start,end;
		boolean sell;
		
		int [] array = new int[n];
		for(int i=0;i<n;i++){
			array[i]=(int)(Math.random()*4+1);
		}
		for(int x:array){
			if(x==1) result+="W";
			else if(x==2) result+="A";
			else if(x==3) result+="S";
			else if(x==4) result+="D";
		}
		System.out.println("다음 문자를 5초 이내에 입력하세요!(대소문자 관계없음) "+result);
		start=System.currentTimeMillis();
		input=s.next();
		end=System.currentTimeMillis();
		if (end-start>5000) {
			System.out.println("타임오버! 판매실패..(소요시간 : "+(end-start)+"ms)");
			sell=false;
		}
		else if (input.equalsIgnoreCase(result)==true) {
			System.out.println("판매성공!");
			sell=true;
		}
		else {
			System.out.println("잘못된 입력 ! 판매실패입니다..(당신의 입력값 : "+input+")");
			sell=false;
		}
		return sell;
	}

public static int game_RPS(int money){
		Scanner s = new Scanner(System.in);
		String input;
		int com;
		int result=0;//0비김,1짐,2이김
		boolean again=false;
		
		do{
		System.out.print("가위,바위,보 중에서 뭐 낼래? ");
		input=s.next();
		
		com=(int)(Math.random()*3);//0=가위,1=바위,2=보
		
		switch(input){
			case "가위":
			if (com==0) {
				System.out.println("비겼음");
				result=0;
			}
			else if(com==1) {
				System.out.println("졌음");
				result=1;
			}
			else if(com==2) {
				System.out.println("이겼음");
				result=2;
			}
			break;
			
			case "바위":
			if (com==0) {
				System.out.println("이겼음");
				result=2;
			}
			else if(com==1) {
				System.out.println("비겼음");
				result=0;
			}
			else if(com==2) {
				System.out.println("졌음");
				result=1;
			}
			break;
			
			case "보":
			if (com==0) {
				System.out.println("졌음");
				result=1;
			}
			else if(com==1) {
				System.out.println("이겼음");
				result=2;
			}
			else if(com==2) {
				System.out.println("비겼음");
				result=0;
			}
			break;
			
			default :
			System.out.println("잘못입력했다..다시입력해라");
			again=true;
			continue;
		}
		switch(result){//이기고지면 돈 증가감소값 설정하기
			case 1:
			money--;
			break;
			case 2:
			money++;
			break;
		}
		
		if(result!=0) {
			System.out.println("또 할거면 \"한다\"를 입력하고, 아니면 아무거나 입력하셈..현재돈: "+money);
			input=s.next();
			switch(input){
				case "한다":
				again=true;
				break;
				
				default:
				again=false;
				break;
			}
		}
		else again=true;
		
		
		}while(again);
		System.out.println("당신의 돈은 : "+money+"원 입니다.");
		return money;
	}
}