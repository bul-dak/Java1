
public class Abstract {

	public static void main(String[] args) {
//		Product pro = new Product(10);
//		System.out.println(pro.price);
	
		Product pro = new Computer();
		System.out.println(pro.price);
		pro.test();
		pro.func();
	}

}

abstract class Product {
	int price; //��ǰ�� ����
	Product(int price) {
		this.price = price;
	}
	void test() {
		System.out.println("Product");
	}
	abstract void func(); //�߻�޼��� 
}

class Tvv extends Product {
	Tvv() {super(100); } //Ƽ�񰡰�
	
	public String toString() { return "Tv"; } // ���ݰ� "Tv"�� ������ ����.
	                                          // 	System.out.println(p.price); = 100 
	                                          //	System.out.println(p.toString()); = Tv

	@Override
	void func() {
		// TODO Auto-generated method stub
		System.out.println("tv");
		
	}
}
class Computer extends Product {
	Computer() {super(200); } //��ǻ�Ͱ���
	
	public String toString() { return "Computer"; }

	@Override
	void func() {
		System.out.println("comouter");
	}
	
}
class Audio extends Product {
	Audio() {super(50); }

	public String toString() { return "Audio"; }

	@Override
	void func() {
		// TODO Auto-generated method stub
		System.out.println("audio");
		
	}
}