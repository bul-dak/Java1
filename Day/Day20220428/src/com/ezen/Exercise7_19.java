package com.ezen;

public class Exercise7_19 {

	public static void main(String[] args) {
		Buyer b = new Buyer(); //���̾� ��ü ����
		//Product p = new Tvv();
		
		b.buy(new Tvv());      //���̾��� buy�޼��� ȣ�� ���ڰ����� Tv��ü�� �־���. tv��ü�� �����ϰ��ִ� Ŭ������ tv(����)+product(����)
		b.buy(new Computer());
		b.buy(new Tvv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());

		b.summary();
	
	}

}
class Buyer {
	int money = 1000; //�������ִ� �� 
	Product[] cart = new Product[3]; //3�������� �ִ� ��ٱ��� �迭 
	int i = 0; //cart�� ���̴� index i���� ����.
	
	void buy(Product p) { //buy�޼���
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ�"+p+"�� �� �� �����ϴ�.");
			return; //�޼��� ����.
		}
		money -= p.price; //������ �ִ� ���� ��ǰ���ݺ��� ������ �������ִ� ������ ��ǰ������ ����.
		add(p); //��ǰ�� cart�ȿ� �ִ� add()�޼��� ȣ��.
	}
	void add(Product p) {
		if(i >= cart.length ) {  //��ǰ ������ ��ٱ��� �������� ���ų� ũ�� ��ٱ��ϰ����� �ι�� �ø� �� ��´�.
			Product[] tmp = new Product[cart.length*2];
			System.arraycopy(cart, 0, tmp, 0, cart.length);
			cart = tmp;
		}
		cart[i]=p; //ù��° Tv�� Computer�� ���� ���� if�� ����ȵǰ� ������� �����.
		           //������ ��ٱ��� (cart)�� �����Ѵ�. 
		i++;       //�׸��� i�� ���� 1������Ų��.
	}
	void summary() {
		String itemList  = "";
		int sum = 0;
		for(int i = 0; i<cart.length;i++) {
			if(cart[i]==null)
				break;
			itemList += cart[i] + ",";
			sum += cart[i].price;
		}
		
		System.out.println("������ ���� :"+itemList);
		System.out.println("����� �ݾ� :"+sum);
		System.out.println("���� �ݾ� :"+money);
	}
}

class Product {
	int price; //��ǰ�� ����
	
	Product(int price) {
		this.price = price;
	}
}
class Tvv extends Product {
	Tvv() {super(100); } //Ƽ�񰡰�
	
	public String toString() { return "Tv"; } // ���ݰ� "Tv"�� ������ ����.
	                                          // 	System.out.println(p.price); = 100 
	                                          //	System.out.println(p.toString()); = Tv
}
class Computer extends Product {
	Computer() {super(200); } //��ǻ�Ͱ���
	
	public String toString() { return "Computer"; }
	
}
class Audio extends Product {
	Audio() {super(50); }

	public String toString() { return "Audio"; }
}













