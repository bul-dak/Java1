
public class Ex04 {

	public static void main(String[] args) {
		//�Լ����� �Է�(X), ���(O)
		int num = 2;
		int num2 = 5;
		
		System.out.println("main() �Լ�!!");
		
	 	double n = sub(); //�Լ� ȣ��
		           //�� sub();�ڸ��� return���� ��ü�� �ϰ� ��.
	 	
		System.out.println("��� ���� : "+n); 
	}
	//�Լ��� �����ϸ� �ݵ�� �ٸ������� ȣ���� �ؾ��Ѵ�.
	//void �ڸ����� ��ȯ���� �´�.-->void�� ��ȯ���� ���ٴ� ���� ���
	//sub�� �Լ� �̸� --> ���� �̸� �ؿ��� ����Ѵ�.
	public static double sub() 
	{ // return�ڷ����� void�ڸ� �ڷ����� �����ؾ���.
		double dnum = 12.5;
		
		System.out.println("sub() �Լ�..."); 
		
		return dnum;
	}

}
