
public class TestVariables {

	public static void main(String[] args) {
		Variables var = new Variables();
		var.iv++;
		
		Variables.cv++; //Ŭ���� ����
		
		System.out.println("var : "+var.iv);
		System.out.println("var.cv: "+var.cv);
		
		Variables var2 = new Variables();
		var2.iv++;
		
		Variables.cv++;
		
		System.out.println("var2 : "+ var2.iv);
		System.out.println("var2.cv: "+var2.cv);		
		
		Variables var3 = new Variables();
		var3.iv++;
		
		Variables.cv++;
		
		System.out.println("var3 : "+var3.iv);
		System.out.println("var3.cv: "+var.cv);
		
		System.out.println("--------------------");
		
		Variables var4 =  new Variables();
		System.out.println("var4 : "+var4.iv); //�ν��Ͻ� ������ ��ü ������ ����ؾ���.
		
	}
}

class Variables {
	int iv; //�ν��Ͻ� ����, �������
	static int cv; //Ŭ��������, ��������, ��������
	
	void method() {
		int lv=0; //��������
	
	}

}
