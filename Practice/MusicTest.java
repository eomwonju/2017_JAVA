class Person extends Object{//��� Ŭ������ Object Ŭ������ �ڼ�
	protected int age;
	protected String name;
	
	//Object class(�θ� Ŭ����) : public String toSring()//Override �� �� ���������ڸ� �Ժη� �����ϸ� �ȵȴ�.//������ ������ �ȵ�// ������ ������ ���� ����
	public String toSring(){//��ü�� ������ String���� ��ȯ
		return String.format("�� %s�� ���̴� %d�̰�, �̸��� %s�Դϴ�.", this.getClass().getName(), age, name);//getClass : ��ü�� ������ Ŭ������ ����(class Person ���) + getName : Ŭ������ �̸�(Person ���)
	}
	
	
	
	
	
	
	
	
	
	//Object�� equals() �޼ҵ带 ������
	//���� 100% ����
	public boolean equals(Object o){//���̰� ���� �̸��� ������ ���� ������� ����
		if(this.age == (((Person)o).age) && this.name.equals(((Person)o).name)) return true;
		else return false;//���� �޼ҵ�� equals(String)
	}
	
	
	
	
	
	
	
	
	
	
	
	public void eat(String menu, int n){
		System.out.printf("%s�� %d�� �Խ��ϴ�.", menu, n);
	}
	
	public Person(){}//����Ʈ ������
	
	public Person(int age, String name){//��� �ʵ带 �ʱ�ȭ �ϴ� ������
		this.age = age;
		this.name = name;
	}
}

class Player extends Person{
	public void play(){
		System.out.println("�����մϴ�.");
	}
	public Player(){}
	
	public Player(int age, String name){
		super(age, name);
	}
}

class Director extends Person{
	public void direct(){
		System.out.println("�����մϴ�.");
	}
	
	public Director(){}
	public Director(int age, String name){//�ڽ�Ŭ������ �����ڰ� ���� �����ϴ� ���� �θ�Ŭ������ �����ڸ� ȣ���ϴ� ���̴�.
		super(age, name);
	}
}

class Pianist extends Player{
	private String brandOfPiano;
	
	
	//equals() ������ ����, �̸�, �ǾƳ밡�� ���� ��� ���� �ǾƴϽ�Ʈ
	public boolean equals(Object o){
		if(this.age == (((Pianist)o).age) && this.name.equals(((Pianist)o).name) && this.brandOfPiano.equals(((Pianist)o).brandOfPiano)) return true;
		else return false;
	}
	
	
	
	//toSring ������ : ��ü�� ��� ������ String Type���� ��ȯ
	public String toSring(){
		return super.toString()+String.format("�� �ǾƳ� �귣��� %s�Դϴ�.", brandOfPiano);
	}
	
	@Override
	public void play(){
		System.out.print("�ǾƳ븦 ");
		super.play();
	}
	
	public Pianist(){}//����Ʈ �����ڴ� ����� ���°� ����
	
	public Pianist(int age, String name, String brand){
		//����, �̸��� ���� : �θ�Ŭ�������� ���� �ʵ��̱� ����
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
		System.out.print("ÿ�θ� ");
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
		System.out.print("���̿ø��� ");
		super.play();
	}
	public Violinist(){}
	
	public Violinist(int age, String name){
		super(age, name);
	}
}

class MusicTest{
	public static void main(String [] args){
		Person p1 = new Person(20, "ȫ�浿");
		Person p2 = new Person(20, "���亥");
		System.out.println(p1.toSring());
		System.out.println(p1.equals(p2));
		Pianist beethoven  = new Pianist(20, "���亥", "��â");
		System.out.println(beethoven.toSring());//=System.out.println(beethoven)
	}
	//Chellist c = new Chellist(5, "���ѳ�");
}

//�����ڴ� ��ü�� ������ �� ȣ���ϴ� Ư���� �޼ҵ��̴�. �����ڰ� �ϴ� �ֵ� �۾��� ����Ͻÿ�. : ��ü �����ÿ� �ʵ带 �ʱ�ȭ�ϴ� ������ ��

//����Ʈ �����ڴ� �������� ���� �׻� ����� �����


//�ǾƴϽ�Ʈ, ÿ����Ʈ, ���̿ø��Ͻ�Ʈ(�������� �ڽ�Ŭ����) => ������(����� ���� Ŭ����1) 
//������(����� ���� Ŭ����2) 
//���(�θ�)
//�޼ҵ�, �ʵ�+������!!
//object Ŭ������ �޼ҵ� : equals(); toSring(); getClass().getName();