
public class Ex01 {

	public static void main(String[] args) {
		Car c1= new Car(); 
		Car c2= new Car();
		Car c3= new Car();
		c1.num++; 
		System.out.println(c1.num);
		System.out.println(c2.num);
		System.out.println(c3.num);
		
//		Car c4 = new Car();
//		c4.func();
//		
//		Car c5 = new Car(c4);
		
//		System.out.println(c5.num);
		
		Car2 c10 = Car2.getInstance(); //Ÿ���� Car2�� ���� c10�� 
		                             //Ŭ���� Car�� �ִ� getInstance�Լ� 
		                             //ȣ���ؼ� ���� ��ȯ��������. ���? ����Ÿ���� Car2�� ���� c10��
		c10.num++;
		System.out.println(c10.num);
		
		Car2 c11 = Car2.getInstance(); //��ü�� ���� ���������� ���� Ŭ������ �����ϰ�����.
		c11.num++;                     //*�� �κ��� �ణ ���� ����.
		System.out.println(c11.num);   //���� Ŭ������ �����ϰ� �ֱ⶧���� num���� ���� �ö�.
		System.out.println(c10.num);
	}
}
class Car {
	int num = 10; //��ü �����ϰ� ���� ����� �� �ִ� �ν��Ͻ�����
	public Car() {
		System.out.println("car ������");
		
	} 
	
}
class Car2 { //������ ���� >> �̱��� ; ��ü�� �ϳ��� �����ؼ� �����ϰڴ�.
	
	private static Car2 car2 = null; //�ܺο��� ���� car2�� �����ϴ� ���� ���� ���ؼ�(���Ƿ� ���� �����ϴ°��� ������)
	                                 //private�� �ٿ����� static�� �������ν� Ŭ���������� ��ü�������� �޸𸮰�����
	                                 //�ö󰡱� ������ getInstance�޼ҵ� ������ Car2 car2 = null�̶�� ������ 
	                                 //����Ҽ� ����. �׷��� ��ü������ ����!!
	
	int num = 100;
	
	private Car2() { //����Ʈ ������
		System.out.println("car2 ������");
	}
	public static Car2 getInstance() {
		if(car2 == null)
			car2 = new Car2(); //������ȣ��
		return car2; //�����ڰ� ȣ��� car2�� ��ȯ�� ����? -->13�����ٿ� �ִ� Car2.getInstance() �̰�����
	}
	
}

//1.�Ϲ������� ��ü������ �����ڸ� ���ؼ� ��ü�����Ѵ�.
//2.�̱����� ������ private >> �ܺ����� ����.
//3.��� ������ ���ΰ�? ==> getInstance�޼ҵ忡�� ��ü�� �����ϰ� �ִ�.
//4.�ܺο��� ��ü�� �����Ϸ��� getInstance���ؼ��� �����ϴ�.
//5.getInstance�� �޼ҵ��̱� ������ �ܺο��� �����Ϸ��� ��ü�� �����ϰ� �����ؾ��Ѵ�.
//6.static�޼ҵ�� ��ü�� �������� �ʰ��� ���� �����ϴ�. ���� getInstancefmf static�޼ҵ�� �����Ѵ�.
//7.getInstance static �޼ҵ忡�� ��ü�� �����ؼ� �������� car2���� ������ ��ü �ּҰ��� �Ѱ��ش�. 
//8.Car2 car2�� ���̴� ��� �����ؾ� �ϴ°�? ==>static���� static������ ����












