class Person extends Object{//모든 클래스는 Object 클래스의 자손
	protected int age;
	protected String name;
	
	//Object class(부모 클래스) : public String toSring()//Override 할 때 접근지시자를 함부로 변경하면 안된다.//범위를 좁히면 안됨// 범위를 넓히는 것은 가능
	public String toSring(){//객체의 정보를 String으로 반환
		return String.format("이 %s의 나이는 %d이고, 이름은 %s입니다.", this.getClass().getName(), age, name);//getClass : 객체를 생성한 클래스의 정보(class Person 출력) + getName : 클래스의 이름(Person 출력)
	}
	
	
	
	
	
	
	
	
	
	//Object의 equals() 메소드를 재정의
	//시험 100% 출제
	public boolean equals(Object o){//나이가 같고 이름이 같으면 같은 사람으로 정의
		if(this.age == (((Person)o).age) && this.name.equals(((Person)o).name)) return true;
		else return false;//여기 메소드는 equals(String)
	}
	
	
	
	
	
	
	
	
	
	
	
	public void eat(String menu, int n){
		System.out.printf("%s를 %d개 먹습니다.", menu, n);
	}
	
	public Person(){}//디폴트 생성자
	
	public Person(int age, String name){//모든 필드를 초기화 하는 생성자
		this.age = age;
		this.name = name;
	}
}

class Player extends Person{
	public void play(){
		System.out.println("연주합니다.");
	}
	public Player(){}
	
	public Player(int age, String name){
		super(age, name);
	}
}

class Director extends Person{
	public void direct(){
		System.out.println("지휘합니다.");
	}
	
	public Director(){}
	public Director(int age, String name){//자식클래스의 생성자가 가장 먼저하는 일은 부모클래스의 생성자를 호출하는 일이다.
		super(age, name);
	}
}

class Pianist extends Player{
	private String brandOfPiano;
	
	
	//equals() 재정의 나이, 이름, 피아노가지 같은 경우 같은 피아니스트
	public boolean equals(Object o){
		if(this.age == (((Pianist)o).age) && this.name.equals(((Pianist)o).name) && this.brandOfPiano.equals(((Pianist)o).brandOfPiano)) return true;
		else return false;
	}
	
	
	
	//toSring 재정의 : 객체의 모든 정보를 String Type으로 반환
	public String toSring(){
		return super.toString()+String.format("또 피아노 브랜드는 %s입니다.", brandOfPiano);
	}
	
	@Override
	public void play(){
		System.out.print("피아노를 ");
		super.play();
	}
	
	public Pianist(){}//디폴트 생성자는 만들어 놓는게 좋음
	
	public Pianist(int age, String name, String brand){
		//나이, 이름은 보류 : 부모클래스에서 만든 필드이기 때문
		/*this.age = age;
		this.name = name;
		*/
		super(age, name);
		this.brandOfPiano = brand;
	}
}

class Cellist extends Player{
	@Override
	public void play(){
		System.out.print("첼로를 ");
		super.play();
	}
	public Cellist(){}
	
	public Cellist(int age, String name){
		super(age, name);
	}
}

class Violinist extends Player{
	@Override
	public void play(){
		System.out.print("바이올린을 ");
		super.play();
	}
	public Violinist(){}
	
	public Violinist(int age, String name){
		super(age, name);
	}
}

class MusicTest{
	public static void main(String [] args){
		Person p1 = new Person(20, "홍길동");
		Person p2 = new Person(20, "베토벤");
		System.out.println(p1.toSring());
		System.out.println(p1.equals(p2));
		Pianist beethoven  = new Pianist(20, "베토벤", "영창");
		System.out.println(beethoven.toSring());//=System.out.println(beethoven)
	}
	//Chellist c = new Chellist(5, "강한나");
}

//생성자는 객체를 생성할 때 호출하는 특별한 메소드이다. 생성자가 하는 주된 작업을 기술하시오. : 객체 생성시에 필드를 초기화하는 역할을 함

//디폴트 생성자는 안정성을 위해 항상 만들어 줘야함


//피아니스트, 첼리스트, 바이올리니스트(연주자의 자식클래스) => 연주자(사람의 서브 클래스1) 
//지휘자(사람의 서브 클래스2) 
//사람(부모)
//메소드, 필드+생성자!!
//object 클래스의 메소드 : equals(); toSring(); getClass().getName();