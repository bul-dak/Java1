import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// ���� �Է¹޾Ƽ� -> 90�̻� A, 80�̻� B, 70C, 60D, 60����F.
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if (num >= 90 && num <= 100)   
			System.out.println("A�����Դϴ�");
		
		else if (num >= 80 && num <90)
			System.out.println("B�����Դϴ�.");
		
		else if (num >= 70 && num < 80)
			System.out.println("C�����Դϴ�.");
		
		else if (num >= 60 && num < 70)
			System.out.println("D�����Դϴ�.");
		
		else if (num <= 50 && num >= 0)
			System.out.println("F�����Դϴ�.");
		
		sc.close();
	}

}
