import java.util.Scanner;

public class Ex03 {  //p150���� if������ �ٲ۰� �������� Ǯ���ֽŰ�

	public static void main(String[] args) {
		System.out.print("����(1),����(2),��(3)�� �ϳ��� �Է��ϼ���.>");
		
		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt(); 
		int com = (int)(Math.random() *3) + 1;  
                       //0��1������ ������ �߻�
		
		System.out.println("�����" + user + "�Դϴ�.");
		System.out.println("����" + com + "�Դϴ�.");
		int result = user-com;
		
		if(result == 2 || result ==-1) 
			System.out.println("����� �����ϴ�.");
		else if (result == 1 || result == -2) 
			System.out.println("����� �̰���ϴ�.");
		else 
			System.out.println("�����ϴ�.");
		
		scanner.close();
	}

}
