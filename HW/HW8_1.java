class HW8_1{
	public static void main(String [] args){
		Student st = new Student("ȫ�浿", 20, 4.3);
		System.out.println(st);// ���������� ����϶�� �ϸ� �ڵ����� st�� toString()�޼ҵ尡 ȣ��Ǿ� �� ����� ��µ�.
	}
}

class Student{
	private String name;
	private int age;
	private double grade;
	
	public Student(){//����Ʈ �����ڴ� �̿� ���� �ƹ� �ϵ� ���� �ʾƵ� �����ϰ�, �Ǵ� �Ʒ� ó�� �⺻���� ���� �̸��� �ʱ�ȭ �ϴ� �͵� ����. 	
	}
	
	/*
	public Student(){//����Ʈ �����ڿ��� �ٸ� �����ڸ� ȣ��
		this("�͸�", 20, 4.3);
	}
	*/
	
	public Student(String name, int age, double grade){
		this.name = name;
		
		if(age<0||age>200) this.age = 20;
		else this.age = age;
		
		if(grade<0||grade>4.3) this.grade = 3.0;
		else this.grade = grade;
	}
	
	public String toString(){ //�л� ������ ���ڿ��� ��ȯ�ϴ� �޼ҵ� 
		return String.format("\n-�л� ����-\n\n�̸�: %s\n����: %d\n����: %.2f\n", name, age, grade); //���ڿ��� ������ �����ϰ� ���� ��� StringŬ������ format()�޼ҵ带 ���
		//format()�޼ҵ�� printf()�� ������ ����
	}
	
	public boolean equals(Object o){
		return this.age==((Student)o).age && this.name.equals(((Student)o).name) && this.grade ==((Student)o).grade;
	}
}