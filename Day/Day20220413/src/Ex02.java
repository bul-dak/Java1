import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2= sc.nextInt();
		
		add(num1,num2); //�Լ� ȣ��

		System.out.println("���α׷� ����");
		
		sc.close();
	}
	// 1) �Է�O, ���X   void(��ȯ��) add(�Լ��̸�)
	public static void add(int num1, int num2) {  // --->�Լ� ����, �Լ� ��ü

		System.out.println("�� ���� ����"+(num1+num2));
	}

}
