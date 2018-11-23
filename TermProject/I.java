class I{
	static int myMoney=30000, tired=5, pay=25000;
	static Scanner s = new Scanner(System.in);
	
	public static void action(){
		
		System.out.println("손님이 없다.");
		System.out.println("행동을 선택하세요.");
		System.out.println("1.정리하기 2.진열하기 3.청소하기 4.가만히 있기");
		int n = s.nextInt();
		while(true){
			if(n==1){
				organize();
				break;
			}
			else if(n==2){
				display();
				break;
			}
			else if(n==3){
				clean();
				break;
			}
			else if(n==4){
				rest();
				break;
			}
			else{
				System.out.println("1부터 4까지의 정수를 입력해주세요.");
				continue;
			}
		}
		store.report1();
	}
	
	public static void organize(){//정리하기
		System.out.println("정리하기를 선택했습니다.");
		try{
			Thread.sleep(1000);
		} catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("...정리중입니다...");
		try{
			Thread.sleep(1000);
		} catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("정리완료");
		store.setDirty(-1);//더러움 -1
		setTired(1);//피로도 +1
	}
	
	public static void display(){//진열하기
		System.out.println("진열하기를 선택했습니다.");
		try{
			Thread.sleep(1000);
		} catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("상품을 진열합니다");
		try{
			Thread.sleep(1000);
		} catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("진열완료");
		setTired(1);
	}
	
	public static void clean(){//청소하기
		System.out.println("청소하기를 선택했습니다.");
		try{
			Thread.sleep(1000);
		} catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("...청소중입니다...");
		try{
			Thread.sleep(1000);
		} catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("청소완료");
		store.setDirty(-1);//더러움 -1
		setTired(1);//피로도 +1
	}
	
	public static void rest(){//가만히 있기
		System.out.println("가만히 휴식을 취합니다");
		try{
			Thread.sleep(2000);
		} catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("피로가 조금 회복되었습니다.");
		setTired(-1);
	}
	
	public static void sale(int n){//물건팔기, n = 손님별 난이도
		System.out.println("손님의 계산요청");
		minigame.game_WASD(n);//호출
		if (minigame.getSell()) {
			store.setSaleMoney(5000);
			System.out.println("오늘의 누적매출 : "+store.getSaleMoney());
		}
		else System.out.println("다음 기회에...");	
	}
	
	//재산설정
	public static void setMyMoney(int n){
		myMoney += n;
	}
	public static int getMyMoney(){
		return myMoney;
	}
	
	//피로도설정
	public static void setTired(int n){
		tired += n;
		if(tired<0) tired=0;
	}
	public static int getTired(){
		return tired;
	}
	
	//일당설정
	public static void setPay(int n){
		pay += n;
	}
	public static int getPay(){
		return pay;
	}
	
	public static void spendMoney(){
		System.out.println("하루 일과를 마치고");
		System.out.println("1.음식 사먹기 2.친구와 카페가기 3.친구와 술 마시러가기");
		while(true){
			if(n==1){
				eat();
				break;
			}
			else if(n==2){
				goCafe();
				break;
			}
			else if(n==3){
				drink();
				break;
			}
			else{
				System.out.println("1부터 3까지의 정수를 입력해주세요.");
				continue;
			}
		}
	}
	
	public static void eat(){
		public String [] arr2 = new String [4];
		arr2 = {"스테이크를", "과자를", "피자를", "치킨을"};
		public int y = (int)(Math.random()*4);
		System.out.printf("%s 먹었습니다.\n", arr2[y]);
		if(y==0){
			setMyMoney(-10000);
			setTired(-3);
		}
		else if(y==1){
			setMyMoney(-3000);
			setTired(-1);
		}
		else if(y==2){
			setMyMoney(-5000);
			setTired(-1);
		}
		else {
			setMyMoney(-7000);
			setTired(-2);
		}
	}
	
	public static void goCafe(){
		System.out.println("카페에 가서 친구와 수다떨었습니다.");
		setMyMoney(-3000);
		setTired(-1);
	}
	
	public static void drink(){
		public String [] arr = new String [4];
		arr = {"오랜만에 만난 동창들과", "혼자", "룸메와", "대학 동기들과"};
		public int x = (int)(Math.random()*4);
		System.out.printf("%s 술을 마셨습니다.\n", arr[x]);
		if(x==0){
			setMyMoney(-7000);
			setTired(-2);
		}
		else if(x==1){
			setMyMoney(-3000);
			setTired(-1);
		}
		else if(x==2){
			setMyMoney(-5000);
			setTired(-1);
		}
		else {
			setMyMoney(-6000);
			setTired(-2);
		}
	}
}