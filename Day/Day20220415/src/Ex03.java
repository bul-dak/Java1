import java.util.Scanner;

public class Ex03 { //if������ؼ� �ټ����� ������ �Է¹޾� ���� ū ���� ����ϴ� ���α׷� �ۼ�. while���� ���� 

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num, max =0;
		String tmp;
		
		System.out.println("���� 5ȸ �Է�(0~100)");
		
		for(int i=0; i<5 ; i++) {
			tmp = sc.nextLine();
			num = Integer.parseInt(tmp);

			if (num<0 || num>100) {
				System.out.println("0~100������ ������ �Է��ϼ���.");
				--i;
				continue;
				}
			
			if(max < num ) 
				max = num;
			
		} //end of for
		
		System.out.println("�ִ� : "+max);
	}

}
