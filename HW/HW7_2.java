public class HW8_1{
    public static void main(String [] args){
		if(args.length==0){
			System.out.println("커맨드 라인상에 입력된 문자열이 존재하지 않습니다.");
			return;
		}
		
		String tmp;
		/*
			문자열의 길이에 대한 내림차순으로 정렬해야 하므로 제일 긴 것을 맨 앞으로 보내줘야 한다. 
		*/
		
		for(int i=0; i<args.length-1; i++){
			for(int j=i+1; j<args.length; j++){//i번째 원소와 그 이후(i+1번째 이후)의 원소들을 비교해서 
				if(args[i].length()<args[j].length()){//j번째(즉, i이후의) 문자열의 길이가 더 길다면 j번째 원소와 i번째 원소의 위치를 바꿔준다. 
				//그 결과 더 긴 문자열이 앞에 위치 하게 됨. 
					tmp = args[i];
					args[i] = args[j];
					args[j] = tmp;
				}
				else if(args[i].length()==args[j].length()){//만약 문자열의 길이가 같다면 유니코드 값(영문자의 경우 아스키 코드 값과 일치)이 작은 순으로 나열해야 함: compareTo() 메소드 사용하면 아스키 코드 값을 비교할 수 있음. 
					if(args[i].compareTo(args[j])>0){//이 경우 i번째 원소가 j번째 원소보다 아스키 값이 더 크다는 말이므로 위치를 바꿔줘야 함. 
						tmp = args[i];
						args[i] = args[j];
						args[j] = tmp;
					}
				}
			}
		}
		
		for(String s:args) System.out.print(s+"\t");
    } 
}