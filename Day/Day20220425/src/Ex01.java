//�ν��Ͻ� ������ �޼ҵ�� ��ü�� �����Ǿ� ��� ����.
//�ν��Ͻ� ���� �� �޼ҵ�� ��밡�� ����� �ν��Ͻ� ���� �ν��Ͻ��޼ҵ�� Ŭ��������, 
//Ŭ���� �޼ҵ� ���ٰ���.
//Ŭ���������� Ŭ���� �޼ҵ�� ��ü ������ method area������ ������, 
//���� Ŭ���� ���� �޼ҵ�� �������� ���� �ν��Ͻ����� �޼ҵ� ���� �Ұ�.
public class Ex01 {
	static int num =100;
	int i =10;
	
	void func() {
		i++;
		num++;
		System.out.println(i);
	}
	
	static void func2() {
//		i++;
		num ++;
	}
}

class Abc {
	public static void main(String[] args) {
		Ex01 ex = new Ex01();
		ex.func();
		System.out.println(ex.i);
	}

}
