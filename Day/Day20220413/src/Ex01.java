import java.util.Scanner;

public class Ex01 { //�� ���� �Է¹޾Ƽ� ���� ���ϴ� ���α׷�

	public static void main(String[] args) {  //jvm(����ӽ�) ȣ��
		
		add(); //�Լ� ȣ��

		System.out.println("���α׷� ����");
		
	}
	// 1) �Է�X, ���X   void(��ȯ��) add(�Լ��̸�)
	public static void add() {  // --->�Լ� ����, �Լ� ��ü
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2= sc.nextInt();
		
		System.out.println("�� ���� ����"+(num1+num2));
		
		sc.close();
	}
}
