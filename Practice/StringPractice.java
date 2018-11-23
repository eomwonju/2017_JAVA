import java.lang.String;

class StringPractice{
	pubic static void main(String [] args){
		
		String st = "Hello", st1 = "abc", st2 = "ad", st3 = "abc", st4 = "abcd";
		System.out.println("문자열 길이 : "+st.length());
		System.out.println("5번째 문자 : "+st.charAt(4));
		System.out.println("st1과 st2 비교 : "+st1.compareTo(st2));//st1 - st2 = -2
		System.out.println("st1과 st2 비교 : "+st2.compareTo(st1));//st2 - st1 = 2
		System.out.println("st1과 st2 비교 : "+st3.compareTo(st1));//st3 - st1 = 0
		System.out.println("st1과 st2 비교 : "+st4.compareTo(st1));//st4 - st1 = d의 ASCII코드 값
		
		if(st1.equals(st3)) System.out.println("두 문자열은 같다");//내용 비교
		else System.out.println("두 문자열은 다르다");
	}
}