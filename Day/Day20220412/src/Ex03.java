
public class Ex03 {

	public static void main(String[] args) {
		//�Լ����� �Է�(X), ���(O)
		int num = 2;
		int num2 = 5;
		
		System.out.println("main() �Լ�!!");
		
	 	int result = sub(); //�Լ� ȣ��
		
		System.out.println("��� ���� : "+result); 
	}
	//�Լ��� �����ϸ� �ݵ�� �ٸ������� ȣ���� �ؾ��Ѵ�.
	//void �ڸ����� ��ȯ���� �´�.-->void�� ��ȯ���� ���ٴ� ���� ���
	//sub�� �Լ� �̸� --> ���� �̸� �ؿ��� ����Ѵ�.
	public static int sub() { 
		int num = 10000;
		
		System.out.println("sub() �Լ�..."); 
		
		return num;

	}

}
