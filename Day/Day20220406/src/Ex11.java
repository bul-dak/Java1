import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		System.out.print("������ �Է����ּ���.>");
		
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		int num = Integer.parseInt(tmp);
		// int num = sc.nextInt();  11,12�� ���� 10���ٰ� ����.
		
		switch(num) {
		case 1 :
			System.out.println("1�Է�");
			break;
		case 2 :
			System.out.println("2�Է�");			
			break;  //�����ϰ� ���� �ä������� ���� �� ����
		case 3 :
			System.out.println("3�Է�");
			break;
		case 4 :
			System.out.println("4�Է�");
			break; 
		default :
			System.out.println("�� �� �Է�");	
		
		}
			
		sc.close();
	}
}
