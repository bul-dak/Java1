import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if (num > 0) {
			System.out.println("���");
			System.out.println("��Ȯ�մϴ�.");
		}
		else if (num < 0)                   //����� ���� ������ �̻��� ��� else if�� ���Ѵ�� �� �� �ִ�.  
			System.out.println("����");
			
		else                                //����� ���� �ΰ����� ��� else�� ����.
			System.out.println("��");
			
//		if (num == 0)
//			System.out.println("��");
		
//		if (num < 0)
//			System.out.println("����");
		
		sc.close();
	}

}
