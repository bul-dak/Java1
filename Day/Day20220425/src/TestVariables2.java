
public class TestVariables2 {

	public static void main(String[] args) {
		System.out.println(Variables2.cv);
		 //Ŭ���� ������ ��ü �������� �ʰ� ���� ����. >>������ ��ü���� ���� �޸� ������ �ö�����.
		
		Variables2 var2 = new Variables2();
		var2.method(); //��ü ���� �� �޼ҵ� ���� ����.
		
		Variables2.method2();
	}
}

class Variables2 {
	int iv; //�ν��Ͻ� ����, �������
	static int cv=100; //Ŭ��������, ��������, ��������
	
	void method() {
		int lv=0; //��������
	
	}
	static void method2() {
		int lv=0; //��������
		System.out.println("lv : "+lv);
	
	}
}
