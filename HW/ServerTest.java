//HW10_1_2
import java.util.Scanner;

class Server{	//Ȩ��Ʈ��ũ ���� 
	private String pw="java";
	private Control[] c = new Control[5];
	private Scanner sc = new Scanner(System.in);
	
	Server(){		//������ ������ �� �ִ� ��ü ���
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
	private boolean logIn(){	//�α� ���� �� �� ��� ��ȯ
		String userPw;
		boolean pass = false;
		
		for(int i=0; i<3; ){
			System.out.print("���� ���� ��� ��ȣ�� �Է��ϼ��� : ");
			userPw = sc.nextLine();
			pass=pw.equals(userPw);
			if(pass) {
				System.out.println("������ �����߽��ϴ�.");
				break;
			}
			else{
				i++;
				System.out.println("��� ��ȣ�� "+i+"ȸ �� �� �Է��ϼ̽��ϴ�.");
				if(i==3) System.out.println("���� ���� ��û�� �����մϴ�.");
			}
		}
		return pass;
	}
	
	public void service(){
		if(logIn()){
			while(true){
				System.out.println("======================");
				System.out.print("����/�Ͱ�/����?");
				String s = sc.nextLine();
				switch(s){
				case "����":
					goOut();
					break;
				case "�Ͱ�":
					comeHome();
					break;
				case "����":
					System.out.println("Ȩ������ ������ �����մϴ�.");
					return;
				default:
					System.out.println("�߸��� ����Դϴ�.");
				}
			}
		}
		else{
			System.out.println("�α��ο� �����Ͽ� ���񽺸� ������ �� �����ϴ�.");
		}
	}
	
	private void goOut(){	//���� �� �� ��
		for(Control con:c){
			con.turnOff();
		}
	}
	
	private void comeHome(){	//�Ͱ��� ���� 
		for(Control con:c){
			con.turnOn();
		}
	}
}

class ServerTest{//Ȩ��Ʈ��ũ �׽�Ʈ 
	public static void main(String args []){
		Server server = new Server(); //Ȩ��Ʈ��ũ ���� ����
		server.service();
	}
}
interface Control{		//���� ��ǰ�� ��Ʈ���ϱ� ���� �������̽� 
	void turnOff();
	void turnOn();
}

abstract class Fire implements Control{
	public void turnOff(){
		System.out.println(this.getClass().getName()+": �����ϴ�.");
	}
	public void turnOn(){
		System.out.println(this.getClass().getName()+": �����ϴ�.");
	}
}


class Gas extends Fire{
	public void turnOff(){
		System.out.println(this.getClass().getName()+": ��ݸ�� ����.");
	}
}
class Boiler extends Fire{}			
class Light extends Fire{}

class Cooker extends Fire{
	public void turnOn(){
		System.out.println(this.getClass().getName()+": ��� ��� ����. ");
	}
}
class Refrigerator implements Control{
	public void turnOff(){
		System.out.println(this.getClass().getName()+": ��� �۵��մϴ�.");
	}
	public void turnOn(){
		System.out.println(this.getClass().getName()+": ����, �Ļ� ��ȿ�Ⱓ�� �ٵǾ����ϴ�. ���������. ");
	}
}
