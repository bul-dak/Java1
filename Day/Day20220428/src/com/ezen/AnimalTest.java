package com.ezen;

public class AnimalTest {

	public static void main(String[] args) {
		Animal an1 = new Animal();
		Animal an2 = new Mammal();
		Animal an3 = new Person(); 
		//����Ŭ������ ����Ŭ������ �����ϸ� ����Ŭ������ ������ �� �ִ� ���� ����Ŭ���� �������̴�.
		
		an1.eat();
		an2.eat();
		an3.eat();
		an3.run();
		
		
//		Person p = an3;
//		Person p = (Person)an3; //���������� ����ȯ�ϸ� �����ϰ��ִ� ����Ŭ������ ��� �޼��带
		                        //������ �� ����.
		
//		p.eat();
//		p.run();
//		p.play();
//		
//		Mammal m1 = (Mammal)an3;
//		m1.eat(); //����̸Դ´ٰ� ��µ�.
//		
//		Object obj = new Person();
//		Person p2 = (Person)obj; //����Ÿ���� ->�ڼ�Ÿ������ ����ȯ �����Ұ�.
//		p2.eat();
		
		Animal animal = new Penguin();
//		animal.eat();
//		animal.play();
//		Penguin Penguin = (Penguin)animal;
//		Penguin.play();
		
		if(animal instanceof Birds) {
			Birds birds = (Birds)animal; 
			//����� ����,����� �� �����Ҽ� ������ ������ ������, ����� ��ϸ� ������ �� �ֱ⋚����
			//����� ����ȯ�� ���ִ� ���̴�.
		}
		else if (animal instanceof Mammal) {
			Mammal mammal = (Mammal)animal;
		}
			
//		Person pserson (Person)animal;
//		person.eat();
	}

}

class Animal extends Object { //����Ŭ������ �޼��带
	void eat() {              //�������̵��ϰ��ִ� ����Ŭ���� �޼��常 ���� ����!
		System.out.println("������ �Դ´�.");
	}
	void run() {}
}
class Mammal extends Animal{
	void eat() {
		System.out.println("�������� �Դ´�.");
	}
	
}
class Whale extends Mammal {
	void eat() {
		System.out.println("���� �Դ´�.");
	}
	
}
class Person extends Mammal {
	void eat() {
		System.out.println("����� �Դ´�.");
	}
	void run() {
		System.out.println("����� �޸���.");
	}
	void play() {}
}
class Birds extends Animal {
	void eat() {
		System.out.println("������ �Դ´�.");
	}
	
}
class Penguin extends Birds {
	void eat() {
		System.out.println("����� �Դ´�.");
	}
	void play() {System.out.println("����� ���.");}
}
class Sparrow extends Birds {
	void eat() {
		System.out.println("������ �Դ´�.");
	}
	
}