
public class CarTest {

	public static void main(String[] args) {
		Sedan se = new Sedan(5,4,"white");
//		se.color = "white";
//		se.passenger = 5;
//		se.tire = 4;
		System.out.println(se.color+","+se.passenger+","+se.tire);
		
		Bus b  = new Bus();
		b.passenger = 15;
		b.tire = 6;
		System.out.println(b.passenger+","+b.tire);
		
	
		Sports ss = new Sports(2,4,2,"Red",10000);
		System.out.println(ss.color + ","+ss.passenger + ","+ss.tire + ","+ss.seat+","+ss.sports);
	
	}

}


class Car3 { //������Ŭ���� 
	int passenger;
	int tire;
	int seat;
	public Car3(int passenger, int tire, int seat) {
		this.passenger = passenger;
		this.tire = tire;
		this.seat = seat;
		System.out.println("Car() ������");
	}
	public Car3() {} //����Ʈ������
	
	void run() {}
	void stop() {}
}

class Sedan extends Car3 { //Ŭ���� Car3�� ��ӹ��� Ŭ���� Sedan.
	String color;
	public Sedan() {} //������ ����Ʈ������
	public Sedan(int passenger, int tire,String color) {
		super(passenger,tire,4); //super : �ڽ�Ŭ�������� ��ӹ��� �θ�Ŭ������ ��������� �����Ҷ� ���.
								 //����Ŭ���� ������ ȣ�� , ù��° �ٿ� �־����.
		this.color = color;        
//		this.passenger = passenger;
//		this.tire = tire;
		System.out.println("Sedan()������");
		}
	public Sedan(int passenger, int tire, int seat, String color) {
		super(passenger,tire,seat);
		this.color = color;
	}
}

class Sports extends Sedan {
	
	int sports; 
	public Sports() {} //����Ʈ������
	
	public Sports(int passenger, int tire, int seat,String color,int sports) {
		super(passenger,tire,seat,color);
		this.sports = sports;
	}

}
class Bus extends Car3 { 
	void paseengerLoad() {}
}

class Truck extends Car3 {
	void objectLoad() {}
	
}
