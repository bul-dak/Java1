
public class Ex01 { //�Լ��� ���� ����? ���������,��������. ���ɺ��� �з��ϱ����ؼ�(��ǰ,�Ǹ�,ȸ���.)

	public static void main(String[] args) {
		//�Լ����� �Է�(X), ���(X)
		System.out.println("main() �Լ�!!");
		sub2(); //�Լ� ȣ��
		System.out.println("main()2 �Լ�!!");
	}
	//�Լ��� �����ϸ� �ݵ�� �ٸ� ��(main���) ȣ���� �ؾ��Ѵ�.
	public static void sub() { //public�� �ƹ��� ���ٽ� private�� ���Ŀ�
		System.out.println("���� �Լ� �Դϴ�."); //ȣ��� �� ������� �ٽ� ȣ���ߴ� ������
		
	}
	public static void sub2() { //public�� �ƹ��� ���ٽ� private�� ���Ŀ�
		sub();
		System.out.println("����2 �Լ� �Դϴ�."); //ȣ��� �� ������� �ٽ� main����
		System.out.println("�ȳ��ϼ���.");
	}
	
}
//�����Լ� ����2�Լ� �����Լ� ����2�Լ�
