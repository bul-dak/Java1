
public class BankAccount2 {//Ŭ���� --> Ŭ���� ����� �߻�ȭ����
	private int balance; //�ܾ� �������,�ν��Ͻ�����, ��Ģ : ������ �ܺο��� ���� ������ ����
	                                     //�������� ���� �� �ϳ��� ���Ἲ
	
	int deposit(int amount) { //�Ա�
		balance += amount;
		return balance;
		
	}
	int withdraw(int amount) { //���
		 balance -= amount;
		 return balance;
		 
	}
	
	int checkBanance() { //�ܰ� Ȯ��
		System.out.println("�ܾ� : "+balance);
		return 0;
	}
	
}

class MainClass2 {
	public static void main(String[] args) {
		
		//��ü �迭
		BankAccount2[] bank = new BankAccount2[3];
		
		bank[0] = new BankAccount2();
		bank[1] = new BankAccount2();
		bank[2] = new BankAccount2();
		
		bank[0].deposit(10000);
		bank[0].withdraw(3000);
		System.out.println(bank[0].checkBanance());
		
		for (int i =0; i<bank.length;i++) {
			bank[i] = new BankAccount2();
		}
	}
}

