//HW10_1_2
import java.util.Scanner;

class Server{	//홈네트워크 서버 
	private String pw="java";
	private Control[] c = new Control[5];
	private Scanner sc = new Scanner(System.in);
	
	Server(){		//서버가 통제할 수 있는 객체 등록
		c[0] = new Gas();
		c[1] = new Boiler();
		c[2] = new Light();
		c[3] = new Cooker();
		c[4] = new Refrigerator();
		//or
		/*
		c = new Control[]{new Gas(), new Boiler(), new Light(), new Cooker(), new Refrigerator()};
		*/
	}
	private boolean logIn(){	//로긴 로직 및 그 결과 반환
		String userPw;
		boolean pass = false;
		
		for(int i=0; i<3; ){
			System.out.print("서버 접속 비밀 번호를 입력하세요 : ");
			userPw = sc.nextLine();
			pass=pw.equals(userPw);
			if(pass) {
				System.out.println("서버에 접속했습니다.");
				break;
			}
			else{
				i++;
				System.out.println("비밀 번호를 "+i+"회 잘 못 입력하셨습니다.");
				if(i==3) System.out.println("서버 연결 요청을 종료합니다.");
			}
		}
		return pass;
	}
	
	public void service(){
		if(logIn()){
			while(true){
				System.out.println("======================");
				System.out.print("외출/귀가/종료?");
				String s = sc.nextLine();
				switch(s){
				case "외출":
					goOut();
					break;
				case "귀가":
					comeHome();
					break;
				case "종료":
					System.out.println("홈서버와 연결을 종료합니다.");
					return;
				default:
					System.out.println("잘못된 명령입니다.");
				}
			}
		}
		else{
			System.out.println("로그인에 실패하여 서비스를 제공할 수 없습니다.");
		}
	}
	
	private void goOut(){	//외출 시 할 일
		for(Control con:c){
			con.turnOff();
		}
	}
	
	private void comeHome(){	//귀가시 할일 
		for(Control con:c){
			con.turnOn();
		}
	}
}

class ServerTest{//홈네트워크 테스트 
	public static void main(String args []){
		Server server = new Server(); //홈네트워크 서버 생성
		server.service();
	}
}
interface Control{		//가전 제품을 컨트롤하기 위한 인터페이스 
	void turnOff();
	void turnOn();
}

abstract class Fire implements Control{
	public void turnOff(){
		System.out.println(this.getClass().getName()+": 꺼집니다.");
	}
	public void turnOn(){
		System.out.println(this.getClass().getName()+": 켜집니다.");
	}
}


class Gas extends Fire{
	public void turnOff(){
		System.out.println(this.getClass().getName()+": 잠금모드 설정.");
	}
}
class Boiler extends Fire{}			
class Light extends Fire{}

class Cooker extends Fire{
	public void turnOn(){
		System.out.println(this.getClass().getName()+": 취사 모드 설정. ");
	}
}
class Refrigerator implements Control{
	public void turnOff(){
		System.out.println(this.getClass().getName()+": 계속 작동합니다.");
	}
	public void turnOn(){
		System.out.println(this.getClass().getName()+": 우유, 식빵 유효기간이 다되었습니다. 장봐오세요. ");
	}
}
