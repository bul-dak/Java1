import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) { //p.172 4-27
		int num;
		int sum=0;
		boolean flag = true; //while���� ���ǽ����� ���� ����
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�հ踦 ���� ���ڸ� �Է��ϼ���.(�������� 0�� �Է�)");		
		String tmp = scanner.nextLine();
		num = Integer.parseInt(tmp);
		
		
		while (flag) {
			System.out.print(">>");
			if(num!=0) {  //num�� 0�� �ƴϸ� sum�� ���Ѵ�.
				sum+=  num;
			} else {
				flag = false;  //num�� 0�̸�, flag�� ���� false�� ����
			}
		} //while�� end
		
		System.out.println("�հ�: "+sum);
		
		scanner.close();
	}

}
