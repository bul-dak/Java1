import java.util.Scanner;

public class Ex04 { //���� 5���� ���������� �Է��ؼ� �� ���� �� 

	public static void main(String[] args) {
		int sum = 0; //������
		int i = 0; //ȸ���뵵
		int input;
		
		Scanner scanner = new Scanner(System.in);
		
		while(i++ < 5) {
			System.out.println(i+"ȸ ���� �Է�: ");
			input = scanner.nextInt();
			
			sum +=input;
			System.out.println("sum: "+sum);
		}

		scanner.close();
	}

}
