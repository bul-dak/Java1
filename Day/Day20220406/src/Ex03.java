import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// Ű����� �� ���� �Է��� �޾Ƽ� , ������ ����� ����Ѵ�.
	
		Scanner sc = new Scanner(System.in);
//		
//		int num1 = sc.nextIn();   �����ۿ� �Է¸���. ���� X
//		int num1 = sc.nextIn();

		String n1 = sc.nextLine();   //���ڵ� �Է°���
		String n2 = sc.nextLine();
		
		int num1 = Integer.parseInt(n1);
		int num2 = Integer.parseInt(n2);
		
		int sum = num1 + num2;
		double aver = sum / 2.0;
		
		System.out.println("�հ�:"+ sum + "���:"+ aver);
		
		sc.close();
	
	}

}

