//���� �ڷ� ���� ����

int [] array = new int[5];
int [] copyArray = new int[5];

//int�� ������ �����ϰ� �ִ� �迭�� ��� ������ ���� �ι�� ����� �ݺ� ������ �ۼ��϶�.
for(int i=0; i<array.length++){
	array[i] *=2;
}

//�ϳ��� �迭�� �ٸ� �迭�� �����ϴ� �ݺ� ������ �ۼ��϶�.
for(int i=0; i<array.length++){
	copyarray[i] = array[i];
}