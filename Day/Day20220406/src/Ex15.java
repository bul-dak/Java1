import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		System.out.print("������ �Է��ϼ���.>");
		
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();  //ȭ���� ���� �Է¹��� ������ tmp�� ����
		int score = Integer.parseInt(tmp);  //�Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ
		
	    
		switch(score/10) {   //������ ������ 10�� ���ָ� ��
			case 9:  
			System.out.println("A");
			break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("F");
				break;
		}
		
		sc.close();
	}

}
