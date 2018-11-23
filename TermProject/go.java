import java.util.*;
import java.text.*;

public class go{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		System.out.print("당신의 이름은?");
		String name=s.next();
		System.out.print("당신의 나이는?");
		int age=s.nextInt();
		
		System.out.println("\n목표 재산은 100만원 입니다.\n");
		
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat dateFormat = new SimpleDateFormat("오늘은 yyyy년 MM월 dd일 입니다.");
		String currtime = dateFormat.format(calendar.getTime());
		System.out.println(currtime);
		
		System.out.println("100만원을 모을 때까지 열심히 일해보자.");
		int days=1;
		
		while(I.getMyMoney()<100000){
		System.out.println("\n-"+days+"일차-\n");
		
		System.out.println("아직 손님이 없다..\n");
		I.action();
		while(store.getCntTime()<=3){
		double randomNbr=Math.random()*5;
		if (randomNbr>=2)	I.sale(customer.customer1());
		else I.action();
		store.setCntTime(1);
		System.out.println("현재시간 : "+store.getCntTime());
		}
		days++;
		store.getMoney();
		store.reset();
		}
		System.out.println("클리어");
		owner.moneyfight();
	}
}


class I{
	static int myMoney=30000,tired=5,pay=25000;
	static Scanner s = new Scanner(System.in);
	
	public static void action(){
		
		System.out.println("손님이 없다..\n");
		System.out.println("행동을 선택하세요.");
		System.out.println("1.정리하기 2.진열하기 3.청소하기 4.가만히 있는다..(숫자만)");
		int n = s.nextInt();
		if (n==1) clean();
		else if(n==2) display();
		else if(n==3) clean2();
		else rest();
		store.report1();
		
	}
	
	public static void clean(){
		System.out.println("청소하기를 선택했습니다.");
		//슬립1초
		System.out.println("...청소중입니다...");
		//슬립1초
		System.out.println("청소완료");
		store.setDirty(-1);//더러움 -1
		setTired(1);//피로도 +1
	}
	
	public static void display(){
		System.out.println("상품을 진열합니다");
		//슬립1초
		System.out.println("진열완료");
		setTired(1);
	}
	
	public static void clean2(){
		System.out.println("정리하기를 선택했습니다.");
		//슬립1초
		System.out.println("...정리중입니다...");
		//슬립1초
		System.out.println("정리완료");
		store.setDirty(-1);//더러움 -1
		setTired(1);//피로도 +1
	}
	
	public static void rest(){//int time을 받아 몇시간 쉴건지 설정..?
		System.out.println("가만히 휴식을 취합니다...");
		//슬립2초
		System.out.println("피로가 조금 회복되었습니다.");
		setTired(-1);
	}
	
	public static void sale(int n){//손님별난이도
		System.out.println("손님의 계산요청");
		minigame.game_WASD(n);//호출
		if (minigame.getSell()) {
			store.setSaleMoney(5000);
			System.out.println("오늘의 누적매출 : "+store.getSaleMoney());
		}
		else System.out.println("다음 기회에..");
		
	}
	//재산설정
	public static void setMyMoney(int n){
		myMoney += n;
	}
	public static int getMyMoney(){
		return myMoney;
	}
	//피로도설정
	public static void setTired(int n){
		tired += n;
	}
	public static int getTired(){
		return tired;
	}
	//일당설정
	public static void setPay(int n){
		pay += n;
	}
	public static int getPay(){
		return pay;
	}
}

class store{
	static int saleMoney=5000,dirty=5,products=0,cntTime;
	
	
	public static void chargeProducts(int n){//입고 상품 수
		System.out.println("현재 상품의 수 : "+getProducts()+"개");
		System.out.println("상품이 "+n+"개 입고되었습니다.");
		setProducts(n);
		System.out.println("현재 상품의 수 : "+getProducts()+"개");
	}
	
	public static void setProducts(int n){
		products+=n;
	}
	public static int getProducts(){
		return products;
	}
	
	public static void setDirty(int n){
		dirty+=n;
	}
	public static int getDirty(){
		return dirty;
	}
	
	public static void setSaleMoney(int n){
		saleMoney+=n;
	}
	public static int getSaleMoney(){
		return saleMoney;
	}
	
	public static void report1(){
		System.out.println("나의 현재 피로도 : "+I.getTired());
		System.out.println("더러움의 정도 : "+getDirty());
	}
	
	public static void report2(){
		System.out.println("오늘 누적 매출 : "+getSaleMoney());
		System.out.println("더러움의 정도 : "+getDirty());
	}
	public static void setCntTime(int n){
		cntTime+=n;
	}
	public static int getCntTime(){
		return cntTime;
	}
	public static void reset(){//하루지나면서 변수 초기화해주기.시간,누적매출,청결,
		setCntTime(-getCntTime());
		setSaleMoney(-getSaleMoney());
		setDirty(1);//더러움1증가;
	}
	public static void getMoney(){
		System.out.println("하루가 끝났습니다~! 일당을 받았습니다.");
		I.setMyMoney(I.getPay());
	}
	
}

class minigame{
	static String result="",input="";
	static long start,end;
	static boolean sell;
	public static void game_WASD(int n){
		Scanner s=new Scanner(System.in);
		
		
		
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
		result = "";
	}
	public static boolean getSell(){
		return sell;
	}

public static void game_RPS(){
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
			I.setPay(-5000);
			break;
			case 2:
			I.setPay(5000);
			break;
		}
		
		if(result!=0) {
			System.out.println("또 할거면 \"한다\"를 입력하고, 아니면 아무거나 입력하세요..현재일당: "+I.getPay()+"원");
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
		System.out.println("당신의 일당은 : "+I.getPay()+"원 입니다.");
		
	}
}

class owner{
	static int mood;
	public static void checkDirty(int n){
		if (n>5) {
			System.out.println("청소좀 해라");
			I.setPay(-5000);
		}
		else System.out.println("청소상태양호");
	}
	
	public static void checkSaleMoney(){
		System.out.println("현재 매출은 : "+store.getSaleMoney()+"원 입니다");
	}
	
	public static void moneyfight(){
		System.out.println("나와 일당 협상을 하겠나? (현재 일당 : "+I.getPay()+"원)");
		minigame.game_RPS();
	}
}

class customer{
	
	static int customer1(){//일반손님
		System.out.println("일반 손님입니다");
		
		return 5;
	}
}