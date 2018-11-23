import java.util.Scanner;

interface Customizable{
	void customize();
}

class Noodle extends Menu implements Customizable{
	@Override 
	public void customize(){
		System.out.print("\t곱빼기로 주문하시겠습니까??(Y/N)");
		Scanner s = new Scanner(System.in);
		if(s.next().charAt(0)=='Y'){
			System.out.println("\t"+this.getClass().getName()+": 곱빼기로 주문합니다.");
		}
	}
}
class Hamburger extends Menu{}
class Pizza extends Menu implements Customizable{
	@Override 
	public void customize(){
		System.out.print("\t토핑을 입력해주세요: ");
		Scanner s = new Scanner(System.in);
		String topping = s.nextLine();
		System.out.println("\t"+topping+" 피자로 주문합니다.");
	}
}
class Steak extends Menu{}


class Menu{
	void order(){
		System.out.println(this.getClass().getName()+"을 주문 받았습니다!");
		if(this instanceof Customizable) ((Customizable)this).customize();
	}
}


class Test{
	public static void main(String [] args){
		Menu [] menu = {new Noodle(), new Hamburger(), new Pizza(), new Steak()};
		
		for(Menu m: menu) m.order();
	}
}
