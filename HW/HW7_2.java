public class HW8_1{
    public static void main(String [] args){
		if(args.length==0){
			System.out.println("Ŀ�ǵ� ���λ� �Էµ� ���ڿ��� �������� �ʽ��ϴ�.");
			return;
		}
		
		String tmp;
		/*
			���ڿ��� ���̿� ���� ������������ �����ؾ� �ϹǷ� ���� �� ���� �� ������ ������� �Ѵ�. 
		*/
		
		for(int i=0; i<args.length-1; i++){
			for(int j=i+1; j<args.length; j++){//i��° ���ҿ� �� ����(i+1��° ����)�� ���ҵ��� ���ؼ� 
				if(args[i].length()<args[j].length()){//j��°(��, i������) ���ڿ��� ���̰� �� ��ٸ� j��° ���ҿ� i��° ������ ��ġ�� �ٲ��ش�. 
				//�� ��� �� �� ���ڿ��� �տ� ��ġ �ϰ� ��. 
					tmp = args[i];
					args[i] = args[j];
					args[j] = tmp;
				}
				else if(args[i].length()==args[j].length()){//���� ���ڿ��� ���̰� ���ٸ� �����ڵ� ��(�������� ��� �ƽ�Ű �ڵ� ���� ��ġ)�� ���� ������ �����ؾ� ��: compareTo() �޼ҵ� ����ϸ� �ƽ�Ű �ڵ� ���� ���� �� ����. 
					if(args[i].compareTo(args[j])>0){//�� ��� i��° ���Ұ� j��° ���Һ��� �ƽ�Ű ���� �� ũ�ٴ� ���̹Ƿ� ��ġ�� �ٲ���� ��. 
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