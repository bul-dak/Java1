
public class BankAccount {//Ŭ���� --> Ŭ���� ����� �߻�ȭ����
	private int balance; //�ܾ� �������,�ν��Ͻ�����, ��Ģ : ������ �ܺο��� ���� ������ ����
	                                     //�������� ���� �� �ϳ��� ���Ἲ
	private int sum; //������ ù���ڸ� �빮�ڷ� �ٲ㼭 ���� 8����
	
	//getter, setter ==> get �� ���, set �� �Է�
//	public int getSum() {
//		return sum;
//	}
//	public void setSum(int sum) {
//		this.sum = sum;
//	}
	
	int deposit(int amount) { //�Ա�
		balance += amount;
		return balance;
		
	}
	int withdraw(int amount) { //���
		 balance -= amount;
		 return balance;
		 
	}
	
	void checkBanance() { //�ܰ� Ȯ��
		System.out.println("�ܾ� : "+balance);
	}
	
}

class MainClass {
	public static void main(String[] args) {
		//�Ʒ� ȭ��ó�� ����ϱ� ���� ������ ���
		//System.out.println(); -->������ ����
		BankAccount kim = new BankAccount(); //������ ȣ�� --> ����� ����Ʈ ������ȣ���.
		kim.deposit(10000);
		kim.checkBanance();
		kim.withdraw(3000);
		kim.checkBanance();

		BankAccount park = new BankAccount(); 
		park.deposit(50000);
		park.withdraw(30000);
		park.checkBanance();
		
		BankAccount lee = new BankAccount(); 
		lee.deposit(50000);
		lee.withdraw(49000);
		lee.checkBanance();
		
//		lee.setSum(100);
//		lee.getSum();
		
	}
}

//�ܾ� 10000
//�ܾ� 7000