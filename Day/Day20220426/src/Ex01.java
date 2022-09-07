
public class Ex01 {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		c1.num++;
		System.out.println(c1.num);
		System.out.println(c2.num);
		System.out.println(c3.num);
		
		//�̱��� ��ü������ �ϳ��� ��.
		Car2 c10 = Car2.getInstance();
		c10.num++;
		System.out.println(c10.num);
		
		Car2 c11 = Car2.getInstance();
		c10.num++;
		System.out.println(c10.num);
	}
}
class Car {
	
	int num = 10;
	
	public Car() {
	}
}

class Car2 {
	private static Car2 car2 = null; //Ŭ�������� �� ������.
	
	int num = 100; //�ν��Ͻ�����
	
	private Car2() {} //�⺻������
	
	public static Car2 getInstance() { //Ŭ�����޼ҵ� :��ü�������� �޼ҵ�ȣ�� ����
		if(car2 == null)
			car2 = new Car2();  //������ ȣ��
		return car2; //c10 c11 �� ���� ���� �׷��� Ÿ���� ��ġ�ؾ��ϱ� ������ c10 �տ� Car2�� ����.
	}
		
	
}