
class MyMath2 {
	
	long a, b;
	
	//�ν��Ͻ����� a,b���� �̿��ؼ� �۾��ϹǷ� �Ű������� �ʿ����.
	long add() 		 {return a + b; } //a,b�� ��������
	long subtract()  {return a - b; }
	long multiply()  {return a * b; }
	double divide()  {return a / b; }
	
	
	//�ν��Ͻ������� ������� �Ű����������� �۾��� �����ϴ�.
	static long add(long a, long b) 	  {return a + b; } //a,b�� ��������
	static long subtract(long a, long b)  {return a - b; }
	static long multiply(long a, long b)  {return a * b; }
	static double divide(long a, long b)  {return a / b; }
}

class MyMathTest2 {
	public static void main(String[] args) {
		//Ŭ�����޼��� ȣ��. �ν��Ͻ� �������� ȣ�Ⱑ��.
		System.out.println(MyMath2.add(200L,100L));
		System.out.println(MyMath2.subtract(200L,100L));
		System.out.println(MyMath2.multiply(200L,100L));
		System.out.println(MyMath2.divide(200L,100L));
	}

}
