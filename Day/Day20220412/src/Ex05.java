
public class Ex05 {

	public static void main(String[] args) {
		//�Լ����� �Է�(O), ���(O)
		int num =5;
		int num2 =10;
		
		System.out.println("main() �Լ�!!");
		
	 	int result = sub(num,num2); //�Լ� ȣ�� -->���ڰ� �Ǵ� �μ�
	 	
		System.out.println("��� ���� "+result); 
	}
	
	public static int sub(int num, int num2) { //-->�Ű�����
		int inum = num*num2;
		System.out.println("sub() �Լ�..."); 
		return inum; //return num*num2 �̷��� �ٷκ����� ��.
	}

}
