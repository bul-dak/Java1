
public class Ex06 {

	public static void main(String[] args) { //������
		int num =2;
		
		gugudan(num);
		gugudan2(num);
		System.out.println("���α׷� ����!!");
		
		
	} 
	public static void gugudan(int num) {
		System.out.println("�Է���"+num+"�� ���");

		for (int i=1;i<=9;i++) {
			System.out.println(num +"*"+i+"="+ num*i);
		}
	}

	public static void gugudan2(int num) {
			System.out.println("�Է���"+num+"�� ���");

			for (int i=1;i<=num;i++) {
				System.out.println(num +"*"+i+"="+ num*i);
			}
	}		

}
