
class MemberCall {
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv;
	//static int cv2 = iv; //����. Ŭ���������� �ν��Ͻ� ������ ����� �� ����.
	static int cv2 = new MemberCall().iv;   //��ó�� �����ؾ� ��밡��.
	
	static void staticMethod() {
		System.out.println(cv);
//		System.out.println(iv); ����. Ŭ���� �޼ҵ忡���� �ν��Ͻ����� ���Ұ�
		MemberCall c = new MemberCall();
		System.out.println(c.iv);
	}
	
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv);
		
	}
	
	static void staticMethod2() {
		staticMethod();
//		instanceMethod(); ����.
		MemberCall c = new MemberCall();
		c.instanceMethod1();
	}
	void instanceMethod2() {
		staticMethod();
		instanceMethod1();

	}

}
