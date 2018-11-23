class HW8_1{
	public static void main(String [] args){
		Student st = new Student("홍길동", 20, 4.3);
		System.out.println(st);// 참조변수를 출력하라고 하면 자동적을 st의 toString()메소드가 호출되어 그 결과가 출력됨.
	}
}

class Student{
	private String name;
	private int age;
	private double grade;
	
	public Student(){//디폴트 생성자는 이와 같이 아무 일도 하지 않아도 무방하고, 또는 아래 처럼 기본으로 나이 이름을 초기화 하는 것도 가능. 	
	}
	
	/*
	public Student(){//디폴트 생성자에서 다른 생성자를 호출
		this("익명", 20, 4.3);
	}
	*/
	
	public Student(String name, int age, double grade){
		this.name = name;
		
		if(age<0||age>200) this.age = 20;
		else this.age = age;
		
		if(grade<0||grade>4.3) this.grade = 3.0;
		else this.grade = grade;
	}
	
	public String toString(){ //학생 정보를 문자열로 반환하는 메소드 
		return String.format("\n-학생 정보-\n\n이름: %s\n나이: %d\n학점: %.2f\n", name, age, grade); //문자열에 서식을 지정하고 싶은 경우 String클래스의 format()메소드를 사용
		//format()메소드는 printf()와 사용법이 동일
	}
	
	public boolean equals(Object o){
		return this.age==((Student)o).age && this.name.equals(((Student)o).name) && this.grade ==((Student)o).grade;
	}
}