import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2= sc.nextInt();
		
		int result = add(num1,num2); //�Լ� ȣ��
		
		System.out.println("�� ���� ����"+result);
		System.out.println("���α׷� ����");
		
		sc.close();
	}
	// 1) �Է�O, ���O   void(��ȯ��) add(�Լ��̸�)
	public static int add(int num1, int num2) {  // --->�Լ� ����, �Լ� ��ü
		 
		return num1 + num2;
		
	}

}
