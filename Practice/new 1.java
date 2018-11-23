//강의 자료 문제 정답

int [] array = new int[5];
int [] copyArray = new int[5];

//int형 정수를 저장하고 있는 배열의 모든 원소의 값을 두배로 만드는 반복 루프를 작성하라.
for(int i=0; i<array.length++){
	array[i] *=2;
}

//하나의 배열을 다른 배열로 복사하는 반복 루프를 작성하라.
for(int i=0; i<array.length++){
	copyarray[i] = array[i];
}