import java.util.Scanner;

interface Customizable{
	void customize();
}

class Noodle extends Menu implements Customizable{
	@Override 
	public void customize(){
		System.out.print("\t������� �ֹ��Ͻðڽ��ϱ�??(Y/N)");
		Scanner s = new Scanner(System.in);
		if(s.next().charAt(0)=='Y'){
			System.out.println("\t"+this.getClass().getName()+": ������� �ֹ��մϴ�.");
		}
	}
}
class Hamburger extends Menu{}
class Pizza extends Menu implements Customizable{
	@Override 
	public void customize(){
		System.out.print("\t������ �Է����ּ���: ");
		Scanner s = new Scanner(System.in);
		String topping = s.nextLine();
		System.out.println("\t"+topping+" ���ڷ� �ֹ��մϴ�.");
	}
}
class Steak extends Menu{}


class Menu{
	void order(){
		System.out.println(this.getClass().getName()+"�� �ֹ� �޾ҽ��ϴ�!");
		if(this instanceof Customizable) ((Customizable)this).customize();
	}
}


class Test{
	public static void main(String [] args){
		Menu [] menu = {new Noodle(), new Hamburger(), new Pizza(), new Steak()};
		
		for(Menu m: menu) m.order();
	}
}
