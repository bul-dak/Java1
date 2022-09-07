package com.ezen;

import lombok.Getter;
import lombok.Setter;


public class CarTest {

	public static void main(String[] args) {
		Sedan se = new Sedan();
//		se.setColor("Red");
//		System.out.println(se.getColor());
//		se.setPassenger(4);
//		System.out.println(se.getPassenger()+"��");
		
//		Sedan se2 = new Sedan("blue",2,4,3);
		
//		SportsCar sp = new SportsCar();
//		sp.setColor("red")
//		System.out.println(sp.getColor);
		
		SportsCar sp2 = new SportsCar("yellow",2,4,1,5000);
		sp2.run();
		
		System.out.println(sp2.getColor()+","+sp2.getPassenger()+","+sp2.getTire()+","+
		                   sp2.getSeat()+","+sp2.horsepower); //�������� getter����� �� �ۿ� ����.
	
		SportsCar sp3 = new SportsCar();
	}

}

@Getter
@Setter

class Car {
	
	private int passenger;
	private int tire;
	private int seat;
	
	void run() {
		System.out.println("�޷�!!!");
	}
	void stop() {}
	
	
	
	public Car() {
		System.out.println("Car()������");
	}
	public Car(int passenger,int tire, int seat) {
		System.out.println("Car()������");
		this.passenger = passenger;
		this.tire = tire;
		this.seat = seat;
	}
	
	
}
class Sedan extends Car { 
	private String color;
	
	public Sedan() {
		System.out.println("Sedan()������");

	}
	public Sedan(String color,int passenger, int tire, int seat) {
		super(passenger,tire,seat);
		System.out.println("Sedan()������");
		this.color = color;
	}

	void gas() {}
	public String getColor() {
		return color;
	}
//	public void setColor(String color) {
//		this.color = color;
//	}
}

class SportsCar extends Sedan {
	int horsepower;
	
	public SportsCar() {
		System.out.println("Sports()������");

	}
	public SportsCar(String color,int passenger, int tire, int seat,int horsepower) {
		super(color,passenger,tire,seat);
		this.horsepower = horsepower;
	}
	void run() { //�������̵�
		System.out.println("������ī �޷�!!!"); //���������� �ν��Ͻ������� ������ ���������� �켱
	}
}

class Bus extends Car {
	int passengerCount;
	void passengerLoad() {}
}

class Truck extends Car {
	int load;
	void ObjectLoad() {}
}