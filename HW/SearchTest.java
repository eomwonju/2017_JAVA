import java.util.Scanner;

class Search{
	Scanner s = new Scanner(System.in);//스캐너를 필드로 선언할 수도 있음
	
	String inputString(String prompt){//매개변수로 받은 문자열을 출력하고 사용자가 입력한 문자열을 반환하는 메소드 
		System.out.print(prompt);
		return s.nextLine();
	}
	
	void searchKeyword(String sentence, String keyword){//문장과 검색할 단어를 매개변수로 받아 검색 결과를 출력하는 메소드 
		int i, n=0, cnt=1; //n: 검색횟수, cnt: 어절개수
		int lenKey = keyword.length();
		
		System.out.print("검색 결과: ");
		for(i=0; i<=sentence.length()-lenKey; i++){
			if(sentence.charAt(i)==' '){
				cnt++;
			}//공백이 나올때마다 어절 개수 추가
			if(keyword.equalsIgnoreCase(sentence.substring(i, i+lenKey))){
				System.out.print(cnt+"번째, ");//문자열의 i번째 문자부터 키워드길이만큼 잘랐을때 키워드와 대소문자 무시하고 일치한다면 검색 결과에 지금 어절 추가
				n++; //검색횟수 추가
			}
		}
		if(n>0) System.out.print("\b\b 어절에서 \""+keyword+"\"가 검색되어, ");
		
		System.out.println("총 "+n+"회 검색되었습니다.");
	}	
}


class SearchTest{
	public static void main(String [] args){
		Search s = new Search();
		String sentence = s.inputString("문장: ");
		String keyword = s.inputString("검색할 단어: ");
		s.searchKeyword(sentence, keyword);
	}
}